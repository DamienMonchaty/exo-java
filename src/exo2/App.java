package exo2;

public class App {
    public static void main(String[] args) throws Exception {
        // Écrire un programme en Java qui permet de calculer la somme S=1+2+3+...+ 10. Utilisant la boucle for.
        int S = 0;
        for (int i = 1; i <= 10; i++) {
                S = S + i;
        }
        System.out.print("la somme de 1 -> 10 est: " + S);
    }
}
