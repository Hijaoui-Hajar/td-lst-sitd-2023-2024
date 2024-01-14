package td1.lesBoucles;
import java.util.Scanner;
public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la première valeur : ");
        double value1 = scanner.nextDouble();

        System.out.print("Entrez la deuxième valeur : ");
        double value2 = scanner.nextDouble();

        System.out.print("Entrez la troisième valeur : ");
        double value3 = scanner.nextDouble();

        double maxValue = Math.max(value1, Math.max(value2, value3));

        System.out.println("Le maximum des trois valeurs est : " + maxValue);

        scanner.close();
    }
}