/**HERENCIA INTERFACE**/

package ElementosVectorInterface;

public class VectorI implements EstadisticasI
{
    //--------------------------------------------------    
    public int calcularSuma(int Elementos[],int n)
    {
     int sumar=0,i;
      for(i=0;i<n;i++)
      {
      sumar=sumar+Elementos[i]; 
      }
     return sumar;
    }
//---------------------------------------------------  
    public int calcularMaximo(int Elementos[],int n)
    {
      int i,max=0;
     for(i=0;i<n;i++)
      {
        if(Elementos[i]> max)
        {
         max=Elementos[i];
        }
      }
     return max;
    }
//---------------------------------------------------    
    public int calcularMinimo(int Elementos[],int n)
    {
      int i,min=1000;
       for(i=0;i<n;i++)
        {
          if(Elementos[i]< min)
          {
           min=Elementos[i];
          }
        } 
     return min;
    }    
}

