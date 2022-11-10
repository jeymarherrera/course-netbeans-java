package sistemaBancario;
public  abstract class Banco 
{
    private String nombreCuenta;
    private double saldoCuenta;

    //constructor
    public Banco() 
    {
        nombreCuenta = "Gustavo";
        saldoCuenta = 10.0;
    }
    
    //acceso por referencia
    public String getNombreCuenta() 
    {
        return nombreCuenta;
    }

    public double getSaldoCuenta() 
    {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) 
    {
        this.saldoCuenta = saldoCuenta;
    }
    
    //metodos no implementados
    public abstract double depositar(double monto);
    public abstract double retirar(double monto);
    public abstract void calcularInteres();
    public abstract void mostrarSaldo();
    
    //metodo opcion menu-main
    public void menuopciones()
    {
       System.out.println(" 1. Para Depositar  ");
       System.out.println(" 2. Para Retiro  ");
       System.out.println(" 3. Para Calcular el Interes ");
       System.out.println(" 4. Para Ver Saldo  ");
       System.out.println(" Digite su opcion =>  ");
    }
    
}
