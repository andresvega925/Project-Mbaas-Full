/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.example.ws;

import com.bancocoquimbo.xml.bancocoquimbo.CreateUserRes;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.naming.NamingException;
import javax.sql.DataSource;
import logic.datasource.weblogic.LocalServiceLocator;
import logic.datasource.weblogic.UserManagerDAO;

/**
 *
 * @author andres
 */
@WebService(serviceName = "BancoCoquimbo_HTTP_Service", portName = "BancoCoquimbo_Port", endpointInterface = "com.bancocoquimbo.xml.bancocoquimbo.BancoCoquimboPortType", targetNamespace = "http://www.bancocoquimbo.com/xml/BancoCoquimbo", wsdlLocation = "WEB-INF/wsdl/ServiceWebCreationsUsers/BancoCoquimbo.wsdl")
public class ServiceWebCreationsUsers {

    public com.bancocoquimbo.xml.bancocoquimbo.CreateUserRes opCreateUser(com.bancocoquimbo.xml.bancocoquimbo.CreateUserRq request) throws NamingException {
        //TODO implement this method
        
        LocalServiceLocator locator = LocalServiceLocator.getInstance();
        UserManagerDAO dao = new UserManagerDAO((DataSource)locator.getResource("jdbc/datacredito"));
        
              CreateUserRes resp = new CreateUserRes();
       
        
        try {
            int rta = dao.createUser(request.getName(), request.getLastaName(), request.getAge(), request.getPhone(), request.getDni());
             if(rta==1){
                resp.setCaracterAceptacion("Ok");
                resp.setResponse(1);
             }else{
                resp.setCaracterAceptacion("Fallido!");
                resp.setResponse(0);
             }  
            
        } catch (SQLException ex) {
            Logger.getLogger("Error insertando datos en bd = ",ServiceWebCreationsUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
  
        return resp;
    }
    
}
