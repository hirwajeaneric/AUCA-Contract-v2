package rw.ac.auca.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author hirwa
 */
@Entity
public class AucaStudents implements Serializable {
    @Id
    private String regNumber;
    private String firstName;
    private String lastName;
    private String email;
    private String faculty;
    private String department;
    private String residence;

    public AucaStudents() {
    }

    public AucaStudents(String regNumber, String firstName, String lastName, String email, String faculty, String department, String residence) {
        this.regNumber = regNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.faculty = faculty;
        this.department = department;
        this.residence = residence;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }
    
    
}
