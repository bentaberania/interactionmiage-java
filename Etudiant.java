/* 
Bentabe Rania 22412390
Basraoui Nada 22414318 
*/

public class Etudiant extends Utilisateur {
    private int idEtudiant;
    private String niveau;

    public Etudiant(String nom, String prenom, String login, int idEtudiant, String niveau) {
        super(nom, prenom, login);
        this.idEtudiant = idEtudiant;
        this.niveau = niveau;
    }

    public int getIdEtudiant() {
        return idEtudiant; 
    }

    public String getNiveau() {
        return niveau;
    }

    public Role getRole() {
        return new Role("Etudiant(e)");
    }

    public void envoyerCompteRenduActivite(CompteRenduActivite compteRendu) {
        System.out.println("L'étudiant(e) " + getNom() + " envoie le compte rendu des activités : " + compteRendu.getContenu());
    }

    public void consulterCompteRenduActivite(CompteRenduActivite compteRendu) {
        System.out.println("L'étudiant(e) " + getNom() + " consulte le compte rendu des activités : " + compteRendu.getContenu());
    }

    @Override
    public void interagir(String message) {
        System.out.println("Interaction de l'étudiant(e) : " + message);
    }

    @Override
    public String toString() {
        return "Etudiant : " + getPrenom() + " " + getNom() + " (Niveau : " + niveau + ")";
    }

}
