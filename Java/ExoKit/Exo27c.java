import java.time.LocalDate;
import java.util.Scanner;
 
public class Exo27c {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int[] tab = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
 
        System.out.println(" Quel est le jour ? ");
        int jour = sc.nextInt();
 
        System.out.println(" Quel est le mois ? ");
        int mois = sc.nextInt();
 
        System.out.println(" Quel est l'année ? ");
        int annee = sc.nextInt();
 
        LocalDate date = LocalDate.now();

        
        try {
            date = LocalDate.parse(annee + "-" + mois + "-" + jour);
        }
        catch(Exception ex) {
            System.out.println(" Date invalide ");
            System.exit(0);
        }
 
        // la date est valide
       
 
        System.out.println("la date est valide");
 
        annee = date.getYear();
 
        if ((annee % 4 == 0) && (annee % 100 != 0) || (annee % 400 == 0)  && (tab[1] != 29)) {
           
               
           
            System.out.println(" L'année est bisextile");
        }
           
        else {
            System.out.println(" L'année n'est pas bisextile");
           
        }
 sc.close();
    }
}
   
 
 