package tiendaLimonadas;
public class LimonadaConAzucar extends Limonadas
{ private int cucharadas;

    public void setCucharadas(int cucharadas) 
    {
        this.cucharadas = cucharadas;
    }
    
    public String calcularChucharadas()
    { String mensaje="";
     if ((cucharadas < 1) || (cucharadas > 3) )
       mensaje = "El limite de cucharadas de azucar por limonada es de 1-3";  
     else
       mensaje = " \t\t¡De acuerdo!";      
    return mensaje;
    }
    
    public int cucharadasConsumidas(int totalC)
    { int totalCucharadas=0;
    if(totalC < getCantidadAzucar())  
        totalCucharadas = totalCucharadas + totalC;
    return totalCucharadas;
    }
    
    public double dineroObtenidoA(int vasosC)
    { double gananciasA;
       gananciasA = vasosC*getPrecioConAzucar();
        return gananciasA;
    }


}