package exo3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Écrire un programme en Java qui permet d'échanger le contenu de deux entiers
        // A et B saisis par l'utilisateur et afficher ces entiers après l’échange.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer un entier A:");
        float A = scanner.nextInt();
        System.out.print("Entrer un entier B:");
        float B = scanner.nextInt();
        float C = A;
        A = B;
        B = C;
        System.out.println("le contenu de A est: " + A + "\n");
        System.out.print("le contenu de B est: " + B);
        scanner.close();
    }
}
