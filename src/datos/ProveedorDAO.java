/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import database.Conexion;
import entidades.DetalleProveedor;
import entidades.Proveedores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import datos.interfaces.CrudProveedor;

/**
 *
 * @author Juan Pablo Campos L
 */
public class ProveedorDAO implements CrudProveedor<Proveedores,DetalleProveedor>{
    
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public ProveedorDAO() {
        CON =Conexion.getInstance();
    }

    @Override
    public List<Proveedores> listar(String texto) {
        List<Proveedores> registros=new ArrayList();
        try {
            if(texto.equalsIgnoreCase("")){
               ps = CON.Conectar().prepareStatement("SELECT * FROM Proveedores WHERE clvprov IS NOT NULL");
           }else{
               ps = CON.Conectar().prepareStatement("SELECT * FROM Proveedores where clvprov = ?");
               ps.setString(1, texto);
           }
            rs = ps.executeQuery();
            while (rs.next()) {
                registros.add(new Proveedores(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            rs = null;
            CON.Desconectar();
        }

        return registros;
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DetalleProveedor> ListarDetalle(int idProvedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Proveedores> listarComboClave() {
        List<Proveedores> registros = new ArrayList();
        try{
            ps = CON.Conectar().prepareStatement("SELECT clvprov FROM Proveedores ORDER BY clvprov ASC");
            rs = ps.executeQuery();
            while(rs.next()){
                registros.add(new Proveedores(rs.getInt(1)));
            }
            ps.close();
            rs.close();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps = null;
            rs = null;
            CON.Desconectar();
        }
        return registros;
    }
    
    @Override
    public boolean insertar(Proveedores obj) {
        resp = false;
        String consultaSQL = "insert into Proveedores(nombrep, direccionp, estadop, telefonop, localidadp)\n"
                + "values(?,?,?,?,?) ;";
        try {
            ps = CON.Conectar().prepareStatement(consultaSQL);
           ps.setString(1, obj.getNombrep());
           ps.setString(2, obj.getDireccionp());
           ps.setString(3, obj.getEstadop());
           ps.setString(4, obj.getTelefonop());
           ps.setString(5, obj.getLocalidadp());

            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            CON.Desconectar();
        }
        return resp;        
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean actualizar(Proveedores obj) {
        resp = false;
        String consultaSQL = "update Proveedores set nombrep=?,direccionp=?,estadop=?,telefonop=?,localidadp=? where clvprov=?;";
        try {
            ps = CON.Conectar().prepareStatement(consultaSQL);
           ps.setString(1, obj.getNombrep());
           ps.setString(2, obj.getDireccionp());
           ps.setString(3, obj.getEstadop());
           ps.setString(4, obj.getTelefonop());
           ps.setString(5, obj.getLocalidadp());
           ps.setInt(6, obj.getClvprov());
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            CON.Desconectar();
        }
        return resp;        
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean desactivar(int id) {
        resp = false;
        String consultaSQL = "delete from Proveedores where clvprov=?";
        try {
            ps = CON.Conectar().prepareStatement(consultaSQL);
            ps.setInt(1, id);
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            CON.Desconectar();
        }
        return resp;        
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int total() {
        int numeroderegistros = 0;
        try {
            ps = CON.Conectar().prepareStatement("select count(clvprov) from Proveedores;");
            rs = ps.executeQuery();
            while (rs.next()) {
                numeroderegistros = rs.getInt(1); //getString(String) 
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            rs = null;
            CON.Desconectar();
        }

        return numeroderegistros;        
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean existe(String texto) {
        resp = false;
        try {
            ps = CON.Conectar().prepareStatement("select * from Proveedores where nombrep=?;");
            ps.setString(1, texto);
            rs = ps.executeQuery();
            if (rs.next()) {
                resp = true;
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            rs = null;
            CON.Desconectar();
        }

        return resp;        
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int ultimoid() {
        int id = 0;
        try {
            ps = CON.Conectar().prepareStatement("SELECT AUTO_INCREMENT FROM information_schema.TABLES WHERE TABLE_SCHEMA = 'LaCienegaBD' AND TABLE_NAME = 'Proveedores';");
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1); //getString(String) 
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            rs = null;
            CON.Desconectar();
        }

        return id; 

        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

}
