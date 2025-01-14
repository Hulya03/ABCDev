import java.util.Scanner;

public class Exo13 {

    public static void main(String[] args) {

        System.out.println("Veuillez saisir un premier nombre");

        Scanner Obj = new Scanner(System.in);

        double nb1 = Obj.nextInt();

        System.out.println("Veuillez saisir un second nombre");

        double nb2 = Obj.nextInt();

        double moyenne = (nb1 + nb2) / 2;

        System.out.println("La moyenne de vos deux nombres est " + moyenne);

        Obj.close();
    }
}
