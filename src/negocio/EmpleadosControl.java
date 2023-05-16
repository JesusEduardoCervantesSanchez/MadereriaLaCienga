                                                                                                        
package negocio;

import datos.EmpleadosDAO;
import entidades.Empleados;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class EmpleadosControl {
    private final EmpleadosDAO DATOS;
    private Empleados obj;
    private DefaultTableModel modeloTabla;
    private int registrosMostrados;
    
    public EmpleadosControl(){
        DATOS=new EmpleadosDAO();
        obj = new Empleados();
        registrosMostrados=0;
    }
    
    public DefaultTableModel listar(String texto){
        List <Empleados> lista = new ArrayList();
        lista.addAll(DATOS.listar(texto));
        
        //Crear el modelo y establecer los títulos del modelo
        String titulos[]={"ID Empleado", "Nombre Empleado", "Telefono Empleado", "Domicilio Empleado", "Colonia Empleado", "Estado"};
        modeloTabla=new DefaultTableModel(null,titulos);
        
        // Recorrer los elementos de la lista con for each
        String registro []= new String[6];
        registrosMostrados=0;
        for(Empleados item: lista){
            registro[0] = ""+item.getIdEmpleado();
            registro[1] = item.getNombreEmpleado();
            registro[2] = item.getTelefonoEmpleado();
            registro[3] = item.getDomicilioEmpleado();
            registro[4] = item.getColoniaEmpleado();
            registro[5] = (item.isActivo())?"Activo":"Inactivo";
            
            //Insertar el registro en el modelo
            modeloTabla.addRow(registro);
            registrosMostrados+=1;
        }
        return modeloTabla;
    }
    
 
    
    public String insertar(String nombreEmpleado, String telefonoEmpleado, String domicilioEmpleado, String coloniaEmpleado){
    // Verificar si existe la categoria
        if(DATOS.existe(nombreEmpleado))
            return "El registro ya existe.";
        else
        {
            // Llenar el objeto
            obj.setNombreEmpleado(nombreEmpleado);
            obj.setTelefonoEmpleado(telefonoEmpleado);
            obj.setDomicilioEmpleado(domicilioEmpleado);
            obj.setColoniaEmpleado(coloniaEmpleado);
            obj.setActivo(true);
            
            //Insertar el objeto en la base de datos
            return (DATOS.insertar(obj))?"OK":"Error al insertar el registro";
        }
    }
    
    public String actualizar(int idEmpleado, String nombreEmpleado, String nombreAnterior, String telefonoEmpleado, String domicilioEmpleado, String coloniaEmpleado){
        if(nombreEmpleado.equals(nombreAnterior))
        {
            obj.setIdEmpleado(idEmpleado);
            obj.setNombreEmpleado(nombreEmpleado);
            obj.setTelefonoEmpleado(telefonoEmpleado);
            obj.setDomicilioEmpleado(domicilioEmpleado);
            obj.setColoniaEmpleado(coloniaEmpleado);
            if(DATOS.actualizar(obj))
                return "OK";
            else
                return "Error al actualizar el registro.";
        }
        else
        {
            if(DATOS.existe(nombreEmpleado))
                return "El usuario ya existe.";
            else
            {
                obj.setNombreEmpleado(nombreEmpleado);
            obj.setTelefonoEmpleado(telefonoEmpleado);
            obj.setDomicilioEmpleado(domicilioEmpleado);
            obj.setColoniaEmpleado(coloniaEmpleado);

            if(DATOS.actualizar(obj))
                    return "OK.";
                else
                    return "Error al actualizar el registro.";
            }
        }
    }
    
    public String desactivar(int id){
        return(DATOS.desactivar(id))?"OK":"No se pudo desactivar el registro";
    }
    
    public String activar(int id){
        return(DATOS.activar(id))?"OK":"No se pudo desactivar el registro";
    }
    
    public int total(){
        return DATOS.total();
    }
    
    public int totalMostrados(){
        return registrosMostrados;
    }
}
