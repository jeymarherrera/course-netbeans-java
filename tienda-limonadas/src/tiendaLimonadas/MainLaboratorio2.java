/**HERENCIA SIMPLE**/

/*
HERRERA, JEYMAR		20-70-5165  
*/
package tiendaLimonadas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class MainLaboratorio2 
{   public static void main(String[] args) throws IOException 
    {
    String opcion,c;
    int opc,total = 0,cucharadas=0, vasos, vasosA = 0, vasosB = 0;
    boolean salir=false;
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
      
    LimonadaConAzucar objA;   
    LimonadaSinAzucar objB;  
    do
    {
    opcion= (String) JOptionPane.showInputDialog(null,"\n***************************************************"
    +"\n                       MENU                        "
    +"\n***************************************************"
    +"\n* 1. LIMONADA ENDULZADA...................$0.50    "
    +"\n* 2. LIMONADA SIN DULCE...................$0.45    "
    +"\n* 3. SOLICITAR TOTALES                             "
    +"\n* 4. SALIR                                         "
    +"\n***************************************************");

    opc=Integer.parseInt(opcion);

    objA = new LimonadaConAzucar();
    objB = new LimonadaSinAzucar();

    switch(opc) //estructura switch
    {
    case 1:
	c=(String) JOptionPane.showInputDialog(null,"\n ¿Cuantas cucharadas de azucar desea? ");
        cucharadas=Integer.parseInt(c);
        objA.setCucharadas(cucharadas);
        JOptionPane.showMessageDialog(null,objA.calcularChucharadas());
        vasos=objA.vasosConsumidos(vasosA,vasosB);
        objA.cucharadasConsumidas(total);
        if ((cucharadas < 1) || (cucharadas > 3))  
        {
        total=total-cucharadas;
        vasosA--;
        }
        else if(vasos >= objA.getCantidadVasos())
        {
        JOptionPane.showMessageDialog(null,"  Disculpe! Ya no tenemos Vasos.");
        total=total-cucharadas;
        vasosA--;         
        }
        else if(total >= objA.getCantidadAzucar())
        {
        JOptionPane.showMessageDialog(null,"  Disculpe! Ya no tenemos Azucar."); 
        total=total-cucharadas;
        vasosA--;            
        }
        else 
            JOptionPane.showMessageDialog(null,"    Aqui tiene su limonada con "+cucharadas+" cucharada azucar \n\t ¡Gracias por su compra!");
        total=total+cucharadas;
        vasosA++;  
    break;
    case 2:
        vasos=objA.vasosConsumidos(vasosA,vasosB);
        if (vasos>= objB.getCantidadVasos())
            JOptionPane.showMessageDialog(null,"  Disculpe! Ya no tenemos Vasos.");
        else
        {
        vasosB++;
	JOptionPane.showMessageDialog(null,"    Aqui tiene su limonada sin azucar \n\t ¡Gracias por su compra!");   
        }       
    break;
    case 3:
        objA.cucharadasConsumidas(total);
	JOptionPane.showMessageDialog(null,"\n LOS TOTALES OBTENIDOS SON LOS SIGUIENTES:  "
        +"\n****************************************************** "
        +"\n *Cucharadas de Azucar Restantes = "+(objA.getCantidadAzucar()-objA.cucharadasConsumidas(total))
        +"\n *Vasos Consumidos = "+objA.vasosConsumidos(vasosA,vasosB)
        +"\n *Dinero Total Obtenido = "+(objA.dineroObtenidoA(vasosA)+objB.dineroObtenidoB(vasosB))
        +"\n *Ganancias de las Limonadas con Azucar = "+objA.dineroObtenidoA(vasosA)
        +"\n *Ganancias de las Limonadas sin Azucar = "+objB.dineroObtenidoB(vasosB));
    break;
    case 4:
        salir=true;
        JOptionPane.showMessageDialog(null,"\n            ¡¡Hasta Luego!!");
    break;
    default:
	JOptionPane.showMessageDialog(null,"\n**Numero fuera de rango** \n   -Intente de nuevo-");
    break;
    }
    }
    while (opc != 4);
    }
}
