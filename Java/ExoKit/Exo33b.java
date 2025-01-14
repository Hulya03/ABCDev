
import java.util.Scanner;

public class Exo33b {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        int nombre = sc.nextInt();
        int nombreSup = nombre + 10;

        System.out.println("Les 10 nombres après " + nombre + " sont ");

        for (int i = nombre; i < nombreSup; i++) {

            nombre = nombre + 1;
            System.out.print(nombre + ",");
        }
        sc.close();

    }

}