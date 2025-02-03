public class CompteBancaire2 {
 
    //Attributs
    private int numeroCompte;
    private String nomClient;
    private double solde;
    private double montantDecouvertAutorise;
 
 
    //Constructeur par défaut
    public CompteBancaire2() {
 
    }
   
    //Constructeur classique
    public CompteBancaire2(int numeroCompte, String nomClient, double solde, double montantDecouvertAutorise){
        this.numeroCompte = numeroCompte;
        this.nomClient = nomClient;
        this.solde = solde;
        this.montantDecouvertAutorise = montantDecouvertAutorise;
 
    }

    // Constructeur par Clonage
    public CompteBancaire2 (CompteBancaire2 compteACloner){
        numeroCompte = compteACloner.numeroCompte;
        nomClient = compteACloner.nomClient;
        solde = compteACloner.solde;
        montantDecouvertAutorise = compteACloner.montantDecouvertAutorise;
    }
 
 
    //Méthode toString
    public String toString(){
        String result;
        result = "Compte Bancaire [ mumeroCompte :"+ numeroCompte + ", nomClient : " + nomClient + ", solde : " + solde + ", montantDecouvertAutorise : " + montantDecouvertAutorise + "]";
        return result;
    }
 
    // Méthodes
 
    //getter qui retourne le solde
    public double getsolde(){
        return this.solde;
    }

    //getter qui retourne le numéro de compte
    public int getnumeroCompte() {
        return this.numeroCompte;
    }

    //getter qui retourne le montant de decouvert autorisé
    public double getMontantDecouvertAutorise() {
        return this.montantDecouvertAutorise;
    }


    public void crediter(double montantACrediter){
        System.out.println( "Le compte de " + this.nomClient + " a un solde de : " + this.solde) ;
        this.solde =+ montantACrediter;
        System.out.println( "après le crédit de : " + montantACrediter + "Le compte numéro " + this.nomClient + "a un solde de : " + this.solde) ;
    }
 
    public boolean debiter(double montantADebiter){
        if (this.solde + this.montantDecouvertAutorise >= montantADebiter) {
            this.solde = this.solde - montantADebiter;  
        return true;
        } else {
            System.out.println("Solde insuffisant");
        return false ;
        }
    }
 
 
        //this.debit   (on fait le débit dans le "this", si on met c1.debit, on fait un débit du compte c1)
    public boolean transferer(CompteBancaire2 compteBeneficiaire, double montantATransferer){
        boolean result;
        result = this.debiter(montantATransferer);
        if (result){
            // on utilise la fonction "debiter" pour aller plus vite,
            // si result = true, on rentre ici
            compteBeneficiaire.crediter(montantATransferer);
        }
        return result;
    }
 
    public boolean comparer(CompteBancaire2 compte) {
        if (this.solde > compte.solde){
            System.out.println("Le solde de " + this.nomClient + " est supérieur au solde du compte de " + compte.nomClient );
            return true;
        }else {
            System.out.println("Le solde de " + this.nomClient + " est nférieur au solde du compte de " + compte.nomClient );
            return false;
        }
 
    }
 
}
 
 
