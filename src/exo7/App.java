package exo7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Écrivez un programme Java qui accepte trois nombres et affiche "Tous les
        // nombres sont égaux" si les trois nombres sont égaux, "Tous les nombres sont différents" si les trois
        // nombres sont différents et sinon "Ni tous ni égaux ni différents".
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int x = scanner.nextInt();
        System.out.print("Input second number: ");
        int y = scanner.nextInt();
        System.out.print("Input third number: ");
        int z = scanner.nextInt();
        
        if (x == y && x == z) {
            System.out.println("All numbers are equal");
        } else if (x != y && x != z && z != y) {
            System.out.println("Tous les nombres sont différents");
        } else {
            System.out.println("Ni tous ni égaux ni différents");
        }
        scanner.close();

    }
}
