package POO.Fraction;

public class mainFraction {

    public static void main(String[] args) {
        
        Fraction f1 = new Fraction(-12,-7);

        Fraction f2 = new Fraction();

        Fraction f3 = new Fraction(9);


        Fraction f4 = new Fraction(15,4);
        Fraction f5 = new Fraction(9,4);


        Fraction f6 = new Fraction(2,5);
        Fraction f7 = new Fraction(9,4);


        Fraction f8 = new Fraction(2,5);
        Fraction f9 = new Fraction(9,4);

        Fraction f10 = new Fraction(0,10);

    


        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());

        f1.oppose();

        System.out.println(f1.toString());

        f10.inverse();

        System.out.println(f1.toString());

        

       System.out.println(f4.superieur(f5));

       System.out.println(f4.egalA(f5));

        f4.plus(f5);

        System.out.println(f4.toString());


        f6.multiplie(f7);

        System.out.println(f6.toString());

        f8.divise(f9);

        System.out.println(f8.toString());


        
    }
    

}
