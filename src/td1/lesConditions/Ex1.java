package td1.lesConditions;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier naturel : ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Erreur : l'entier doit être positif.");
        } else {
            long factorial = calculateFactorial(n);
            System.out.println("Le factoriel de " + n + " est : " + factorial);
        }

        scanner.close();
    }

    private static long calculateFactorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
