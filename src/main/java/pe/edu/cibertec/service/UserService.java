/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.service;

import pe.edu.cibertec.model.User;

/**
 *
 * @author francisco
 */
public interface UserService {
    public void list();
    public void insert(User user);
    public void delete(User user);
}
