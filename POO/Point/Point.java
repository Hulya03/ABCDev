public class Point {
     
    //Attributs
    private double abscisse;
    private double ordonnee;


    //Constructeur par défaut
    public Point(){

    }

    //Constructeur classique
    public Point(double abscisse , double ordonnee) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }


    //Opérations

    public String toString(){
        String result;
        result = "Le point a pour abscisse " + abscisse + " et pour ordonnée : " + ordonnee + ".";
        return result;
    }



        //symetrie par rapport à l'axe des ordonnées 
    public void symOrdonnee(){
        this.abscisse = abscisse * (-1);
    }


        //symetrie par rapport à l'axe des abscisses
    public void symAbscisse(){
        this.ordonnee = ordonnee * (-1);
    }

        //symétrie par rapport à l'origine 
    public void symOrigine(){
        this.abscisse = abscisse * (-1);
        this.ordonnee = ordonnee * (-1);
    }

        //permuter les coordonnées 
    public void permutation(){
        double boite;
        boite = this.abscisse;
        this.abscisse = this.ordonnee;
        this.ordonnee = boite;
    }
    
}
