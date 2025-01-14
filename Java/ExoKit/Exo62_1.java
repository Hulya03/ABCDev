import java.util.Scanner;

public class Exo62_1 {
    
    public static void main(String[] args) {


        // dans une chaine de caractere, tu peux mettre des chiffres 
        // MAIS dans int, float, double.. tu peux pas mettre de lettre 
        // DONC  commencer avec un String 

        // double precision => utilisation de double

        Scanner sc;
        String input; // valeur en km

        double valeurMi;

        sc = new Scanner(System.in);

        //"break" is used to exit from the loop. "System.exit" is used to exit from the program

        do {
        System.out.println("Veuillez saisir une valeur entre 0.01 et 1 000 000, puis 'q' pour terminer le programme.");
        input = sc.nextLine();    
            if (input.contentEquals("q")) {
                System.out.println("Programme terminé");
                System.exit(0); 
            }
            else if (Double.parseDouble(input) >= 0.1 && Double.parseDouble(input) <= 1000000) {
                valeurMi = Double.parseDouble(input) / 1.609; 
                System.out.println(input + " vaut " + String.format("%.2f",valeurMi) + " miles.");
            }
        } while (Double.parseDouble(input) < 0.1 || Double.parseDouble(input) > 1000000);

        sc.close();

    }
}
