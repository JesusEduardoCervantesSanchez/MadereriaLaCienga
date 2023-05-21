 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cristianss
 */
public class Empleados {
   private int clvemp;
   private String nombree; 
   private String apellidoe;
   private String telefonoe;
   private String direccione;
   private String coloniae;
   private String nombreu;
   private String contrasenau;
   private String rolu;

    public Empleados() 
    {
    
    }

    public Empleados(int clvemp, String nombree, String apellidoe, String telefonoe, String direccione, String coloniae, String nombreu, String contrasenau, String rolu) {
        this.clvemp = clvemp;
        this.nombree = nombree;
        this.apellidoe = apellidoe;
        this.telefonoe = telefonoe;
        this.direccione = direccione;
        this.coloniae = coloniae;
        this.nombreu = nombreu;
        this.contrasenau = contrasenau;
        this.rolu = rolu;
    }

    public Empleados(int clvemp, String nombree, String apellidoe, String telefonoe, String direccione, String coloniae) {
        this.clvemp = clvemp;
        this.nombree = nombree;
        this.apellidoe = apellidoe;
        this.telefonoe = telefonoe;
        this.direccione = direccione;
        this.coloniae = coloniae;
    }


    
//    public Empleados(int clvemp, String NombreEmpleado, String apellidoe, String TelefonoEmpleado, String DomicilioEmpleado, String ColoniaEmpleado) {
//        this.clvemp = clvemp;
//        this.nombree = NombreEmpleado;
//        this.apellidoe = apellidoe;
//        this.telefonoe = TelefonoEmpleado;
//        this.direccione = DomicilioEmpleado;
//        this.coloniae = ColoniaEmpleado;
//    }

   

    public int getClvemp() {
        return clvemp;
    }

    public void setClvemp(int clvemp) {
        this.clvemp = clvemp;
    }

    public String getNombree() {
        return nombree;
    }

    public void setNombree(String nombree) {
        this.nombree = nombree;
    }
    
    public String getApellidoe() {
        return apellidoe;
    }

    public void setApellidoe(String apellidoe) {
        this.apellidoe = apellidoe;
    }

    public String getTelefonoe() {
        return telefonoe;
    }

    public void setTelefonoe(String telefonoe) {
        this.telefonoe = telefonoe;
    }

    public String getDireccione() {
        return direccione;
    }

    public void setDireccione(String direccione) {
        this.direccione = direccione;
    }

    public String getColoniae() {
        return coloniae;
    }
    
    public void setColoniae(String coloniae){
        this.coloniae = coloniae;
    }

    public String getNombreu() {
        return nombreu;
    }

    public void setNombreu(String nombreu) {
        this.nombreu = nombreu;
    }

    public String getContrasenau() {
        return contrasenau;
    }

    public void setContrasenau(String contrasenau) {
        this.contrasenau = contrasenau;
    }

    public String getRolu() {
        return rolu;
    }

    public void setRolu(String rolu) {
        this.rolu = rolu;
    }
    
    
   
}
