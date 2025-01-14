import java.util.Scanner;

    // permet de manipuler date
import java.time.LocalDate;

    //permet d'obtenir une quantité de temps
import java.time.Period;

    //permet d'utiliser "DateTimeFormatter" pour format JJ/MM/AAAA
import java.time.format.DateTimeFormatter;




public class ExoM {
    
    public static void main(String[] args) {
        
        //Saisie du nom et prénom 

        Scanner Obj = new Scanner(System.in);
        System.out.println(" Veuillez saisir votre nom : ");
        String nom = Obj.nextLine();
        System.out.println(" Veuillez saisir votre prénom : ");
        String prenom = Obj.nextLine();

        
        // Saisie de la date de naissance 

               // convertir la date en format JJ/MM/AAAA
         DateTimeFormatter Convertisseur = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Veuillez saisir votre date de naissance en format JJ/MM/AAAA :");

        String dateAnniv = Obj.nextLine();

            // parsing (= analyse ) = extrait info d'un ensemble de données. dans ce cas : cenversion "String" en format date 
            // Je prends la date d'anniv + le convertisseur pour obtenir le bon format 
        LocalDate dateAnnivBonFormat = LocalDate.parse(dateAnniv,Convertisseur);


     
            //pour voir la date d'aujourd'hui
        LocalDate today = LocalDate.now();

        


            //pour avoir la durée en anniv et aujours en années (d'où "getYears")
        int age = Period.between(dateAnnivBonFormat,today).getYears();


        if (age >= 18) {
            System.out.println("Quel est votre métier ?");
            String metier = Obj.nextLine();
            System.out.println(nom + " - " + prenom + " - " + dateAnniv + " ("+age+")" + " - " + metier);
        }else{
            System.out.println("Quelle est votre couleur préférée ?");
            String couleur = Obj.nextLine();
            System.out.println(nom + " - " + prenom + " - " + dateAnniv + " ("+age+")" + " - " + couleur);

        }

        Obj.close();

    }

}
