/*2.	Escribir una clase Estadística que permita a otras clases implementar 
los métodos suma (), maximo() y minimo() para los elementos de un vector.
 */
package ElementosVectorAbstracto;

public abstract class EstadisticaA 
{   protected int Elementos[],n;

    public EstadisticaA(int[] Elementos, int n) 
    {
        this.Elementos = Elementos;
        this.n = n;
    }
 
    public abstract int calcularSuma();
    public abstract int obtenerMinimo();
    public abstract int obtenerMaximo();
}
