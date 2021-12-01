
package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class HerramientasDao {
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    Herramientas her;
    
    public int insertarHerramientas(Herramientas her){
        
        int x=0;
        try {
            ps=cnn.prepareStatement("INSERT INTO TBherramientas VALUES(?,?,?,?,?,?,?)");
            ps.setInt(1,her.getCodigo_Herramienta());
            ps.setInt(2,her.getId_Empleado());
            ps.setString(3,her.getNombre_Herramienta());
            ps.setString(4,her.getMarca_Herramienta());
            ps.setDouble(5,her.getPrecio_Herramienta());
            ps.setInt(6,her.getExistencias_Herramienta());
            ps.setString(7,her.getProveedor_Herramienta());
            x=ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos guardados");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error al insertar"+ex);
        }
     return x;
    }
    public ArrayList<Herramientas> consultageneralHerramienta(){
        ArrayList<Herramientas> lista=new ArrayList<>();
        
        try {
            ps=cnn.prepareStatement("SELECT * FROM Tbherramientas");
            rs=ps.executeQuery();
            while(rs.next()){
                her=new Herramientas(rs.getInt(1), rs.getInt(2), rs.getString(3),
                        rs.getString(4), rs.getDouble(5),rs.getInt(6),rs.getString(7));
                
                lista.add(her);
            }
                    
        } catch (SQLException ex) {
            System.out.println("error en la consulta"+ex);
        }
        
        return lista;
        
    }
}
