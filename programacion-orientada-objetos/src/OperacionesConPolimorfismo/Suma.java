package OperacionesConPolimorfismo;

public class Suma extends Operaciones 
{   //constructor
    public Suma(int num1, int num2) 
    {
        super(num1, num2);
    }
    
    @Override//metodo sobreescrito
    public void operacion()
    {
        resultado=num1+num2;
    }  
}
