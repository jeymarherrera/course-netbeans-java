/*Mientras que los datos de cada jugador son:Número de uniforme, Nombre, puntos anotados*/
package Problema1;
public class Jugador extends Equipo
{ private int numeroUniforme;
  private String nombre;
  private int puntosAnotados;

  //acceso por referencia
    public void setNumeroUniforme(int numeroUniforme) 
    {
        this.numeroUniforme = numeroUniforme;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public void setPuntosAnotados(int puntosAnotados) 
    { 
        this.puntosAnotados = puntosAnotados;
    }

   //metodos propios 
    public int cantidadJugadores(int cont)
    {  int totalJugadores = 0;
        totalJugadores=totalJugadores+cont;
        return totalJugadores;
    }
  
    public int puntosAnotados()
    {  int totalPuntos = 0;
        totalPuntos=totalPuntos+puntosAnotados;
        return totalPuntos;
    }   
}