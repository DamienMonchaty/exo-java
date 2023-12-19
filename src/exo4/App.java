package exo4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Une boutique propose à ses clients, une réduction de 15% pour les montants
        // d’achat supérieurs à 200 Euros.
        // Écrire un programme en Java permettant de saisir le prix total HT et de
        // calculer le montant TTC en prenant en compte la réduction et la TVA=20%.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer le montant HT:");
        double Prix_HT = scanner.nextFloat();

        double Prix_TTC = Prix_HT + Prix_HT * 0.2;
        if (Prix_TTC > 200) {
            Prix_TTC = Prix_TTC - Prix_TTC * 0.15;
            System.out.print("le montant TTC est: " + Prix_TTC);
        } else {
            System.out.print("le montant TTC est: " + Prix_TTC);
        }
        scanner.close();
    }
}
