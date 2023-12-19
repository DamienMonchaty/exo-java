package exo5;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Écrivez un programme Java qui demande son nom à l’utilisateur et qui affiche
        // «Bonjour» à l'écran et le nom sur une ligne distincte.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez votre nom, svp: ");
        String fname = scanner.next();
        System.out.print("Entrez votre prénom. svp: ");
        String lname = scanner.next();
        System.out.println();
        System.out.println("Bonjour \n" + fname + " " + lname);
        scanner.close();
    }
}
