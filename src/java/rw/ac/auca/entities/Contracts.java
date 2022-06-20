package rw.ac.auca.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author hirwa
 */
@Entity
public class Contracts implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int contractNumber;
    private String regNumber;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Double dueAmount;
    private Double paidAmount;
    private String nameOnReciept;
    // private byte[] paymentReciet;
    private Double amountPerInstallment;
    private Date creationdate;
    private String status;

    public Contracts() {
    }

    public Contracts(int contractNumber, String regNumber, String firstName, String lastName, String phone, String email, Double dueAmount, Double paidAmount, String nameOnReciept, Double amountPerInstallment, Date creationdate, String status) {
        this.contractNumber = contractNumber;
        this.regNumber = regNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.dueAmount = dueAmount;
        this.paidAmount = paidAmount;
        this.nameOnReciept = nameOnReciept;
        this.amountPerInstallment = amountPerInstallment;
        this.creationdate = creationdate;
        this.status = status;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(Double dueAmount) {
        this.dueAmount = dueAmount;
    }

    public Double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getNameOnReciept() {
        return nameOnReciept;
    }

    public void setNameOnReciept(String nameOnReciept) {
        this.nameOnReciept = nameOnReciept;
    }

    public Double getAmountPerInstallment() {
        return amountPerInstallment;
    }

    public void setAmountPerInstallment(Double amountPerInstallment) {
        this.amountPerInstallment = amountPerInstallment;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
