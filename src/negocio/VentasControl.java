/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import datos.VentasDAO;
import entidades.Clientes;
import entidades.Empleados;
import entidades.Pro_Ven;
import entidades.Producto;
import entidades.VentaDetalle;
import javax.swing.DefaultComboBoxModel;
import entidades.Ventas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CSjes
 */
public class VentasControl {

    private final VentasDAO DATOS;
    private Ventas obj;
    private DefaultTableModel modeloTabla;
    private DefaultTableModel modeloTabla2;
    private DefaultTableModel modeloTabla3;
    private int registrosMostrados;

    public VentasControl() {
        this.DATOS = new VentasDAO();
        obj = new Ventas();
        registrosMostrados = 0;
    }

    public DefaultTableModel listar(String texto) {
        List<Ventas> lista = new ArrayList();
        //lista.addAll(DATOS.listar(texto));
        //Crear el modelo y establecer los titulos del modelo
        String titulos[] = {"IdVenta", "Id Cliente", "Nombre del Cliente", "Id Empleado", "Nombre Empleado", "Folio de Venta", "Fecha", "SubTotal", "IVA"};
        modeloTabla = new DefaultTableModel(null, titulos);
        //Recorrer los elementos de la lista con un for each
        String registro[] = new String[9];
        registrosMostrados = 0;
        for (Ventas item : lista) {
            /*registro[0] = Integer.toString(item.getIdVentas());
            registro[1] = Integer.toString(item.getIdCliente());
            registro[2] = item.getClienteNombre();
            registro[3] = Integer.toString(item.getIdEmpleado());
            registro[4] = item.getNombreEmpleado();
            registro[5] = item.getFolioVenta();
            registro[6] = "" + item.getFechaVenta();
            registro[7] = Double.toString(item.getSubTotal());
            registro[8] = Double.toString(item.getIVA());*/
            //Insertar el registro en el modelo
            modeloTabla.addRow(registro);
            registrosMostrados += 1;
        }
        return modeloTabla;
    }

    public DefaultTableModel listarDetalle(int idVenta) {
        List<Pro_Ven> lista = new ArrayList();
        // lista.addAll(DATOS.listarDetalle(idVenta));
        //Crear el modelo y establecer los titulos del modelo"
        String titulos[] = {"ID Producto", "Producto", "Cantidad", "Precio", "SubTotal"};
        modeloTabla = new DefaultTableModel(null, titulos);
        //Recorrer los elementos de la lista con un for each
        String estado;
        String registro[] = new String[5];
        registrosMostrados = 0;
        for (Pro_Ven item : lista) {
            registro[0] = "" + item.getIdProductos();
            registro[1] = item.getNombreProducto();
            registro[2] = "" + item.getCantProVen();
            registro[3] = "" + item.getPrecioU();
            registro[4] = "" + item.getSubTotal();
            //Insertar el registro en el modelo
            modeloTabla.addRow(registro);
            registrosMostrados += 1;
        }
        return modeloTabla;
    }

    public DefaultTableModel ListarProductos(String valor) {
        List<Producto> lista = new ArrayList();
        // lista.addAll(DATOS.ListarProductos(valor));
        String titulos[] = {"Id", "Id Categotia", "Producto", "Categoria", "Existencias", "P. Compra", "P. Venta", "Ganancia", "Imagen"};
        modeloTabla3 = new DefaultTableModel(null, titulos);
        String registro[] = new String[9];
        registrosMostrados = 0;
        for (Producto item : lista) {
            /*
            registro[0] = Integer.toString(item.getIdProducto());
            registro[1] = Integer.toString(item.getIdCategoria());
            registro[2] = item.getNombreProducto();
            registro[3] = item.getNombreCategoria();
            registro[4] = Integer.toString(item.getExistencias());
            registro[5] = Double.toString(item.getPrecioCompra());
            registro[6] = Double.toString(item.getPrecioVenta());
            registro[7] = Double.toString(item.getGanancia());
            registro[8] = item.getImagenProducto();
            modeloTabla3.addRow(registro);
            registrosMostrados += 1;
             */
        }
        return modeloTabla3;
    }

    public DefaultTableModel ListarCliente(String valor) {
        List<Clientes> lista = new ArrayList();
        // lista.addAll(DATOS.ListarCliente(valor));
        //int idCliente, String nombreCliente, String apellidosCliente, String telefonoCliente, String correoCliente
        String titulos[] = {"Id", "Nombre", "Apellidos", "Telefono", "Correo"};
        modeloTabla = new DefaultTableModel(null, titulos);
        String registro[] = new String[5];
        registrosMostrados = 0;
        for (Clientes item : lista) {
            registro[0] = Integer.toString(item.getIdCliente());
            registro[1] = item.getNombreCliente();
            registro[2] = item.getApellidosCliente();
            registro[3] = item.getTelefonoCliente();
            registro[4] = item.getCorreoCliente();
            modeloTabla.addRow(registro);
            registrosMostrados += 1;
        }
        return modeloTabla;
    }

    public DefaultTableModel ListarEmpleados(String valor) {
        List<Empleados> lista = new ArrayList();
        // lista.addAll(DATOS.ListarEmpleado(valor));
        String titulos[] = {"Id", "Nombre", "Telefono", "Domicilio", "Colonia"};
        modeloTabla = new DefaultTableModel(null, titulos);
        String registro[] = new String[5];
        registrosMostrados = 0;
        for (Empleados item : lista) {
            registro[0] = Integer.toString(item.getClvemp());
            registro[1] = item.getNombree();
            registro[2] = item.getTelefonoe();
            registro[3] = item.getDireccione();
            registro[4] = item.getColoniae();
            modeloTabla.addRow(registro);
            registrosMostrados += 1;
        }
        return modeloTabla;
    }

    public String insertar(int clvemp, ArrayList detalles) {
        //ArrayList<VentaDetalle> listaProductos = new ArrayList();
        //Verificar si existe la categoria else {
        //Llenar el objeto
        //Convertir el Default Table Model a una lista
        //for (int i = 0; i < detalles.getRowCount(); i++) {
        //Insertar los valores en la lista
        //listaProductos.add(new VentaDetalle(Integer.parseInt(""+detalles.getValueAt(i, 0)), Integer.parseInt(""+detalles.getValueAt(i, 1))));
        // }
        //Insertar el objeto en la base de datos
        if (DATOS.insertar(clvemp, detalles)) {
            return "OK";
        } else {
            return "Error al insertar el registro";
        }
    }

    public ComboBoxModel<String> ListaProductos() {
        ComboBoxModel<String> combo = new DefaultComboBoxModel<>(DATOS.ListarProductos().toArray(new String[0]));
        return combo;
    }

    public int totalMostrados() {
        return registrosMostrados;
    }

    public String NombreProducto(int idProducto) {
        return DATOS.nombrep(idProducto);
    }

    public double PrecioProducto(int idProducto) {
        return DATOS.precio(idProducto);
    }

    public int Existencia(int idProducto) {
        return DATOS.Existencia(idProducto);
    }

    public int clvMax() {
        return DATOS.clvmax();
    }
}
