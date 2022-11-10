/*Clase padre: Los datos del equipo son: Nombre del equipo*/
package Problema1;
public class Equipo 
{ private String nombreEquipo;
    
    //acceso por referencia
    public String getNombreEquipo() 
    {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) 
    {
        this.nombreEquipo = nombreEquipo;
    }    
}