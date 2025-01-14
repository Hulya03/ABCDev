import java.util.Scanner;

public class Exo24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir un nombre entre 0 et 23 :");
        int heure = sc.nextInt();
        System.out.println("Veuillez saisir un nombre 0 et 59 :");
        int min = sc.nextInt();

        int heuresup = heure + 1;
        int minsup = min + 3;
        int minuit = 0;

        if (heure < 0 || heure >= 24 || min < 0 || min > 59) {
            System.out.println("Les données saisies sont invalides");

        } else {
            if (heure == 23 && min >=57){
                System.out.println("il est " + heure + " H " + min + ". Dans 3 min, il sera " + "0" + minuit + " H 0" + (minsup - 60));
            }
             else if (min < 57) {
                System.out.println("il est " + heure + " H " + min + ". Dans 3 min, il sera " + heure + " H " + minsup);

            } else {
                System.out.println(
                        "il est " + heure + " H " + min + ". Dans 3 min, il sera " + heuresup + " H 0" + (minsup - 60));
            }
        }
        sc.close();
    }
}
