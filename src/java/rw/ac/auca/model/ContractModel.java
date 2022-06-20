package rw.ac.auca.model;

import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import rw.ac.auca.controller.GenericDao;
import rw.ac.auca.entities.*;

/**
 *
 * @author hirwa
 */
@SessionScoped
@ManagedBean(name = "con")
public class ContractModel {
    private Admins admin = new Admins();
    private Users user = new Users();
    private AucaStudents student = new AucaStudents();
    private Contracts contract = new Contracts();
    private ContractSetup setup = new ContractSetup();
    private RegistrationData registration = new RegistrationData();
    private Checking check = new Checking();

    private GenericDao genericDao = new GenericDao();

    public Checking getCheck() {
        return check;
    }

    public void setCheck(Checking check) {
        this.check = check;
    }
    
    public Admins getAdmin() {
        return admin;
    }

    public void setAdmin(Admins admin) {
        this.admin = admin;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public AucaStudents getStudent() {
        return student;
    }

    public void setStudent(AucaStudents student) {
        this.student = student;
    }

    public Contracts getContract() {
        return contract;
    }

    public void setContract(Contracts contract) {
        this.contract = contract;
    }

    public ContractSetup getSetup() {
        return setup;
    }

    public void setSetup(ContractSetup setup) {
        this.setup = setup;
    }

    public RegistrationData getRegistration() {
        return registration;
    }

    public void setRegistration(RegistrationData registration) {
        this.registration = registration;
    }
    
    
    /*SOME DECLARATIONS*/
    List<Admins> listOfAdmins = new ArrayList<>();
    List<AucaStudents> listOfAucaStudents = new ArrayList<>();
    List<Contracts> listOfContracts = new ArrayList<>();
    List<Contracts> listOfContractsForOneStudent = new ArrayList<>();
    List<RegistrationData> listOfRegistrations = new ArrayList<>();
    List<Users> listOfUsers = new ArrayList<>();
    String setupId;
    String regNumber;
    String namesOfLoggedInUser;
    
    
    /*FETCHING DATA*/
    public void retrieveAdmins(){
        listOfAdmins = genericDao.fetchAdmin();
    }
    
    public void retrieveAucaStudents(){
        listOfAucaStudents = genericDao.fetchAucaStudents();
    }
    
    public void retrieveContracts(){
        listOfContracts = genericDao.fetchContract();
    }
    
    public void getAContractSetups(){
        setup = genericDao.findContractSetup(setupId);
    }
    
    /*Retreiving informaiton about student registrations*/
    public void retrieveRegistrationData(){
        listOfRegistrations = genericDao.fetchRegistrationData();
        System.out.println("\nStudents who have done the registration:");
        for (RegistrationData data : listOfRegistrations) {
            System.out.println(data.getFirstName());
        }
    }
    
    public void retrieveUsers(){
        listOfUsers = genericDao.fetchUsers();
    }
    
    /*Listing contracts of one single student*/
    public void getContractsById(String regNumber){
        listOfContractsForOneStudent = genericDao.listContractPerStudent(regNumber);
        System.out.println("\nContracts submitted by this student:");
        for (Contracts yourContracts : listOfContractsForOneStudent) {
            System.out.println(yourContracts.getContractNumber());
        }
    }
    
    /*Finding a user by password*/
    public Users getUserByRegNumber(String regNumber){
        return genericDao.findPassword(regNumber);
    }
    
    /*LOGIN AS USER*/
    public String login(){
        
        String enteredId = check.getRegistrationNumberC();
        String enteredPassword = check.getPasswordC();
                
        Users fetchedUser = getUserByRegNumber(enteredId);
        String passwordOfFetchedUser = fetchedUser.getCreatePassword();
        
        if (enteredPassword.equals(passwordOfFetchedUser)) {
            
            retrieveRegistrationData();            
            getContractsById(enteredId);
            
            namesOfLoggedInUser = fetchedUser.getFirstName()+" "+fetchedUser.getLastName();
            return "student/user-account";   
        } else {
            FacesMessage loginMessage = new FacesMessage("Incorrect username or password");
            FacesContext.getCurrentInstance().addMessage("error-message", loginMessage);
            return "signin";   
        }
    }
    
    /*SIGNUP AS USER*/
    public String goToSignup(){
        return "signup";
    }
    
    /*SIGNUP AS USER*/
    public String signup(){
        if (true) {
            
            return "sign";   
        } else {
            
            return "signup";   
        }
    }
    
    /*LOGIN AS ADMIN*/
    public String signinAdmin(){
    
        return "";
    }
    
    /*SIGNUP AS ADMIN*/
    public String signupAdmin(){
    
        return "";
    }
    
    /*USER ACCOUNT*/
    public String userAccount(){
    
        return "";
    }
    
    /*CREATE CONTRACT STEP1*/
    public String step1(){
    
        return "";
    }
    
    /*CREATE CONTRACT STEP2*/
    public String step2(){
    
        return "";
    }
    
    /*CONTRACT SUMMARY*/
    public String summary(){
    
        return "";
    }
    
    /*DASHBOARD*/
    public String dashboard(){
    
        return "";
    }
}
