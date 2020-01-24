/*
Clase encargada de locazar y obtener los recursos del servidor weblogic
*/
package logic.datasource.weblogic;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataSource;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author andres
 */
public class LocalServiceLocator {
    
    //instancia del locator
    private static LocalServiceLocator locator = null;
    
    /*instancia del locator*/
    private InitialContext localContext = null;
    
    /*Almacena los recursos solicitados en cache para mejorar el rendimiento*/
    private HashMap<String, Object> resourceCache = null;
    
    
    /*constructor que crea una unica instancia de la clase*/
    
    private LocalServiceLocator(){
    
        try {
            localContext = new InitialContext();
            resourceCache = new HashMap<String, Object>();
        } catch (NamingException ex) {
            Logger.getLogger(LocalServiceLocator.class.getName()).log(Level.SEVERE, null, ex);
                        
        }
        
    }
    
    /*metodo que retorna la unica instancia del Service Locatro*/
    public static LocalServiceLocator getInstance(){
    
        if(locator== null){
            locator = new LocalServiceLocator();
        }        
        return locator;
    }
    
    
    /*metodo que retorna el recurso JDNI solicitado*/
    public Object getResource(String jndiName) throws NamingException{
        if(!resourceCache.containsKey(jndiName)){            
            Object obj = localContext.lookup(jndiName);
            resourceCache.put(jndiName, obj);
        }
        
        return  resourceCache.get(jndiName);
    }


}
