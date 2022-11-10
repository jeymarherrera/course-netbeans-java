/**Una cuenta regular: produce un interés del 6%. Cada vez que se hace un retiro     
se revisa para ver si se puede realizar el retiro y que no quede sobregirada.**/

package BancoEGPAbstracto;
public class CuentaRegularA extends CuentasBancariasA 
{ 
    
    //constructor
    public CuentaRegularA(String nombre, double saldo) 
    {
        super(nombre, saldo);
    }
    
    //tipo de cuenta a crear
   
    
@Override//metodo realizacion de deposito
    public double realizarDeposito()
    { 
     saldo = saldo + getDeposito(); 
     return saldo;
    }
       

@Override//metodo realizacion de retiro
    public String realizarRetiro()
    { String mensajeRetiro="";
       if(saldo >= getRetiro())
       {
            saldo = saldo - getRetiro(); 
            mensajeRetiro="Su retiro de B/."+getRetiro()+" ha sido exitoso";
            setCantidadRetiro();
       }
       else 
           mensajeRetiro = "Lo sentimos su saldo es insuficiente ";
       return mensajeRetiro;
    }
    
    
@Override//metodo calculo de interes generado por retiro
    public double calcularInteres()
    { double interes=0;
        interes = interes +(getCantidadRetiro() * 0.06);
        return interes;
    }
    
}
