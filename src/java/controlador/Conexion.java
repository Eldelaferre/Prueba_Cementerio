
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    
    Connection cnn;
    public Connection conexionbd(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //JOptionPane.showMessageDialog(null, "Driver ok");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error en drivers :  " + e);
        }
        try {
            cnn = DriverManager.getConnection("jdbc:mysql://localhost/prueba_Cementerio", "root", "Jonathan-2277235");
            //JOptionPane.showMessageDialog(null, "Conexión Establecida con prueba (:D)");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en nuestro local Host : " + e);
        }
        return cnn;
    }
    public static void main(String[] args) {
        Conexion con = new Conexion();
        con.conexionbd();
    }
    
}
