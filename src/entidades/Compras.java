package entidades;

import java.util.Date;
import java.util.List;

public class Compras {

    private int clvprov;
    private int clvco;
    private Date fechac;
    private int estadoc;

    public Compras() {
    }

    public Compras(int clvprov, int clvco, Date fechac, int estadoc) {
        this.clvprov = clvprov;
        this.clvco = clvco;
        this.fechac = fechac;
        this.estadoc = estadoc;
    }

    public int getClvprov() {
        return clvprov;
    }

    public void setClvprov(int clvprov) {
        this.clvprov = clvprov;
    }

    public int getClvco() {
        return clvco;
    }

    public void setClvco(int clvco) {
        this.clvco = clvco;
    }

    public Date getFechac() {
        return fechac;
    }

    public void setFechac(Date fechac) {
        this.fechac = fechac;
    }

    public int getEstadoc() {
        return estadoc;
    }

    public void setEstadoc(int estadoc) {
        this.estadoc = estadoc;
    }
    
    
    
}
