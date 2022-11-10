package medicamentos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConectarBasedeDatos 
{ public Connection conexion;

    //metodo de conexion a la base de datos
    public void conectarDB() throws SQLException
    {
       //variable no modificable
       final String controlador = "com.mysql.jdbc.Driver";
    try 
    {
        Class.forName(controlador);
        final String url_db="jdbc:mysql://localhost:8082/farmaciaegph";
        conexion=DriverManager.getConnection(url_db, "jherrera", "PHPMYADMINJHB3");
        //JOptionPane.showMessageDialog(null, "Conexión Establecida Correctamente");
    } 
    catch (ClassNotFoundException  | SQLException ex) 
    {
        //Logger.getLogger(ConectarBasedeDatos.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Error en la conexión", JOptionPane.ERROR_MESSAGE);
    }
    }
    
    //metodo de desconexion 
    public void desconectarDB()
    {
        if(conexion!=null)
        {
            try 
            {
                conexion.close();
            } 
            catch (SQLException ex) 
            {
                //Logger.getLogger(ConectarBasedeDatos.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage(), "No es posible la conexión", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
}
