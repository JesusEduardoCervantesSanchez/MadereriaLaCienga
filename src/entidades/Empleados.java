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
   private String telefonoEmpleado;
   private String domicilioEmpleado;
   private String coloniaEmpleado;
   private boolean activo;

    public Empleados() 
    {
    
    }

    public Empleados(int idEmpleado, String nombreEmpleado, String telefonoEmpleado, String domicilioEmpleado, String coloniaEmpleado, boolean activo) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.telefonoEmpleado = telefonoEmpleado;
        this.domicilioEmpleado = domicilioEmpleado;
        this.coloniaEmpleado = coloniaEmpleado;
        this.activo = activo;
    }
    
    public Empleados(int idEmpleado, String NombreEmpleado, String TelefonoEmpleado, String DomicilioEmpleado, String ColoniaEmpleado) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = NombreEmpleado;
        this.telefonoEmpleado = TelefonoEmpleado;
        this.domicilioEmpleado = DomicilioEmpleado;
        this.coloniaEmpleado = ColoniaEmpleado;
    }

   

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

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    @Override
    public String toString()
    {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", nombreEmpleado=" + nombreEmpleado + ", telefonoEmpleado=" + telefonoEmpleado + ", domicilioEmpleado=" + domicilioEmpleado + ", coloniaEmpleado=" + coloniaEmpleado + "activo="+ activo +'}';
    }
   
}
