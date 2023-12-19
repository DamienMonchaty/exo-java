package exo1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //  Écrire un programme en Java qui demande l'âge d'un enfant et permet d'informer de sa catégorie sachant que les catégories sont les suivantes: 
        // "poussin de 6 a 7 ans"
        // "pupille de 8 a 9 ans "
        // "minime de 10 a 11 ans "
        // " cadet après 12 ans ".
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez l'âge de l'enfant : ");
        int ageEnfant = scanner.nextInt();

        // Utilisation du switch avec pattern matching
        switch (ageEnfant) {
            case 6, 7 -> System.out.println("Catégorie : Poussin de 6 à 7 ans");
            case 8, 9 -> System.out.println("Catégorie : Pupille de 8 à 9 ans");
            case 10, 11 -> System.out.println("Catégorie : Minime de 10 à 11 ans");
            default -> {
                if (ageEnfant >= 12) {
                    System.out.println("Catégorie : Cadet après 12 ans");
                } else {
                    System.out.println("Catégorie non définie pour cet âge.");
                }
            }
        }
        
        scanner.close();
    }
}
