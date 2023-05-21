/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author hg710
 */
public class DetalleDevVentas {
    private int clvprod;
    private int clvdv;
    private int cantidaddv;

    public DetalleDevVentas() {
    }

    public DetalleDevVentas(int clvprod, int clvdv, int cantidaddv) {
        this.clvprod = clvprod;
        this.clvdv = clvdv;
        this.cantidaddv = cantidaddv;
    }
    
        public DetalleDevVentas(int clvprod, int cantidaddv) {
        this.clvprod = clvprod;
        this.cantidaddv = cantidaddv;
    }

    public int getClvprod() {
        return clvprod;
    }

    public void setClvprod(int clvprod) {
        this.clvprod = clvprod;
    }

    public int getClvdv() {
        return clvdv;
    }

    public void setClvdv(int clvdv) {
        this.clvdv = clvdv;
    }

    public int getCantidaddv() {
        return cantidaddv;
    }

    public void setCantidaddv(int cantidaddv) {
        this.cantidaddv = cantidaddv;
    }
    
    
}
