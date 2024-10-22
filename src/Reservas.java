import java.time.LocalDate;

public class Reservas {
    private String nome;
    private LocalDate checkin;
    private LocalDate checkout;
    private int numQuartos;
    private int tipo;

    public Reservas() {
    }

    public Reservas(String nome, LocalDate checkin, LocalDate checkout, int numQuartos, int tipo) {
        this.nome = nome;
        this.checkin = checkin;
        this.checkout = checkout;
        this.numQuartos = numQuartos;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public int getNumQuartos() {
        return numQuartos;
    }

    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Reservas{" +
                "nome='" + nome + '\'' +
                ", checkin=" + checkin +
                ", checkout=" + checkout +
                ", numQuartos=" + numQuartos +
                ", tipo=" + tipo +
                '}';
    }
}
