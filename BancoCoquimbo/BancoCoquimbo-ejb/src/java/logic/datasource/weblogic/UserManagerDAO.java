/*Clase encargada del Crud de los usuarios*/
package logic.datasource.weblogic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

/**
 *
 * @author andres
 */
public class UserManagerDAO {

    //objeto datasource a utilizar en la consulta
    private DataSource dataSource = null;

    //objeto connection a utilizar en la consulta
    private Connection connection = null;

    //objeto Statement a utilizar en la consulta
    private Statement statemenet = null;

    //objeto PreparedStatement a utilizar en la consulta
    private ResultSet resultSet = null;

    public UserManagerDAO(DataSource dataSource) {
        if (dataSource == null) {
            throw new ExceptionInInitializerError("No se ha inizialzado el DataSource");
        }
        this.dataSource = dataSource;
    }

    public String validateUSer(String dni) throws SQLException {

        String query = "select * from persona";
        //connection = dataSource.getConnection();
        //statemenet = connection.createStatement();
        resultSet = queryDB(query);

        while (resultSet.next()) {
            //obtenemos el String de la columna uno
            System.out.println(resultSet.getString(1));
        }
        return resultSet.getString(1);
    }

    public int createUser(String name, String last_name, int age, int phone, int dni) throws SQLException {

        String response = null;
        String queryValidate = "select dni from persona where dni=" + dni;
        int estadoTransaccion = 0;
        connection = dataSource.getConnection();
        statemenet = connection.createStatement();

        try {
            String query = "insert into persona (name,lastName,age,phone,dni) values(" + "\"" + name + "\"," + "\"" + last_name + "\"," + "\"" + age + "\"," + "\"" + phone + "\"," + "\"" + dni + "\"" + ")";

            if(statemenet.executeUpdate(query)==1){
                estadoTransaccion = 1;
            }

            return estadoTransaccion;

        } catch (Exception e) {
            
            return estadoTransaccion;
        } finally {
            closeResourcesBD();
        }

    }
    
    
    private ResultSet queryDB(String query) throws SQLException{
        
        connection = dataSource.getConnection();
        statemenet = connection.createStatement();
        resultSet = statemenet.executeQuery(query);
        
        return resultSet;
    }
    
    /*metodo para cerrarlos recursos de la bsd*/
    private void closeResourcesBD() {

        try {
            if (this.resultSet != null) {
                this.resultSet.close();
            }
            if (this.statemenet != null) {
                this.statemenet.close();
            }
            if (this.connection != null) {
                this.connection.close();
            }

        } catch (Exception e) {
            System.out.println("WARNING no se pudo cerrar los recursos de la bd: " + e.getMessage());
        }
    }
}
