package pe.edu.cibertec.user.action;


import pe.edu.cibertec.user.bo.UserBo;
import com.opensymphony.xwork2.ActionSupport;
 
public class UserAction extends ActionSupport{

	public String listarUsuarios() throws Exception {
            return SUCCESS;	
	}
        
        public String insertarUsuario() {
            return SUCCESS;
        }
        
        public String eliminarUsuario() {
            return SUCCESS;
        }
}