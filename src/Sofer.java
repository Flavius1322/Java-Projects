public class Sofer {
    private String nume;
    private String prenume;


    public Sofer(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public Sofer() {

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

    public void aprobCursa(Cursa cursa,Masina masina){

        if(cursa.getMasini() == masina)
            cursa.setAprobare(true);

    }

    public void nuAprobCursa(Cursa cursa,Masina masina){

        if(cursa.getMasini() == masina)
            cursa.setAprobare(false);
    }

    @Override
    public String toString() {
        return "Sofer{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                '}';
    }
}