import java.util.ArrayList;

public class Hospede {
    private String name;
    private ArrayList<Reservas> historicoDeReservas = new ArrayList<>();

    public Hospede() {
    }

    public Hospede(String name, ArrayList<Reservas> históricoDeReservas) {
        this.name = name;
        this.historicoDeReservas = históricoDeReservas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Reservas> getHistóricoDeReservas() {
        return historicoDeReservas;
    }

    public void setHistóricoDeReservas(ArrayList<Reservas> históricoDeReservas) {
        this.historicoDeReservas = históricoDeReservas;
    }

    @Override
    public String toString() {
        return "Hospede{" +
                "name='" + name + '\'' +
                ", históricoDeReservas=" + historicoDeReservas +
                '}';
    }
}