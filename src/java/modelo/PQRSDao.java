package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PQRSDao {

    Conexion con = new Conexion();
    Connection cnn = con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    PQRS pq;

    public int insertarPQRS(PQRS pqrs) {
        JOptionPane.showMessageDialog(null, "Entra a registrar");
        int x = 0;
        try {
            ps = cnn.prepareStatement("insert into TbPQRS(Id_Visitante,PQRS_fecha,PQRS_descripcion) values(?,?,?)");
            //ps.setInt(1, pqrs.getCod_Pqr());
            ps.setInt(1, pqrs.getId_Usuario());
            ps.setString(2, pqrs.getFecha_Pqr());
            ps.setString(3, pqrs.getPQR());
            x = ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al inserta" + ex);
        }
        return x;
    }

    public boolean actualizarPQRS(PQRS pqrsactu) {
        int x = 0;
        boolean r = false;
        try {
            ps = cnn.prepareStatement("update TbPQRS set Tbregistra_Regis_codigo=?,PQRS_fecha=?,PQRS_descripcion=? where PQRS_codigo=?");

            ps.setInt(1, pqrsactu.getId_Usuario());
            ps.setString(2, pqrsactu.getFecha_Pqr());
            ps.setString(3, pqrsactu.getPQR());
            ps.setInt(4, pqrsactu.getCod_Pqr());

            x = ps.executeUpdate();
            if (x > 0) {
                r = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return r;
    }

    public ArrayList<PQRS> consultageneralPQRS() {
        ArrayList<PQRS> lista = new ArrayList<>();
        try {
            ps = cnn.prepareStatement("select*from TbPQRS");
            rs = ps.executeQuery();
            while (rs.next()) {
                pq = new PQRS(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4));
                lista.add(pq);
            }

        } catch (SQLException ex) {
            System.out.println("Error en la consulta" + ex);
        }
        return lista;
    }
}
