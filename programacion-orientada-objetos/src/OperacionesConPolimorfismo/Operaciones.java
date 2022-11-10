package OperacionesConPolimorfismo;
public abstract class Operaciones 
{
    protected int num1;
    protected int num2;
    protected int resultado;
    
    //constructor
    public Operaciones(int num1, int num2) 
    {
        this.num1 = num1;
        this.num2 = num2;
        this.resultado=0;
    }
    
    //metodo no implementado //metodo sobreescrito
    public abstract void operacion();
    
    public void imprimir()
    {
      System.out.println("El resultado es "+resultado);
    }  
}