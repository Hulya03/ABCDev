import java.util.Arrays;
import java.util.Scanner;

public class Exo47 {
    
    public static void main(String[] args) {

        /*VARIABLES*/

        Scanner sc;
        int nbValeurs;
        int [] tab;
        int [] tabAugmente;
        
        /* TRAITEMENT */

        sc = new Scanner(System.in);
        System.out.println("Entrez le nombre de valeur que vous allez saisir : ");
        nbValeurs = sc.nextInt();

        tab = new int [nbValeurs] ;

        for (int i = 0; i < tab.length; i++) {
            System.out.println("Entrez une valeur : ");
            tab[i] = sc.nextInt();
        }

        tabAugmente = new int[nbValeurs];

        for (int i = 0; i < tabAugmente.length; i++) {
            tabAugmente[i] = tab[i] + 1;
        }

        sc.close();

        /* AFFICHAGE RESULTAT */

        System.out.println(Arrays.toString(tabAugmente));


    }
    
}
