package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VisitanteDao {

    Conexion con = new Conexion();
    Connection cnn = con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    Visitante vi;

    public int Insertar_Visitante(Visitante vis) {

        JOptionPane.showMessageDialog(null, "Dao");

        int x = 0;
        try {
            ps = cnn.prepareStatement("INSERT INTO TBvisitante VALUES(?,?,?,?,?)");
            ps.setInt(1, vis.getId_Usuario());
            ps.setString(2, vis.getNombre_Visitante());
            ps.setString(3, vis.getDireccion_Visitante());
            ps.setString(4, vis.getTelefono_Visitante());
            ps.setString(5, vis.getEmail_Visitante());

            x = ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos ok");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar" + e);
        }
        return x;

    }

    public boolean actualizarvisitante(Visitante visactu) {
        int x = 0;
        boolean r = false;
        try {
            ps = cnn.prepareStatement("update TBvisitante set visit_nombre=?,visit_direccion=?,visit_telefono=?,visit_email=? where Id_Usuario=?");

            ps.setString(1, visactu.getNombre_Visitante());
            ps.setString(2, visactu.getDireccion_Visitante());
            ps.setString(3, visactu.getTelefono_Visitante());
            ps.setString(4, visactu.getEmail_Visitante());
            ps.setInt(5, visactu.getId_Usuario());

            x = ps.executeUpdate();
            if (x > 0) {
                r = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return r;
    }

    public ArrayList<Visitante> consultageneralvisitante() {
        JOptionPane.showMessageDialog(null, "en el dao");
        ArrayList<Visitante> lista = new ArrayList<>();
        try {
            ps = cnn.prepareStatement("select*from TBvisitante");
            rs = ps.executeQuery();
            while (rs.next()) {
                vi = new Visitante(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                lista.add(vi);
            }

        } catch (SQLException ex) {
            System.out.println("Error en la consulta" + ex);
        }
        return lista;
    }

}
