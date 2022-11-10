/**Una cuenta dorada: La cuenta dorada produce un interés del 2%. 
El cliente con una cuenta dorada puede sobregirarse en forma indefinida. 
Y se le cobra 1.00 cada vez que retira.**/

package BancoEGPAbstracto;
public class CuentaDoradaA extends CuentasBancariasA 
{ 

    //constructor
    public CuentaDoradaA(String nombre, double saldo) 
    {
        super(nombre, saldo);
    }
       
 @Override
    public double realizarDeposito()
    {
     saldo = saldo + getDeposito(); 
     return saldo;
    }
           
    
@Override//metodo realizacion de retiro
    public String realizarRetiro()
    { String mensajeRetiro="";
        saldo = (saldo - getRetiro()); 
        mensajeRetiro="Su retiro de "+getRetiro()+" ha sido exitoso";
        setCantidadRetiro();
       return mensajeRetiro;
    }
    
    
@Override
    public double calcularInteres()
    { double interes=0;
        interes = interes +(getCantidadRetiro() * 0.02);
        return interes;
    }
}
