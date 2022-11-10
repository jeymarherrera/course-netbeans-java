package InversionSinHerencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainInversionSH 
{   public static void main(String[] args) throws IOException
    {  float inver1,inver2,inver3;
       String mens;
     
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        Inversion obj= new Inversion();
        
        System.out.println(" Ingrese el capital a invertir ");
        inver1=Float.parseFloat(br.readLine());
        
        System.out.println(" Ingrese el capital a invertir ");
        inver2=Float.parseFloat(br.readLine());
        
        System.out.println(" Ingrese el capital a invertir ");
        inver3=Float.parseFloat(br.readLine());
        
        //llamada al metodo
        obj.asignar(inver1, inver2, inver3);
        
        //llamada al metodo
        mens=obj.calcularInversion();
        
        System.out.println(mens);
    }  
}
