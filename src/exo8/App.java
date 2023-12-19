package exo8;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Écrire un programme en Java qui permet de saisir 10 entiers dans un tableau.
        // - compter combien y a-t-il d'éléments pairs et impairs. 
        // - mettre les éléments pairs dans un tableau T1 et les éléments impaires dans
        // un tableau T2.
        // - Puis afficher T1 et T2

        int[] tab = new int[10];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            tab[i] = scanner.nextInt();
        }

        int evenNumber = 0;
        int oddNumber = 0;

        for (int n : tab) {
            if (n % 2 == 0) {
                evenNumber++;
            } else {
                oddNumber++;
            }
        }

        int[] t1 = new int[evenNumber];
        int[] t2 = new int[oddNumber];

        int iEven = 0;
        int iOdd = 0;

        for (int n : tab) {
            if (n % 2 == 0) {
                t1[iEven++] = n;
            } else {
                t2[iOdd++] = n;
            }
        }

        System.out.print("Tableau Pair ");
        for (int i = 0; i < t1.length; i++) {
            System.out.print(t1[i]);
        }

        System.out.println();

        System.out.print("Tableau impair ");
        for (int i = 0; i < t2.length; i++) {
            System.out.print(t2[i]);
        }

        scanner.close();
    }
}
