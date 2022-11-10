/**Ambas cuentas bancarias y se pude depositar, retirar, calcula interés 
 y enviar saldo actual. Una cuenta se crea con un nombre y un saldo inicial. **/
package BancoEGPAbstracto;
public abstract class CuentasBancariasA 
{
    protected String nombre;
    protected double saldo;
    private double retiro;
    private int cantidadRetiro=0;
    private double deposito;

    public CuentasBancariasA(String nombre, double saldo) { //Constructor, datos para crear la cuenta
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    public double getRetiro() 
    {
        return retiro;
    }
    public void setRetiro(double retiro) 
    {
        this.retiro = retiro;
    }

    public int getCantidadRetiro() 
    {
        return cantidadRetiro;
    }

    public void setCantidadRetiro() 
    {
        cantidadRetiro++;
        this.cantidadRetiro = cantidadRetiro;
    }

    public double getDeposito() 
    {   
        return deposito;
    }

    public void setDeposito(double deposito) 
    {
        this.deposito = deposito;
    }

    public abstract double realizarDeposito(); 
    public abstract String realizarRetiro();    
    public abstract double calcularInteres();

}
