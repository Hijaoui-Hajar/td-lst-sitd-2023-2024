package td3.ex7;
import td3.ex7.Employe;
public class TravailleurHoraire extends Employe {
    private double retribution;
    private int heures;

    public TravailleurHoraire() {
    }

    public TravailleurHoraire(String nom, String prenom, double retribution) {
        super(nom, prenom);
        this.retribution = retribution;
    }

    public double getRetribution() {
        return retribution;
    }

    public void setRetribution(double retribution) {
        this.retribution = retribution;
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    @Override
    public String toString() {
        String nom = null;
        return "TravailleurHoraire [retribution=" + retribution + ", heures=" + heures + ", nom=" + nom + "]";
    }

    @Override
    public double gains() {
        return 0;
    }
}