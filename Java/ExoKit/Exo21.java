import java.util.Scanner;

public class Exo21 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir un nombre :");

        int nb = sc.nextInt();

        if (nb >= 0 ){
            System.out.println("Le nombre est positif");
        }else {
            System.out.println("Le nombre est négatif");
        }

        sc.close();

    }
}
