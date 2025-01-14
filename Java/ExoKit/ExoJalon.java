public class ExoJalon {

 /*  Programme à réaliser :
 
[Réception d'un message électronique] 
 
Lorsqu’un email est réceptionné par un serveur de messagerie, quelques vérifications sont nécessaires avant que l’email soit transmis à son destinataire final.  
 
Il est indispensable de contrôler que l’adresse email du destinataire existe et que la boite de réception du destinataire dispose de suffisamment d’espace disponible. Une analyse antivirus est systématiquement faite sur les pièces jointes (le serveur n’accepte que les pièces jointes inférieures à 25Mo).  
 
Si toutes les contrôles sont satisfaisants, l’email est transmis au destinataire.  
 
Le destinataire a peut-être activé un message d’absence (réponse automatique). Si tel est le cas, celui-ci est transmis à l’expéditeur. */

    public static void main(String[] args) {

        boolean adresseEmail; // adresse mail valide
        boolean espaceSuffisant; // espace suffisant pour récepion
        boolean pj; // si pj besoin d'une analyse
        double pj25; // seule pj < 25 acceptée
        boolean destinataireAbsent; // reponse automatique à activer en cas d'absence
        boolean analyseAntivirus; // analyse de l'antivirus de la pièce jointe Ok

        adresseEmail = true;
        espaceSuffisant = true;
        pj = true;
        pj25 = 12;
        destinataireAbsent = true;
        analyseAntivirus = true;

        if (pj) {
            System.out.println("La pièce jointe est en cours d'analyse");
            if (pj25 < 25 && analyseAntivirus) {
                System.out.println("La pièce jointe est OK ");
            } else if (pj25 > 25 || !analyseAntivirus) {
                System.out.println("Le mail ne peut pas être envoyé ");
            }
        }

        if (adresseEmail && espaceSuffisant && pj25 < 25) {
            System.out.println("Le mail a été envoyé");
            if (destinataireAbsent) {
                System.out.println("Le destinataire est absent. Un réponse automatique est renvoyée à l'expéditeur ");
            }

                // 2 synthaxes possibles :  !adresseEmail   ou  adresseEmail == false  
        } else if (!adresseEmail) {
            System.out.println("Le mail n'a pas pu être transmis car l'adresse mail est incorrecte. ");
        } else if (!espaceSuffisant ) {
            System.out.println(
                    "Le mail n'a pas pu être transmis car il n'y a pas assez d'espace dans la boite de réeption du destinataire ");
        } else if (pj25 > 25) {
            System.out.println("Le mail n'a pas pu être transmis car la pièce jointe est supérieure à 25 Mo ");
        }

    }
}

// dans cet exercice, il aurait fallu verifier tout d'abord si l'adresse mail est valide car sinon tout le
// reste est inutile car il n'y aura pas d'envoi.