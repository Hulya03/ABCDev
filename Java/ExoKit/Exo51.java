import java.util.Scanner;

public class Exo51 {
    public static void main(String[] args) {
        int result1; 
        int result2;
        float result3;
        float result4;

            // 3 manières d'"intégrer" les valeurs dans les fonctions :

            // 1) avec un scanner dans le main 

        int nb1;
        int nb2;
        Scanner sc;

        sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le nombre 1 :");
        nb1 = sc.nextInt();
        System.out.println("Veuillez saisir le nombre 2 :");
        nb2 = sc.nextInt();
        
        result1 = Exo51.getSum(nb1, nb2);

            // 2) entrée des valeur en "brut"

        result2 = Exo51.getSub(12,8);
        result3 = Exo51.getMulti(7,9);
        result4 = Exo51.getDiv(15, 3);


            // 3) Créer une procédure pour la saisie de la valeur via un scanner 
                //cela evitera de récrire le scanner plusieurs fois

                //mais comment ??

        /*int nb;
        int result5; 
        
        result5 = Exo51.saisieNombre(nb);*/


        // Quand on a des fonctions, il est ppréféable d'utiliser le main pour printer les resultats

        System.out.println("Somme : " + result1);
        System.out.println("Différence : " + result2);
        System.out.println("Produit : " + result3);
        System.out.println("Quotient : " + result4);
        
        sc.close();
    }

    public static int getSum(int nb1, int nb2) {
        int sum;

        sum = nb1 + nb2;
        return sum;
    }

    public static int getSub(int nb1, int nb2) {
        int sub;
 
        sub = nb1 - nb2;
        return sub;
    }

    public static float getMulti(float nb1 , float nb2) {
        float multi;

        multi = nb1 * nb2;
        return multi;
    }

    public static float getDiv(int nb1, int nb2) {
        float div;
        float divA;

        div = (float)nb1 / (float)nb2;

        if (nb2 == 0){
            div = 0;
        }

        divA = Math.round((div * 100.0) /100.0);

        return divA;
    }


     /*    
       fonction scanner (tentative)
       public static int saisieNombre(int nb){
        Scanner sc;

        sc = new Scanner (System.in);
        System.out.println("Veuillez saisir vontre nombre");
        nb = sc.nextInt();

        return nb;

        

    }
    */

    
}
