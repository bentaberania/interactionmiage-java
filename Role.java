/* 
Bentabe Rania 22412390
Basraoui Nada 22414318 
*/

public class Role  {
    private String nomRole;

    public Role(String nomRole) {
        this.nomRole = nomRole;
    }

    public String getNomRole() {
        return nomRole;
    }

    public void setNomRole(String nomRole) {
        this.nomRole = nomRole;
    }

    @Override
    public String toString() {
        return nomRole;
    }


 
}
