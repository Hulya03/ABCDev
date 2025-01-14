import java.util.Scanner;

public class Exo22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir un nombre :");
        int nb1 = sc.nextInt();
        System.out.println("Veuillez saisir un nombre :");
        int nb2 = sc.nextInt();

        if (nb1 * nb2 >= 0) {
            System.out.println("Le produit est positif");
        } else {
            System.out.println("Le produit est négatif");
        }

        sc.close();

    }
}
