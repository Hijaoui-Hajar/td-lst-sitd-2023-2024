package td2;

public class Point2 {
    private char nom;
    private double abscisse;
    private double ordonnee;

    // Constructeur par défaut
    public Point2() {
        this.nom = ' ';
        this.abscisse = 0.0;
        this.ordonnee = 0.0;
    }

    // Constructeur d'initialisation
    public Point2(char nom, double abscisse, double ordonnee) {
        this.nom = nom;
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }

    // Getters et setters
    public char getNom() {
        return nom;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }

    public double getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    public double getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(double ordonnee) {
        this.ordonnee = ordonnee;
    }

    // Méthode Norme
    public double norme() {
        return Math.sqrt(Math.pow(abscisse, 2) + Math.pow(ordonnee, 2));
    }
}


