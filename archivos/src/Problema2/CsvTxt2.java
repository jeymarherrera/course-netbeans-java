package Problema2;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;



public class CsvTxt2 {
    ArrayList<String> lista = new ArrayList<>();
    
    public void asignar(ArrayList<String>list){
        lista=list; 
    }
    
 
    public boolean Ordenar_Numeros()
    { 
        ArrayList<String> totales = new ArrayList<>();
        String armen="";
        int  [] cont =new int [22]; 
        String contenedor="";
        for(int z=0 ; z<lista.size();z++)
        {
        armen=armen+lista.get(z);
        } 
        lista.add(armen);
         
        for(int x=0 ; x<lista.size();x++)
        {
        String [] items = lista.get(x).split(" ");
        for(int z=1 ; z<items.length;z++)
        { 
           cont[z-1]=Integer.parseInt(items[z]);
        } 
        } 
        cont=burbuja(cont);
          

        for(int z=1; z<cont.length; z++)
        {
         contenedor=contenedor+"-"+Integer.toString(cont[z]); 
        }
        totales.add(contenedor);
        
        try 
        {
            Imprimir_Datos(totales);
            return true;
        }
        catch (IOException e)
        {
            return false;
        }
    }  
        
    
    
    //metodo burbuja
    int [] burbuja(int[] Array) 
    { int i, j, aux;
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
       return Array;
    } 

    
    
    
    public void Imprimir_Datos(ArrayList<String>  list) throws IOException
    {
        String ruta ="C:\\texto\\Problema2.txt";
        File file = new File(ruta);
        if (!file.exists())
        {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
       // FileWriter fw = new FileWriter(file);
        try(BufferedWriter bw = new BufferedWriter(fw))
        {
            for(int x=0; x<list.size(); x++) 
            {
               bw.write("NUMEROS ORDENADOS\n\n"); 
               bw.write(list.get(x));
               bw.write(".");
            }
        }
    }
}

