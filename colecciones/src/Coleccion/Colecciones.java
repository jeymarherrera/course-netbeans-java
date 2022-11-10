
package Coleccion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class Colecciones 
{ private ArrayList<Double> arrayL = new ArrayList<Double>();
  private LinkedList<Double> linked = new LinkedList<Double>();
  
  
  //metodo que verifica si el numero se encuentra en el arreglo
  public boolean asignar (double numero){
      if(arrayL.contains(numero)){ //si numero se escunetra en el arreglo
          return false; //retornar falso
      }
      else //de otro modo
      {
          arrayL.add(numero); //agregar numero en el arreglo
          linked.add(numero); //agragar numero en el linked
          return true; //retornar falso
      }
  }
    
    public ArrayList<Double> ordenarArrayList(){
     Collections.sort(arrayL); //metodo para ordenar listas/linked/vector
     return arrayL;
 }
 
    public LinkedList<Double> ordenarLinkedList(){
     Collections.sort(linked); //metodo para ordenar listas/linked/vector
     return linked;
 }
}
