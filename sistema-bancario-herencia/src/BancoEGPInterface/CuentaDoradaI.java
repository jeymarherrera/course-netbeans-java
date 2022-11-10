package BancoEGPInterface;

public class CuentaDoradaI implements CuentasBancariasI  
{ 

   public String crearCuenta(String nombre, double saldo)
   { String mensajeCrear;
     mensajeCrear=" ESTIMADO USUARIO, "+nombre+" USTED HA CREADO UNA CUENTA EN EL BANCO EGP"
                  +"\n      CUENTA CON UN SALDO INICIAL DE B/."+saldo;
     return mensajeCrear; 
   }

    public double realizarDeposito(double deposito, double saldo)
    {
     saldo = saldo + deposito;
     return saldo;
    }

    public double realizarRetiro(double retiro, double saldo)
    { saldo = saldo - retiro; 
       return saldo;
    }
     

    public double calcularInteres(int cantidadRetiro)
    { double interes=0;
        interes = interes +(cantidadRetiro * 0.02);
        return interes;
    }

}
