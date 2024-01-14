package td1.lesBoucles;
import java.util.Scanner;
public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur de a : ");
        double a = scanner.nextDouble();

        System.out.print("Entrez la valeur de b : ");
        double b = scanner.nextDouble();

        System.out.print("Entrez la valeur de c : ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Racines réelles distinctes :");
            System.out.println("Première racine : " + root1);
            System.out.println("Deuxième racine : " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);

            System.out.println("Racine réelle unique :");
            System.out.println("Racine : " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);

            System.out.println("Racines complexes :");
            System.out.println("Première racine : " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Deuxième racine : " + realPart + " - " + imaginaryPart + "i");
        }

        scanner.close();
    }
}