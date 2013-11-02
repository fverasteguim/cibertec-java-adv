/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.user.action;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import pe.edu.cibertec.model.Autor;
import pe.edu.cibertec.service.AutorService;

/**
 *
 * @author Francisco
 */
public class AutorAction {
    
    private List<Autor> autores;
    
    private Autor autor;

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public List<Autor> getAutores() {
        return autores;
    }
    
    @Autowired
    @Qualifier("impl1")
    private AutorService autorService;
    
    public String listarAutores() throws Exception {

            autores = autorService.list();
            return "success";

    }
    
    public String nuevoAutor() throws Exception {
        autor = new Autor();
        return "success";
    }
    
    public String guardarAutor() throws Exception {
        autorService.insert(autor);
        return "success";
    }
    
    
}
