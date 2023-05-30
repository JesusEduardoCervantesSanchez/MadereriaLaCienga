/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import datos.ProveedorDAO;
import entidades.Categoria;
import entidades.Proveedores;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juan Pablo Campos L
 */
public class ProveedorControl {

    private final ProveedorDAO datos;
    private Proveedores obj;
    private DefaultTableModel modeloTabla;

    public ProveedorControl() {
        datos = new ProveedorDAO();
        obj = new Proveedores();
    }

    public DefaultTableModel Listar(String texto) {
        List<Proveedores> Lista = new ArrayList();
        Lista.addAll(datos.listar(texto));

        // Crear modelo y establecer los titulos del modelo 
        String titulos[] = {"Clave", "Nombre", "Dirección", "Estado", "Teléfono", "Localidad"};
        modeloTabla = new DefaultTableModel(null, titulos);
        //Donde vamos a recorrer la estructura o los elementos de la lista con for each
        String registro[] = new String[6];

        for (Proveedores item : Lista) {
            registro[0] = Integer.toString(item.getClvprov());
            registro[1] = item.getNombrep();
            registro[2] = item.getDireccionp();
            registro[3] = item.getEstadop();
            registro[4] = item.getTelefonop();
            registro[5] = item.getLocalidadp();

            //Insertar el registro en el modelo
            modeloTabla.addRow(registro);

        }
        return modeloTabla;
    }
    
    public String[] Buscar(String texto) {
        List<Proveedores> Lista = new ArrayList();
        Lista.addAll(datos.listar(texto));
        String registro[] = new String[6];
        for (Proveedores item : Lista) {
            registro[0] = item.getNombrep();
            registro[1] = item.getDireccionp();
            registro[2] = item.getEstadop();
            registro[3] = item.getTelefonop();
            registro[4] = item.getLocalidadp();
        }
        return registro;
    }

    public String Insertar(String nombre, String direccion, String estado, String telefono, String localidad) {
        //verificar si existe la categoria
        if (datos.existe(nombre)) {
            return "Este proveedro ya se encuentra registrado";
        } else {
            //llenar el objeto
            obj.setNombrep(nombre);
            obj.setDireccionp(direccion);
            obj.setEstadop(estado);
            obj.setTelefonop(telefono);
            obj.setLocalidadp(localidad);
            //Insertar el objeto en la base de datos
            if (datos.insertar(obj)) {
                return "OK";
            } else {
                return "Error al insertar el registro";
            }
        }
    }

    public String Actualizar(int clvprov, String nombre, String nombreAnt, String direccion, String estado, String telefono, String localidad) {
        //Verificar si el usuario esta cambiando el nombre de la categoria
        if (nombre.equals(nombreAnt)) {
            obj.setClvprov(clvprov);
            obj.setNombrep(nombre);
            obj.setDireccionp(direccion);
            obj.setEstadop(estado);
            obj.setTelefonop(telefono);
            obj.setLocalidadp(localidad);
            //Actualizar el registro en la base de datos
            if (datos.actualizar(obj)) {
                return "OK";
            } else {
                return "ERROR al actualizar el registro";
            }
        } else {
            if (datos.existe(nombre)) {
                return "Este proveedor ya se encuentra registrado";
            } else {
                obj.setClvprov(clvprov);
                obj.setNombrep(nombre);
                obj.setDireccionp(direccion);
                obj.setEstadop(estado);
                obj.setTelefonop(telefono);
                obj.setLocalidadp(localidad);
                //Actualizar el registro en la base de datos
                if (datos.actualizar(obj)) {
                    return "OK";
                } else {
                    return "ERROR al actualizar el registro";
                }
            }
        }
    }
    
    public String Desactivar(int id) {
        if (!datos.existe2(id)) {
            return "El registro no existe";
        } else {
            return (datos.desactivar(id))?"OK":"Error";
        }
    }
    
    public DefaultComboBoxModel seleccionarProveedores(int i){
        DefaultComboBoxModel items = new DefaultComboBoxModel();
        List<Proveedores> registros = new ArrayList();
        if(i==1)
            items.addElement("Todos");
        else
            items.addElement("Elige");
        registros = datos.listarComboClave();
        for(Proveedores pro:registros){
            items.addElement(new Proveedores(pro.getClvprov()));
        }
        return items;
    }
    
    public int total() {
        return datos.total();
    }
     
    public int id() {
        return datos.ultimoid()+1;
    }
    
    
     
     
}
