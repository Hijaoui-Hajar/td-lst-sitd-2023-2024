package td3.ex3;

public class Cercle extends Centre {
    private double rayon;

    public Cercle(int x, int y, char nom, double rayon) {
        super(x, y, nom);
        this.rayon = rayon;
    }

    public void afficher() {
        super.affCoordNom();
        System.out.println("Rayon : " + rayon);
    }

    public void afficherNom() {
        super.affNom();
    }
}
