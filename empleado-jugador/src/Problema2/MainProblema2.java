/**HERENCIA ABSTRACTA
 HERRERA, JEYMAR		20-70-5165
 **/
package Problema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainProblema2 
{
    public static void main(String[] args) throws IOException 
    {
     double salarioB[], salarioN[],sueldoxhora;
     int i,n,horas[],h;
     String  nombres[],nom;
     
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in)); 
    Empleado obj;
    
    System.out.println("\nIngrese la cantidad de empleados de la empresa");
    n=Integer.parseInt(br.readLine());
    
    nombres = new String [n];
    salarioB = new double [n];
    salarioN = new double [n];
    horas = new int [n];
    
    for(i=0;i<n;i++)
     {
       System.out.println("\nIngrese el nombre del empleado en la posicion "+i);
       nom=br.readLine();
       nombres[i]=nom; 
     }
    
    for(i=0;i<n;i++)
     {
       System.out.println("\nIngrese las horas trabajadas del empleado en la posicion "+i);
       h=Integer.parseInt(br.readLine());
       horas[i]=h; 
     }
    
       System.out.println("\nIngrese el sueldo por hora");
       sueldoxhora=Double.parseDouble(br.readLine());
       
       obj = new Empleado(nombres,sueldoxhora,salarioB, salarioN,horas,n);
  
       System.out.println("____________________________________________________________________________________________________________________");
       System.out.println("Nombre del empleado                          Salario Bruto                        Salario Neto");
       System.out.println("___________________________________________________________________________________________________________________");
       nombres=obj.nombreEmpleado(); 
       salarioB = obj.calcularSalarioBruto();
       salarioN = obj.calcularSalarioNeto();
       for(i=0;i<n;i++)
       {
       System.out.print("      "+nombres[i] +"                                       $"+salarioB[i]+"                               $"+salarioN[i]+"        \n" ) ;
       System.out.println("____________________________________________________________________________________________________________________");
       }   
    } 
}
    
    

