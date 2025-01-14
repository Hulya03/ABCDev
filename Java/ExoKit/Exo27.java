import java.util.Scanner;

public class Exo27 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir un numéro de jour");
        int jour = sc.nextInt();
        System.out.println("Veuillez saisir un numéro de mois");
        int mois = sc.nextInt();
        System.out.println("Veuillez saisir un numéro d'année");
        int annee = sc.nextInt();

        int[] joursLimite = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // Pour qu'une année soit bissextile, le numéro de l'année doit être divisible
        // par quatre, à l'exception des années de fin de siècle,
        // qui doivent être divisibles par 400. Cela signifie que l'année 2000 était une
        // année bissextile, bien que 1900 ne l'ait pas été.

        // On met "joursLimite[mois-1]" car il y a la cellule "zéro" et on veut associer
        // par exemple le mois de mai 5 à la cellule 4.

        if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) {
            joursLimite[1] = 29;
        } else {
            joursLimite[1] = 28;
        }

        if (jour >= 1 && jour <= joursLimite[mois - 1] && mois >= 1 && mois <= 12) {
            System.out.println("date valide");
        }

        else {
            System.out.println("date non valide");
        }

        sc.close();

    }
}
