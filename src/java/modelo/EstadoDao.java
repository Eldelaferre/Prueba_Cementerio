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

public class EstadoDao {
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    Estado es;
    
    public int insertarEstado(Estado es){
        
        int x=0;
        try {
            ps=cnn.prepareStatement("INSERT INTO TbEstado_fallecido VALUES(?,?,?)");
            ps.setInt(1,es.getCodigo_Estado());
            ps.setString(2,es.getTipo_Estado());
            ps.setString(3,es.getDescripcion_Estado());
            
            x=ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos guardados");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error al insertar"+ex);
        }
     return x;
    } 
    public ArrayList<Estado> consultageneralestado(){
        ArrayList<Estado> lista=new ArrayList<>();
        
        try {
            ps=cnn.prepareStatement("SELECT * FROM TbEstado_fallecido");
            rs=ps.executeQuery();
            while(rs.next()){
                es=new Estado(rs.getInt(1), rs.getString(2), rs.getString(3));
                
                lista.add(es);
            }
                    
        } catch (SQLException ex) {
            System.out.println("error en la consulta"+ex);
        }
        
        return lista;
        
    }
}