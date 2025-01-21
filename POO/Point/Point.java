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

    //Constructeur par clonage 
    public Point (Point p2){
        this.abscisse = p2.abscisse;
        this.ordonnee = p2.ordonnee;
    }


    //Opérations

    public String toString(){
        String result;
        result = "Le point a pour abscisse " + abscisse + " et pour ordonnée : " + ordonnee + ".";
        return result;
    }

        //modifier coordonnees
    public void change(double changeAbs, double changeOrd){
        this.abscisse = changeAbs;
        this.ordonnee = changeOrd;
    }


        //symetrie par rapport à l'axe des ordonnées 
    public void symOrdonnee(){
        this.abscisse = this.abscisse * (-1);
    }


        //symetrie par rapport à l'axe des abscisses
    public void symAbscisse(){
        this.ordonnee = this.ordonnee * (-1);
            //autre synthaxe
            //this.ordonnee *= -1;
    }

        //symétrie par rapport à l'origine 
    public void symOrigine(){
        this.abscisse = this.abscisse * (-1);
        this.ordonnee = this.ordonnee * (-1);
        System.out.println("Apres la symétrie par rapport à l'origine :");
        
            /*
            autre synthaxe en faisant appel à la fonction
            this.symOrdonnee();
            this.symAbscisse();
            */
    }

        //permuter les coordonnées 
    public void permutation(){
        double boite;
        boite = this.abscisse;
        this.abscisse = this.ordonnee;
        this.ordonnee = boite;
    }
    
}
