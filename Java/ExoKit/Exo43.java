import java.util.Scanner;

public class Exo43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Combien de nombres voulez-vous saisir ? ");
        int nbValeurs = sc.nextInt();

        int tab[] = new int[nbValeurs];
        // Quand on a un tableau, soit on donne les valeurs, soit on donne la taille du tableau 

        int positif = 0;
        int negatif = 0;

        for (int i = 0; i < nbValeurs; i++) {
            System.out.println("Entrez la valeur : ");
            tab[i] = sc.nextInt();

            if (tab[i] > 0) {
                positif = positif + 1;
            } else {
                negatif = negatif + 1;
            }
        }
        System.out.println("Il y a " + positif + "nombres positifs");
        System.out.println("Il y a " + negatif + "nombres négatifs");

        sc.close();
    }
}
