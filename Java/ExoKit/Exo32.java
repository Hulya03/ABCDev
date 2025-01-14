
import java.util.Scanner;

public class Exo32 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer un nombre entre 10 et 20 : ");
        int nombre = sc.nextInt();

        while (nombre > 20 || nombre < 10) {

            if (nombre > 20) {
                System.out.println("Entrez un nombre plus petit");
                nombre = sc.nextInt();

            } else {
                System.out.println("Entrez un nombre plus grand");
                nombre = sc.nextInt();
            }

        }

        System.out.println("Yes, you do it !");

        sc.close();
    }
}
