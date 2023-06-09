/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;
/**
 *
 * @author CSjes
 */
public class Ventas {

    private int clvve;
    private double iva;
    private double subtotalv;
    private String fechav;
    private int clvem;
    private int clvprode;
    private int cantidadve;
    private String nombre;
    private double preciop;
    private double monto;

    public Ventas() {
    }

    public Ventas(int clvve, double iva, double subtotalv, String fechav, int clvem, int clvprode, int cantidadve, String nombre, double preciop, double monto) {
        this.clvve = clvve;
        this.iva = iva;
        this.subtotalv = subtotalv;
        this.fechav = fechav;
        this.clvem = clvem;
        this.clvprode = clvprode;
        this.cantidadve = cantidadve;
        this.nombre = nombre;
        this.preciop = preciop;
        this.monto = monto;
    }

    public int getClvve() {
        return clvve;
    }

    public void setClvve(int clvve) {
        this.clvve = clvve;
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

    public String getFechav() {
        return fechav;
    }

    public void setFechav(String fechav) {
        this.fechav = fechav;
    }

    public int getClvem() {
        return clvem;
    }

    public void setClvem(int clvem) {
        this.clvem = clvem;
    }

    public int getClvprode() {
        return clvprode;
    }

    public void setClvprode(int clvprode) {
        this.clvprode = clvprode;
    }

    public int getCantidadve() {
        return cantidadve;
    }

    public void setCantidadve(int cantidadve) {
        this.cantidadve = cantidadve;
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

    public Ventas(int cantidadve, String nombre, double preciop, double monto) {
        this.cantidadve = cantidadve;
        this.nombre = nombre;
        this.preciop = preciop;
        this.monto = monto;
    }
}