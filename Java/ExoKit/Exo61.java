public class Exo61 {

  /*
   * On souhaite écrire un programme de calcul des 4 premiers nombres parfaits.
   * 
   * Un nombre est dit parfait s’il est égal à la somme de ses diviseurs, 1
   * compris.
   */

  public static void main(String[] args) {

    int nbParfait; // on veut les 4 premiers nombres parfaits
    int nbAtester;
    int sommeDiviseur;
    int diviseur;
    
    nbAtester = 1;
    nbParfait = 0;

    while (nbParfait < 5) {

      sommeDiviseur = 0;
      diviseur = 1;
      while (diviseur < nbAtester) {

        // quand on fait modulo de deux nombre entier et que le resultat est 0.5, il
        // arrondit au dessus
        if (nbAtester % diviseur == 0) {
          sommeDiviseur = sommeDiviseur + diviseur;
        }
        diviseur++;
      }

      if (nbAtester == sommeDiviseur) {
        nbParfait++;
        System.out.println(nbAtester + " est un nombre parfait.");
      }
      nbAtester++;
    }

  }

}
