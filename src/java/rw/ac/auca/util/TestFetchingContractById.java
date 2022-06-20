package rw.ac.auca.util;

import java.util.List;
import rw.ac.auca.controller.GenericDao;
import rw.ac.auca.entities.Contracts;

/**
 *
 * @author hirwa
 */
public class TestFetchingContractById {

    public static void main(String[] args) {
        GenericDao dao = new GenericDao();
        List<Contracts> userContracts = dao.listContractPerStudent("22003");
        for (Contracts contracts : userContracts) {
            System.out.println("\nThis student has the following contracts : "+contracts.getContractNumber());
        }
     }
    
}
