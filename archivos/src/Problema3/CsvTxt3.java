//programa realizado solo con arreglos
package Problema3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class CsvTxt3 
{   int Arreglo[]; 
    
    public void asignar(int[]Array){
        Arreglo=Array;

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

    
   
    public void imprimir() throws IOException
    {
        String ruta = "C:\\texto\\Problema3.csv";
        File file = new File(ruta);
        if(!file.exists()){
           file.createNewFile(); 
        }
        
        FileWriter fw = new FileWriter(file);
        try(BufferedWriter bw = new BufferedWriter(fw))
        {
           for(int x=0; x<Arreglo.length;x++) 
           {
               bw.write(" "+Arreglo[x]);
               bw.write(";");
           }
        }
    }  
}
//manera opcional (incompleta)
/**
import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter; **/
/**
public class PruebaConsola {

    public static void main(String[] args) throws IOException 
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int [] numeros = new int [10];
      int numero, i = 0, k;
      
      System.out.print("Ingrese 10 numeros sin que se repitan\n\n");
      
      for(i=0; i<10; i++)
      {
         System.out.print("\nIngrese un número:  ");
         numero=Integer.parseInt(br.readLine());
         numeros[i] = numero;
         for(k=0; k<10; k++)
         {
             if (numero == numeros[k])
             {
                 System.out.print("Numero repetido!!!!");
                 i--;
             }
         }
      }
    }
    
    JFileChooser fc = new JFileChooser();
   FileNameExtensionFilter filtro = new FileNameExtensionFilter(".csv", "csv");
    File archivo = null;

} 
**/
