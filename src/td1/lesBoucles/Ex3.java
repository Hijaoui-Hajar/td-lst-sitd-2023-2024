package td1.lesBoucles;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur de a : ");
        int a = scanner.nextInt();

        System.out.print("Entrez la valeur de b : ");
        int b = scanner.nextInt();

        System.out.println("\n1. Vérifier si la somme a + b est paire.");
        System.out.println("2. Vérifier si le produit ab est paire.");
        System.out.println("3. Connaître le signe de la somme a + b.");
        System.out.println("4. Connaître le signe du produit ab.");

        System.out.print("\nChoisissez une option (1/2/3/4) : ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                if ((a + b) % 2 == 0) {
                    System.out.println("La somme a + b est paire.");
                } else {
                    System.out.println("La somme a + b est impaire.");
                }
                break;
            case 2:
                if ((a * b) % 2 == 0) {
                    System.out.println("Le produit ab est pair.");
                } else {
                    System.out.println("Le produit ab est impair.");
                }
                break;
            case 3:
                if (a + b > 0) {
                    System.out.println("Le signe de la somme a + b est positif.");
                } else if (a + b < 0) {
                    System.out.println("Le signe de la somme a + b est négatif.");
                } else {
                    System.out.println("La somme a + b est nulle.");
                }
                break;
            case 4:
                if (a * b > 0) {
                    System.out.println("Le signe du produit ab est positif.");
                } else if (a * b < 0) {
                    System.out.println("Le signe du produit ab est négatif.");
                } else {
                    System.out.println("Le produit ab est nul.");
                }
                break;
            default:
                System.out.println("Option invalide. Veuillez choisir une option entre 1 et 4.");
        }

        scanner.close();
    }
}