/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author hg710
 */
public class VentaDetalle {
    private int clvprod;
    private int clvve;
    private int cantidadv;
    private double iva;
    private double subtotalv;
    private String nombre;
    private double preciop;
    private double monto;

    public VentaDetalle() {
    }

    public VentaDetalle(int clvprod, int clvve, int cantidadv, double iva, double subtotalv) {
        this.clvprod = clvprod;
        this.clvve = clvve;
        this.cantidadv = cantidadv;
        this.iva = iva;
        this.subtotalv = subtotalv;
    }

    public VentaDetalle(int clvprod, int cantidadv, double iva, double subtotalv) {
        this.clvprod = clvprod;
        this.cantidadv = cantidadv;
        this.iva = iva;
        this.subtotalv = subtotalv;
    }
    
    public VentaDetalle(int clvprod, int cantidadv) {
        this.clvprod = clvprod;
        this.cantidadv = cantidadv;
    }

    public int getClvprod() {
        return clvprod;
    }

    public void setClvprod(int clvprod) {
        this.clvprod = clvprod;
    }

    public int getClvve() {
        return clvve;
    }

    public void setClvve(int clvve) {
        this.clvve = clvve;
    }

    public int getCantidadv() {
        return cantidadv;
    }

    public void setCantidadv(int cantidadv) {
        this.cantidadv = cantidadv;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getSubtotalv() {
        return subtotalv;
    }

    public void setSubtotalv(double subtotalv) {
        this.subtotalv = subtotalv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPreciop() {
        return preciop;
    }

    public void setPreciop(double preciop) {
        this.preciop = preciop;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    public VentaDetalle(int clvprod, int cantidadve, String nombre, double preciop) {
        this.clvprod = clvprod;
        this.cantidadv = cantidadve;
        this.nombre = nombre;
        this.preciop = preciop;
    }
}
