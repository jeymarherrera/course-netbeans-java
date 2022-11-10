package sistemaBancario;
public class CuentaRegular extends Banco 
{
     @Override //metodo implemetado
     public  double depositar(double monto)
     {
         double saldo=0.0;
         saldo=getSaldoCuenta()+monto;
         setSaldoCuenta(saldo);
         return saldo;
     }
    
     //metodo local
     public String validacion (double monto)
     {
         String mensaje="";
         if (getSaldoCuenta()>monto){
          mensaje="Su monto Actual es   $"+ Double.toString(retirar(monto));
         }
         else{
           mensaje= " EL Saldo es Insuficiente para Hacer el Retiro"  ;
         }
         return mensaje;
     }
     
     @Override //metodo implemetado
     public double retirar(double monto)
     {
         double saldo=0.0;
         saldo=getSaldoCuenta()-monto;
         setSaldoCuenta(saldo);
         return saldo;
     }
     
     @Override //metodo implemetado
     public void calcularInteres()
     {
         double saldoint;
         saldoint=getSaldoCuenta()+getSaldoCuenta()*0.06;
         setSaldoCuenta(saldoint);
         mostrarSaldo();
     }
     
     @Override //metodo implemetado
     public  void mostrarSaldo()
     {
         System.out.println("Su saldo Actual es $"+getSaldoCuenta());
     }
     
}