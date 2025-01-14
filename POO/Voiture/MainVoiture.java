public class MainVoiture {

    public static void main(String[] args) throws Exception {


        Voiture v0 = new Voiture() ;

        Voiture v1 = new Voiture(" Mercedes ", 2019 , 4 , " Diesel ", true, true, false, false);

        Voiture v2 = (Voiture) v1.clone();

        System.out.println(v1.toString());

        v1.demarrer();
        v1.stopper();
        v1.avancer();
        v1.ralentir();

        System.out.println(v1.toString());
        
    }



}