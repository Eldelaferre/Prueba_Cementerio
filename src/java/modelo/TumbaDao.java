package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TumbaDao {

    Conexion con = new Conexion();
    Connection cnn = con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    Tumba tumba;

    public int Insertar_Tumba(Tumba tum) {

        int x = 0;
        try {
            ps = cnn.prepareStatement("INSERT INTO Tbtumba VALUES(?,?)");
            ps.setInt(1, tumba.getCodigo_Tumba());
            ps.setString(2, tumba.getUbicacion_Tumba());

            x = ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos guardados");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al insertar" + ex);
        }
        return x;
    }

    public ArrayList<Tumba> Consultageneral_Tumba() {
        ArrayList<Tumba> lista = new ArrayList<>();

        try {
            ps = cnn.prepareStatement("SELECT * FROM Tbtumba");
            rs = ps.executeQuery();
            while (rs.next()) {
                tumba = new Tumba(rs.getInt(1), rs.getString(2));

                lista.add(tumba);
            }

        } catch (SQLException ex) {
            System.out.println("error en la consulta" + ex);
        }

        return lista;
    }
}
