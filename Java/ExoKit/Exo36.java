import java.util.Scanner;

public class Exo36 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nombreMax = 0;
        int imax = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Entrez le nombre numéro " + i + " :");
            int nombre = sc.nextInt();
            if (nombre > nombreMax) {
                nombreMax = nombre;
                imax = i;
            }
        }
        System.out.println("Le résultat :");
        System.out.println("Le plus grand nombre est : " + nombreMax);
        System.out.println(nombreMax + " était le nombre numéro " + imax);

        sc.close();
    }
}
