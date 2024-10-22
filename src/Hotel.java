import java.util.ArrayList;

public class Hotel {
    private ArrayList<Quarto> listaDeQuartos = new ArrayList<>();
    private ArrayList<Reservas> listaDeReservas = new ArrayList<>();
    private ArrayList<Hospede> listaDeHospedes = new ArrayList<>();

    public Hotel() {
    }

    public Hotel(ArrayList<Quarto> listaDeQuartos, ArrayList<Reservas> listaDeReservas, ArrayList<Hospede> listaDeHospedes) {
        this.listaDeQuartos = listaDeQuartos;
        this.listaDeReservas = listaDeReservas;
        this.listaDeHospedes = listaDeHospedes;
    }

    public ArrayList<Quarto> getListaDeQuartos() {
        return listaDeQuartos;
    }

    public void setListaDeQuartos(ArrayList<Quarto> listaDeQuartos) {
        this.listaDeQuartos = listaDeQuartos;
    }

    public ArrayList<Reservas> getListaDeReservas() {
        return listaDeReservas;
    }

    public void setListaDeReservas(ArrayList<Reservas> listaDeReservas) {
        this.listaDeReservas = listaDeReservas;
    }

    public ArrayList<Hospede> getListaDeHospedes() {
        return listaDeHospedes;
    }

    public void setListaDeHospedes(ArrayList<Hospede> listaDeHospedes) {
        this.listaDeHospedes = listaDeHospedes;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "listaDeQuartos=" + listaDeQuartos +
                ", listaDeReservas=" + listaDeReservas +
                ", listaDeHospedes=" + listaDeHospedes +
                '}';
    }
}
