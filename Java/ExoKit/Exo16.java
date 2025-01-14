import java.util.Scanner;

public class Exo16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir un nombre n1 : ");
        int nb1 = sc.nextInt();
        System.out.println("Veuillez saisir un nombre n2 : ");
        int nb2 = sc.nextInt();

        int rangt;

        rangt = nb1;
        nb1 = nb2;
        nb2 = rangt;

        System.out.println("la valeur n1 devient : " + nb1);
        System.out.println("la valeur n2 devient : " + nb2);

        sc.close();

    }
}
