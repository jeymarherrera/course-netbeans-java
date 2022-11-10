/*Integrantes

HERRERA, JEYMAR		20-70-5165  

*/

package ElementosVectorInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class MainEstadisticasI 
{
    public static void main(String[] args) 
    {
      int Elementos[],n,i,opc;
      String opcion;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      VectorI obj= new VectorI();
      
          String nu = (String) JOptionPane.showInputDialog(null,"\n*************************************************************************************"
              +"\n INGRESE LA CANTIDAD DE ELEMENTOS QUE DESEE TENER EN EL VECTOR "
              +"\n**************************************************************************************","TAMAÑO",JOptionPane.INFORMATION_MESSAGE);
              n=Integer.parseInt(nu);
              
     Elementos= new int [n];
     
    do
    {
    opcion= (String) JOptionPane.showInputDialog(null,"\n***************************************************"
    +"\n                       MENU                        "
    +"\n***************************************************"
    +"\n* 1. CARGAR VECTOR                                "
    +"\n* 2. SUMA                                         "
    +"\n* 3. MINIMO                                        "
    +"\n* 4. MAXIMO                                       "
    +"\n* 5. SALIR                                        "
    +"\n***************************************************");

    opc = Integer.parseInt(opcion);

    switch(opc) //estructura switch 
    {
    case 1:
        
        for(i=0;i<n;i++)
        {
        String Elemen = (String) JOptionPane.showInputDialog(null,"\n**************************************************************"
              +"\n INGRESE CADA VALOR DEL VECTOR - Elementos["+i+"]:           "
              +"\n***************************************************************","ELEMENTOS",JOptionPane.INFORMATION_MESSAGE);
              Elementos[i]=Integer.parseInt(Elemen);   
        }
        
        for(i=0;i<n;i++)
        {
        JOptionPane.showMessageDialog(null,"INDICE: "+i+"-->"+Elementos[i],"VALORES",JOptionPane.INFORMATION_MESSAGE);   
        }
    break;
    case 2:
       JOptionPane.showMessageDialog(null,"LA SUMA ES: "+obj.calcularSuma(Elementos, n),"VALORES",JOptionPane.INFORMATION_MESSAGE);
    break;
    case 3:
       JOptionPane.showMessageDialog(null,"\nEl MINIMO ES: "+obj.calcularMinimo(Elementos, n),"VALORES",JOptionPane.INFORMATION_MESSAGE);
    break;
    case 4:
       JOptionPane.showMessageDialog(null,"\nEL MAXIMO ES: "+obj.calcularMaximo(Elementos, n),"VALORES",JOptionPane.INFORMATION_MESSAGE);
    break;
    case 5:
        System.exit(0);
        JOptionPane.showMessageDialog(null,"\n            ¡¡ HASTA PRONTO !!");
    break;
    default:
	JOptionPane.showMessageDialog(null,"\n**NUMERO FUERA DE RANGO** \n   -INTENTE DE NUEVO-");
    break;
    }
    }
    while (opc != 5);
    }

    }
    
