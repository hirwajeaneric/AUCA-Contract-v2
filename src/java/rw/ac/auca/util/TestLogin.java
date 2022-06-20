package rw.ac.auca.util;

import rw.ac.auca.controller.GenericDao;
import rw.ac.auca.entities.Users;

/**
 *
 * @author hirwa
 */
public class TestLogin {
    public static void main(String[] args) {
        GenericDao generic = new GenericDao();
        
        Users user = generic.findPassword("22003");
        
        System.out.println(user.getFirstName());
    }
}
