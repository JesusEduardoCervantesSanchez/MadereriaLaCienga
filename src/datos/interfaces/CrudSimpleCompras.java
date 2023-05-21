/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Datos.Interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tadeo
 */
public interface CrudSimpleCompras<T, DC, P, PR, E> {

    public List<T> Listar();

    public List<T> Listar(int idCompra);

    public ArrayList<String> ListarC();

    public ArrayList<String> ListarProductos();

    public ArrayList<String> ListarProvedor();

    public List<E> ListarEmpleado(String valor);

    public boolean insertar(int clvprov, ArrayList<DC> obj1);

    public boolean insertarEmP_Com(int idCompra, int idEmpleado);

    public boolean insertarProv_Comp(int idCompra, int idProvedor);

    public boolean cancelar(int id);

    public int total();

    public int RegresarIdCompra(String Folio);

    public boolean existe(String texto);

    public int ActualizarStock(int cant, int id);

    public int ObtenerStock(int id);
}
