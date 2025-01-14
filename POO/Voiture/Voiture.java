
public class Voiture implements Cloneable {

    //Attribut 
    private String marque;
    private int annee;
    private int nbDeRoue;
    private String typeCarburant;
    private boolean moteur;
    private boolean contact;
    private boolean accelerateur;
    private boolean frein;

    //Constructeur par défaut 
    public Voiture() {

    }

    // différencier this.marque (attribut) et marque (varible qu'on rentre en paramèetre pour instancier l'objet voiture)
    //Constructeur classique 
    public Voiture(String indiquerMarque, int annee, int nbDeRoue, String typeCarburant, boolean moteur, boolean contact, boolean accelerateur, boolean frein) {
        this.marque = indiquerMarque;
        this.annee = annee;
        this.nbDeRoue = nbDeRoue;
        this.typeCarburant = typeCarburant;
        this.moteur = moteur;
        this.contact = contact;
        this.accelerateur = accelerateur;
        this.frein = frein;
    }

    //Constructeur par clonage ???
    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException cnse) {
            cnse.printStackTrace(System.err);
        }
        return o;
    }

    // this.permet de changer l'état de l'attribut 
    public void demarrer() {
        if (contact == true) {
            if (moteur == false) {
                this.moteur = true;
                System.out.println("La voiture démarre");
            } else {
                System.err.println("La voiture est déjà démarrée.");
            }
        }else{
            System.out.println("il n'y a pas le contact ");
        }
    }

    public void stopper() {
        if (moteur == true) {
            this.moteur = false;
            System.out.println("La voiture est maintenant arrétée");
        } else {
            System.out.println("Le moteur est déjà à l'arrêt");
        }
    }

    public void avancer() {
        if (moteur == true) {
            this.accelerateur = true;
            this.frein = false;
            System.out.println("La voiture accélère");
        } else {
            System.out.println("La voiture n'est pas démarrée");
        }
    }

    public void ralentir() {
        if (moteur == true) {
            this.frein = true;
            this.accelerateur = false; 
            System.out.println("La voiture ralentit");
        } else {
            System.err.println("La voiture n'est pas démarrée");
        }
    }

    public String toString() {
        return "Voiture [ marque : " + marque + "année : " + annee + "nombre de roues : " + nbDeRoue + "type de carburant : "
                + typeCarburant + "moteur : " + moteur + "contact : " + contact + "accélération : " + accelerateur + "frein : " + frein + "]";
    }
}
