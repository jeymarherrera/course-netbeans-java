package OperacionesConPolimorfismo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainOperacionesP 
{
    public static void main(String[] args) throws IOException
    { int numA,numB;
    
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingrese el primer valor ");
        numA=Integer.parseInt(br.readLine());
        
        System.out.println("Ingrese el segundo valor ");
        numB=Integer.parseInt(br.readLine());
        
        Suma  obj1 = new Suma(numA,numB);
        Resta obj2 = new Resta(numA,numB);
        
        obj1.operacion();
        obj1.imprimir();
        obj2.operacion();
        obj2.imprimir();
    }
}
