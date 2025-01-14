import java.util.Scanner;

public class Exo15 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println( "Veuilez saisir le rayon :");
        System.out.println( "Veuilez saisir l'angle :");

        double rayon = sc.nextDouble();
        double angle = sc.nextDouble();

        double result = (Math.PI * rayon * rayon * angle) / 360;

        System.out.println("L'aire du secteur circulaire est de " + result);


        sc.close();
    }

}
