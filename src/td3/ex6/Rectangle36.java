package td3.ex6;

public class Rectangle36 extends Figure {
    private double longueur;
    private double largeur;

    public Rectangle36() {
        this(0, 0, "Rectangle");
    }

    public Rectangle36(double longueur, double largeur) {
        this(longueur, largeur, "Rectangle");
    }

    public Rectangle36(double longueur, double largeur, String nom) {
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    @Override
    public double getPerimeter() {
        return 2 * (longueur + largeur);
    }

    @Override
    public double getAire() {
        return longueur * largeur;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                ", nom='" + getNom() + '\'' +
                '}';
    }
}
