import java.util.Scanner;

public class Exo62_2 {
    
    public static void main(String[] args) {

        Scanner sc;
        String startingUnit; 
        String input; // valeur en km
        double valeur;

        sc = new Scanner(System.in);

        System.out.println("Quel est l'unité de départ ? "); 
        startingUnit = sc.nextLine();   

        // startingUnit.equalsIgnoreCase("km")
        // .equalsIgnoreCase = compare 2 chaines de caractères en ignorant les minuscules et majuscules

        do {
        System.out.println("Veuillez saisir une valeur entre 0.01 et 1 000 000, puis 'q' pour terminer le programme.");
        input = sc.nextLine();    
            if (input.contentEquals("q")) {
                System.out.println("Programme terminé");
                System.exit(0); 
            }
            else if (Double.parseDouble(input) >= 0.1 && Double.parseDouble(input) <= 1000000) {
                if (startingUnit.equalsIgnoreCase("mi")){
                valeur = Double.parseDouble(input) * 1.609; 
                System.out.println(input + " vaut " + String.format("%.2f",valeur) + " km.");
                } 
                else{
                valeur = Double.parseDouble(input) / 1.609; 
                System.out.println(input + " vaut " + String.format("%.2f",valeur) + " miles.");
                }

            }
        } while (Double.parseDouble(input) < 0.1 || Double.parseDouble(input) > 1000000);

        sc.close();

    }
}
