import java.util.Scanner;

public class Exo63_1 {

    public static void main(String[] args) {

        // valeur.contains("C") : permet de vérifier si il y a le contenu "C" dans la
        // chaine de caractère "valeur"

        // pour extraire dernière lettre d'une chaine de caractère
        // String valeur = "985 C";
        // String lastLetter = valeur.substring(valeur.length() -1);

        // Double.parseDouble(input) : permet de transformer une chaine de carcatere en
        // "double"

        Scanner sc;
        String input;
        double value; // partie numérique de mon input
        double valueConvert;

        sc = new Scanner(System.in);

        do {

            System.out.println(
                    " Saisir une valeur numérique comprise entre -459.67 et 5 000 000 suivi de l’unité de température : - C pour Celsius - F pour Fahrenheit ");
            input = sc.nextLine();

            // garder "value" hors "if" pour pouvoir l'utiliser dans "else"

            value = Double.parseDouble(input.substring(0, input.length() - 2));

            if (value >= -459.67 && value <= 5000000) {

                if (input.contains("C")) {
                    valueConvert = (value * 9 / 5) + 32;

                    System.out.println(value + " °C vaut " + valueConvert + " °F.");
                } else {
                    valueConvert = (value - 32) * 5 / 9;

                    System.out.println(value + " °F vaut " + valueConvert + " °C.");
                }

            }

        } while (value < -459.67 || value > 5000000);

        sc.close();
    }

}
