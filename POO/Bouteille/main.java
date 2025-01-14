public class main {

    public static void main(String[] args) {
        
        Bouteille b1 = new Bouteille(true, 1000, 25);

        
        System.out.println(b1.toString());
        System.out.println(b1.fermer());
        System.out.println(b1.toString());


    }
    
}
