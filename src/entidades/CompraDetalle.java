/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

public class CompraDetalle {
    private int clvco;
    private int clvprod;
    private int cantidadc;
    private double Precio;
    private double Descuento;
    private double Subtotal;

    public CompraDetalle() {
    }

    public CompraDetalle(int idCompras, int idProductos, String nombreProducto, int Cantidad, double Precio, double Descuento, double Subtotal) {
        this.clvco = idCompras;
        this.clvprod = idProductos;
        this.cantidadc = Cantidad;
        this.Precio = Precio;
        this.Descuento = Descuento;
        this.Subtotal = Subtotal;
    }

    public CompraDetalle(int idProductos, int Cantidad, double Precio, double Descuento, double Subtotal) {
        this.clvprod = idProductos;
        this.cantidadc = Cantidad;
        this.Precio = Precio;
        this.Descuento = Descuento;
        this.Subtotal = Subtotal;
    }

    public int getIdCompras() {
        return clvco;
    }

    public void setIdCompras(int idCompras) {
        this.clvco = idCompras;
    }

    public int getIdProductos() {
        return clvprod;
    }

    public void setIdProductos(int idProductos) {
        this.clvprod = idProductos;
    }

    public int getCantidad() {
        return cantidadc;
    }

    public void setCantidad(int Cantidad) {
        this.cantidadc = Cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public double getDescuento() {
        return Descuento;
    }

    public void setDescuento(double Descuento) {
        this.Descuento = Descuento;
    }

    public double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    } 
    
}
