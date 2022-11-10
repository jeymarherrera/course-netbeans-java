package tiendaLimonadas;

public class Limonadas 
{ private int cantidadVasos;
  private int cantidadAzucar;
  private double precioConAzucar;
  private double precioSinAzucar;
  
    public Limonadas() {
        this.cantidadVasos = 100;
        this.cantidadAzucar = 80;
        this.precioConAzucar = 0.50;
        this.precioSinAzucar = 0.45;
    }
  
    public int getCantidadVasos() 
    {
        return cantidadVasos;
    }

    public int getCantidadAzucar() 
    {
        return cantidadAzucar;
    }

    public double getPrecioConAzucar() 
    {
        return precioConAzucar;
    }

    public double getPrecioSinAzucar() 
    {
        return precioSinAzucar;
    } 
    
    public int vasosConsumidos(int vasosA, int vasosB)  
    { int totalVasos = 0;
    if (totalVasos < cantidadVasos)
    {
      totalVasos = totalVasos + vasosA;
      totalVasos = totalVasos + vasosB;
    }
    return totalVasos;
    }  
}

