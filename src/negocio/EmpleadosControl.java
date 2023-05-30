package negocio;

import datos.EmpleadosDAO;
import entidades.Empleados;
import entidades.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class EmpleadosControl {

    private final EmpleadosDAO DATOS;
    private Empleados obj;
    private DefaultTableModel modeloTabla;
    private int registrosMostrados;

    public EmpleadosControl() {
        DATOS = new EmpleadosDAO();
        obj = new Empleados();
        registrosMostrados = 0;
    }

    public DefaultTableModel listar(String texto) {
        List<Empleados> lista = new ArrayList();
        lista.addAll(DATOS.listar(texto));

        //Crear el modelo y establecer los títulos del modelo
        String titulos[] = {"Clave Empleado", "Nombre Empleado", "Apellido Empleado", "Telefono Empleado", "Domicilio Empleado", "Colonia Empleado"};
        modeloTabla = new DefaultTableModel(null, titulos);

        // Recorrer los elementos de la lista con for each
        String registro[] = new String[6];
        registrosMostrados = 0;
        for (Empleados item : lista) {
            registro[0] = "" + item.getClvemp();
            registro[1] = item.getNombree();
            registro[2] = item.getApellidoe();
            registro[3] = item.getTelefonoe();
            registro[4] = item.getDireccione();
            registro[5] = item.getColoniae();

            //Insertar el registro en el modelo
            modeloTabla.addRow(registro);
            registrosMostrados += 1;
        }
        return modeloTabla;
    }

    public String insertar(String nombreEmpleado, String apellidoEmpleado, String telefonoEmpleado, String domicilioEmpleado, String coloniaEmpleado, String nombreu, String contrasenau) {
        // Verificar si existe la categoria
        // Llenar el objeto
        obj.setNombree(nombreEmpleado);
        obj.setApellidoe(apellidoEmpleado);
        obj.setTelefonoe(telefonoEmpleado);
        obj.setDireccione(domicilioEmpleado);
        obj.setColoniae(coloniaEmpleado);
        obj.setNombreu(nombreu);
        obj.setContrasenau(contrasenau);
        //Insertar el objeto en la base de datos
        return (DATOS.insertar(obj)) ? "OK" : "Error al insertar el registro";
    }

    public String actualizar(int idEmpleado, String nombreEmpleado, String apellidoEmpleado, String telefonoEmpleado, String domicilioEmpleado, String coloniaEmpleado) {
        obj.setNombree(nombreEmpleado);
        obj.setApellidoe(apellidoEmpleado);
        obj.setTelefonoe(telefonoEmpleado);
        obj.setDireccione(domicilioEmpleado);
        obj.setColoniae(coloniaEmpleado);
        obj.setClvemp(idEmpleado);

        if (DATOS.actualizar(obj)) {
            return "OK.";
        } else {
            return "Error al actualizar el registro.";
        }
    }

    public String eliminar(int idEmpleado) {
        if (DATOS.eliminar(idEmpleado)) {
            return "OK";
        } else {
            return "Error al eliminar...";
        }
    }

    public int total() {
        return DATOS.total();
    }

    public int totalMostrados() {
        return registrosMostrados;
    }

    public ComboBoxModel<String> ListarC() {
        ComboBoxModel<String> combo = new DefaultComboBoxModel<>(DATOS.ListarE().toArray(new String[0]));
        return combo;
    }
    
    public ComboBoxModel<String> ListarC2() {
        ComboBoxModel<String> combo = new DefaultComboBoxModel<>(DATOS.ListarE2().toArray(new String[0]));
        return combo;
    }
    
        public String[] Buscar(String texto) {
        List<Empleados> Lista = new ArrayList();
        Lista.addAll(DATOS.listar(texto));
        String registro[] = new String[6];
        for (Empleados item : Lista) {
            registro[0] = item.getNombree();
            registro[1] = item.getApellidoe();
            registro[2] = item.getTelefonoe();
            registro[3] = item.getDireccione();
            registro[4] = item.getColoniae();
        }
        return registro;
       }
    
    public String ActualizarContra(int clave, String contra, String nueva)
    {
        if(DATOS.ActualizarContra(clave, contra, nueva))
            return "OK.";
        else
            return "Error al actualizar el registro.";
    }
    
    public int clvmax(){
        return DATOS.clvmax();
    }
    
    public DefaultComboBoxModel seleccionarProductos(int i){
        DefaultComboBoxModel items = new DefaultComboBoxModel();
        List<Empleados> registros = new ArrayList();
        if(i==1)
            items.addElement("Todos");
        else
            items.addElement("Elige");
        registros = DATOS.ListarEs();
        for(Empleados pro:registros){
            items.addElement(new Producto(pro.getClvemp()));
        }
        return items;
    }
}
