
import java.util.List;

public class Cursa {
    private boolean aprobare;
    private Masina masini;

    public Cursa(boolean aprobare, Masina masini) {
        this.aprobare = aprobare;
        this.masini = masini;
    }

    public Cursa( Masina masini) {
        this.masini = masini;
    }

    public boolean getAprobare() {
        return aprobare;
    }

    public void setAprobare(boolean aprobare) {
        this.aprobare = aprobare;
    }

    public Masina getMasini() {
        return masini;
    }

    public void setMasini(Masina masini) {
        this.masini = masini;
    }


    @Override
    public String toString() {
        return "Cursa{" +
                "aprobare=" + aprobare +
                ", masini=" + masini +
                '}';
    }
}