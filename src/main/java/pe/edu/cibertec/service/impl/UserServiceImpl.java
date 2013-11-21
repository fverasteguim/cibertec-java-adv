/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.dao.UserDao;
import pe.edu.cibertec.model.User;
import pe.edu.cibertec.service.UserService;

/**
 *
 * @author francisco
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
    
    public List<User> list() {
        return userDao.list();
        
    }

    public void insert(User user) {
        userDao.insert(user);
    }

    public void delete(User user) {
        
        userDao.delete(user);
    }

}
