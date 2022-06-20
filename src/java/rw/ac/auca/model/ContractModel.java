package rw.ac.auca.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
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

    public String setContract(Contracts contract) {
        this.contract = contract;
        return "view-contract";
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
    String accepted;

    public String getAccepted() {
        return accepted;
    }

    public void setAccepted(String accepted) {
        this.accepted = accepted;
    }
    
    public List<Admins> getListOfAdmins() {
        return listOfAdmins;
    }

    public void setListOfAdmins(List<Admins> listOfAdmins) {
        this.listOfAdmins = listOfAdmins;
    }

    public List<AucaStudents> getListOfAucaStudents() {
        return listOfAucaStudents;
    }

    public void setListOfAucaStudents(List<AucaStudents> listOfAucaStudents) {
        this.listOfAucaStudents = listOfAucaStudents;
    }

    public List<Contracts> getListOfContracts() {
        return listOfContracts;
    }

    public void setListOfContracts(List<Contracts> listOfContracts) {
        this.listOfContracts = listOfContracts;
    }

    public List<Contracts> getListOfContractsForOneStudent() {
        return listOfContractsForOneStudent;
    }

    public void setListOfContractsForOneStudent(List<Contracts> listOfContractsForOneStudent) {
        this.listOfContractsForOneStudent = listOfContractsForOneStudent;
    }

    public List<RegistrationData> getListOfRegistrations() {
        return listOfRegistrations;
    }

    public void setListOfRegistrations(List<RegistrationData> listOfRegistrations) {
        this.listOfRegistrations = listOfRegistrations;
    }

    public List<Users> getListOfUsers() {
        return listOfUsers;
    }

    public void setListOfUsers(List<Users> listOfUsers) {
        this.listOfUsers = listOfUsers;
    }

    public Users getFetchedUser() {
        return fetchedUser;
    }

    public void setFetchedUser(Users fetchedUser) {
        this.fetchedUser = fetchedUser;
    }
     
    public String getNamesOfLoggedInUser() {
        return namesOfLoggedInUser;
    }

    
 
    Users fetchedUser;
    String enteredId;
    RegistrationData yourData;
    ContractSetup aSetup;
    
    
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
    
    public void retrieveStudentRegistrationInformation(String regNumber){
        yourData = genericDao.findRegistrationDetailsOfStudent(regNumber);
        System.out.println("\nYour data includes: "+yourData.getAmountDue()+" - "+yourData.getFirstName());
    }
    
    /*Retreiving informaiton about student registrations*/
    public void retrieveRegistrationData(){
        listOfRegistrations = genericDao.fetchRegistrationData();
        System.out.println("\nStudents who have done the registration:");
        for (RegistrationData data : listOfRegistrations) {
            System.out.println(data.getFirstName());
        }
    }
    
    public void retrieveContractSetupInformation(String setupId){
        aSetup = genericDao.findContractSetup(setupId);
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
    
    
    
    /**
     * METHODS THAT WORK ON THE GUI
     */
        
    /*LOGIN AS USER*/
    public String login(){
        
        enteredId = check.getRegistrationNumberC();
        String enteredPassword = check.getPasswordC();
                
        fetchedUser = getUserByRegNumber(enteredId);
        String passwordOfFetchedUser = fetchedUser.getCreatePassword();
        
        if (enteredPassword.equals(passwordOfFetchedUser)) {
            
            retrieveRegistrationData();            
            getContractsById(enteredId);
            
            namesOfLoggedInUser = fetchedUser.getFirstName()+" "+fetchedUser.getLastName();
            return "student/user-account";   
        } else {
            FacesMessage loginMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR ,"Incorrect username or password","Try again");
            FacesContext.getCurrentInstance().addMessage("error-message", loginMessage);
            return "signin";   
        }
    }
    
    /*SIGNUP AS USER*/
    public String signup(){
        
        String enteredId = user.getRegNumber();
        System.out.println("\nEntered ID: "+enteredId);
        
        List<Users> allUser = genericDao.fetchUsers();
        int found = 0;
        for (Users aUser : allUser) {
            if (aUser.getRegNumber().equals(enteredId)) {
                found = 1;
            } else {
                found = 0;
            }
        }
        
        if (found == 1) {
            FacesMessage signupMessage = new FacesMessage(FacesMessage.SEVERITY_WARN,"This ID is already registered!","You should either change the id or login");
            FacesContext.getCurrentInstance().addMessage("signup-message", signupMessage);
            return "signup";   
        } else {
            genericDao.saveUsers(user);
            FacesMessage signupMessage = new FacesMessage(FacesMessage.SEVERITY_INFO,"Account Successfully Created!","Confirm your email and login.");
            FacesContext.getCurrentInstance().addMessage("error-message", signupMessage);
            return "signin";   
        }
    }
    
    /**
     *
     * NAVIGATION 
     */
    
    /*TO SIGNUP AS USER*/
    public String goToSignup(){
        return "signup";
    }
    
    /*TO LOGIN AS A USER*/
    public String goToSignin(){
        return "/faces/signin";
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
        namesOfLoggedInUser = fetchedUser.getFirstName()+" "+fetchedUser.getLastName();
        return "student/user-account";
    }
    
    public String returnToUserAccount(){
        namesOfLoggedInUser = fetchedUser.getFirstName()+" "+fetchedUser.getLastName();
        return "user-account";
    }
    
    /*CREATE CONTRACT STEP1*/
    public String createContract(){
        namesOfLoggedInUser = fetchedUser.getFirstName()+" "+fetchedUser.getLastName();
        int found = 1;
        for (RegistrationData info : listOfRegistrations) {
            if (info.getRegNumber().equals(enteredId)) {
                found++;
            } else {
                found = 1;
            }
        }
 
        if (found>1) {
            retrieveStudentRegistrationInformation(enteredId);
            contract.setRegNumber(yourData.getRegNumber());
            contract.setFirstName(yourData.getFirstName());
            contract.setLastName(yourData.getLastName());
            contract.setDueAmount(yourData.getAmountDue());    
            return "create-contract";
        } else {
            FacesMessage userAccountMessage = new FacesMessage(FacesMessage.SEVERITY_FATAL ,"You don't have courses in your box, Can't create a contract.","Register contract");
            FacesContext.getCurrentInstance().addMessage("error-message", userAccountMessage);
            return "user-account";
        }
    }
    
    
    /*CALCULATING AMOUNT PER INSTALLMENT*/
    public String calculateAmountPerInstallment(){
        contract.setAmountPerInstallment((contract.getDueAmount()-contract.getPaidAmount())/3);
        return "create-contract";
    }
    
    /*CONTRACT SUMMARY*/
    public String goToSummary(){
        namesOfLoggedInUser = fetchedUser.getFirstName()+" "+fetchedUser.getLastName();
        return "contract-summary";
    }
    
    public String goToConfirm(){
        contract.setCreationdate(new Date());
        namesOfLoggedInUser = fetchedUser.getFirstName()+" "+fetchedUser.getLastName();
        return "confirm-contract";
    }
    
    /*SUBMITTING THE CONTRACT*/
    public String submitContract(){
        FacesMessage submitMessage;
        contract.setStatus("Pending");
        if (contract.getCreationdate()!=null) {
            genericDao.saveContract(contract);
            submitMessage = new FacesMessage(FacesMessage.SEVERITY_INFO,"Contract Submitted!","You shall receive information about your contract lately..");
            FacesContext.getCurrentInstance().addMessage("submit-message", submitMessage);
            return "submittion-response";
        } else {
            submitMessage = new FacesMessage(FacesMessage.SEVERITY_FATAL,"Failed to submit your contract!","Make sure all required Infomation is provided.");
            FacesContext.getCurrentInstance().addMessage("submit-message", submitMessage);
            return "summary";
        }
    }

    /*SUBMITTING THE CONTRACT*/
    public String updateContract(){
        FacesMessage submitMessage;
        contract.setStatus("Pending");
        if (contract.getCreationdate()!=null) {
            genericDao.saveContract(contract);
            submitMessage = new FacesMessage(FacesMessage.SEVERITY_INFO,"Contract Submitted!","You shall receive information about your contract lately..");
            FacesContext.getCurrentInstance().addMessage("submit-message", submitMessage);
            return "submittion-response";
        } else {
            submitMessage = new FacesMessage(FacesMessage.SEVERITY_FATAL,"Failed to submit your contract!","Make sure all required Infomation is provided.");
            FacesContext.getCurrentInstance().addMessage("submit-message", submitMessage);
            return "summary";
        }
    }
    
    /*DASHBOARD*/
    public String dashboard(){
        retrieveContracts();
        retrieveUsers();
        retrieveAdmins();
        return "admin/dashboard";
    }
}
