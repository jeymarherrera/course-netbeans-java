//uso de LinkedList

package Colecciones1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;


public class ArchivoSecuencial 
{ 
  private LinkedList<String> linkedL = new LinkedList<String>();
  private LinkedList<Double> linked = new LinkedList<Double>();
  
    public void asignar(LinkedList<String> list)
    {
        linkedL=list;  
    }  
    
     public boolean totalizar() throws IOException
    {
        for(int x=0 ; x<linkedL.size();x++)
        {
            String [] items = linkedL.get(x).split(";");
            double [] aux = new double [linkedL.size()];
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
          metodoBurbuja(linked);
          return true; 
        } 
        catch (IOException ex) 
        {
          return false; 
        } 
    }
    
    public void metodoBurbuja(LinkedList<Double> arr) throws IOException 
    { int i, j;
      double aux=0.0f, a;
      double [] Array = new double [linked.size()];
      for(int z=0 ; z<Array.length;z++)
       {
          Array[z]= arr.get(z);
       }
       for (int x=0; x< Array.length; x++) 
        {
        for (i=0; i< Array.length-1; i++) 
        {
            for (j=0; j< Array.length-i-1; j++) 
            {
                if (Array[j+1] < Array[j])
                {
                    aux = Array[j+1];
                    Array[j+1]=Array[j];
                    Array[j] = aux;
                }
            }
        }
        linked.set(x, Array[x]);  
        }
       convertirCadena(linked);
    } 
    
    public void convertirCadena(LinkedList<Double>  list) throws IOException{
        String cadena = "";
           for(int x=0; x<list.size();x++)
           {   cadena = "";
               cadena = cadena+";"+list.get(x).toString(); 
               linkedL.set(x, cadena);
           }
           imprimirLinked(linkedL);
    }
    
    public void imprimirLinked(LinkedList<String>  list) throws IOException{
        String ruta ="C:\\texto\\Laboratorio5_Linked.csv";
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
