/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author JAVA-ADV-VS
 */
@Entity
@Table(name="user")
public class User {
    @Id()
    @Column(name="USER_ID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idUser;
    private String username;
    private String password;
    private Boolean enabled;
    
    @ManyToMany
    private List<Role> roles;
}
