package POO.Fraction;

public class mainFraction {

    public static void main(String[] args) {
        
        Fraction f1 = new Fraction(-12,-7);

        Fraction f2 = new Fraction();

        Fraction f3 = new Fraction(9);


        Fraction f4 = new Fraction(12,7);
        Fraction f5 = new Fraction(4,7);


        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());

        f1.oppose();

        System.out.println(f1.toString());

        f1.inverse();

        System.out.println(f1.toString());

        

       // System.out.println(f4.superieur(f5));

       // System.out.println(f4.egalA(f5));

        f4.plus(f5);

        System.out.println(f4.toString());
        
    }
    

}
