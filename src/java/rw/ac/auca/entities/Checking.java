package rw.ac.auca.entities;

/**
 *
 * @author hirwa
 */
public class Checking {
    private String registrationNumberC;
    private String passwordC;

    public Checking() {
    }

    public Checking(String registrationNumberC, String passwordC) {
        this.registrationNumberC = registrationNumberC;
        this.passwordC = passwordC;
    }

    public String getRegistrationNumberC() {
        return registrationNumberC;
    }

    public void setRegistrationNumberC(String registrationNumberC) {
        this.registrationNumberC = registrationNumberC;
    }

    public String getPasswordC() {
        return passwordC;
    }

    public void setPasswordC(String passwordC) {
        this.passwordC = passwordC;
    }    
}
