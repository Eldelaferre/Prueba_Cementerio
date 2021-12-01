/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FallecidoDao {

    Conexion con = new Conexion();
    Connection cnn = con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    Fallecido fal;

    public int insertarFallecido(Fallecido fal) {

        int x = 0;
        try {
            ps = cnn.prepareStatement("INSERT INTO Tbfallecido VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, fal.getCodigo_fallecido());
            ps.setInt(2, fal.getCodigo_Tumba());
            ps.setString(3, fal.getFecha_Ingreso_Fallecido());
            ps.setString(4, fal.getNombre_Fallecido());
            ps.setString(5, fal.getFecha_Nacimiento());
            ps.setString(6, fal.getFecha_Muerte());
            ps.setString(7, fal.getHora_Muerte());
            ps.setString(8, fal.getResponsable_Fallecido());
            ps.setString(9, fal.getEmail_Responsable());
            ps.setInt(10, fal.getTelefono_Responsable());
            ps.setInt(11, fal.getCodigo_Estado_Fallecido());
            x = ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos guardados");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al insertar" + ex);
        }
        return x;
    }

    public ArrayList<Fallecido> consultageneralFallecido() {
        ArrayList<Fallecido> lista = new ArrayList<>();

        try {
            ps = cnn.prepareStatement("SELECT * FROM Tbfallecido");
            rs = ps.executeQuery();
            JOptionPane.showMessageDialog(null, "entra");
            while (rs.next()) {
                fal = new Fallecido(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getInt(10), rs.getInt(11));

                lista.add(fal);
            }

        } catch (SQLException ex) {
            System.out.println("error en la consulta" + ex);
        }

        return lista;

    }
}
