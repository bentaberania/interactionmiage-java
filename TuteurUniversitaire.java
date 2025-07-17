/* 
Bentabe Rania 22412390
Basraoui Nada 22414318 
*/

public class TuteurUniversitaire extends Utilisateur {
    private int idTuteur;

    public TuteurUniversitaire(String nom, String prenom, String login, int idTuteur) {
        super(nom, prenom, login);
        this.idTuteur = idTuteur;
    }

    public int getIdTuteur() {
        return idTuteur;
    }

    public Role getRole() {
        return new Role("Tuteur Universitaire");
    }

    public void consulterCompteRenduActivite(CompteRenduActivite compteRendu) {
        System.out.println("Tuteur Universitaire " + getNom() + " consulte le compte-rendu d'activité : " + compteRendu.getContenu());
    }

    public void envoyerCompteRenduVisite(CompteRenduVisite compteRendu) {
        System.out.println("Tuteur Universitaire " + getNom() + " envoie un compte-rendu de visite : " + compteRendu.getContenu());
    }

    public void consulterCompteRenduVisite(CompteRenduVisite compteRendu) {
        System.out.println("Tuteur Universitaire " + getNom() + " consulte le compte-rendu de visite : " + compteRendu.getContenu());
    }

    public void ajouterModification(Modification modification) {
        System.out.println("Tuteur Universitaire " + getNom() + " ajoute des modifications : " + modification.getContenu());
    }

    @Override
    public void interagir(String message) {
        System.out.println("Tuteur Universitaire " + getNom() + " : " + message);
    }

    @Override
    public String toString() {
        return "Tuteur Universitaire : " + getPrenom() + " " + getNom() + " (ID : " + idTuteur + ")";
    }

}
