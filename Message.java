/* 
Bentabe Rania 22412390
Basraoui Nada 22414318 
*/

public class Message {
    private String contenu;
    private String expediteur; 
    private String destinataire; 

    public Message(String contenu, String expediteur, String destinataire) {
        this.contenu = contenu;
        this.expediteur = expediteur;
        this.destinataire = destinataire;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getExpediteur() {
        return expediteur;
    }

    public void setExpediteur(String expediteur) {
        this.expediteur = expediteur;
    }

    public String getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(String destinataire) {
        this.destinataire = destinataire;
    }

    @Override
    public String toString() {
        return "Message de " + expediteur + " à " + destinataire + " : " + contenu;
    }

}
