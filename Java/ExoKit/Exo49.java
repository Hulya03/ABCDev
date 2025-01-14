import java.util.Scanner;

public class Exo49 {

    public static void main(String[] args) {

        /* VARIABLES */

        Scanner sc;
        int noteTotal;
        double[] note;
        double sommeNote;
        double moyenne;
        double superieur;
        double inferieur;

        /* TRAITEMENTS */

        sc = new Scanner(System.in);
        System.out.println("Entrez le nombre de note total : ");
        noteTotal = sc.nextInt();

        note = new double[noteTotal];
        sommeNote = 0;
        superieur = 0;
        inferieur = 0;
        moyenne = 0;
        
        for (int i = 0; i < note.length; i++) {
            System.out.println("Entrez la note de l'élève :");
            note[i] = sc.nextDouble();

            sommeNote = sommeNote + note[i];
 

            moyenne = sommeNote / (double)noteTotal;
        }
        for (int j = 0; j < note.length; j++) {
            if (note[j] > moyenne) {
                superieur ++;
            
            }
        }
       

        /* AFFICHAGE RESULTAT */

        System.out.println("moyenne " + moyenne);
        System.out.println("il y a " + superieur + "notes supérieures à la moyenne de la classe et " + inferieur + "notes inférieures");
        sc.close();
    }

}
