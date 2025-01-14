public class Exo44 {

    public static void main(String[] args) {
        
        /* VARAIBLES */
        
        float [] tab ;
        float result;

        /* TRAITEMENTS */

        tab  = new float[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        result = 0;

        for (int i = 0; i < tab.length; i++) {
            result = result + tab[i];
        }

        /* AFFICHAGE RESULTATS */

        System.out.println("La somme des nombres vaut : " + result );
    }
    
}
