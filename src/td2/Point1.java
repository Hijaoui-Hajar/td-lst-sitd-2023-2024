package td2;

public class Point1 {
    private char nom;
    private double abscisse;

// Constructeur
    public Point1(char nom, double abscisse) {
        this.nom = nom;
        this.abscisse = abscisse;
    }

// Méthode affiche
    public void affiche() {
        System.out.println("Nom du point : " + nom + " et abscisse : " + abscisse);
    }

// Méthode translate
    public void translate(double valeur) {
        abscisse += valeur;
    }
}

