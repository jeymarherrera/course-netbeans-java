package PoligonosConInterfaces;

public class Figuras implements Poligonos
{
  @Override
  public double areaTriangulo(double base, double altura)
  {double res;
        res=(base*altura)/2;
        return res;     
   }
   
  @Override
   public double areaRectangulo (double base, double altura)
   {double res;
        res=base*altura;
        return res;  
   }
   
  @Override
   public double areaRomboide (double base, double altura)
   {double res;
        res=base*altura;
        return res;
   }  
}
