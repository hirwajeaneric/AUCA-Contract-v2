package rw.ac.auca.entities;

/**
 *
 * @author hirwa
 */
public class CheckA {
    private String idC;
    private String passwordC;

    public CheckA() {
    }

    public CheckA(String idC, String passwordC) {
        this.idC = idC;
        this.passwordC = passwordC;
    }

    public String getIdC() {
        return idC;
    }

    public void setIdC(String idC) {
        this.idC = idC;
    }

    public String getPasswordC() {
        return passwordC;
    }

    public void setPasswordC(String passwordC) {
        this.passwordC = passwordC;
    }
    
    
}
