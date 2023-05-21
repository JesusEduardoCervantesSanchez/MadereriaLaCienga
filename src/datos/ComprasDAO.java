/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

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
import java.sql.CallableStatement;
import entidades.CompraDetalle;
import entidades.Proveedores;
import entidades.Empleados;
import entidades.Producto;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ComprasDAO implements CrudSimpleCompras<Compras, CompraDetalle, Producto, Proveedores, Empleados> {

    private final Conexion CON;
    private PreparedStatement ps;
    private CallableStatement cs;
    private ResultSet rs;
    private boolean resp;

    public ComprasDAO() {
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
    public boolean insertar(int clvprov, ArrayList<CompraDetalle> obj1) {
        resp = false;
        Connection conn = null;
        String InsertarCompra = "CALL InsertarCompra(?,?)";
        try {
            conn = CON.Conectar();
            conn.setAutoCommit(false);
            cs = conn.prepareCall(InsertarCompra);
            cs.setInt(1, clvprov);
            cs.registerOutParameter(2, Types.INTEGER);
            int filasAfectadas = cs.executeUpdate();
            System.out.println("Se ejecuto la primera inserción?" + filasAfectadas);
//            rs = cs.getGeneratedKeys();
            int clvco = cs.getInt(2);
//            if (rs.next()) {
//                System.out.println("Entrandoe en el if de asignación clvco");
//                clvco = rs.getInt(1);
//            }
            System.out.println("clave de compra" + clvco);
            if (filasAfectadas > 0) {
                System.out.println("Entrando al if del detalle de compra");
                //se inserto la venta  correctamente
                String InsertarDetalleCompra = "CALL InsertarDetalleCom(?, ?, ?, ?, ?, ?)";
                cs = conn.prepareCall(InsertarDetalleCompra);
                for (CompraDetalle item : obj1) {
                    cs.setInt(1, item.getClvprod());
                    cs.setInt(2, clvco);
                    cs.setInt(3, item.getCantidadc());
                    cs.setDouble(4, item.getMedidasp());
                    cs.setDouble(5, item.getPreciop());
                    cs.setDouble(6, item.getGananciap());
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
                Logger.getLogger(ComprasDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return resp;
    }

    @Override
    public boolean insertarEmP_Com(int idCompra, int idEmpleado) {
        resp = false;
        String consultaSQL = "Insert into Emp_Com(idCompras, idEmpleado)";
        consultaSQL += "VALUES(?, ?)";
        try {
            ps = CON.Conectar().prepareStatement(consultaSQL);
            ps.setInt(1, idCompra);
            ps.setInt(2, idEmpleado);
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
    public boolean insertarProv_Comp(int idCompra, int idProvedor) {
        resp = false;
        String consultaSQL = "Insert into Prov_Comp(idCompras, idProvedores)";
        consultaSQL += "VALUES(?, ?)";
        try {
            ps = CON.Conectar().prepareStatement(consultaSQL);
            ps.setInt(1, idCompra);
            ps.setInt(2, idProvedor);
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
    public int total() {
        int numeroRegistros = 0;
        try {
            ps = CON.Conectar().prepareStatement("SELECT COUNT(*) from Compras;");
            rs = ps.executeQuery();
            while (rs.next()) {
                numeroRegistros = rs.getInt(1); //getString(String);
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
    public boolean existe(String Folio) {
        resp = false;
        try {
            ps = CON.Conectar().prepareStatement("SELECT * from Compras WHERE FolioCompra = ?;");
            ps.setString(1, Folio);
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
    }

    @Override
    public boolean cancelar(int id) {
        resp = false;
        String consultaSQL = "UPDATE Compras SET estadoc = 0 WHERE clvco = ?;";
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
    }

    @Override
    public ArrayList<String> ListarProductos() {
        ArrayList<String> registros = new ArrayList();
        try {
            String sql = "SELECT clvprod FROM productos";
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
    public int ActualizarStock(int cant, int id) {
        int r = 0;
        String sql = "UPDATE Productos SET Existencias=? WHERE idProductos=?";
        try {
            ps = CON.Conectar().prepareStatement(sql);
            ps.setDouble(1, cant);
            ps.setInt(2, id);
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
        return r;
    }

    @Override
    public int ObtenerStock(int id) {
        int r = 0;
        String sql = "SELECT Existencias FROM Productos WHERE idProductos = ?";
        try {
            ps = CON.Conectar().prepareStatement(sql);
            ps.setDouble(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                r = rs.getInt(1);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            CON.Desconectar();
        }
        return r;
    }

    @Override
    public ArrayList<String> ListarProvedor() {
        ArrayList<String> registros = new ArrayList();
        try {
            String sql = "SELECT clvprov FROM proveedores";
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
                //registros.add(new Empleados(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
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
    public int RegresarIdCompra(String Folio) {
        int idVenta = 0;
        try {
            ps = CON.Conectar().prepareStatement(" Select idCompras from Compras where FolioCompra Like ?;");//El parametro del count, si se le ingresa un asterisco toma en cuenta solo nulos
            ps.setString(1, "%" + Folio + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                idVenta = rs.getInt(1);
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
        return idVenta;
    }

    @Override
    public List<Compras> Listar() {
        List<Compras> registros = new ArrayList();
        try {
            String sql = "SELECT DISTINCT C.clvco, P.clvprov, DC.clvprod, DC.cantidadc, C.fechac, C.estadoc\n"
                    + " FROM comprov P INNER JOIN (compras C INNER JOIN prodcomp DC ON DC.clvco=C.clvco) ON C.clvco=C.clvco\n"
                    + " WHERE C.estadoc = 1 ORDER BY C.clvco ASC";
            ps = CON.Conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                registros.add(new Compras(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getInt(6)));
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
    public List<Compras> Listar(int idCompra) {
        List<Compras> registros = new ArrayList();
        try {
            String sql = "SELECT DISTINCT C. clvco, P.clvprov, DC.clvprod, DC.cantidadc, C.fechac, C.estadoc\n"
                    + " FROM comprov P INNER JOIN (compras C INNER JOIN prodcomp DC ON DC.clvco=C.clvco) ON C.clvco=C.clvco\n"
                    + " WHERE C.clvco = ? AND C.estadoc = 1 ORDER BY C.clvco ASC";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setInt(1, idCompra);
            rs = ps.executeQuery();
            while (rs.next()) {
                registros.add(new Compras(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getInt(6)));
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
}
