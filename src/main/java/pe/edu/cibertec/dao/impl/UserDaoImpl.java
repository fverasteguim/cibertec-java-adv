/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.dao.impl;

import org.springframework.stereotype.Repository;
import pe.edu.cibertec.dao.UserDao;
import pe.edu.cibertec.model.User;

/**
 *
 * @author francisco
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao{
    public void list() {
        System.out.println("Obteniendo la lista de usuarios");
    }

    public void insert(User user) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void delete(User user) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
