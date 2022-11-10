//clase hija
package Problema2;
public class Empleado extends Sistema
{ private String nombres[];
  private double sueldoHora;
  private int horas[];
  private double N;

  //constructor
    public Empleado(String[] nombres, double sueldoHora,double[] salarioB, double[] salarioN, int[] horas, int N) {
        super(salarioB, salarioN);
        this.nombres = nombres;
        this.sueldoHora = sueldoHora;
        this.horas = horas;
        this.N = N;
    }
  
  //metodos propios
  public double calcularHorasExtras()
  { double extra=0;
    int i=0;
    
    for(i=0;i<N;i++)
    {
      if (horas[i] > 85)
      { 
        extra = (double) ((horas[i]-80)*(sueldoHora*3));
      }
      else if (horas[i] >= 81 && horas[i] <= 85)
      {
        extra = (double) ((horas[i]-80)*(sueldoHora*2));
      }
      else if (horas[i] <= 80) 
      {
        extra = 0;
      }
    }
    return extra;  
  }

  public String [] nombreEmpleado()
  {
    return nombres;
  }
  
 //metodos abstractos
@Override
  public double [] calcularSalarioBruto()
  { int i;
     for(i=0;i<N;i++)
     {
       getSalarioB()[i]=(double)(sueldoHora*horas[i])+calcularHorasExtras();
     }
    return getSalarioB();
  }
  
@Override
  public double [] calcularSalarioNeto()
  { int i;
     for(i=0;i<N;i++)
     {
      if(getSalarioB()[i] >= 50000.0 && getSalarioB()[i] >= 11000.0 )
      {
       getSalarioN()[i]=(getSalarioB()[i]-0.0975-0.0125-0.15);
      }
      else
      {
       getSalarioN()[i]=(getSalarioB()[i]-0.0975-0.0125);  
      }
     }
    return getSalarioN();
    }   
}
