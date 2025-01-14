import java.util.Arrays;
import java.util.Scanner;

public class Exo48 {

    public static void main(String[] args) {

        /* VARIABLES */

        Scanner sc;
        int nbValeurs;
        int[] tab;
        int valeurMax;
        int position; 

        /* TRAITEMENT */

        sc = new Scanner(System.in);
        System.out.println("Veuillez entrer le nombre de valeurs à saisir: ");
        nbValeurs = sc.nextInt();

        tab = new int[nbValeurs];
        valeurMax = Integer.MIN_VALUE; // C'est la plus petite valeur que preut prendre un entier (int)
        position = 0; // Est-ce qu'on peut faire sans mettre un zéro ?

        for (int i = 0; i < tab.length; i++) {
            System.out.println("Entrez la valeur numero " + (i + 1));
            tab[i] = sc.nextInt();
            if (tab[i] > valeurMax) {
                valeurMax = tab[i];
                position = i;
            }
        }

        /* AFFICHAGE RESULTAT */

        System.out.println("Les valeurs entrées forment le tableau suivant : " + Arrays.toString(tab));
        System.out.println("La plus grande valeur est : " + valeurMax);
        System.out.println("Elle se trouve en position " + position + " dans le tableau.");

        sc.close();

    }

}
