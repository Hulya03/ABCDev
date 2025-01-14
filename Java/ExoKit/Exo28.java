import java.util.Scanner;

public class Exo28 {
    
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);

    System.out.println("Pourcentage Candidat 1 : ");
    double cand1 = sc.nextDouble();
    System.out.println("Pourcentage Candidat 2 : ");
    double cand2 = sc.nextDouble();
    System.out.println("Pourcentage Candidat 3 : ");
    double cand3 = sc.nextDouble();
    System.out.println("Pourcentage Candidat 4 : ");
    double cand4 = sc.nextDouble();

    double total = cand1 + cand2 + cand3 + cand4;

    double candp1 = cand1 / total * 100;
    double candp2 = cand2 / total * 100;
    double candp3 = cand3 / total * 100;
    double candp4 = cand4 / total * 100;


      if (candp1 >50){
        System.out.println("Le candidat 1 est élu");
      } else if ( candp1 >= 12.5 /*&& candp1 < 50 (inutile car on est déja en dessous de 50*/ && candp1 >candp2 && candp1 >candp3 && candp1> candp4){
        System.out.println("Le candidat 1 est en ballotage favorable"); 
      } else if ( candp1 >= 12.5 && (candp1 <candp2 || candp1 <candp3 || candp1<candp4)){
      System.out.println("Le candidat 1 est en ballotage défavorable");
      }else {
        System.out.println("Le candidat 1 est éliminé");

      }

    sc.close();
    }
}
