package tiendaLimonadas;
public class LimonadaSinAzucar extends Limonadas
{
    public double dineroObtenidoB(int vasosC)
    { double gananciasB;
       gananciasB =(double) vasosC*getPrecioSinAzucar();
        return gananciasB;
    }
}