import java.util.Scanner;

public class Exo14 {

    public static void main(String[] args) {

        System.out.println("Veuillez saisir le rayon de la sphère :");

        Scanner Obj = new Scanner(System.in);

        double rayon = Obj.nextInt();

        double aire = 4 * Math.PI * rayon * rayon;
        double volume = (4 * Math.PI * rayon * rayon) / 3;

        System.out.println("L'aire de votre sphère est : " + aire);
        System.out.println("Le volume de votre sphère est : " + volume);

        // si besoin, Ligne de code pour mettre 2 chiffres après la virgule :
        // (double)Math.round(result*100)/100;

        Obj.close();

    }

}
