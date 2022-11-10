package sistemaBancario;
public class CuentaDorada extends Banco  
{
     @Override //metodo implemetado
     public  double depositar(double monto)
      {
         double saldo=0.0;
         saldo=getSaldoCuenta()+monto;
         setSaldoCuenta(saldo);
         return saldo;
     }
      
     @Override //metodo implemetado
     public double retirar(double monto)
     {
         double saldo=0.0;
         saldo=getSaldoCuenta()-monto-1;
         setSaldoCuenta(saldo);
         return saldo;
     }
     
     @Override //metodo implemetado
     public void calcularInteres()
     {
         double saldoint;
         saldoint=getSaldoCuenta()+getSaldoCuenta()*0.02;
         setSaldoCuenta(saldoint);
         mostrarSaldo();
     }
       
      @Override //metodo implemetado
      public  void mostrarSaldo()
      {
         System.out.println("Su saldo Actual es $"+getSaldoCuenta());
     }
      
}
