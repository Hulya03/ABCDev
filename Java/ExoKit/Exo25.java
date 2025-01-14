import java.util.Scanner;

public class Exo25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir le nombre de copies : ");

        int nbCopie = sc.nextInt();

        if (nbCopie > 0 && nbCopie <= 10) {
            double tarif = nbCopie * 0.10;
            System.out.println("Le montant de la facture est de " + tarif);
        } else if (nbCopie > 10 && nbCopie <= 30) {
            double tarif = 10 * 0.10 + (nbCopie - 10) * 0.09;
            System.out.println("Le montant de la facture est de " + tarif);
        } else {
            double tarif = 10 * 0.10 + 20 * 0.09 + (nbCopie - 30) * 0.08;
            System.out.println("Le montant de la facture est de " + tarif);
        }

        sc.close();
    }

}
