package POO.Fraction;

public class Fraction {

    // Attributs
    private int numerateur;
    private int denominateur;

    // Constructeur par défaut
    public Fraction() {
        this.denominateur = 1;

    }

    // Constructeur classique
    public Fraction(int numerateur, int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
        if (this.numerateur < 0 && this.denominateur < 0) {
            this.denominateur *= (-1);
            this.numerateur *= (-1);

        }
    }

    // Constructeur sur mesure
    public Fraction(int numerateur) {
        this.denominateur = 1;
        this.numerateur = numerateur;
    }

    // Constructeur par clonage
    public Fraction(Fraction fractionAcloner) {
        this.numerateur = fractionAcloner.numerateur;
        this.denominateur = fractionAcloner.denominateur;
    }

    // Représentation textuelle
    public String toString() {
        String result;
        result = this.numerateur + "/" + this.denominateur;
        if (this.denominateur == 1) {
            //Integer.toString = permet d'afficher des int dans string 
            result = Integer.toString(this.numerateur);
        }
        if (this.numerateur == 0) {
            result = Integer.toString(0);
        }
        return result;
    }

    // Méthode qui permet d'écrire l'opposé
    public void oppose() {
        if (this.denominateur > 0) {
            this.numerateur *= (-1);
        }
        if (this.denominateur < 0) {
            this.denominateur *= (-1);
        }

    }

    // Méthode qui permet d'écrire l'inverse
    public void inverse() {

        try {
        int boite;
        int test;
        boite = this.numerateur;
        this.numerateur = this.denominateur;
        this.denominateur = boite;
        test = this.numerateur / this.denominateur;
        } catch (Exception e) {
            System.out.println("Attention ! on ne peut pas diviser par zéro");
        }

    }

    // Méthode qui permet de savoir si une fraction est supérieure à une autre
    public boolean superieur(Fraction f1) {
        if (this.numerateur / this.denominateur > f1.numerateur / f1.denominateur) {
            return true;
        }
        return false;
    }

    // Méthode qui permet de savoir si une fraction est égale à une autre
    public boolean egalA(Fraction f1) {
        if (this.numerateur / this.denominateur == f1.numerateur / f1.denominateur) {
            return true;
        }
        return false;
    }

    // Méthode privée pour trouver le PGCD
    private int getPgcd() {
        int a = this.numerateur;
        int b = this.denominateur;
        int pgcd = 1;

        if (a != 0 && b != 0) {
            if (a < 0)
                a = -a;

            if (b < 0)
                b = -b;

            while (a != b) {
                if (a < b) {
                    b = b - a;
                } else {
                    a = a - b;
                }
            }

            pgcd = a;
        }

        return pgcd;
    }


    // Méthode privée pour réduire la fraction
    private void reduire(){
        int pgcd = this.getPgcd();
        
        this.numerateur = this.numerateur / pgcd; 
        this.denominateur = this.denominateur / pgcd; 

        if (this.numerateur > 0 && this.denominateur < 0) {
            this.numerateur *= (-1);
            this.denominateur *= (-1);
        }
    }


    //Méthode qui permet d'additionner 
    public void plus(Fraction fractionAAdditionner){

        
        //mutliplication de la première fraction avec le dénominateur de la fractionAAdditionner
        this.numerateur *= fractionAAdditionner.denominateur;
        this.denominateur *= fractionAAdditionner.denominateur;
        //mutliplication de la fractionAAdditionner par le dénominateur de  la première fraction
        fractionAAdditionner.numerateur *= fractionAAdditionner.denominateur;
             //addition des deux numérateurs
        this.numerateur = this.numerateur + fractionAAdditionner.numerateur;
    }


    //Méthode qui permet de soustraire 
    public void moins(Fraction fractionAAdditionner){
        //mutliplication de la première fraction avec le dénominateur de la fractionAAdditionner
        this.numerateur *= fractionAAdditionner.denominateur;
        this.denominateur *= fractionAAdditionner.denominateur;
        //mutliplication de la fractionAAdditionner par le dénominateur de  la première fraction
        fractionAAdditionner.numerateur *= fractionAAdditionner.denominateur;
        //addition des deux numérateurs
        this.numerateur = this.numerateur - fractionAAdditionner.numerateur;
    }

    //Méthode qui multiplie deux fractions 
    public void multiplie(Fraction fractionAMultiplier){
        this.numerateur = this.numerateur * fractionAMultiplier.numerateur;
        this.denominateur = this.denominateur * fractionAMultiplier.denominateur; 
    }


    //Méthode pour diviser deux fractions
    public void divise(Fraction fractionADiviser){
        fractionADiviser.inverse();
        this.multiplie(fractionADiviser);

    }

}
