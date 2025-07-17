/* 
Bentabe Rania 22412390
Basraoui Nada 22414318 
*/

public abstract class Utilisateur {
    private String nom;
    private String prenom;
    private String login;

    public Utilisateur(String nom, String prenom, String login) {
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getLogin() {
        return login;
    }

    public abstract void interagir(String message);

    @Override
    public String toString() {
        return "Utilisateur : " + getPrenom() + " " + getNom() + " (" + getLogin() + ")";
    }

}
