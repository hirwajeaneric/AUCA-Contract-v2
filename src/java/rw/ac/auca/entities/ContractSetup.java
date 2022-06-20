package rw.ac.auca.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author hirwa
 */
@Entity
public class ContractSetup implements Serializable {
    @Id
    private String setupId;
    private String academicYear;
    private String semester;
    private Date submittionStartDate;
    private Date submittionEndDate;
    private Double rate;

    public ContractSetup() {
    }

    public ContractSetup(String setupId, String academicYear, String semester, Date submittionStartDate, Date submittionEndDate, Double rate) {
        this.setupId = setupId;
        this.academicYear = academicYear;
        this.semester = semester;
        this.submittionStartDate = submittionStartDate;
        this.submittionEndDate = submittionEndDate;
        this.rate = rate;
    }

    public String getSetupId() {
        return setupId;
    }

    public void setSetupId(String setupId) {
        this.setupId = setupId;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Date getSubmittionStartDate() {
        return submittionStartDate;
    }

    public void setSubmittionStartDate(Date submittionStartDate) {
        this.submittionStartDate = submittionStartDate;
    }

    public Date getSubmittionEndDate() {
        return submittionEndDate;
    }

    public void setSubmittionEndDate(Date submittionEndDate) {
        this.submittionEndDate = submittionEndDate;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
    
    
}
