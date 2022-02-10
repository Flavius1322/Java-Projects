

public class Masina {
    private Sofer sofer;
    private int distanta;
    private double pret;

    public Masina(Sofer sofer, int distanta, double pret) {
        this.sofer = sofer;
        this.distanta = distanta;
        this.pret = pret;
    }

    public Sofer getSofer() {
        return sofer;
    }

    public void setSofer(Sofer sofer) {
        this.sofer = sofer;
    }

    public int getDistanta() {
        return distanta;
    }

    public void setDistanta(int distanta) {
        this.distanta = distanta;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }


    @Override
    public String toString() {
        return "Masina{" +
                "sofer=" + sofer +
                ", distanta=" + distanta +
                ", pret=" + pret + " RON"+
                '}';
    }
}