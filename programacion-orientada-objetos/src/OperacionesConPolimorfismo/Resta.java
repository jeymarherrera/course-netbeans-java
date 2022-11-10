package OperacionesConPolimorfismo;

public class Resta extends Operaciones 
{
    //comunicacion con el constructor padre
    public Resta(int num1, int num2) 
    {
        super(num1, num2);
    }
    
    @Override //metodo sobreescrito
    public void operacion()
    {
       resultado=num1-num2;
    }   
}