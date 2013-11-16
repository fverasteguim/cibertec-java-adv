/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.dao;

import java.util.List;
import pe.edu.cibertec.model.Role;

/**
 *
 * @author JAVA-ADV-VS
 */
public interface RoleDao {
    List<Role> list();
    void insert(Role role);
    void delete(Role role);
}
