/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author hg710
 */
public class DevVentas {
    private int clvdv;
    private int clvve;
    private double iva;
    private double subtotalv;
    private String fechav;

    public DevVentas() {
    }

    public DevVentas(int clvdv, int clvve, double iva, double subtotalv, String fechav) {
        this.clvdv = clvdv;
        this.clvve = clvve;
        this.iva = iva;
        this.subtotalv = subtotalv;
        this.fechav = fechav;
    }

    public int getClvdv() {
        return clvdv;
    }

    public void setClvdv(int clvdv) {
        this.clvdv = clvdv;
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
    
    
}
