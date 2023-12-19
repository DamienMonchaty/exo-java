package exo11;

public class App {
    public static void main(String[] args) throws Exception {
        // Écrivez une méthode qui renvoie le plus grand entier dans un tableau.
        int[] tab = {1, 2, 9, 4};
        int bValue = 0;
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > bValue) {
                bValue = tab[i];
            }
        }
        System.out.println("Le plus grand entier dans le tableau est : " + bValue);

    }
}
