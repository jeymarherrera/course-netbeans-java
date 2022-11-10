package PoligonosConInterfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainPoligonosI 
{
    public static void main(String[] args) throws IOException
    {double altura, base;
    
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        Figuras obj = new Figuras();
        
        System.out.println(" Intrege la altura ");
        altura=Double.parseDouble(br.readLine());
        
        System.out.println(" Ingrese la base ");
        base=Double.parseDouble(br.readLine());
        
        System.out.println(" El area del Triangulo es "+obj.areaTriangulo(base, altura));
        System.out.println(" El area del Rectangulo es "+obj.areaRectangulo(base, altura));
        System.out.println(" El area del Romboide es "+obj.areaRomboide(base, altura));
    } 
}
