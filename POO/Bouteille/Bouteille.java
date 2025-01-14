public class Bouteille {

    private boolean estOuvert;
    private float contenanceEnMl; 
    private float contenuEnPourcentage;
//
    //Constructeur par défaut 
    public Bouteille(){
    }

    // Constructeur classique 
    // This. sert à indiquer un objet particulier  ???,
    public Bouteille( boolean estOuvert, float contenanceEnMl , float contenuEnPourcentage ) {
        this.estOuvert = estOuvert;
        this.contenanceEnMl = contenanceEnMl;
        this.contenuEnPourcentage = contenuEnPourcentage;
    }


    //Constructeur par clonage 
    //public.... ???

    // getter : renvoie l'état de l'attribut estOuvert
    public boolean getEstOuvert(){
        return estOuvert;
    }

    // setter : permet de changer l'état de l'attribut estOuvert
    // on met this.attribut quand on veut changer la valeur de l'attribut
    public void setEstOuvert(boolean estOuvert){
        this.estOuvert = estOuvert; 
    }

    public float getContenanceEnMl(){
        return contenanceEnMl;
    }

    public void setContenanceEnMl(float contenanceEnMl){
        this.contenanceEnMl = contenanceEnMl;
    }

    public float getContenuEnPourcentage(){
        return contenuEnPourcentage;
    }

    public void setContenuEnPourcentage(float contenuEnPourcentage){
        this.contenuEnPourcentage = contenuEnPourcentage;
    }


    // Opération/Méthode ouvrir()
    // tu ouvres ta bouteille donc estOuvert devient vrai 
    public boolean ouvrir(){
        if (estOuvert == true){
            System.out.println("La bouteille est déjà ouverte");
            return false; 
            // false parce qu'on peut pas l'ouvrir 
        }else{ 
            this.estOuvert = true;
            System.out.println("La bouteilles est maintenant ouvert");
            return true;
        }
    }

    public boolean fermer(){
        if(estOuvert == false ){
            System.out.println("La bouteille est éja fermée");
            return false; 
        }else {
            this.estOuvert = false;
            return true;
        }
   
    }

    public String toString(){
        return "[Bouteille estOuvert:" + estOuvert + " contenanceEnMl:" + contenanceEnMl + "contenuEnPourcentage:" + contenuEnPourcentage + "]" ;
    }

    
}
