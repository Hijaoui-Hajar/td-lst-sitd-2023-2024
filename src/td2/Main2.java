package td2;
import td2.Rectangle2;
import java.awt.*;

public class Main2 {
////////////////EXERCICE1/////////////////////
    public static void main(String[] args) {
        // Création d'un point
        Point1 pointA = new Point1('A', 5.0);

        // Affichage des caractéristiques du point
        pointA.affiche();

        // Translation du point
        pointA.translate(3.0);

        // Affichage à nouveau des caractéristiques du point
        pointA.affiche();
    }

///////////////EXERCICE2///////////////////
/*
    public static void main(String[] args) {
        // Création d'un point
        Point2 pointA = new Point2('A', 3.0, 4.0);

        // Affichage des caractéristiques du point
        System.out.println("Nom du point : " + pointA.getNom());
        System.out.println("Abscisse du point : " + pointA.getAbscisse());
        System.out.println("Ordonnée du point : " + pointA.getOrdonnee());

        // Affichage de la distance entre le point et l'origine
        System.out.println("Distance entre le point et l'origine : " + pointA.norme());
    }
*/

///////////////EXERCICE4///////////////////
/*
    public static void main(String[] args) {
    // Création d'un objet Temps
    Temps temps1 = new Temps(13, 45, 30);

    // Affichage de l'objet Temps
    System.out.println(temps1.toString());

    // Ajout de 2 heures
    temps1.ajouterHeures(2);
    System.out.println(temps1.toString());

    // Ajout de 30 minutes
    temps1.ajouterMinutes(30);
    System.out.println(temps1.toString());

    // Ajout de 45 secondes
    temps1.ajouterSecondes(45);
    System.out.println(temps1.toString());
}
*/

///////////////EXERCICE5///////////////////
/*
    public static void main(String[] args) {
        Rectangle2 r1 = new Rectangle2();
        r1.setLongueur(4);
        r1.setLargeur(3);
        System.out.println(r1);
        System.out.println("Périmètre: " + r1.perimetre());
        System.out.println("Aire: " + r1.aire());
        System.out.println("Est-ce un carré? " + r1.isCarre());

        Rectangle2 r2 = new Rectangle2(2, 2);
        System.out.println(r2);
        System.out.println("Périmètre: " + r2.perimetre());
        System.out.println("Aire: " + r2.aire());
        System.out.println("Est-ce un carré? " + r2.isCarre());
    }
*/

}