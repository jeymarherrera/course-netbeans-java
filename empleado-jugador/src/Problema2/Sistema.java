//clase padre
package Problema2;
public abstract class Sistema 
{ //atributos
  private double salarioB[];
  private double salarioN[];

   //constructor de la clase pade
    public Sistema(double[] salarioB, double[] salarioN) 
    {
        this.salarioB = salarioB;
        this.salarioN = salarioN;
    }
    
    //acceso por referencia
    public double[] getSalarioB() 
    {
        return salarioB;
    }

    public double[] getSalarioN() 
    {
        return salarioN;
    }
    
  //metodos no implementados
    public abstract double [] calcularSalarioBruto();  
    public abstract double [] calcularSalarioNeto();  
}
