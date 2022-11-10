package InversionConHerencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainInversionCH 
{   public static void main(String[] args) throws IOException 
    {  float inver1,inver2,inver3;
    
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        Inversion obj = new Inversion();
        
        System.out.println(" Ingrese el capital a invertir ");
        inver1=Float.parseFloat(br.readLine());
        
        System.out.println(" Ingrese el capital a invertir ");
        inver2=Float.parseFloat(br.readLine());
        
        System.out.println(" Ingrese el capital a invertir ");
        inver3=Float.parseFloat(br.readLine());
        
        obj.setInver1(inver1);
        obj.setInver2(inver2);
        obj.setInver3(inver3);
        
        System.out.println(" Lo que invirtio la primer persona "+obj.getInver1());
        System.out.println(" Lo que invirtio la segunda persona "+obj.getInver2());
        System.out.println(" Lo que invirtio la tercera persona "+obj.getInver3());
        
        obj.calcularInversion();
        
        System.out.println("La inversion para la primera persona es "+obj.getInver1());
        System.out.println("La inversion para la segunda persona es "+obj.getInver2());
        System.out.println("La inversion para la tercera persona es "+obj.getInver3());

    }
    
}
