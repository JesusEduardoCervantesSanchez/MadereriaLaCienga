/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Juan Pablo Campos L
 */
public class DetalleProveedor {
    int clvprov,clvco;

    public DetalleProveedor() {
    }
    
    public DetalleProveedor(int clvprov, int clvco) {
        this.clvprov = clvprov;
        this.clvco = clvco;
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

    
    
    
}
