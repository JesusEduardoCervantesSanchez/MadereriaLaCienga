package datos.interfaces;

import java.util.List;

public interface CrudProductoInterface<T> {
    public List<T> listar(String texto); //Regresa un listado de tipo List de objetos T
    public boolean insertar(T obj); // Inserta un objeto del tipo T
    public boolean actualizar(T obj); //Actualiza un registro de acuerdo a un objeto del tipo T
    public int total();
    public int clvmax();
     public boolean existe(String texto);
    public boolean existe2(int id); //Regresa verdadero o falso si existe un registro.
    public boolean eliminar(int id); //Elimina un objeto
}
