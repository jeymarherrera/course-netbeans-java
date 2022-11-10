//uso del Collecttion.sort con ArrayList

package Colecciones2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Coleccion 
{

  private ArrayList<String> arrayL = new ArrayList<String>();
  private ArrayList<Double> array = new ArrayList<Double>();


  public void asignar (ArrayList<String> list)
  {
      arrayL=list;
  }
    
    public boolean totalizar()
    {
        for(int x=0 ; x<arrayL.size();x++)
        {
            String [] items = arrayL.get(x).split(";");
            Double [] aux = new Double [arrayL.size()];
            double a;
            for(int z=0 ; z<items.length;z++)
            {
                aux[x]=Double.parseDouble(items[z]);
            }
            a=aux[x];
            array.add(a);
            
        }
      try 
      {
          ordenarArrayList(array);
          return true; 
      } catch (IOException ex) 
      {
          Logger.getLogger(Coleccion.class.getName()).log(Level.SEVERE, null, ex);
           return false; 
      }
         
    }
    
    public void ordenarArrayList(ArrayList<Double> array) throws IOException
    {
     Collections.sort(array); //metodo para ordenar listas/linked/vector
     convertirCadena(array);
 
    }
    
    public void convertirCadena(ArrayList<Double>  list) throws IOException{
        String cadena = "";
           for(int x=0; x<list.size();x++)
           {   cadena = "";
               cadena = cadena+";"+list.get(x).toString(); 
               arrayL.set(x, cadena);
           }
           imprimirArray(arrayL);
    }
    
    public void imprimirArray(ArrayList<String> list) throws IOException{
        String ruta ="C:\\texto\\Laboratorio5_ArrayColeccion.csv";
        File file = new File( ruta);
        if (!file.exists()){
            file.createNewFile();
        }
        //FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
        FileWriter fw = new FileWriter(file);
        try(BufferedWriter bw = new BufferedWriter(fw))
        {
           for(int x=0; x<list.size();x++) { 
               bw.write(list.get(x));
               bw.write("\n");
           }
        } 
    }
}
