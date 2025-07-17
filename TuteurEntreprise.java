/* 
Bentabe Rania 22412390
Basraoui Nada 22414318 
*/

public class TuteurEntreprise extends Utilisateur {
    private String nomEntreprise;
    private int idTuteur;
    private String post;

    public TuteurEntreprise(String nom, String prenom, String login, String nomEntreprise, int idTuteur, String post) {
        super(nom, prenom, login);
        this.nomEntreprise = nomEntreprise;
        this.idTuteur = idTuteur;
        this.post = post;
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public int getIdTuteur() {
        return idTuteur;
    }

    public String getPost() {
        return post;
    }

    public Role getRole() {
        return new Role("Tuteur Entreprise");
    }

    public void consulterCompteRenduVisite(CompteRenduVisite compteRendu) {
        System.out.println("Tuteur Entreprise " + getNom() + " consulte le compte-rendu de visite : " + compteRendu.getContenu());
    }

    public void ajouterModification(Modification modification) {
        System.out.println("Tuteur Entreprise " + getNom() + " ajoute des modifications : " + modification.getContenu());
    }

    @Override
    public void interagir(String message) {
        System.out.println("Tuteur Entreprise " + getNom() + " : " + message);
    }
}
