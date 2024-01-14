package td3.ex7;
import td3.ex7.Employe;
public class Patron extends Employe {
    private double salaire;

    public Patron() {
    }

    public Patron(String nom, String prenom, double salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        String prenom = null;
        String nom = null;
        return "Patron [salaire=" + salaire + ", nom=" + nom + ", prenom=" + prenom + "]";
    }

    @Override
    public double gains() {
        return salaire;
    }
}