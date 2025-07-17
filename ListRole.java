/* 
Bentabe Rania 22412390
Basraoui Nada 22414318 
*/

import java.util.ArrayList;
import java.util.List;

public class ListRole {
    private List<Role> roles;

    public ListRole() {
        roles = new ArrayList<>();
        initialiserRoles(); // Initialiser les rôles par défaut
    }

    // Méthode pour initialiser les rôles par défaut
    private void initialiserRoles() {
        roles.add(new Role("Etudiant(e)"));
        roles.add(new Role("Tuteur Universitaire"));
        roles.add(new Role("Tuteur Entreprise"));
    }

    // Méthode pour obtenir la liste des rôles
    public List<Role> getRoles() {
        return roles;
    }

}
