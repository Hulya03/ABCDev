import java.util.Scanner;

public class Exo12 {

   public static void main(String[] args) {
    
    System.out.println("Quel est votre nom ?");

    Scanner Obj = new Scanner(System.in);

    String nom = Obj.nextLine();

    System.out.println( "Bonjour " + nom );
    

    Obj.close();
}

}
