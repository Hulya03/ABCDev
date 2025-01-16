public class mainCompteBancaire {

    public static void main(String[] args) {
        
        CompteBancaire c1 = new CompteBancaire(1592000, "Hülya", 200, 500);

        CompteBancaire c2 = new CompteBancaire(1592222, "Nunu", 100, 400);

        System.out.println(c1.toString());

        c1.crediter(500);

        System.out.println(c1.toString());

        c1.debiter(150);

        System.out.println(c1.toString());

        System.out.println(c1.transferer(c2, 200));

        System.out.println(c1.comparer(c2));







        
    }
    
}
