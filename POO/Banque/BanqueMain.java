

public class BanqueMain {


    public static void main(String[] args) {
        
        Banque b1 = new Banque("Crédit Mutuel", "Châteauneuf");

        b1.ajouteCompte(1245, "Robert", 2000, 300);
        b1.ajouteCompte(2568,"Denis", 1000, 400);

        System.out.println(b1.toString());

        
        System.out.println("Le compte avec le solde supérieur : " + b1.compteSup());

        b1.transferer(1245,2568,10000);
    }
    
}
