/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

public class CompraDetalle {
    private int clvco;
    private int clvprod;
    private int cantidadc;
    private double preciop;
    private double gananciap;
    private double medidasp;

    public CompraDetalle() {
    }

    public CompraDetalle(int clvco, int clvprod, int cantidadc, double preciop, double gananciap, double medidasp) {
        this.clvco = clvco;
        this.clvprod = clvprod;
        this.cantidadc = cantidadc;
        this.preciop = preciop;
        this.gananciap = gananciap;
        this.medidasp = medidasp;
    }

    public CompraDetalle(int clvprod, int cantidadc, double preciop, double gananciap, double medidasp) {
        this.clvprod = clvprod;
        this.cantidadc = cantidadc;
        this.preciop = preciop;
        this.gananciap = gananciap;
        this.medidasp = medidasp;
    }
    
    

    public int getClvco() {
        return clvco;
    }

    public void setClvco(int clvco) {
        this.clvco = clvco;
    }

    public int getClvprod() {
        return clvprod;
    }

    public void setClvprod(int clvprod) {
        this.clvprod = clvprod;
    }

    public int getCantidadc() {
        return cantidadc;
    }

    public void setCantidadc(int cantidadc) {
        this.cantidadc = cantidadc;
    }

    public double getPreciop() {
        return preciop;
    }

    public void setPreciop(double preciop) {
        this.preciop = preciop;
    }

    public double getGananciap() {
        return gananciap;
    }

    public void setGananciap(double gananciap) {
        this.gananciap = gananciap;
    }

    public double getMedidasp() {
        return medidasp;
    }

    public void setMedidasp(double medidasp) {
        this.medidasp = medidasp;
    }

    
}
