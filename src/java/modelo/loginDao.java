package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class loginDao {

    Conexion con = new Conexion();
    Connection cnn = con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;

    public ArrayList<login> LoginDao(login usu) {
        ArrayList<login> lista = new ArrayList<>();
        try {
            ps = cnn.prepareStatement("select Usua_Id,Usua_rol,Usua_user,Usua_clave from Usuario where Usua_user=? && Usua_clave=?");
            ps.setString(1, usu.getUser_Usu_log());
            ps.setString(2, usu.getClave_Usu_log());

            rs = ps.executeQuery();
            if (rs.next()) {
                login log_usu = new login(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                lista.add(log_usu);
            }
            //JOptionPane.showMessageDialog(null, usu.getRol_Usu_log());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error el login = " + ex);
        }
        return lista;
    }
}
