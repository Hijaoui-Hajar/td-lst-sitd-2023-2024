package td3.ex6;

public abstract class Figure {
    private String nom;

    public Figure(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract double getPerimeter();

    public abstract double getAire();

    @Override
    public String toString() {
        return "Figure{" +
                "nom='" + nom + '\'' +
                '}';
    }
}


