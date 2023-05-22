/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import datos.interfaces.CrudEmpleadosInterface;
import database.Conexion;
import entidades.Empleados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristianss
 */
public class EmpleadosDAO implements CrudEmpleadosInterface<Empleados> {

    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public EmpleadosDAO() {
        CON = Conexion.getInstance();
    }

    public List<Empleados> listar(String texto) {
        List<Empleados> registros = new ArrayList();
        try {
            if (texto.equalsIgnoreCase("")) {
                ps = CON.Conectar().prepareStatement("SELECT * FROM Empleados");
            } else {
                ps = CON.Conectar().prepareStatement("SELECT * FROM Empleados WHERE clvemp = ?");
                ps.setInt(1, Integer.parseInt(texto));
            }
            rs = ps.executeQuery();
            while (rs.next()) {
                registros.add(new Empleados(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
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
    }

    @Override
    public boolean insertar(Empleados obj) {
        resp = false;
        String consultaSQL = "INSERT INTO Empleados(nombree, apellidoe, telefonoe, direccione, coloniae)\n"
                + " values(?,?,?,?,?);";
        try {
            ps = CON.Conectar().prepareStatement(consultaSQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, obj.getNombree());
            ps.setString(2, obj.getApellidoe());
            ps.setString(3, obj.getTelefonoe());
            ps.setString(4, obj.getDireccione());
            ps.setString(5, obj.getColoniae());
            int insercion = ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            int clvemp = 0;
            if (rs.next()) {
                clvemp = rs.getInt(1);
            }
            System.out.println(clvemp);
            if (insercion == 1) {
                String insertarUsuario = "INSERT INTO Usuarios(clvemp, nombreu, contrasenau, rolu) values (?,?,?,?);";
                ps = CON.Conectar().prepareStatement(insertarUsuario);
                ps.setInt(1, clvemp);
                ps.setString(2, obj.getNombreu());
                ps.setString(3, obj.getContrasenau());
                ps.setString(4, "Empleado");
                resp = ps.executeUpdate() > 0;
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            CON.Desconectar();
        }
        return resp;
    }

    @Override
    public boolean actualizar(Empleados obj) {
        resp = false;
        String consultaSQL = "UPDATE Empleados SET nombree=?, apellidoe=?, telefonoe=?, direccione=?, coloniae=? "
                + "WHERE clvemp = ?;";
        try {
            ps = CON.Conectar().prepareStatement(consultaSQL);
            ps.setString(1, obj.getNombree());
            ps.setString(2, obj.getApellidoe());
            ps.setString(3, obj.getTelefonoe());
            ps.setString(4, obj.getDireccione());
            ps.setString(5, obj.getColoniae());
            ps.setInt(6, obj.getClvemp());
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
    }

    @Override
    public boolean eliminar(int id) {
        resp = false;
        String consultaSQL2 = "DELETE FROM Usuarios WHERE clvemp=? and clvemp>2";
        String consultaSQL = "DELETE FROM Empleados WHERE clvemp=? and clvemp>2";
        try {
            ps = CON.Conectar().prepareStatement(consultaSQL2);
            ps.setInt(1, id);
            if (ps.executeUpdate() > 0) {
                ps = CON.Conectar().prepareStatement(consultaSQL);
                ps.setInt(1, id);
                if (ps.executeUpdate() > 0) {
                    resp = true;
                }
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            CON.Desconectar();
        }
        return resp;
    }

    @Override
    public int total() {
        int numeroRegistros = 0;
        try {
            ps = CON.Conectar().prepareStatement("SELECT COUNT(*) FROM Empleados;");
            rs = ps.executeQuery();
            while (rs.next()) {
                numeroRegistros = rs.getInt(1);  // getString(String)
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
        return numeroRegistros;
    }

    @Override
    public boolean existe(String texto) {
        resp = false;
        try {
            ps = CON.Conectar().prepareStatement("SELECT * FROM Empleados WHERE nombree =?;");
            ps.setString(1, texto);
            rs = ps.executeQuery();
            if (rs.next()) {
                resp = true;  //getString(String)
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
    }

    public ArrayList<String> ListarE() {
        ArrayList<String> registros = new ArrayList();
        try {
            String sql = "SELECT clvemp FROM Empleados ORDER BY clvemp ASC;";
            ps = CON.Conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                registros.add(rs.getString(1));
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
    }
    
    public ArrayList<Empleados> ListarEs() {
        ArrayList<Empleados> registros = new ArrayList();
        try {
            String sql = "SELECT clvemp FROM Empleados ORDER BY clvemp ASC;";
            ps = CON.Conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                registros.add(new Empleados(rs.getInt(1)));
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
    }

    public boolean ActualizarContra(int clave, String contra, String nueva)
    {
        resp=false;
        try{
            ps=CON.Conectar().prepareStatement("Update Usuarios set contrasenau = ? where clvemp = ? and contrasenau = ?;");
            ps.setString(1, nueva);
            ps.setInt(2, clave);
            ps.setString(3, contra);
            if(ps.executeUpdate()>0){
            resp=true;  //getString(String)
            }
            ps.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
            ps=null;
            CON.Desconectar();
        }
        return resp;  
    }
    
    public int clvmax() {
        int numeroMax=0;
        try{
            ps=CON.Conectar().prepareStatement("SELECT AUTO_INCREMENT FROM information_schema.TABLES WHERE TABLE_SCHEMA = 'LaCienegaBD' AND TABLE_NAME = 'Empleados';");
            rs=ps.executeQuery();
            while(rs.next()){
            numeroMax=rs.getInt(1);  // getString(String)
        }
        ps.close();
        rs.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
            ps=null;
            rs=null;
            CON.Desconectar();
        }
        return numeroMax;    
    }
}
