package entidades;

import java.util.Date;
import java.util.List;

public class Compras {

    private int clvprov;
    private int clvprod;
    private int cantidadc;
    private int clvco;
    private String fechac;
    private int estadoc;

    public Compras() {
    }

    public Compras(int clvco, int clvprov, int clvprod, int cantidadc, String fechac, int estadoc) {
        this.clvprov = clvprov;
        this.clvprod = clvprod;
        this.cantidadc = cantidadc;
        this.clvco = clvco;
        this.fechac = fechac;
        this.estadoc = estadoc;
    }

    public Compras(int clvprov, int clvprod, int cantidadc, String fechac, int estadoc) {
        this.clvprov = clvprov;
        this.clvprod = clvprod;
        this.cantidadc = cantidadc;
        this.fechac = fechac;
        this.estadoc = estadoc;
    }

    public int getClvprov() {
        return clvprov;
    }

    public void setClvprov(int clvprov) {
        this.clvprov = clvprov;
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

    public int getClvco() {
        return clvco;
    }

    public void setClvco(int clvco) {
        this.clvco = clvco;
    }

    public String getFechac() {
        return fechac;
    }

    public void setFechac(String fechac) {
        this.fechac = fechac;
    }

    public int getEstadoc() {
        return estadoc;
    }

    public void setEstadoc(int estadoc) {
        this.estadoc = estadoc;
    }

}
