/*La aplicación además debe permitir obtener la suma, mínimo y máximo 
de los elementos de un vector de N elementos.
 */
package ElementosVectorAbstracto;

public class VectorA extends EstadisticaA
{
    public VectorA(int[] Elementos, int n) 
    {
        super(Elementos, n);
    }
  
    public  int calcularSuma()
    {
      int sumar=0,i;
      for(i=0;i<n;i++)
      {
      sumar=sumar+Elementos[i]; 
      } 
    return sumar; 
    }
    
    
    public  int obtenerMaximo()
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
    
    
    public int obtenerMinimo()
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
