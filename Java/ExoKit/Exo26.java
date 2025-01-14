import java.util.Scanner;

public class Exo26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer une année : ");

        int annee = sc.nextInt();

        if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) {
            System.out.println("L'année " + annee + " est une année bissextile");
        } else {
            System.out.println("L'année " + annee + " n'est pas une année bissextile");
        }

        sc.close();
    }
}
