package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EmpleadoDao {

    Conexion con = new Conexion();
    Connection cnn = con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    Empleado em;
    Empleado emp;

    public Boolean insertarempleado(Empleado emp) {
        int x = 0;
        Boolean r = false;
        try {
            ps = cnn.prepareStatement("insert into Tbempleado values(?,?,?,?,?,?,?,?)");
            ps.setInt(1, emp.getId_Empleado());
            ps.setString(2, emp.getTipo_Empleado());
            ps.setInt(3, emp.getCedula_Empleado());
            ps.setString(4, emp.getNombre_Empleado());
            ps.setString(5, emp.getDireccion_Empleado());
            ps.setString(6, emp.getTelefono_Empleado());
            ps.setString(7, emp.getEmail_Empleado());
            ps.setString(8, emp.getImagen_Empleado());
            x = ps.executeUpdate();
            if (x > 0) {
                r = true;
            }

            JOptionPane.showMessageDialog(null, "Datos ok");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar" + e);
        }
        return r;
    }

    public boolean actualizarempleado(Empleado empactu) {
        int x = 0;
        boolean r = false;
        try {
            ps = cnn.prepareStatement("update Tbempleado set Emple_tipo=?,Emple_Cedula=?,Emple_nombre=?,Emple_direccion=?,Emple_telefono=?,Emple_email=?,Emple_imagen=? where Emple_codigo=?");

            ps.setString(1, empactu.getTipo_Empleado());
            ps.setInt(2, empactu.getCedula_Empleado());
            ps.setString(3, empactu.getNombre_Empleado());
            ps.setString(4, empactu.getDireccion_Empleado());
            ps.setString(5, empactu.getTelefono_Empleado());
            ps.setString(6, empactu.getEmail_Empleado());
            ps.setString(7, empactu.getImagen_Empleado());
            ps.setInt(8, empactu.getId_Empleado());

            x = ps.executeUpdate();
            if (x > 0) {
                r = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return r;
    }

    public ArrayList<Empleado> consultageneralempleado() {
        ArrayList<Empleado> lista = new ArrayList<>();
        try {
            ps = cnn.prepareStatement("select*from Tbempleado");
            rs = ps.executeQuery();
            while (rs.next()) {
                em = new Empleado(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
                lista.add(em);
            }

        } catch (SQLException ex) {
            System.out.println("Error en la consulta" + ex);
        }
        return lista;
    }

    public ArrayList<Empleado> DatosEmple(Empleado dd) {
        JOptionPane.showMessageDialog(null, dd.getId_Empleado());
        ArrayList<Empleado> lista = new ArrayList<>();       
        try {            
            ps = cnn.prepareStatement("Select * from tbempleado where Id_Empleado=?");
            ps.setInt(1, dd.getId_Empleado());
            rs = ps.executeQuery();
            while (rs.next()) {
                
                emp = new Empleado(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
                lista.add(emp);
                
            }
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error En la consulta" + e);
        }
        JOptionPane.showMessageDialog(null, "Consulta ok");
        return lista;

    }

}
