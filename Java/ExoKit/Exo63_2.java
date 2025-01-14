import java.util.Scanner;

public class Exo63_2 {

    public static void main(String[] args) {

        Scanner sc;
        String unit;
        int minValue;
        int maxValue;
        double convertValue;

        do {

            sc = new Scanner(System.in);
            System.out.println("Saisissez 'C' ou 'F' pour l'unité de mesure ou 'quit' pour quitter: ");
            unit = sc.nextLine();

            if (unit.contains("quit")) {
                System.out.println("Programme terminé");
                System.exit(0);
            }

            System.out.println("Saisissez une valeur minimum : ");
            minValue = sc.nextInt();
            System.out.println("Saisissez une valeur maximum : ");
            maxValue = sc.nextInt();

            if (unit.contains("C")) {
                for (int i = minValue; i < maxValue; i++) {
                    convertValue = ((double) minValue * 9 / 5) + 32;
                    System.out.println(convertValue);
                    minValue++;
                }
            }

            if (unit.contains("F")) {
                for (int i = minValue; i < maxValue; i++) {
                    convertValue = ((double) minValue - 32) * 5 / 9;
                    System.out.println(String.format("%.2f", convertValue));
                    minValue++;
                }
            }

        } while (!unit.contains("quit"));

        sc.close();

    }
}
