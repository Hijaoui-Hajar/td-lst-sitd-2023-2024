package td3.ex5;

public class Avion extends Vehicule {
    private int nbMoteur;

    public Avion(int nbP, int nbM) {
        super(nbP);
        this.nbMoteur = nbM;
    }

    public int getNbMoteur() {
        return nbMoteur;
    }

    public void setNbMoteur(int nbMoteur) {
        this.nbMoteur = nbMoteur;
    }

    @Override
    public String toString() {
        return "Avion [nbMoteur=" + nbMoteur + ", nbPassager=" + getNbPassager() + "]";
    }
}