/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import datos.DevVentasDAO;
import entidades.Clientes;
import entidades.Empleados;
import entidades.Pro_Ven;
import entidades.DevVentas;
import entidades.DetalleDevVentas;
import entidades.VentaDetalle;
import javax.swing.DefaultComboBoxModel;
import entidades.Ventas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class DevVentasControl {

    private final DevVentasDAO DATOS;
    private Ventas obj;
    private DefaultTableModel modeloTabla;
    private DefaultTableModel modeloTabla2;
    private DefaultTableModel modeloTabla3;
    private int registrosMostrados;
    private double total;

    public DevVentasControl() {
        this.DATOS = new DevVentasDAO();
        obj = new Ventas();
        registrosMostrados = 0;
    }

    public ComboBoxModel<String> ListaClaves() {
        ComboBoxModel<String> combo = new DefaultComboBoxModel<>(DATOS.ListarClaveV().toArray(new String[0]));
        return combo;
    }

    public DefaultTableModel listarDetalle(int idVenta) {
        List<VentaDetalle> lista = new ArrayList();
        lista.addAll(DATOS.ListarTabla(idVenta));
        //Crear el modelo y establecer los titulos del modelo"
        String titulos[] = {"Clave", "Cantidad", "Nombre", "Precio", "Monto"};
        modeloTabla = new DefaultTableModel(null, titulos);
        //Recorrer los elementos de la lista con un for each
        String estado;
        String registro[] = new String[5];
        registrosMostrados = 0;
        for (VentaDetalle item : lista) {
            registro[0] = "" + item.getClvprod();
            registro[1] = "" + item.getCantidadv();
            registro[2] = "" + item.getNombre();
            registro[3] = "" + item.getPreciop();
            registro[4] = "" + item.getCantidadv() * item.getPreciop();
            //Insertar el registro en el modelo
            modeloTabla.addRow(registro);
            registrosMostrados += 1;
        }
        return modeloTabla;
    }

    public DefaultTableModel listarDetalle2(int idVenta) {
        total = 0;
        List<VentaDetalle> lista = new ArrayList();
        lista.addAll(DATOS.ListarTabla(idVenta));
        //Crear el modelo y establecer los titulos del modelo"
        String titulos[] = {"Clave", "Cantidad", "Nombre", "Precio", "Monto"};
        modeloTabla = new DefaultTableModel(null, titulos);
        //Recorrer los elementos de la lista con un for each
        String estado;
        String registro[] = new String[5];
        registrosMostrados = 0;
        for (VentaDetalle item : lista) {
            registro[0] = "" + item.getClvprod();
            registro[1] = "" + item.getCantidadv();
            registro[2] = "" + item.getNombre();
            registro[3] = "" + item.getPreciop();
            registro[4] = "" + item.getCantidadv() * item.getPreciop();
            total += Double.parseDouble(registro[4]);
            //Insertar el registro en el modelo
            modeloTabla.addRow(registro);
            registrosMostrados += 1;
        }
        registro[0] = "";
        registro[1] = "";
        registro[2] = "Subtotal:";
        registro[3] = "";
        registro[4] = "" + (total - (total * .16));
        modeloTabla.addRow(registro);
        registro[0] = "";
        registro[1] = "";
        registro[2] = "IVA:";
        registro[3] = "";
        registro[4] = "" + total * .16;
        modeloTabla.addRow(registro);
        registro[0] = "";
        registro[1] = "";
        registro[2] = "Total:";
        registro[3] = "";
        registro[4] = "" + total;
        modeloTabla.addRow(registro);
        return modeloTabla;
    }

    public String insertar(int clvve, ArrayList detalles) {
        //ArrayList<VentaDetalle> listaProductos = new ArrayList();
        //Verificar si existe la categoria else {
        //Llenar el objeto
        //Convertir el Default Table Model a una lista
        //for (int i = 0; i < detalles.getRowCount(); i++) {
        //Insertar los valores en la lista
        //listaProductos.add(new VentaDetalle(Integer.parseInt(""+detalles.getValueAt(i, 0)), Integer.parseInt(""+detalles.getValueAt(i, 1))));
        // }
        //Insertar el objeto en la base de datos
        if (DATOS.insertar(clvve, detalles)) {
            return "OK";
        } else {
            return "Error al insertar el registro";
        }
    }
}
