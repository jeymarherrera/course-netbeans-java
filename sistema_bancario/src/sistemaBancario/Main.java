package sistemaBancario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main 
{  public static void main(String[] args) throws IOException 
   {
        double monto;
        int opc , opc2;
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        CuentaRegular obj1 = new CuentaRegular();
        CuentaDorada   obj2 = new CuentaDorada();
        
        do
        {
            System.out.println(" Bienvenido al Banco, sr(a)"+obj1.getNombreCuenta());
            System.out.println(" 1. Para Cuenta Regular  ");
            System.out.println(" 2. Para Cuenta Dorada  ");
            System.out.println(" 3. Para Salir ");
            System.out.println(" Digite su opcion =>  ");
            opc=Integer.parseInt(br.readLine());
            
            switch(opc)
            {
                case 1: 
                    
                    obj1.menuopciones();
                    opc2=Integer.parseInt(br.readLine());
                    
                    switch(opc2)
                    {
                        case 1:
                            
                            System.out.println(" Ingrese el monto  a Depositar  ");
                            monto=Double.parseDouble(br.readLine());
                            System.out.println(" Su monto Actual es   $"+obj1.depositar(monto));
                            break;
                            
                        case 2:
                            
                            System.out.println(" Ingrese el monto  a Retirar ");
                            monto=Double.parseDouble(br.readLine());
                            System.out.println(obj1.validacion ( monto));
                            break;
                            
                        case 3:
                            
                            obj1.calcularInteres();
                            break;
                            
                        case 4:
                            
                            obj1.mostrarSaldo();
                            break;
                            
                        default:
                            
                            System.out.println(" No existe esta opcion no sea capa  8 "); 
                            break;
                    }
                    break;
                    
                case 2:
                    
                    obj2.menuopciones();
                    opc2=Integer.parseInt(br.readLine());
                    
                     switch(opc2)
                     {
                        case 1:
                            
                            System.out.println(" Ingrese el monto  a Depositar  ");
                            monto=Double.parseDouble(br.readLine());
                            System.out.println(" Su monto Actual es   $"+obj2.depositar(monto));
                            break;
                            
                        case 2:
                            
                            System.out.println(" Ingrese el monto  a Retirar ");
                            monto=Double.parseDouble(br.readLine());
                            System.out.println(" Su monto Actual es   $"+obj2.retirar(monto));
                            break;
                            
                        case 3:
                            
                            obj2.calcularInteres();
                            break;
                            
                        case 4:
                            
                            obj2.mostrarSaldo();
                            break;
                            
                        default:
                            
                            System.out.println(" No existe esta opcion no sea capa  8 "); 
                            break;
                     }  
                     break;
                     
                case 3:
                    
                    System.out.println(" Regrese pronto !!!! "); 
                    break;
                    
                default:
                    
                    System.out.println(" No existe esta opcion no sea capa  8 "); 
                    break;
            } 
        }while(opc!=3); 
    }
}
