//uso del ArrayList

package Colecciones;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class ArchivoSecuencial 
{ 
  private ArrayList<String> arrayL = new ArrayList<String>();
  private ArrayList<Double> array = new ArrayList<Double>();
  
    public void asignar(ArrayList<String> list)
    {
        arrayL=list;  
    }  
    
    
    public boolean totalizar() throws IOException
    {
        for(int x=0 ; x<arrayL.size();x++)
        {
            String [] items = arrayL.get(x).split(";");
            double [] aux = new double [arrayL.size()];
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
          metodoBurbuja(array);
          return true; 
        } 
        catch (IOException ex) 
        {
          return false; 
        } 
    }
    
    public void metodoBurbuja(ArrayList<Double> arr) throws IOException 
    { int i, j;
      double aux=0.0f, a;
      double [] Array = new double [array.size()];
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
        array.set(x, Array[x]);  
        }
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
        String ruta ="C:\\texto\\Laboratorio5_Array.csv";
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
