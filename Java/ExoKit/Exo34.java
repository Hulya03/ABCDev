
import java.util.Scanner;

public class Exo34 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre ");
        int nombre = sc.nextInt();
        int nombreLimite = nombre;

        for (int i = 0; i < nombreLimite; i++) {
            nombre = nombre + i;
        }

        System.out.println("La somme des nombres jusqu'à " + nombreLimite + " est : " + nombre);

        sc.close();
    }

}
