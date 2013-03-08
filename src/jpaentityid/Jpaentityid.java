/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaentityid;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author bondarev
 */
public class Jpaentityid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf;
        emf = Persistence.createEntityManagerFactory("jpaentityidPU");
        EntityManager em = emf.createEntityManager();
        
//        em.getTransaction().begin();
//        Account account = new Account();
//        final Customer customer = new Customer();
//        em.persist(customer);
//        account.setCustomer(customer);
//        em.persist(account);
//        em.getTransaction().commit();
        
        em.getTransaction().begin();
        Account account2 = em.find(Account.class, 2L);
        System.out.println("custId=" + account2.getCustomerId());
        em.getTransaction().commit();
    }
}
