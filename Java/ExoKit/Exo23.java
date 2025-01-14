import java.util.Scanner;

public class Exo23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer votre âge : ");

        int age = sc.nextInt();

        if (age < 5) {
            System.out.println("Vous êtes trop jeune");
        } else if (age >= 5 && age <= 6) {
            System.out.println("Vous êtes débutant");
        } else if (age >= 7 && age <= 8) {
            System.out.println("Vous êtes Poussin");
        } else if (age >= 9 && age <= 10) {
            System.out.println("Vous êtes Benjamin");
        } else if (age >= 11 && age <= 12) {
            System.out.println("Vous êtes Pupille");
        } else if (age >= 13 && age <= 14) {
            System.out.println("Vous êtes Minime");
        } else if (age >= 15 && age <= 16) {
            System.out.println("Vous êtes Cadet");
        } else if (age >= 17 && age <= 18) {
            System.out.println("Vous êtes Junior");
        } else if (age >= 19 && age <= 34) {
            System.out.println("Vous êtes Sénior");
        } else if (age >= 35) {
            System.out.println("Vous êtes Vétéran");
        }

        sc.close();
    }

}
