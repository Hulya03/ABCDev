import java.util.Date; 

public class Film {
   
    //attributs
    private String titre;
    private String genre;     
    private int dureeEnMinutes;
    private int tempsSurPauseEnMinutes;
    private String realisateur; 
    private Date dateDeSortie; 
    private String pays; 
    private String isan;
    private String langueOriginale; 
    private boolean dispoEnVf; 

    //constructeur classique
    public Film (String titre, String genre, int dureeEnMinutes, int tempsSurPauseEnMinutes, String realisateur, Date dateDeSortie, String pays, String isan, String langueOriginale, boolean dispoEnVf){
        this.titre = titre; 
        this.genre = genre;
        this.dureeEnMinutes = dureeEnMinutes; 
        this.tempsSurPauseEnMinutes = tempsSurPauseEnMinutes; 
        this.realisateur = realisateur; 
        this.dateDeSortie = dateDeSortie; 
        this.pays = pays; 
        this.isan = isan;
        this.langueOriginale = langueOriginale;
        this.dispoEnVf = dispoEnVf; 
    }

    // methodes : 

    //convertir minutes en secondes 
    public int convertirDureeENSecondes(){
        return (this.dureeEnMinutes * 60);
    } 

    // Regarder 
    public 
    

}
