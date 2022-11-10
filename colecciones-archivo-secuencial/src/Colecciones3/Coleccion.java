//uso del Collecttion.sort con LinkedList

/*Integrante
HERRERA, JEYMAR		20-70-5165  

*/ 
package Colecciones3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Coleccion 
{ 
  private LinkedList<String> linkedL = new LinkedList<String>();
  private LinkedList<Double> linked = new LinkedList<Double>();

  public void asignar (LinkedList<String> list)
  {
      linkedL=list;
  }
    
    public boolean totalizar()
    {
        for(int x=0 ; x<linkedL.size();x++)
        {
            String [] items = linkedL.get(x).split(";");
            Double [] aux = new Double [linkedL.size()];
            double a;
                for(int z=0 ; z<items.length;z++)
                {
                    aux[x]=Double.parseDouble(items[z]);
                }
                a=aux[x];
                linked.add(a);   
        }
        try 
        {
          ordenarLinkedList(linked);
          return true; 
        } 
        catch (IOException ex) 
        {
          Logger.getLogger(Coleccion.class.getName()).log(Level.SEVERE, null, ex);
          return false; 
        } 
    }
    
    public void ordenarLinkedList(LinkedList<Double> array) throws IOException
    {
     Collections.sort(linked); 
     convertirCadena(linked);
    }
    
    public void convertirCadena(LinkedList<Double>  list) throws IOException
    {
        String cadena = "";
           for(int x=0; x<list.size(); x++)
           {   cadena = ""; 
               cadena = cadena + ";" +list.get(x).toString(); 
               linkedL.set(x, cadena);
           }
        imprimirLinked(linkedL);
    }
    
    public void imprimirLinked(LinkedList<String> list) throws IOException
    {
        String ruta ="C:\\texto\\Laboratorio5_LinkedColeccion.csv";
        File file = new File( ruta);
        if (!file.exists())
        {
            file.createNewFile();
        }
        
        FileWriter fw = new FileWriter(file);
        try(BufferedWriter bw = new BufferedWriter(fw))
        {
           for(int x=0; x<list.size();x++) 
           { 
               bw.write(list.get(x));
               bw.write("\n");
           }
        } 
    }
}
