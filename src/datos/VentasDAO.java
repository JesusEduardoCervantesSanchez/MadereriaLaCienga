/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import entidades.Compras;
import database.Conexion;
import java.sql.Types;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Datos.Interfaces.CrudSimpleCompras;
import datos.interfaces.CrudSimpleVentas;
import java.sql.CallableStatement;
import entidades.CompraDetalle;
import entidades.Proveedores;
import entidades.Empleados;
import entidades.Producto;
import entidades.VentaDetalle;
import entidades.Ventas;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VentasDAO implements CrudSimpleVentas<Ventas, VentaDetalle, Producto, Proveedores, Empleados> {

    private final Conexion CON;
    private PreparedStatement ps;
    private CallableStatement cs;
    private ResultSet rs;
    private boolean resp;

    public VentasDAO() {
        CON = Conexion.getInstance();
    }

//    public List Listar(String texto) {
//        List<Compras> registros = new ArrayList();
//        try {
//            String sql = "SELECT DISTINCT C.idCompras, P.idProvedores, P.nombreProvedor, E.idEmpleado, E.NombreEmpleado, C.FolioCompra, C.Descuento,\n"
//                    + " C.SubtotalCompra, C.IVA, C.FechaCompra, C.Total, C.Estado\n"
//                    + " FROM Provedores P INNER JOIN (Prov_Comp PC INNER JOIN (Compras C INNER JOIN (Emp_Com EC INNER JOIN Empleados E ON E.idEmpleado=EC.idEmpleado) ON EC.idCompras=C.idCompras) ON C.idCompras = PC.idCompras) on PC.idProvedores = P.idProvedores\n"
//                    + " ORDER BY C.idCompras ASC";
//            String buscar = "SELECT DISTINCT C.idCompras, P.idProvedores, P.nombreProvedor, E.idEmpleado, E.NombreEmpleado, C.FolioCompra, C.Descuento,\n"
//                    + " C.SubtotalCompra, C.IVA, C.FechaCompra, C.Total, C.Estado\n"
//                    + " FROM Provedores P INNER JOIN (Prov_Comp PC INNER JOIN (Compras C INNER JOIN (Emp_Com EC INNER JOIN Empleados E ON E.idEmpleado=EC.idEmpleado) ON EC.idCompras=C.idCompras) ON C.idCompras = PC.idCompras) on PC.idProvedores = P.idProvedores\n"
//                    + " WHERE C.FolioCompra like '%" + texto + "%' OR P.nombreProvedor like '%" + texto + "%' OR C.FechaCompra like '%" + texto + "%' ORDER BY C.idCompras ASC";
//            if (texto.equalsIgnoreCase("")) {
//                ps = CON.Conectar().prepareStatement(sql);
//            } else {
//                ps = CON.Conectar().prepareStatement(buscar);
//            }
//            rs = ps.executeQuery();
//            while (rs.next()) {
////                registros.add(new Compras(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getDouble(8), rs.getDouble(9), rs.getString(10), rs.getDouble(11), rs.getString(12)));
//            }
//            ps.close();
//            rs.close();
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        } finally {
//            ps = null;
//            rs = null;
//            CON.Desconectar();
//        }
//        return registros;
//    }
//    @Override
//    public List<CompraDetalle> ListarDetalle(int idCompra) {
//        List<CompraDetalle> registros = new ArrayList();
//        try {
//            ps = CON.Conectar().prepareStatement("SELECT PC.idCompras, PC.idProductos, P.nombreProducto, PC.Cantidad, PC.Precio, PC.Descuento, PC.Subtotal\n"
//                    + " FROM Pro_Comp PC inner join Productos P ON P.idProductos=PC.idProductos\n"
//                    + " WHERE PC.idCompras=?;");
//            ps.setInt(1, idCompra);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                //int idDetalleVenta, int idProducto, int idVenta, String productoNombre, int productoExistencia, int Cantidad, double precio, double descuento, double subTotal) {
//                //registros.add(new CompraDetalle(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getDouble(5), rs.getDouble(6), rs.getDouble(7)));
//            }
//            ps.close();
//            rs.close();
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        } finally {
//            ps = null;
//            rs = null;
//            CON.Desconectar();
//        }
//        return registros;
//    }

    @Override
    public List<Ventas> Listar() {
        List<Ventas> registros = new ArrayList();
        try {
            String sql = "SELECT DISTINCT C.clvco, P.clvprov, DC.clvprod, DC.cantidadc, C.fechac, C.estadoc\n"
                    + " FROM comprov P INNER JOIN (compras C INNER JOIN prodcomp DC ON DC.clvco=C.clvco) ON C.clvco=C.clvco\n"
                    + " WHERE C.estadoc = 1 ORDER BY C.clvco ASC";
            ps = CON.Conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
               // registros.add(new Ventas(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getInt(6)));
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
    public List<Ventas> Listar(int idVenta) {
        List<Ventas> registros = new ArrayList();
        try {
            String sql = "SELECT DISTINCT C. clvco, P.clvprov, DC.clvprod, DC.cantidadc, C.fechac, C.estadoc\n"
                    + " FROM comprov P INNER JOIN (compras C INNER JOIN prodcomp DC ON DC.clvco=C.clvco) ON C.clvco=C.clvco\n"
                    + " WHERE C.clvco = ? AND C.estadoc = 1 ORDER BY C.clvco ASC";
            ps = CON.Conectar().prepareStatement(sql);
            //ps.setInt(1, idCompra);
            rs = ps.executeQuery();
            while (rs.next()) {
               // registros.add(new Compras(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getInt(6)));
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
        ArrayList<String> registros = new ArrayList();
        try {
            String sql = "SELECT clvco FROM compras";
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
    
     @Override
    public ArrayList<String> ListarProductos() {
        ArrayList<String> registros = new ArrayList();
        try {
            String sql = "SELECT clvprod FROM Productos";
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
    
     @Override
    public ArrayList<String> ListarEmpleado() {
        ArrayList<String> registros = new ArrayList();
        try {
            String sql = "SELECT clvco FROM compras";
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
    
     @Override
    public boolean insertar(int clvemp, ArrayList<VentaDetalle> obj1) {
        resp = false;
        Connection conn = null;
        String InsertarCompra = "CALL InsertaVenta(?,?)";
        try {
            conn = CON.Conectar();
            conn.setAutoCommit(false);
            cs = conn.prepareCall(InsertarCompra);
            cs.setInt(1, clvemp);
            cs.registerOutParameter(2, Types.INTEGER);
            int filasAfectadas = cs.executeUpdate();
            System.out.println("Se ejecuto la primera inserción?" + filasAfectadas);
//            rs = cs.getGeneratedKeys();
            int clvve = cs.getInt(2);
//            if (rs.next()) {
//                System.out.println("Entrandoe en el if de asignación clvco");
//                clvco = rs.getInt(1);
//            }
            if (filasAfectadas > 0) {
                System.out.println("Entrando al if del detalle de compra");
                //se inserto la venta  correctamente
                String InsertaDetalleVen = "CALL InsertaDetalleVen(?, ?, ?)";
                cs = conn.prepareCall(InsertaDetalleVen);
                for (VentaDetalle item : obj1) {
                    cs.setInt(1, item.getClvprod());
                    cs.setInt(2, clvve);
                    cs.setInt(3, item.getCantidadv());
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
                Logger.getLogger(VentasDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return resp;
    }
    
    public String nombrep(int id)
    {
        String nombrep="";
        try {
            String sql = "SELECT tipop FROM Productos where clvprod = ?";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                nombrep = rs.getString(1);
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
        return nombrep;
    }
    
    public double precio(int id)
    {
        double preciop = 0.0;
        try {
            String sql = "SELECT preciovp FROM Productos where clvprod = ?";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                preciop = rs.getDouble(1);
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
        return preciop;
    }

    /*
    @Override
    public List<Empleados> ListarEmpleado(String valor) {
        List<Empleados> registros = new ArrayList();
        try {
            String sql = "SELECT idEmpleado, NombreEmpleado, TelefonoEmpleado, DomicilioEmpleado, CPEmpleado, CorreoEmpleado, ContraseñaEmpleado FROM Empleados ORDER BY idEmpleado ASC";
            String buscar = "SELECT idEmpleado, NombreEmpleado, TelefonoEmpleado, DomicilioEmpleado, CPEmpleado, CorreoEmpleado, ContraseñaEmpleado FROM Empleados WHERE NombreEmpleado LIKE '%" + valor + "%' OR TelefonoEmpleado LIKE '%" + valor + "%' OR CorreoEmpleado LIKE '%" + valor + "%' ORDER BY idEmpleado ASC";
            if (valor.equalsIgnoreCase("")) {
                ps = CON.Conectar().prepareStatement(sql);
            } else {
                ps = CON.Conectar().prepareStatement(buscar);
            }
            rs = ps.executeQuery();
            while (rs.next()) {
                //la linea siguiente probablememtne tiene error en rs.getInt(2), tal vez deberia ser con String
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
*/

    

    
    
   public int Existencia(int id)
   {
       int existencia=0;
       try {
            String sql = "SELECT existenciap FROM Productos where clvprod = ?";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                existencia = rs.getInt(1);
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
       return existencia;
   }
}
