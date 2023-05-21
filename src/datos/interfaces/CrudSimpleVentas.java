/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package datos.interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tadeo
 */
public interface CrudSimpleVentas<T, DC, P, PR, E> {

    public List<T> Listar();

    public List<T> Listar(int idVenta);

    public ArrayList<String> ListarC();

    public ArrayList<String> ListarProductos();

    public ArrayList<String> ListarEmpleado();

    public boolean insertar(int clvemp, ArrayList<DC> obj1);
}
