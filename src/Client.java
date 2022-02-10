import java.util.List;

public class Client {
    public int distanta;
    private String nume;
    private String prenume;
    private List<Cursa> masini;

    public Client(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public Client() {

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public List<Cursa> getCursa() {
        return masini;
    }

    public void setCursa(List<Cursa> masini) {
        this.masini = masini;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", curse=" + masini +
                '}';
    }

}