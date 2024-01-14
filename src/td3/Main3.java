package td3;

import td3.ex1.Point;
import td3.ex1.PointA;
import td3.ex2.PointNom32;
import td3.ex3.Centre;
import td3.ex3.Cercle;
import td3.ex4.Bâtiment;
import td3.ex4.Immeuble;
import td3.ex4.Maison;
import td3.ex6.Disque;
import td3.ex6.Rectangle36;
import td3.ex7.Patron;
import td3.ex7.TravailleurCommission;
import td3.ex7.TravailleurHoraire;

public class Main3 {
/////////////////EXERCICE1/////////////////////
    public static void main(String[] args) {
        Point point = new Point(5, 10);
        PointA pointA = new PointA(15, 20);

        System.out.println("Point :");
        System.out.println("x = " + point.getX());
        System.out.println("y = " + point.getY());

        System.out.println("PointA :");
        pointA.affiche();

        point.deplace(2, 3);
        pointA.deplace(5, 7);

        System.out.println("Point :");
        System.out.println("x = " + point.getX());
        System.out.println("y = " + point.getY());

        System.out.println("PointA :");
        pointA.affiche();
    }
/////////////////EXERCICE2/////////////////////
/*
public static void main(String[] args) {
    PointNom32 pointNom = new PointNom32(5, 10, 'A');

    System.out.println("PointNom :");
    pointNom.affCoordNom();

    pointNom.setPointNom32(7, 12, 'B');

    System.out.println("PointNom :");
    pointNom.affCoordNom();

    pointNom.setNom('C');

    System.out.println("PointNom :");
    pointNom.affCoordNom();
}
*/

/////////////////EXERCICE3/////////////////////
/*
    public static void main(String[] args) {
        Centre centre = new Centre(5, 10, 'A');

        System.out.println("Centre :");
        centre.affCoordNom();

        centre.setPointNom(7, 12, 'B');

        System.out.println("Centre :");
        centre.affCoordNom();

        centre.setNom('C');

        System.out.println("Centre :");
        centre.affCoordNom();

        Cercle cercle = new Cercle(5, 10, 'D', 3.0);

        System.out.println("Cercle :");
        cercle.afficher();

        System.out.println("Nom du centre du cercle :");
        cercle.afficherNom();
    }
*/

/////////////////EXERCICE4/////////////////////
/*
 public static void main(String[] args) {
      Bâtiment bâtiment = new Bâtiment("123 Rue de la Paix");
      System.out.println(bâtiment);

      Maison maison = new Maison("456 Rue de la Paix", 3);
      System.out.println(maison);

      Immeuble immeuble = new Immeuble("789 Rue de la Paix", 5);
      System.out.println(immeuble);
}
*/


/////////////////EXERCICE5/////////////////////
/*
    public static void main(String[] args) {
        Disque disc1 = new Disque(new Point(3, 4), 5, "Disque 1");
        System.out.println(disc1);
        System.out.println("Perimeter: " + disc1.getPerimeter());
        System.out.println("Aire: " + disc1.getAire());

        Rectangle36 rect1 = new Rectangle36(4, 5, "Rectangle 1");
        System.out.println(rect1);
        System.out.println("Perimeter: " + rect1.getPerimeter());
        System.out.println("Aire: " + rect1.getAire());

        // Testing Disque constructors
        Disque disc2 = new Disque(new Point(1, 2), 5, "Disque 1");
        System.out.println(disc2);
        Disque disc3 = new Disque(new Point(1, 2), 5, "Disque 1");
        System.out.println(disc3);

        // Testing Rectangle constructors
        Rectangle36 rect2 = new Rectangle36();
        System.out.println(rect2);
        Rectangle36 rect3 = new Rectangle36(6, 7);
        System.out.println(rect3);
    }
*/

/////////////////EXERCICE7/////////////////////
/*
    public static void main(String[] args) {
        Patron patron = new Patron("Martin", "Luc", 3000);
        TravailleurCommission travailleurCommission = new TravailleurCommission("Dupont", "Pierre", 2000, 100);
        TravailleurHoraire travailleurHoraire = new TravailleurHoraire("Durand", "Mathieu", 15);

        System.out.println("Patron : " + patron);
        System.out.println("Gains : " + patron.gains());

        System.out.println("\nTravailleurCommission : " + travailleurCommission);
        System.out.println("Gains : " + travailleurCommission.gains());

        System.out.println("\nTravailleurHoraire : " + travailleurHoraire);
        System.out.println("Gains : " + travailleurHoraire.gains());
    }
*/

}
