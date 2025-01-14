import java.util.Scanner;

public class Exo50c {
    public static void main(String[] args) {
        String result; 
        result = Exo50c.askFirstName();
        Exo50c.showResult(result);

    }

    public static String askFirstName() {
        String firstname;
        Scanner sc = new Scanner (System.in);
        System.out.println("Bonjour, saisissez votre prénom : ");
        firstname = sc.nextLine();
        sc.close();
        return firstname; // on retourne le résultat
        
    }

    public static void showResult(String name) {
        System.out.println("Bonjour " + name );
    }
} 
