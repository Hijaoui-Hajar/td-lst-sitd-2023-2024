package td3.ex4;

public class Immeuble extends Bâtiment {
    private int nbAppart;

    public Immeuble() {
        super();
        this.nbAppart = 0;
    }

    public Immeuble(String adresse, int nbAppart) {
        super(adresse);
        this.nbAppart = nbAppart;
    }

    public int getNbAppart() {
        return nbAppart;
    }

    public void setNbAppart(int nbAppart) {
        this.nbAppart = nbAppart;
    }

    @Override
    public String toString() {
        String adresse = null;
        return "Immeuble [nbAppart=" + nbAppart + ", adresse=" + adresse + "]";
    }
}
