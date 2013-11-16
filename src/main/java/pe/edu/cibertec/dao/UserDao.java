/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.dao;

import pe.edu.cibertec.model.User;

/**
 *
 * @author francisco
 */
public interface UserDao {
    void list();
    void insert(User user);
    void delete(User user);
}
