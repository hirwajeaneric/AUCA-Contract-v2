package rw.ac.auca.util;

import java.util.Date;
import rw.ac.auca.controller.GenericDao;
import rw.ac.auca.entities.Admins;
import rw.ac.auca.entities.AucaStudents;
import rw.ac.auca.entities.ContractSetup;
import rw.ac.auca.entities.Contracts;
import rw.ac.auca.entities.RegistrationData;
import rw.ac.auca.entities.Users;

/**
 *
 * @author hirwa
 */
public class SaveTest {
    public static void main(String[] args) {
        Admins admin1 = new Admins();
        Admins admin2 = new Admins();
        
        Users user1 = new Users();
        Users user2 = new Users();
        Users user3 = new Users();
        
        AucaStudents student1 = new AucaStudents();
        AucaStudents student2 = new AucaStudents();
        AucaStudents student3 = new AucaStudents();
        AucaStudents student4 = new AucaStudents();
        AucaStudents student5 = new AucaStudents();
        
        Contracts contract1 = new Contracts();
        Contracts contract2 = new Contracts();
        Contracts contract3 = new Contracts();
        Contracts contract4 = new Contracts();
        Contracts contract5 = new Contracts();
        
        RegistrationData registration1 = new RegistrationData();
        RegistrationData registration2 = new RegistrationData();
        RegistrationData registration3 = new RegistrationData();
        RegistrationData registration4 = new RegistrationData();
        RegistrationData registration5 = new RegistrationData();
        
        ContractSetup setup1 = new ContractSetup();
        ContractSetup setup2 = new ContractSetup();
        
        
        /*Created admins*/
        admin1.setFirstName("Hirwa");
        admin1.setLastName("Minerve");
        admin1.setUsername("minerve");
        admin1.setCreatePassword("123456");
        admin1.setConfirmPassword("123456");
        
        admin2.setFirstName("Kayiranga");
        admin2.setLastName("Emmanuel");
        admin2.setUsername("kayirem");
        admin2.setCreatePassword("123456");
        admin2.setConfirmPassword("123456");
        
        /*Creating users*/
        user1.setFirstName("Tumusifu");
        user1.setLastName("Emile");
        user1.setEmail("emile@gmail.com");
        user1.setRegNumber("22011");
        user1.setCreatePassword("123456");
        user1.setConfirmPassword("123456");
        
        user2.setFirstName("Mugisha");
        user2.setLastName("Bruce");
        user2.setEmail("bruce@gmail.com");
        user2.setRegNumber("22010");
        user2.setCreatePassword("123456");
        user2.setConfirmPassword("123456");
        
        user3.setFirstName("Mutoni");
        user3.setLastName("Joselyne");
        user3.setEmail("mutoni@gmail.com");
        user3.setRegNumber("22003");
        user3.setCreatePassword("123456");
        user3.setConfirmPassword("123456");
        
        /*ADDING SOME AUCA STUDENTS*/
        student1.setRegNumber("22010");
        student1.setFirstName("Mugisha");
        student1.setLastName("Bruce");
        student1.setEmail("bruce@gmail.com");
        student1.setFaculty("IT");
        student1.setDepartment("Software Engineering");
        student1.setResidence("Kigali");
        
        student2.setRegNumber("22011");
        student2.setFirstName("Tumusifu");
        student2.setLastName("Emile");
        student2.setEmail("emile@gmail.com");
        student2.setFaculty("IT");
        student2.setDepartment("Networking and Communication");
        student2.setResidence("Kigali");
        
        student3.setRegNumber("22003");
        student3.setFirstName("Mutoni");
        student3.setLastName("Joselyne");
        student3.setEmail("mutoni@gmail.com");
        student3.setFaculty("IT");
        student3.setDepartment("Networking and Communication");
        student3.setResidence("Kigali");
        
        student4.setRegNumber("22026");
        student4.setFirstName("Hirwa");
        student4.setLastName("Jean Eric");
        student4.setEmail("erichirwa@gmail.com");
        student4.setFaculty("IT");
        student4.setDepartment("Software Engineering");
        student4.setResidence("Kigali");
        
        student5.setRegNumber("22022");
        student5.setFirstName("Umubyeyi");
        student5.setLastName("Anne Marie");
        student5.setEmail("anne@gmail.com");
        student5.setFaculty("IT");
        student5.setDepartment("Software Engineering");
        student5.setResidence("Kigali");
        
        /*ADDING SOME ALREADY DONE CONTRACTS*/
        contract1.setRegNumber("22002");
        contract1.setFirstName("Muyango");
        contract1.setLastName("Bailly");
        contract1.setPhone("0780539859");
        contract1.setEmail("muyango@gmail.com");
        contract1.setDueAmount(500000.0);
        contract1.setPaidAmount(200000.0);
        contract1.setNameOnReciept("Muyango Bailly");
        contract1.setAmountPerInstallment(100000.0);
        contract1.setCreationdate(new Date(02/07/2022));
        contract1.setStatus("pending");

        contract2.setRegNumber("22026");
        contract2.setFirstName("Hirwa");
        contract2.setLastName("Jean Eric");
        contract2.setPhone("0780599859");
        contract2.setEmail("hirwa@gmail.com");
        contract2.setDueAmount(200000.0);
        contract2.setPaidAmount(100000.0);
        contract2.setNameOnReciept("Hirwa J Eric");
        contract2.setAmountPerInstallment(33333.33);
        contract2.setCreationdate(new Date(06/07/2022));
        contract2.setStatus("pending");
     
        contract3.setRegNumber("22025");
        contract3.setFirstName("Bientot");
        contract3.setLastName("Ririmba");
        contract3.setPhone("0780534859");
        contract3.setEmail("bririmba@gmail.com");
        contract3.setDueAmount(300000.0);
        contract3.setPaidAmount(150000.0);
        contract3.setNameOnReciept("Ririmba");
        contract3.setAmountPerInstallment(50000.0);
        contract3.setCreationdate(new Date(26/06/2022));
        contract3.setStatus("pending");

        contract4.setRegNumber("22022");
        contract4.setFirstName("Anne Marie");
        contract4.setLastName("Umubyeyi");
        contract4.setPhone("0780512323");
        contract4.setEmail("umubyeyiannemarie@gmail.com");
        contract4.setDueAmount(100000.0);
        contract4.setPaidAmount(50000.0);
        contract4.setNameOnReciept("Anne Umubyeyi");
        contract4.setAmountPerInstallment(1666.7);
        contract4.setCreationdate(new Date(02/07/2022));
        contract4.setStatus("pending");
        
        contract5.setRegNumber("22026");
        contract5.setFirstName("Hirwa");
        contract5.setLastName("Jean Eric");
        contract5.setPhone("0780599859");
        contract5.setEmail("hirwa@gmail.com");
        contract5.setDueAmount(200000.0);
        contract5.setPaidAmount(100000.0);
        contract5.setNameOnReciept("Hirwa J Eric");
        contract5.setAmountPerInstallment(33333.33);
        contract5.setCreationdate(new Date(10/02/2022));
        contract5.setStatus("Approved");
        
        /*SAVE SOME STUDENT REGISTRATION FOR COURSES*/
        registration1.setRegNumber("22026");
        registration1.setFirstName("Hirwa");
        registration1.setLastName("Jean Eric");
        registration1.setFaculty("Software Engineering");
        registration1.setSemester(2);
        registration1.setAmountDue(350000.0);
        
        registration2.setRegNumber("22025");
        registration2.setFirstName("Ririmba");
        registration2.setLastName("Bientot");
        registration2.setFaculty("Networking");
        registration2.setSemester(2);
        registration2.setAmountDue(340000.0);
        
        registration3.setRegNumber("22022");
        registration3.setFirstName("Umubyeyi");
        registration3.setLastName("Anne Marie");
        registration3.setFaculty("Software Engineering");
        registration3.setSemester(2);
        registration3.setAmountDue(500000.0);
        
        registration4.setRegNumber("22020");
        registration4.setFirstName("Umutoni");
        registration4.setLastName("Joselyne");
        registration4.setFaculty("Information Management");
        registration4.setSemester(2);
        registration4.setAmountDue(240000.0);
            
        registration5.setRegNumber("21876");
        registration5.setFirstName("Mugisha");
        registration5.setLastName("Fabrice");
        registration5.setFaculty("Information Management");
        registration5.setSemester(2);
        registration5.setAmountDue(350000.0);
        
        
        /*SAVING SOME CONTACT SETUP*/
        setup1.setSetupId("S2-21-22");
        setup1.setAcademicYear("2021-2022");
        setup1.setRate(0.50);
        setup1.setSemester("2");
        setup1.setSubmittionStartDate(new Date(2022,06,01));
        setup1.setSubmittionEndDate(new Date(2022,07,01));

        setup2.setSetupId("S1-21-22");
        setup2.setAcademicYear("2021-2022");
        setup2.setRate(0.50);
        setup2.setSemester("1");
        setup2.setSubmittionStartDate(new Date(2022, 02, 10));
        setup2.setSubmittionEndDate(new Date(2022,02,30));
        
        
        
        /*USING GENERIC DAO TO PERSIST DATA TO DATABASE*/
        GenericDao genericDao = new GenericDao();
        
        genericDao.saveAdmin(admin1);
        genericDao.saveAdmin(admin2);
        
        genericDao.saveAucaStudents(student1);
        genericDao.saveAucaStudents(student2);
        genericDao.saveAucaStudents(student3);
        genericDao.saveAucaStudents(student4);
        genericDao.saveAucaStudents(student5);
        
        genericDao.saveContract(contract1);
        genericDao.saveContract(contract2);
        genericDao.saveContract(contract3);
        genericDao.saveContract(contract4);
        genericDao.saveContract(contract5);
        
        genericDao.saveRegistrationData(registration1);
        genericDao.saveRegistrationData(registration2);
        genericDao.saveRegistrationData(registration3);
        genericDao.saveRegistrationData(registration4);
        genericDao.saveRegistrationData(registration5);
        
        genericDao.saveUsers(user1);
        genericDao.saveUsers(user2);
        genericDao.saveUsers(user3);
        
        genericDao.saveContractSetup(setup1);
        genericDao.saveContractSetup(setup2);
        
        System.out.println("\nDone");
    }
}
