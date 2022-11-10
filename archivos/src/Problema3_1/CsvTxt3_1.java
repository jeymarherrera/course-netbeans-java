/*Problema realizado con arreglos y arraylist
 */
package Problema3_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class CsvTxt3_1 
{   ArrayList<String> lista = new ArrayList<>();
    int Arreglo[]; 
    
    public void asignar( ArrayList<String>  list){
        lista=list;

    }
    
    public boolean validar(int numero, int [] Arr)
    {
        for(int i=0;i<Arr.length;i++)
        {
            if( Arr[i]==numero)
            {    
               return false ;   
            }
        }
    return true;
  }

    
   public void imprimir(ArrayList<String>  list) throws IOException{
      String ruta ="C:\\texto\\problema3.csv";
      File file = new File(ruta);
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
               bw.write(";");
           }
        }
   }
}
