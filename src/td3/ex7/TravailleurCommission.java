package td3.ex7;
import td3.ex7.Employe;
public class TravailleurCommission extends Employe {
    private double salaire;
    private double commission;
    private int quantite;

    public TravailleurCommission() {
    }

    public TravailleurCommission(String nom, String prenom, double salaire, double commission) {
        super(nom, prenom);
        this.salaire = salaire;
        this.commission = commission;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        String nom = null;
        String prenom = null;
        return "TravailleurCommission [salaire=" + salaire + ", commission=" + commission + ", quantite=" + quantite
                + ", nom=" + nom + ", prenom=" + prenom + "]";
    }

    @Override
    public double gains() {
        return salaire + (commission * quantite);
    }
}