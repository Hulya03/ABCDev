
import java.util.Scanner;

public class Exo29 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quel age avez-vous ?");
        int age = sc.nextInt();
        System.out.println("Depuis combien d'années avez-vous votre permis ?");
        int permis = sc.nextInt();
        System.out.println("Combien d'accident avez-vous eu ?");
        int accident = sc.nextInt();
        System.out.println("Quelle est votre ancienneté ?");
        int anciennete = sc.nextInt();

        if (age < 25 && permis < 2 && accident == 0
                || accident != 0 && (age < 25 && permis > 2 || age > 25 && permis < 2)) {
            System.out.println("Vous êtes admis au tarif rouge");
        } else if (accident == 0 && (age < 25 && permis > 2 || age > 25 && permis < 2)
                || age > 25 && permis > 2 && accident != 0) {
            System.out.println("Vous êtes admis au tarif orange");
        } else if (age > 25 && permis > 2 && accident == 0) {
            System.out.println("Vous êtes admis au tarif vert");
        } else {
            System.out.println("Inscription refusée");
        }

        if ((age < 25 && permis < 2 && accident == 0
                || accident != 0 && (age < 25 && permis > 2 || age > 25 && permis < 2)) && anciennete > 5) {
            System.out.println("Mais votre ancienneté vous permet de souscrire au tarif orange");
        } else if ((accident == 0 && (age < 25 && permis > 2 || age > 25 && permis < 2)
                || age > 25 && permis > 2 && accident != 0) && anciennete > 5) {
            System.out.println("Mais votre ancienneté vous permet de souscrire au tarif vert");
        } else if (age > 25 && permis > 2 && accident == 0 && anciennete > 5) {
            System.out.println("Mais votre ancienneté vous permet de souscrire au tarif bleu");
        } 
        

        sc.close();
    }
}
