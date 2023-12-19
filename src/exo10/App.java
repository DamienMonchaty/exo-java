package exo10;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Écrivez un programme Java qui inverse une chaîne de caractères.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une chaîne de caractères : ");
        String str = scanner.nextLine();

        StringBuilder strBuilder = new StringBuilder(str).reverse();

        System.out.println("Chaîne inversée : " + strBuilder.toString());   
        scanner.close();
    }
}
