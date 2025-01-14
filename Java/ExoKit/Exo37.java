import java.util.Scanner;

public class Exo37 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nombre = 1;
        int nombreMax = 0;
        int i = 0; 
        int imax = 0;

        while (nombre != 0) {

            System.out.println("Entrez le nombre numéro " + i + " :");
            nombre = sc.nextInt();
            i = i+1;
            if (nombre > nombreMax) {
                nombreMax = nombre ;
                imax = i;
            }
        }
        System.out.println("Le résultat :");
        System.out.println("Le plus grand nombre est : " + nombreMax);
        System.out.println(nombreMax + " était le nombre " + imax);

        sc.close();
    }
}
