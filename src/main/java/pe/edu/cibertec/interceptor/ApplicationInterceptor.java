/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.interceptor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import pe.edu.cibertec.model.Autor;

/**
 *
 * @author francisco
 */
@Aspect
@Component("applicationInterceptor")
public class ApplicationInterceptor {
    
    public void beforeInsertAutorInterceptor(JoinPoint joinPoint) {
        System.out.println("Intercepting " + joinPoint.getSignature().getName() + " method");
        System.out.println("Before inserting: " + joinPoint.getArgs()[0]);
    }
    
    @After("execution(* pe.edu.cibertec.service.impl.AutorServiceImpl.insert(pe.edu.cibertec.model.Autor)) && args(autor)")
    public void afterInsertAutorInterceptor(Autor autor) {
        System.out.println("After inserting: " + autor);
    }
}
