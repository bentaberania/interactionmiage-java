/* 
Bentabe Rania 22412390
Basraoui Nada 22414318 
*/

public class Modification {
    private String contenu;

    public Modification(String contenu) {
        this.contenu = contenu;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public String toString() {
        return "Modification : " + contenu;
    }


}
