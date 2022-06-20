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
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(admin);
        transaction.commit();
        session.close();
    }

    public void saveUsers(Users user){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }

    public void saveRegistrationData(RegistrationData reg){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(reg);
        transaction.commit();
        session.close();
    }

    public void saveContract(Contracts contract){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(contract);
        transaction.commit();
        session.close();
    }

    public void saveAucaStudents(AucaStudents students){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(students);
        transaction.commit();
        session.close();
    }

    public void saveContractSetup(ContractSetup setup){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(setup);
        transaction.commit();
        session.close();
    }
    
    /*METHODS FOR UPDATING*/
    public void updateAdmin(Admins admin){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.update(admin);
        transaction.commit();
        session.close();
    }

    public void updateUsers(Users user){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.update(user);
        transaction.commit();
        session.close();
    }

    public void updateContract(Contracts contract){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.update(contract);
        transaction.commit();
        session.close();
    }

    public void updateContractSetup(ContractSetup setup){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.update(setup);
        transaction.commit();
        session.close();
    }
    
    /*METHODS FOR DELETING*/
    public void deleteAdmin(Admins admin){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.delete(admin);
        transaction.commit();
        session.close();
    }

    public void deleteUsers(Users user){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.delete(user);
        transaction.commit();
        session.close();
    }

    public void deleteContract(Contracts contract){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.delete(contract);
        transaction.commit();
        session.close();
    }
    
    public void deleteContractSetup(ContractSetup setup){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.delete(setup);
        transaction.commit();
        session.close();
    }
 
    /*METHOD FOR RETRIEVING LISTS OF DATA*/
    public List<Admins> fetchAdmin(){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Admins> listOfAdmins = session.createCriteria(Admins.class).list();
        transaction.commit();
        session.close();
        return listOfAdmins;
    }

    public List<Users> fetchUsers(){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Users> listOfUsers = session.createCriteria(Users.class).list();
        transaction.commit();
        session.close();
        return listOfUsers;
    }

    public List<RegistrationData> fetchRegistrationData(){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<RegistrationData> listOfRegistration = session.createCriteria(RegistrationData.class).list();
        transaction.commit();
        session.close();
        return listOfRegistration;
    }

    public List<Contracts> fetchContract(){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Contracts> listOfContracts = session.createCriteria(Contracts.class).list();
        transaction.commit();
        session.close();
        return listOfContracts;
    }

    public List<AucaStudents> fetchAucaStudents(){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<AucaStudents> listOfAucaStudents = session.createCriteria(AucaStudents.class).list();
        transaction.commit();
        session.close();
        return listOfAucaStudents;
    }
    
    
    /*FETCHING Data by object*/
    public Users findPassword(String regNumber){
        session = HibernateUtil.getSessionFactory().openSession();
        Users foundUser = (Users)session.get(Users.class, regNumber);
        session.close();
        return foundUser;
    }

    public RegistrationData findRegistrationDetailsOfStudent(String regNumber){
        session = HibernateUtil.getSessionFactory().openSession();
        RegistrationData foundDetials = (RegistrationData)session.get(RegistrationData.class, regNumber);
        session.close();
        return foundDetials;
    }

    public ContractSetup findContractSetup(String setupId){
        session = HibernateUtil.getSessionFactory().openSession();
        ContractSetup foundSetup = (ContractSetup)session.get(ContractSetup.class, setupId);
        session.close();
        return foundSetup;
    }
    
    
    /*LISTING OR FETCHING ON CONDITIONS*/
    public List<Contracts> listContractPerStudent(String regNumber){
        session = HibernateUtil.getSessionFactory().openSession();
        Criteria cr = session.createCriteria(Contracts.class);
        cr.add(Restrictions.eq("regNumber", regNumber));
        List listOfYourContracts = cr.list();
        session.close();
        return listOfYourContracts;
    }
}
