public class Exo52 {
    
    public static void main(String[] args) {
        
        String nomSavant;
        String concatenationNom;
        String nomMaj;
        String ccl;
        
        nomSavant = getMC2();
        concatenationNom = getUserName("mickaël", "devoldère");
        nomMaj = getFullName("devoldère", "mickaël");
        ccl = askUser("devoldère" , "mickaël");


        System.out.println(nomSavant);
        System.out.println(concatenationNom);
        System.out.println(nomMaj);
        System.out.println(ccl);
        
    }

    public static String getMC2(){
        return "Einstein";
    }

    public static String getUserName(String prenom, String nom){
        return prenom+nom;
    }

    public static String getFullName(String nom, String prenom){

        prenom = prenom.substring(0,1).toUpperCase() + prenom.substring(1);
        nom = nom.toUpperCase();

        return prenom + " " + nom ;
    }

    public static String askUser( String nom, String prenom){

        String nomSavant;
        String nomMaj;
        
        nomSavant = getMC2();
        nomMaj = getFullName("devoldère", "mickaël");

        return "Bonjour " + nomMaj + ", connaissez-vous " + nomSavant + "?" ;
    }
}
