/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Juan Pablo Campos L
 */
public class Proveedores {
    int clvprov;
    String nombrep, direccionp, estadop, telefonop, localidadp;    

    public Proveedores() {
    }

    public Proveedores(int clvprov, String nombrep, String direccionp, String estadop, String telefonop, String localidadp) {
        this.clvprov = clvprov;
        this.nombrep = nombrep;
        this.direccionp = direccionp;
        this.estadop = estadop;
        this.telefonop = telefonop;
        this.localidadp = localidadp;
    }

    public Proveedores(int clvprov) {
        this.clvprov = clvprov;
    }

    public int getClvprov() {
        return clvprov;
    }

    public void setClvprov(int clvprov) {
        this.clvprov = clvprov;
    }

    public String getNombrep() {
        return nombrep;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public String getDireccionp() {
        return direccionp;
    }

    public void setDireccionp(String direccionp) {
        this.direccionp = direccionp;
    }

    public String getEstadop() {
        return estadop;
    }

    public void setEstadop(String estadop) {
        this.estadop = estadop;
    }

    public String getTelefonop() {
        return telefonop;
    }

    public void setTelefonop(String telefonop) {
        this.telefonop = telefonop;
    }

    public String getLocalidadp() {
        return localidadp;
    }

    public void setLocalidadp(String localidadp) {
        this.localidadp = localidadp;
    }
    
    @Override
    public String toString() {
        return clvprov+"";
    }
}
