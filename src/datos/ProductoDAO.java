package datos;

import database.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import entidades.Producto;
import datos.interfaces.CrudProductoInterface;

public class ProductoDAO implements CrudProductoInterface<Producto> {
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    
    public ProductoDAO(){
        CON = Conexion.getInstance();
    }
    
    @Override
    public List<Producto> listar(String texto) {
        List<Producto> registros=new ArrayList();
        try{
            if(texto.equalsIgnoreCase(""))
                   ps=CON.Conectar().prepareStatement("select clvprod, tipop, existenciap, categoriap, preciovp, gananciap, preciop, medidasp from Productos;");
            else
            {
                ps=CON.Conectar().prepareStatement("select clvprod, tipop, existenciap, categoriap, preciovp, gananciap, preciop, medidasp from Productos where clvprod = ?;");
                ps.setString(1, texto);
            }
            rs=ps.executeQuery();
            while(rs.next())
                registros.add(new Producto(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getDouble(5),rs.getDouble(6),rs.getDouble(7),rs.getDouble(8)));
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
        return registros;
    }

    @Override
    public boolean insertar(Producto obj) {
        resp=false;
        String consultaSQL="insert into Productos(tipop, existenciap, categoriap, preciovp, gananciap, preciop, medidasp)\n" +
                           "values(?,?,?,?,?,?,?)";
        try{
            ps=CON.Conectar().prepareStatement(consultaSQL);
            ps.setString(1, obj.getTipop());
            ps.setInt(2, obj.getExistenciap());
            ps.setString(3, obj.getCategoriap());
            ps.setDouble(4, obj.getPreciovp());
            ps.setDouble(5, obj.getGananciap());
            ps.setDouble(6, obj.getPreciop());
            ps.setDouble(7, obj.getMedidasp());
            
            if(ps.executeUpdate() > 0)
            {
                resp=true;
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

    @Override
    public boolean actualizar(Producto obj) {
        resp=false;
        String consultaSQL="UPDATE Productos SET tipop=?, existenciap=?, categoriap=?, preciovp=?, gananciap=?, preciop=?, medidasp=? WHERE clvprod=?;";
        try{
            //ps=CON.Conectar().prepareStatement(consultaSQL);
            ps=CON.Conectar().prepareStatement(consultaSQL);
            ps.setString(1, obj.getTipop());
            ps.setInt(2, obj.getExistenciap());
            ps.setString(3, obj.getCategoriap());
            ps.setDouble(4, obj.getPreciovp());
            ps.setDouble(5, obj.getGananciap());
            ps.setDouble(6, obj.getPreciop());
            ps.setDouble(7, obj.getMedidasp());
            ps.setInt(8, obj.getClvprod());
            
            if(ps.executeUpdate() > 0)
            {
                resp=true;
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

    @Override
    public int total() {
        int numeroRegistros=0;
        try{
            ps=CON.Conectar().prepareStatement("SELECT COUNT(*) FROM Productos;");
            rs=ps.executeQuery();
            while(rs.next()){
            numeroRegistros=rs.getInt(1);  // getString(String)
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
        return numeroRegistros;    
    }
    
    @Override
    public int clvmax() {
        int numeroMax=0;
        try{
            ps=CON.Conectar().prepareStatement("SELECT AUTO_INCREMENT FROM information_schema.TABLES WHERE TABLE_SCHEMA = 'LaCienegaBD' AND TABLE_NAME = 'Productos';");
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

    @Override
    public boolean existe(String texto) {
        resp=false;
        try{
            ps=CON.Conectar().prepareStatement("SELECT * FROM Productos WHERE tipop=?;");
            ps.setString(1, texto);
            rs=ps.executeQuery();
            if(rs.next()){
            resp=true;  //getString(String)
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
        return resp;       
    }
    
    public boolean existe2(int id) {
        resp=false;
        try{
            ps=CON.Conectar().prepareStatement("SELECT * FROM Productos WHERE clvprod=?;");
            ps.setInt(1, id);
            rs=ps.executeQuery();
            if(rs.next()){
            resp=true;  //getString(String)
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
        return resp;       
    }
    
    @Override
    public boolean eliminar(int id) {
        resp=false;
        String consultaSQL="DELETE FROM Productos WHERE clvprod=?;";
        try{
            ps=CON.Conectar().prepareStatement(consultaSQL);
            ps.setInt(1, id);
            if(ps.executeUpdate() > 0)
            {
                resp=true;
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
    
    public List<Producto> listarComboClave() {
        List<Producto> registros = new ArrayList();
        try{
            ps = CON.Conectar().prepareStatement("SELECT clvprod FROM Productos ORDER BY clvprod ASC");
            rs = ps.executeQuery();
            while(rs.next()){
                registros.add(new Producto(rs.getInt(1)));
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
}
