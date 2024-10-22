import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import static java.time.LocalDate.parse;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static Quarto quarto = new Quarto();
    public static Hospede hospede = new Hospede();
    public static Reservas reservas = new Reservas();
    public static Hotel hotel = new Hotel();

    public static void main(String[] args) {

        boolean running = true;

        while (running) {
            System.out.print("Escolha uma opção: ");
            System.out.println("1. Cadastro de quartos");
            System.out.println("2. Cadastro de reservas");
            System.out.println("3. Check-in");
            System.out.println("4. Check-out");
            System.out.println("5. Relatório de ocupação");
            System.out.println("6. Histórico de reservas");
            System.out.println("0. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    adicionarQuarto();
                    break;
                    case 2:
                        registrarReserva();
                        break;
                        case 3:
                            registrarCheckin();
                            break;
                            case 4:
                                registrarCheckout();
                                break;
                                case 5:
                                    relatorioDeOcupacao();
                                    break;
                                    case 6:
                                        historicoDeReservas();
                                        break;
                                        case 0:
                                            running = false;
                                            break;
                                            default:
                                                System.out.println("Opção inválida! Tente novamente.");

            }

        }


    }


    public static void adicionarQuarto(){
        System.out.println("Número do quarto");
        int numero = scanner.nextInt();
        System.out.println("Tipo do quarto 1:solteiro, 2:Casal, 3:suíte");
        int tipo = scanner.nextInt();
        System.out.println("O preço diário do quarto");
        float preco = scanner.nextFloat();
        System.out.println("Disponíbilidade do quarto");
        boolean disponivel = scanner.nextBoolean();

        Quarto quarto = new Quarto(numero, tipo, preco, disponivel);
        hotel.getListaDeQuartos().add(quarto);
        System.out.println("Quarto adicionado com sucesso");
    }
    public static void registrarReserva() {
        System.out.println("Nome do hóspede");
        String nome = scanner.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Data de check-in (dd/MM/yyyy):");
        scanner.nextLine();
        String checkin = scanner.nextLine().trim();
        LocalDate dataCheckin = null;
        try {
            dataCheckin = LocalDate.parse(checkin, formatter);
            System.out.println("Check-in: " + dataCheckin.format(formatter));
        } catch (DateTimeParseException e) {
            System.out.println("Data inválida. Por favor, use o formato dd/MM/yyyy.");
        }
        System.out.println("Entrada recebida: '" + checkin + "'");

        System.out.println("Data de check-out (dd/MM/yyyy):");
        String checkout = scanner.nextLine().trim();
        LocalDate dataCheckout = null;
        try {
            dataCheckout = LocalDate.parse(checkout, formatter);
            System.out.println("Check-out: " + dataCheckout.format(formatter));
        } catch (DateTimeParseException e) {
            System.out.println("Data inválida. Por favor, use o formato dd/MM/yyyy.");
        }
        System.out.println("Entrada recebida: '" + checkout + "'");


        System.out.println("Número do quarto reservado");
        int numQuartos = scanner.nextInt();


        System.out.println("Tipo do quarto 1:solteiro, 2:Casal, 3:suíte");
        int tipo = scanner.nextInt();

        Reservas resevas = new Reservas(nome, dataCheckin, dataCheckout, numQuartos, tipo);
        hotel.getListaDeReservas().add(resevas);
        System.out.println("Reserva adicionado com sucesso");

    }

        public static void registrarCheckin(){
            System.out.println("Nome do hóspede");
            String nome = scanner.nextLine();
            System.out.println("Número do quarto reservado");
            int num = scanner.nextInt();

            for(Quarto quarto: hotel.getListaDeQuartos()) {
                if(quarto.getNumero() == num) {
                    quarto.setDisponivel(false);
                }
            }

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


            System.out.println("Data de check-in (dd/MM/yyyy):");
            scanner.nextLine();
            String checkin = scanner.nextLine().trim();
            LocalDate dataCheckin = null;
            try {
                dataCheckin = LocalDate.parse(checkin, formatter);
                System.out.println("Check-in: " + dataCheckin.format(formatter));
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Por favor, use o formato dd/MM/yyyy.");
            }
            System.out.println("Entrada recebida: '" + checkin + "'");

        }

    public static void registrarCheckout(){
        System.out.println("Nome do hóspede");
        String nome = scanner.nextLine();
        System.out.println("Número do quarto reservado");
        int num = scanner.nextInt();

        for(Quarto quarto: hotel.getListaDeQuartos()) {
            if(quarto.getNumero() == num) {
                quarto.setDisponivel(true);
            }
        }


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data de checkout (dd/MM/yyyy):");
        scanner.nextLine();
        String checkout = scanner.nextLine().trim();
        LocalDate dataCheckout = null;
        try {
            dataCheckout = LocalDate.parse(checkout, formatter);
            System.out.println("Check-out: " + dataCheckout.format(formatter));
        } catch (DateTimeParseException e) {
            System.out.println("Data inválida. Por favor, use o formato dd/MM/yyyy.");
        }
        System.out.println("Entrada recebida: '" + checkout + "'");

    }

    public static void relatorioDeOcupacao(){
        System.out.println("Lista de quartos ocupados");
        for(Quarto quarto: hotel.getListaDeQuartos()) {
            if(!quarto.isDisponivel()) {
                System.out.println("Quarto:"+quarto.getNumero()+",");
            }
        }


        System.out.println("Qual o número do quarto sobre o qual quer saber?");
        int numQuartos = scanner.nextInt();

        for(Quarto quarto: hotel.getListaDeQuartos()) {
            if(quarto.getNumero() == numQuartos) {
                System.out.println(quarto.isDisponivel());
                System.out.println(quarto.getTipo());
            }
        }
        for(Reservas reserva: hotel.getListaDeReservas()) {
            if(reserva.getNumQuartos() == numQuartos) {
                System.out.println(reserva.getCheckin());
                System.out.println(reserva.getCheckout());
            }
        }
    }

    public static void historicoDeReservas(){
        System.out.println("Nome do hospede");
        String nome = scanner.nextLine();

        for(Reservas reserva: hotel.getListaDeReservas()) {
            if(reserva.getNome().equals(nome)) {
                System.out.println(reserva.getNumQuartos());
                System.out.println(reserva.getCheckin());
                System.out.println(reserva.getCheckout());
            }
        }
    }


}