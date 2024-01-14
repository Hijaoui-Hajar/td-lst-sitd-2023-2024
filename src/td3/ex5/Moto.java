package td3.ex5;

public class Moto extends Vehicule {
    private int nbRoues = 2;

    public Moto(int nbP) {
        super(nbP);
    }

    public int getNbRoues() {
        return nbRoues;
    }

    public void setNbRoues(int nbRoues) {
        this.nbRoues = nbRoues;
    }

    @Override
    public String toString() {
        return "Moto [nbRoues=" + nbRoues + ", nbPassager=" + getNbPassager() + "]";
    }
}