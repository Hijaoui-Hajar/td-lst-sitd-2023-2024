package td3.ex6;

import java.util.Objects;

public class Disque extends Figure {
    private Point centre;
    private double rayon;

    public Disque(td3.ex1.Point point, int rayon, String nom) {
        this(new Point(0, 0), 0, "Disque");
    }

    public Disque(Point centre, double rayon) {
        this(centre, rayon, "Disque");
    }

    public Disque(Point centre, double rayon, String nom) {
        super(nom);
        this.centre = Objects.requireNonNull(centre);
        this.rayon = rayon;
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double getAire() {
        return Math.PI * Math.pow(rayon, 2);
    }

    @Override
    public String toString() {
        return "Disque{" +
                "centre=" + centre +
                ", rayon=" + rayon +
                ", nom='" + getNom() + '\'' +
                '}';
    }
}