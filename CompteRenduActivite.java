/* 
Bentabe Rania 22412390
Basraoui Nada 22414318 
*/

public class CompteRenduActivite {
    private String contenu;

    public CompteRenduActivite(String contenu) {
        this.contenu = contenu;
    }

    public String getContenu() {
        return "Contenu: " + contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public String toString() {
        return "Compte Rendu Activité : " + contenu;
    }

}

