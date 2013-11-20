package pe.edu.cibertec.user.action;

import pe.edu.cibertec.user.bo.UserBo;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.cibertec.model.User;
import pe.edu.cibertec.service.UserService;

public class UserAction extends ActionSupport {

    @Autowired
    private UserService service;
    
    private List<User> usuarios;
    
    private Integer id;

    public List<User> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<User> usuarios) {
        this.usuarios = usuarios;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String listarUsuarios() throws Exception {

        usuarios = service.list();
        return SUCCESS;
    }

    public String insertarUsuario() {
        return SUCCESS;
    }

    public String eliminarUsuario() {
        return SUCCESS;
    }
}