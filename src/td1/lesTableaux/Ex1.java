package td1.lesTableaux;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau (10 <= N <= 50) : ");
        int n = scanner.nextInt();

        if (n < 10 || n > 50) {
            System.out.println("Erreur : la taille du tableau doit être comprise entre 10 et 50.");
        } else {
            int[] tab = new int[n];

            System.out.println("Entrez les " + n + " entiers :");
            for (int i = 0; i < n; i++) {
                tab[i] = scanner.nextInt();
            }

            int min = findMin(tab);
            int max = findMax(tab);

            System.out.println("La valeur minimale de T est : " + min);
            System.out.println("La valeur maximale de T est : " + max);
        }

        scanner.close();
    }

    private static int findMin(int[] tab) {
        int min = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        return min;
    }

    private static int findMax(int[] tab) {
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }
}