/**HERENCIA SIMPLE**/
/*HERRERA, JEYMAR		20-70-5165  */
package Problema1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainProblema1
{
    public static void main(String[] args) throws IOException 
    { String nEquipo, nJugador, opc;
      int nUniforme, pAnotados,cont=0, contador=0;
      char r;
      
      BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
      Jugador obj = new Jugador();
      
      System.out.println("\n Ingrese el nombre del equipo ");
      nEquipo=br.readLine();
      obj.setNombreEquipo(nEquipo);
      
      do
      {
      System.out.println("\n Ingrese el nombre del jugador ");
      nJugador=br.readLine();
      obj.setNombre(nJugador);
      cont++; 
      
      System.out.println("\n Ingrese el numero de uniforme ");
      nUniforme=Integer.parseInt(br.readLine());
      obj.setNumeroUniforme(nUniforme);
      
      System.out.println("\n Ingrese los puntos anotados por el jugador ");
      pAnotados=Integer.parseInt(br.readLine());   
      contador=contador+pAnotados;
      obj.setPuntosAnotados(contador);
      
      System.out.print("\n ¿Deseas agregar mas jugadores? s/n  ");
      opc=br.readLine();
      r=opc.charAt(0);
      
      } while(r == 's' || r == 'S');

      System.out.println("\n\n La cantidad de Jugadores en el equipo "+obj.getNombreEquipo()+" es de: "+obj.cantidadJugadores(cont));
      System.out.println(" La cantidad de Puntos Anotados en el equipo "+obj.getNombreEquipo()+" es de: "+obj.puntosAnotados()); 
    }
}
