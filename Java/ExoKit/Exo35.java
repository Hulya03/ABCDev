
import java.util.Scanner;

public class Exo35 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre ");
        long nombre = sc.nextLong();
        long nombreLimite = nombre;

        for (int i = 1; i < nombreLimite; i++) {
            nombre = nombre * i;
        }

        System.out.println("La factorielle de " + nombreLimite + " est : " + nombre);

        sc.close();
    }

}