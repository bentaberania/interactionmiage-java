/* 
Bentabe Rania 22412390
Basraoui Nada 22414318 
*/

import java.util.ArrayList;
import java.util.List;

public class ListUtilisateur {
    private List<Utilisateur> utilisateurs;

    public ListUtilisateur() {
        utilisateurs = new ArrayList<>();
        initialiserUtilisateurs(); // Initialiser les utilisateurs par défaut
    }

    // Méthode pour ajouter un utilisateur
    public void ajouterUtilisateur(Utilisateur utilisateur) {
        utilisateurs.add(utilisateur);
    }

    // Méthode pour rechercher un utilisateur par login
    public Utilisateur rechercherUtilisateur(String login) {
        for (Utilisateur utilisateur : utilisateurs) {
            if (utilisateur.getLogin().equals(login)) {
                return utilisateur;
            }
        }
        return null;
    }

    // Initialiser des utilisateurs par défaut
    private void initialiserUtilisateurs() {
        utilisateurs.add(new Etudiant("Bentabe", "Rania", "rania123", 1, "M1"));
        utilisateurs.add(new TuteurUniversitaire("Dupond", "Jean", "dupond123", 2));
        utilisateurs.add(new TuteurEntreprise("Basraoui", "Nada", "nada123", "Entreprise X", 3, "dev"));
    }
}
