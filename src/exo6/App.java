package exo6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Écrivez un programme Java qui demande deux chiffres à un utilisateur, pour
        // afficher la somme (addition), multiplier, soustraire, diviser et le reste.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un premier nombre, svp : ");
        int num1 = scanner.nextInt();
        System.out.print("Entrez un deuxieme nombre, svp: ");
        int num2 = scanner.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
        scanner.close();
    }
}
