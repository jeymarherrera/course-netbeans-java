package BancoEGPInterface;
public interface CuentasBancariasI 
{
    public String crearCuenta(String nombre, double saldo); 
    public double realizarDeposito(double deposito, double saldo);
    public double realizarRetiro(double retiro, double saldo);  
    public double calcularInteres(int cantidadRetiro);
}
