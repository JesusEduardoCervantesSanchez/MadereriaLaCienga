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
   private int idEmpleado;
   private String nombreEmpleado; 
   private String apellidoEmpleado;
   private String telefonoEmpleado;
   private String domicilioEmpleado;
   private String coloniaEmpleado;
   private boolean activo;

    public Empleados() 
    {
    
    }

    public Empleados(int idEmpleado, String nombreEmpleado, String apellidoEmpleado, String telefonoEmpleado, String domicilioEmpleado, String coloniaEmpleado) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.telefonoEmpleado = telefonoEmpleado;
        this.domicilioEmpleado = domicilioEmpleado;
        this.coloniaEmpleado = coloniaEmpleado;
    }
    
//    public Empleados(int idEmpleado, String NombreEmpleado, String apellidoEmpleado, String TelefonoEmpleado, String DomicilioEmpleado, String ColoniaEmpleado) {
//        this.idEmpleado = idEmpleado;
//        this.nombreEmpleado = NombreEmpleado;
//        this.apellidoEmpleado = apellidoEmpleado;
//        this.telefonoEmpleado = TelefonoEmpleado;
//        this.domicilioEmpleado = DomicilioEmpleado;
//        this.coloniaEmpleado = ColoniaEmpleado;
//    }

   

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    
    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public String getTelefonoEmpleado() {
        return telefonoEmpleado;
    }

    public void setTelefonoEmpleado(String telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }

    public String getDomicilioEmpleado() {
        return domicilioEmpleado;
    }

    public void setDomicilioEmpleado(String domicilioEmpleado) {
        this.domicilioEmpleado = domicilioEmpleado;
    }

    public String getColoniaEmpleado() {
        return coloniaEmpleado;
    }
    
    public void setColoniaEmpleado(String coloniaEmpleado){
        this.coloniaEmpleado = coloniaEmpleado;
    }
    
    @Override
    public String toString()
    {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", nombreEmpleado=" + nombreEmpleado + ", apellidoEmpleado=" + apellidoEmpleado +", telefonoEmpleado=" + telefonoEmpleado + ", domicilioEmpleado=" + domicilioEmpleado + ", coloniaEmpleado=" + coloniaEmpleado +'}';
    }
   
}
