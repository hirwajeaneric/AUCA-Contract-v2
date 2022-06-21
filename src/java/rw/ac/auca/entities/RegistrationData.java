package rw.ac.auca.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author hirwa
 */
@Entity
public class RegistrationData implements Serializable {
    @Id
    private String regNumber;
    private String firstName;
    private String lastName;
    private String faculty;
    private Double amountDue;
    private int semester;
    private String academicYear;

    public RegistrationData() {
    }

    public RegistrationData(String regNumber, String firstName, String lastName, String faculty, Double amountDue, int semester, String academicYear) {
        this.regNumber = regNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.faculty = faculty;
        this.amountDue = amountDue;
        this.semester = semester;
        this.academicYear = academicYear;
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

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(Double amountDue) {
        this.amountDue = amountDue;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RegistrationData other = (RegistrationData) obj;
        if (this.semester != other.semester) {
            return false;
        }
        if (!Objects.equals(this.regNumber, other.regNumber)) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.faculty, other.faculty)) {
            return false;
        }
        if (!Objects.equals(this.academicYear, other.academicYear)) {
            return false;
        }
        if (!Objects.equals(this.amountDue, other.amountDue)) {
            return false;
        }
        return true;
    }
}
