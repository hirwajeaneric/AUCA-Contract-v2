package rw.ac.auca.controller;

import java.util.List;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;
import rw.ac.auca.entities.*;
import rw.ac.auca.util.HibernateUtil;

/**
 *
 * @author hirwa
 */
public class GenericDao {
    Session session = null;
    Transaction transaction = null;
    
    /*METHODS FOR SAVING*/
    public void saveAdmin(Admins admin){
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(admin);
            transaction.commit();
            session.close();
        } catch (HibernateException e) {
        }
    }

    public void saveUsers(Users user){
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
            session.close();            
        } catch (HibernateException e) {
        }
    }

    public void saveRegistrationData(RegistrationData reg){
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(reg);
            transaction.commit();
            session.close();            
        } catch (HibernateException e) {
        }
    }

    public void saveContract(Contracts contract){
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(contract);
            transaction.commit();
            session.close();            
        } catch (HibernateException e) {
        }
    }

    public void saveAucaStudents(AucaStudents students){
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(students);
            transaction.commit();
            session.close();            
        } catch (HibernateException e) {
        }
    }

    public void saveContractSetup(ContractSetup setup){
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(setup);
            transaction.commit();
            session.close();            
        } catch (HibernateException e) {
        }
    }
    
    
    /*METHODS FOR UPDATING*/
    public void updateAdmin(Admins admin){
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(admin);
            transaction.commit();
            session.close();            
        } catch (HibernateException e) {
        }
    }

    public void updateUsers(Users user){
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(user);
            transaction.commit();
            session.close();            
        } catch (HibernateException e) {
        }
    }

    public void updateContract(Contracts contract){
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(contract);
            transaction.commit();
            session.close();            
        } catch (HibernateException e) {
        }
    }

    public void updateContractSetup(ContractSetup setup){
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(setup);
            transaction.commit();
            session.close();            
        } catch (HibernateException e) {
        }
    }
    
    
    /*METHODS FOR DELETING*/
    public void deleteAdmin(Admins admin){
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(admin);
            transaction.commit();
            session.close();            
        } catch (HibernateException e) {
        }
    }

    public void deleteUsers(Users user){
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(user);
            transaction.commit();
            session.close();            
        } catch (HibernateException e) {
        }
    }

    public void deleteContract(Contracts contract){
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(contract);
            transaction.commit();
            session.close();    
        } catch (HibernateException e) {
        }
    }
    
    public void deleteContractSetup(ContractSetup setup){
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(setup);
            transaction.commit();
            session.close();    
        } catch (HibernateException e) {
        }
    }
 
    
    /*METHOD FOR RETRIEVING LISTS OF DATA*/
    public List<Admins> fetchAdmin(){
        List<Admins> listOfAdmins = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            listOfAdmins = session.createCriteria(Admins.class).list();
            transaction.commit();
            session.close();    
        } catch (HibernateException e) {
        }
        return listOfAdmins;
    }

    public List<Users> fetchUsers(){
        List<Users> listOfUsers = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            listOfUsers = session.createCriteria(Users.class).list();
            transaction.commit();
            session.close();
        } catch (HibernateException e) {
        }
        return listOfUsers;
    }

    public List<RegistrationData> fetchRegistrationData(){
        List<RegistrationData> listOfRegistration = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            listOfRegistration = session.createCriteria(RegistrationData.class).list();
            transaction.commit();
            session.close();    
        } catch (HibernateException e) {
        }
        return listOfRegistration;
    }

    public List<Contracts> fetchContract(){
        List<Contracts> listOfContracts = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            listOfContracts = session.createCriteria(Contracts.class).list();
            transaction.commit();
            session.close();
        } catch (HibernateException e) {
        }
        return listOfContracts;
    }

    public List<AucaStudents> fetchAucaStudents(){
        List<AucaStudents> listOfAucaStudents = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            listOfAucaStudents = session.createCriteria(AucaStudents.class).list();
            transaction.commit();
            session.close();   
        } catch (HibernateException e) {
        }
        return listOfAucaStudents;
    }
    
    
    /*FETCHING Data by object*/
    public Users findPassword(String regNumber){
        Users foundUser = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            foundUser = (Users)session.get(Users.class, regNumber);
            session.close();
            if (foundUser==null) {
                return null;
            } else {
                return foundUser;
            }
        } catch (HibernateException e) {
            return null;
        }
    }

    public Admins findAdminPassword(String regNumber){
        Admins foundAdmin = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            foundAdmin = (Admins)session.get(Admins.class, regNumber);
            session.close();
            if (foundAdmin==null) {
                return null;
            } else {
                return foundAdmin;
            }
        } catch (HibernateException e) {
            return null;
        }
    }

    public RegistrationData findRegistrationDetailsOfStudent(String regNumber){
        RegistrationData foundDetails = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            foundDetails = (RegistrationData)session.get(RegistrationData.class, regNumber);
            session.close();
        } catch (HibernateException e) {
        }
        return foundDetails;
    }

    public ContractSetup findContractSetup(String setupId){
        ContractSetup foundSetup = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            foundSetup = (ContractSetup)session.get(ContractSetup.class, setupId);
            session.close();
        } catch (HibernateException e) {
        }
        return foundSetup;
    }
    
    
    /*LISTING OR FETCHING ON CONDITIONS*/
    public List<Contracts> listContractPerStudent(String regNumber){
        List<Contracts> listOfYourContracts = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Criteria cr = session.createCriteria(Contracts.class);
            cr.add(Restrictions.eq("regNumber", regNumber));
            listOfYourContracts = cr.list();
            session.close();
        } catch (HibernateException e) {
        }
        return listOfYourContracts;
    }
}
