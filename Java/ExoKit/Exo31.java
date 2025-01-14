import java.util.Scanner;

public class Exo31 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez un nombre entre 1 et 3 compris");
        int nombre = sc.nextInt();

        while (nombre < 1 || nombre > 3) {
            System.out.println("Entrez un nombre entre 1 et 3 compris");
            nombre = sc.nextInt();
        }

        //if (nombre >= 1 && nombre <= 3) {
        //    System.out.println("Bravo vous avez reussi !");
        // inutile !!!

     
        System.out.println("Bravo vous avez reussi !");

        sc.close();

    }

}