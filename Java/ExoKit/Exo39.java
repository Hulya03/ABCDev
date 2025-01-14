import java.util.Scanner;

public class Exo39 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long i;

        System.out.println("Nombre de chevaux partants : ");
        long n = sc.nextLong();
        long nLimite = n;
        System.out.println("Nombre de chevaux joués : ");
        long p = sc.nextLong();
        long pLimite = p;
        
        long diff = (n - p);
        long diffLimite = diff;

        // factorielle de n, p et de diff (la différence n-p)
        long nfact = 0;
        long pfact = 0;
        long diffFact = 1;

        sc.close();

        for (i = 1; i < nLimite; i++) {
            n = n * i;
            nfact = n;
        }


        for (i = 1; i < pLimite; i++) {
            p = p * i;
            pfact = p;
        }

        for (i = 1; i < diffLimite; i++) {
            diff = diff * i;
            diffFact = diff;
        }

        long X = nfact / diffFact;
        long Y = nfact / (pfact * diffFact);
        System.out.println("Dans l'ordre : une chance sur " + X + " de gagner");
        System.out.println("Dans l'ordre : une chance sur " + Y + " de gagner");
System.out.println(diff);

    }

}
