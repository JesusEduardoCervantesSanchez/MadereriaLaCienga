                                                                                                        
package negocio;

import datos.CategoriaDAO;
import datos.ProductoDAO;
import entidades.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class ProductoControl {
    private final ProductoDAO DATOS;
    private final CategoriaDAO DATOSCAT;
    private Producto obj;
    private DefaultTableModel modeloTabla;
    private int registrosMostrados;
    
    public ProductoControl(){
        DATOS=new ProductoDAO();
        DATOSCAT = new CategoriaDAO();
        obj = new Producto();
        registrosMostrados=0;
    }
    
    public DefaultTableModel listar(String texto){
        List <Producto> lista = new ArrayList();
        lista.addAll(DATOS.listar(texto));
        
        //Crear el modelo y establecer los títulos del modelo
        String titulos[]={"ID Producto", "Tipo", "Existencia", "Categoría", "Precio Venta", "Ganancia", 
        "Precio Compra", "Medidas"};
        modeloTabla=new DefaultTableModel(null,titulos);
        
        // Recorrer los elementos de la lista con for each
        String registro []= new String[8];
        registrosMostrados=0;
        for(Producto item: lista){
            registro[0] = ""+item.getClvprod();
            registro[1] = item.getTipop();
            registro[2] = ""+item.getExistenciap();
            registro[3] = item.getCategoriap();
            registro[4] = ""+item.getPreciovp();
            registro[5] = ""+item.getGananciap();
            registro[6] = ""+item.getPreciop();
            registro[7] = ""+item.getMedidasp();
                        
            //Insertar el registro en el modelo
            modeloTabla.addRow(registro);
            registrosMostrados+=1;
        }
        return modeloTabla;
    }
  /*  
    public DefaultTableModel seleccionarCategorias(String texto){
        List <Categoria> lista = new ArrayList();
        lista.addAll(DATOSCAT.listar(texto,1));
        
        //Crear el modelo y establecer los títulos del modelo
        String titulos[]={"ID Categoría", "Nombre"};
        modeloTabla=new DefaultTableModel(null,titulos);
        
        // Recorrer los elementos de la lista con for each
        String registro []= new String[2];
        registrosMostrados=0;
        for(Categoria item: lista){
            registro[0] = ""+item.getIdCategoria();
            registro[1] = item.getNombreCategoria();
                        
            //Insertar el registro en el modelo
            modeloTabla.addRow(registro);
            registrosMostrados+=1;
        }
        return modeloTabla;
    }
*/
    
    public String insertar(String tipop, int existenciap, String categoriap, double preciovp, double gananciap, double preciop, double medidasp){
    // Verificar si existe la categoria
        if(DATOS.existe(tipop))
            return "El registro ya existe.";
        else
        {
            // Llenar el objeto
            obj.setTipop(tipop);
            obj.setExistenciap(existenciap);
            obj.setCategoriap(categoriap);
            obj.setPreciovp(preciovp);
            obj.setGananciap(gananciap);
            obj.setPreciop(preciop);
            obj.setMedidasp(medidasp);
            //Insertar el objeto en la base de datos
            return (DATOS.insertar(obj))?"OK":"Error al insertar el registro";
        }
    }
    
    public String eliminar(int id){
        // Verificar si existe la categoria
        if(!DATOS.existe2(id))
            return "El registro no existe.";
        else
        {
            return (DATOS.eliminar(id))?"OK":"Error";
        }
    }
    /*
    public String actualizar(int idProducto, int idCategoria, String nombreProducto, String nombreAnterior, int existencias, double precioCompra, double precioVenta, double ganancia, String imagenProducto){
        //Verificar si el usuario cambia el nombre de la categoría
        if(nombreProducto.equals(nombreAnterior)){
            // Llenar el objeto
            obj.setIdProducto(idProducto);
            obj.setIdCategoria(idCategoria);
            obj.setNombreProducto(nombreProducto);
            obj.setExistencias(existencias);
            obj.setPrecioCompra(precioCompra);
            obj.setPrecioVenta(precioVenta);
            obj.setGanancia(ganancia);
            obj.setImagenProducto(imagenProducto);

                //Actualizar el objeto en la base de datos
                return(DATOS.actualizar(obj))?"OK":"Error al actualizar el registro";
        }
        else{
        // Verificar si existe la categoria
            if(DATOS.existe(nombreProducto))
                return "El nombre del producto ya existe.";
            else
            {
                // Llenar el objeto
                obj.setIdProducto(idProducto);
                obj.setIdCategoria(idCategoria);
                obj.setNombreProducto(nombreProducto);
                obj.setExistencias(existencias);
                obj.setPrecioCompra(precioCompra);
                obj.setPrecioVenta(precioVenta);
                obj.setGanancia(ganancia);
                obj.setImagenProducto(imagenProducto);

                //Actualizar el objeto en la base de datos
                return(DATOS.actualizar(obj))?"OK":"Error al actualizar el registro";
            }
        }
    }
*/
    
    public DefaultComboBoxModel seleccionarProductos(int i){
        DefaultComboBoxModel items = new DefaultComboBoxModel();
        List<Producto> registros = new ArrayList();
        if(i==1)
            items.addElement("Todos");
        else
            items.addElement("Elige");
        registros = DATOS.listarComboClave();
        for(Producto pro:registros){
            items.addElement(new Producto(pro.getClvprod()));
        }
        return items;
    }
    
    public int total(){
        return DATOS.total();
    }
    
    public int clvmax(){
        return DATOS.clvmax();
    }
    
    public int totalMostrados(){
        return registrosMostrados;
    }
}
