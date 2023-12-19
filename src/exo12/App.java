package exo12;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Écrire un programme Java qui permet à l'utilisateur de deviner un nombre choisi aléatoirement par l'ordinateur. 
        // Le programme doit donner des indications à l'utilisateur sur si le nombre à deviner est plus grand ou plus petit que la proposition de l'utilisateur. 
        // Le jeu doit se poursuivre tant que l'utilisateur n'a pas correctement deviné le nombre.
        int nbrEssaisMax = 5;
		int nbrEssais = 1;
        int nbrMagique = 5;
		int i = 0;

        Scanner scanner = new Scanner(System.in);

		while (i != nbrMagique && nbrEssais <= nbrEssaisMax ) {
			System.out.println("Veuillez trouver le bon nombre entre 0 et 10");
			i = scanner.nextInt();
			if (i > nbrMagique) {
				System.out.println("Plus petit");
			}
			if (i < nbrMagique) {
				System.out.println("Plus grand");
			}
			nbrEssais += 1;
		}
				
		if ((nbrEssais > nbrEssaisMax) && (i != nbrMagique)) {			
			System.out.printf("Désolé, vous avez utilisé vos 5 essais en vain.");		
		} else {			
			System.out.printf("Bravo");		
		}

        scanner.close();

    }
}
