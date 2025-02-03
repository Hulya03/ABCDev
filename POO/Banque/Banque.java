
import java.util.ArrayList;

public class Banque {

    // Attributs
    private ArrayList<CompteBancaire2> mesComptes;
    private int nbCompte;
    private String nom;
    private String ville;

    // Constructeur
    public Banque(ArrayList<CompteBancaire2> mesComptes, int nbCompte, String nom, String ville) {
        this.mesComptes = mesComptes;
        this.nbCompte = nbCompte;
        this.nom = nom;
        this.ville = ville;
    }

    // Constructeur sur mesure
    public Banque(String nom, String ville) {
        this.mesComptes = new ArrayList<>();
        this.nom = nom;
        this.ville = ville;

        // this.mesComptes = new ArrayList<>();
        // pour spécifier que mesComptes est un conteneur !!
    }

    // 2 Méthodes pour ajouter un compte :

    // 1. On ajoute un compte existant
    public void ajouteCompte(CompteBancaire2 compteAAjouter) {
        mesComptes.add(compteAAjouter);
    }

    // 2. On créé le compte et on l'ajoute après
    public void ajouteCompte(int numeroCompte, String nomClient, double solde, double montantDecouvertAutorise) {
        CompteBancaire2 compteAAjouter = new CompteBancaire2(numeroCompte, nomClient, solde, montantDecouvertAutorise);
        mesComptes.add(compteAAjouter);
    }

    // Méthode toString qui fait appelle à la méthode toString de la classe
    // ComtpeBancaire
    public String toString() {
        String result;
        result = mesComptes.toString();
        return result;
    }

    // Méthode qui retourne le compte ayant le solde maximum
    public CompteBancaire2 compteSup() {
        CompteBancaire2 compteSuperieur = new CompteBancaire2();
        for (CompteBancaire2 compteActuel : mesComptes) {
            // pour chaque compte de "mesComptes", à chquaque passage de "for", dans
            // compteActuel, il y aura le compte
            // (= on balaie les compte de "mesComptes", on nomme le compte étudié
            // "compteActuel" et y range les données)
            if (compteActuel.getsolde() > compteSuperieur.getsolde()) {
                compteSuperieur = compteActuel;
            }
        }
        return compteSuperieur;
    }

    // Méthode qui retourne un compte en fonction de son numéro
    public CompteBancaire2 rendCompte(int numeroCompte) {
        for (CompteBancaire2 compteActuel : mesComptes) {
            if (compteActuel.getnumeroCompte() == numeroCompte) {
                return compteActuel;
            }
        }
        return null;
    }

    // Méthode qui va transférer une somme d'argent d'un compte vers un autre
    public void transferer(int numeroCompte1, int numeroCompte2, double montantATransferer) {

        // 2 façons d'atteindre le compte bancaire :
        // en crééant un objet ou en mettant "rendCompte(numeroCompte1)"
        CompteBancaire2 compte1 = rendCompte(numeroCompte1);
        CompteBancaire2 compte2 = rendCompte(numeroCompte2);

        if (montantATransferer < (rendCompte(numeroCompte1).getsolde() + compte1.getMontantDecouvertAutorise())) {
            System.out.println("Transfert réussi");

        } else {
            System.out.println("Transfert impossible");
        }

    }

}
