/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import database.Conexion;
import datos.interfaces.CrudSimpleVentas;
import entidades.Empleados;
import entidades.Producto;
import entidades.Proveedores;
import entidades.DetalleDevVentas;
import entidades.DevVentas;
import entidades.VentaDetalle;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hg710
 */
public class DevVentasDAO implements CrudSimpleVentas<DevVentas, DetalleDevVentas, Producto, Proveedores, Empleados> {

    private final Conexion CON;
    private PreparedStatement ps;
    private CallableStatement cs;
    private ResultSet rs;
    private boolean resp;
    
    public DevVentasDAO() {
        CON = Conexion.getInstance();
    }
    
    @Override
    public List<DevVentas> Listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DevVentas> Listar(int idVenta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public ArrayList<String> ListarClaveV() {
        ArrayList<String> registros = new ArrayList();
        try {
            String sql = "SELECT clvve FROM Ventas";
            ps = CON.Conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            registros.add("Elige");
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
    
    public List<VentaDetalle> ListarTabla(int clave) {
        List<VentaDetalle> registros = new ArrayList();
        try {
            String sql = "SELECT P.clvprod, DV.cantidadv, P.tipop, P.preciovp FROM Productos P inner join ProdVen DV on DV.clvprod = P.clvprod where DV.clvve = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setInt(1, clave);
            rs = ps.executeQuery();
            while (rs.next()) {
                registros.add(new VentaDetalle(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDouble(4)));
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
    public ArrayList<String> ListarC() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<String> ListarProductos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<String> ListarEmpleado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean insertar(int clvemp, ArrayList<DetalleDevVentas> obj1) {
        resp = false;
        Connection conn = null;
        String InsertarCompra = "CALL InsertaDevVenta(?,?)";
        try {
            conn = CON.Conectar();
            conn.setAutoCommit(false);
            cs = conn.prepareCall(InsertarCompra);
            cs.setInt(1, clvemp);
            cs.registerOutParameter(2, Types.INTEGER);
            int filasAfectadas = cs.executeUpdate();
            System.out.println("Se ejecuto la primera inserción?" + filasAfectadas);
//            rs = cs.getGeneratedKeys();
            int clvdv = cs.getInt(2);
//            if (rs.next()) {
//                System.out.println("Entrandoe en el if de asignación clvco");
//                clvco = rs.getInt(1);
//            }
            if (filasAfectadas > 0) {
                System.out.println("Entrando al if del detalle de compra");
                //se inserto la venta  correctamente
                String InsertaDetalleDevVen = "CALL InsertaDetalleDevVen(?, ?, ?)";
                cs = conn.prepareCall(InsertaDetalleDevVen);
                for (DetalleDevVentas item : obj1) {
                    cs.setInt(1, item.getClvprod());
                    cs.setInt(2, clvdv);
                    cs.setInt(3, item.getCantidaddv());
                    System.out.println("cs: "+ cs);
                    resp = cs.executeUpdate() > 0;
                } //aqui se cierra el for
                System.out.println("Ultimo estado de resp:" + resp);
                conn.commit();
            } else {
                //Deshacer la transaccion
                conn.rollback();
            }
        } catch (SQLException e) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error" + ex);
            }
            //JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                if (rs != null) {
                    rs.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DevVentasDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return resp;
    }
    
}
