/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.dao.UserDao;
import pe.edu.cibertec.model.User;

/**
 *
 * @author francisco
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao{
    
    @PersistenceContext
    EntityManager em;
    
    public List<User> list() {
        Query q = em.createQuery("select u from User u");
        return q.getResultList();
    }

    public void insert(User user) {
        em.persist(user);
    }

    public void delete(User user) {
        em.remove(user);
    }

    public void update(User user) {
        em.merge(user);
    }
}
