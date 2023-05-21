/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Datos.ComprasDAO;
import entidades.CompraDetalle;
import entidades.Compras;
import entidades.Empleados;
import entidades.Producto;
import entidades.Proveedores;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class ComprasControl {

    private final ComprasDAO datos;
    private Compras obj;
    private int registrosMostrados;
    private DefaultTableModel modeloTabla;
    private DefaultTableModel modeloTabla2;
    private DefaultTableModel modeloTabla3;

    public ComprasControl() {
        datos = new ComprasDAO();
        obj = new Compras();
        registrosMostrados = 0;
    }

    public DefaultTableModel Listar() {
        List<Compras> lista = new ArrayList();
        lista.addAll(datos.Listar());
        String titulos[] = {"Clave Comp", "Clave Prov", "Clave Prod", "Cantidad", "Fecha", "Estado"};
        modeloTabla = new DefaultTableModel(null, titulos);
        String registro[] = new String[6];
        registrosMostrados = 0;
        for (Compras item : lista) {
            registro[0] = Integer.toString(item.getClvco());
            registro[1] = Integer.toString(item.getClvprov());
            registro[2] = Integer.toString(item.getClvprod());
            registro[3] = Integer.toString(item.getCantidadc());
            registro[4] = item.getFechac().substring(0, 10);
            registro[5] = item.getEstadoc() == 1 ? "Activo" : "Inactivo";
            modeloTabla.addRow(registro);
            registrosMostrados += 1;
        }
        return modeloTabla;
    }

    public DefaultTableModel Listar(int clvco) {
        List<Compras> lista = new ArrayList();
        lista.addAll(datos.Listar(clvco));
        String titulos[] = {"Clave Comp", "Clave Prov", "Clave Prod", "Cantidad", "Fecha", "Estado"};
        modeloTabla = new DefaultTableModel(null, titulos);
        String registro[] = new String[6];
        registrosMostrados = 0;
        for (Compras item : lista) {
            registro[0] = Integer.toString(item.getClvco());
            registro[1] = Integer.toString(item.getClvprov());
            registro[2] = Integer.toString(item.getClvprod());
            registro[3] = Integer.toString(item.getCantidadc());
            registro[4] = item.getFechac().substring(0, 10);
            registro[5] = item.getEstadoc() == 1 ? "Activo" : "Inactivo";
            modeloTabla.addRow(registro);
            registrosMostrados += 1;
        }
        return modeloTabla;
    }

//        public DefaultTableModel Listar(String valor) {
//        List<Compras> lista = new ArrayList();
//        lista.addAll(datos.Listar(valor));
//        String titulos[] = {"Id Compra", "Id Proveedor", "Proveedor", "Id Empleado", "Empleado", "Folio", "Descuento", "Subtotal", "IVA", "Fecha", "Total", "Estado"};
//        modeloTabla = new DefaultTableModel(null, titulos);
//        String registro[] = new String[12];
//        registrosMostrados = 0;
//        for (Compras item : lista) {
//            registro[0] = Integer.toString(item.getIdCompras());
//            registro[1] = Integer.toString(item.getIdProvedores());
//            registro[2] = item.getNombreProvedor();
//            registro[3] = Integer.toString(item.getIdEmpleado());
//            registro[4] = item.getNombreEmpleado();
//            registro[5] = item.getFolioCompra();
//            registro[6] = Double.toString(item.getDescuento());
//            registro[7] = Double.toString(item.getSubtotalCompra());
//            registro[8] = Double.toString(item.getIVA());
//            registro[9] = item.getFechaCompra();
//            registro[10] = Double.toString(item.getTotal());
//            registro[11] = item.getEstado();
//            modeloTabla.addRow(registro);
//            registrosMostrados += 1;
//        }
//        return modeloTabla;
//    }
//    public DefaultTableModel ListarDetalle(int idCompra) {
//        List<CompraDetalle> lista = new ArrayList();
//        lista.addAll(datos.ListarDetalle(idCompra));
//
//        //Crear el model y establecer los titulos del modelo
//        String titulos[] = {"ID Producto", "Nombre", "Cantidad", "Precio", "Descuento", "Subtotal"};
//        modeloTabla = new DefaultTableModel(null, titulos);
//
//        String registro[] = new String[6];
//        registrosMostrados = 0;
//        //for(tipo variable:arreglo)
//        for (CompraDetalle item : lista) {
//            registro[0] = Integer.toString(item.getIdProductos());
//            registro[1] = item.getNombreProducto();
//            registro[2] = Integer.toString(item.getCantidad());
//            registro[3] = Double.toString(item.getPreciop());
//            registro[4] = Double.toString(item.getGananciap());
//            registro[5] = Double.toString(item.getMedidasp());
//
//            modeloTabla.addRow(registro);
//            registrosMostrados += 1;
//        }
//        return modeloTabla;
//    }

    public ComboBoxModel<String> ListarProductos() {
        ComboBoxModel<String> combo = new DefaultComboBoxModel<>(datos.ListarProductos().toArray(new String[0]));
        return combo;
    }

    public ComboBoxModel<String> ListarProvedor() {
        ComboBoxModel<String> combo = new DefaultComboBoxModel<>(datos.ListarProvedor().toArray(new String[0]));
        return combo;
    }

    public ComboBoxModel<String> ListarC() {
        ComboBoxModel<String> combo = new DefaultComboBoxModel<>(datos.ListarC().toArray(new String[0]));
        return combo;
    }

    public String Insertar(int clvprov, ArrayList<CompraDetalle> obj1) {
        //llenar el objeto
//        obj.setClvprov(clvprov);
        //convetir DefaultTable a lista o arreglo
//        for (i = 0; i < detalle.getRowCount(); i++) {
//            idProducto = Integer.parseInt(detalle.getValueAt(i, 0).toString());
//            cantidad = Integer.parseInt(detalle.getValueAt(i, 2).toString());
//            precio = Double.parseDouble(detalle.getValueAt(i, 3).toString());
//            descuentoProducto = Double.parseDouble(detalle.getValueAt(i, 4).toString());
//            subtotal = Double.parseDouble(detalle.getValueAt(i, 5).toString());
//            //Insertar los valores en la lista
//            listaProductos.add(new CompraDetalle(idProducto, cantidad, precio, descuentoProducto, subtotal));
//        }
//        obj.setDetalle(listaProductos);
        //insertar objeto en la BD
        if (datos.insertar(clvprov, obj1)) {
            return "OK";
        } else {
            return "Error al realizar la compra";
        }
    }

    public String InsertarEmp_Com(int idCompra, int idEmpleado) {
        if (datos.insertarEmP_Com(idCompra, idEmpleado)) {
            return "OK";
        } else {
            return "Error al generar la nueva compra";
        }
    }

    public String InsertarProv_Comp(int idCompra, int idProvedor) {
        if (datos.insertarProv_Comp(idCompra, idProvedor)) {
            return "OK";
        } else {
            return "Error al generar la nueva compra";
        }
    }

    public String Cancelar(int id) {
        return (datos.cancelar(id)) ? "OK" : "Error al cancelar la compra";
    }

    public int RegresaeIDCompra(String Folio) {
        return datos.RegresarIdCompra(Folio);
    }

    public int Total() {
        return datos.total();
    }

    public int TotalMostrados() {
        return registrosMostrados;
    }

    public int ActualizarExistenciaProd(int cant, int idProducto) {
        return datos.ActualizarStock(cant, idProducto);
    }

    public int ObtenerStock(int idProducto) {
        return datos.ObtenerStock(idProducto);
    }
}
