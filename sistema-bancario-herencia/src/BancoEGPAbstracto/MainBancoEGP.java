/**HERENCIA ABSTRACTA**/

/*Integrante
HERRERA, JEYMAR		20-70-5165  
*/ //******************************************************PROGRAMA ABSTRACTO*****************************************//

/**Programa 1 - Clases Abstractas 
 El Banco EGP posee dos tipos de cuenta: 1. Cuenta Regular. 2. Cuenta Dorada
 **/
package BancoEGPAbstracto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class MainBancoEGP {
    public static void main(String[] args) throws IOException
    {
    String [] opcionC = { " REALIZAR OTRA TRANSACCION","     CONTINUAR  " }; //botones
    String [] tiposCuentas = {" CONTINUAR" };
    String opcion, nombre,Cuenta="";
    int ejecucion=1, respuesta,condicion=0, ejecucion2=1;
    double saldo, deposito, retiro;
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    DecimalFormat d = new DecimalFormat("#.##");
    
    while(condicion==0)
    {
    JOptionPane.showOptionDialog(
                                   null
                                        ,"                                                 _______   _____   ______       \n"
                                         +"                                               |       ____/    _____|      __      \\     \n"                               
                                         +"                                               |      |___|     |    ___ |     |__)     |  \n"
                                         +"                                               |       ___|     |    |_*   |     _____/    \n"
                                         +"                                               |      |___|     |___|    |     |          \n"        
                                         +"                                               |_______\\______  |__|        \n"
                                         +"                                                      BANCO DE PANAMA             \n" 
                                         +"  \n"
                                         +"-------------------------------------------------------------------------------------------------------------------- \n"      
                                         +"                                        ||!|!|||!||!||||!|||||||||!||!||||||||!|||||!|||||||||||!|||||||||||||||¡|| \n"
                                         +"                                        ||¡|¡|||¡||¡||||¡||||||||¡||||||||||||¡|||||¡|||||||||||¡|||||||||||||||!||  \n" 
                                         +"-------------------------------------------------------------------------------------------------------------------- \n"
                                         +"                                                          BIENVENIDO(A)  \n"
                                       ,"INGRESO  \n" 

                                       ,JOptionPane.YES_NO_OPTION
                                       ,JOptionPane.INFORMATION_MESSAGE
                                        ,null
                                        ,tiposCuentas
                                        ,"default"
    		            	);
        
    nombre =(String)JOptionPane.showInputDialog(null, "INGRESE SU NOMBRE ","BANCO EGP",JOptionPane.INFORMATION_MESSAGE);
    Cuenta =(String)JOptionPane.showInputDialog(null, "SELECCIONE EL TIPO DE CUENTA QUE DESEA OBTENER ","BANCO EGP",JOptionPane.PLAIN_MESSAGE,null,new Object[] {"CUENTA REGULAR","CUENTA DORADA"},"SELECCIONE UNA OPCION").toString();
    saldo =Double.parseDouble(JOptionPane.showInputDialog(null, "USUARIO : "+nombre+"\n" +"\n" +"INGRESE UN SALDO INICIAL \n","BANCO EGP",JOptionPane.INFORMATION_MESSAGE)); 
        
    CuentaRegularA obj1;
    CuentaDoradaA obj2;

    switch(Cuenta)
    {   
     case "CUENTA REGULAR":
           obj1 = new CuentaRegularA(nombre,saldo);
           while(ejecucion2==1)
            {
                   opcion= (String) JOptionPane.showInputDialog(null, "¿QUE OPERACION DESEA USTED REALIZAR?   ","BANCO EGP",JOptionPane.PLAIN_MESSAGE,null,new Object[] {"DEPOSITAR","RETIRAR","CALCULAR INTERES","SALDO ACTUAL","CAMBIAR CUENTA*","SALIR"},"SLECCIONE UNA OPCION").toString();
                    switch(opcion)
                     {
                       case "DEPOSITAR":
                       deposito=0;
                       deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "USUARIO : "+nombre+"\n"
                       +"\n"
                       +"INGRESE MONTO A  DEPOSITAR \n","BANCO EGP",JOptionPane.INFORMATION_MESSAGE)); 
                        respuesta = JOptionPane.showConfirmDialog(null,"  ESTA USTED REALIZANDO UN DEPOSITO DE B/."+d.format(deposito)+
                                                                      "\n   ¿DESEA SEGUIR CON LA TRANSACCION?",
                                                                      "ADVERTENCIA",JOptionPane.YES_NO_OPTION);
                       if (respuesta == JOptionPane.YES_OPTION)
                         { obj1.setDeposito(deposito);
                           JOptionPane.showMessageDialog(null,"  EL DEPOSITO DE B/."+d.format(deposito)+" SE HA REALIZADO SATISFACTORIAMENTE");
                           JOptionPane.showOptionDialog(
    		                           null
    		                           	,"                                                       PUESTO DE VENTA \n"
                                                 +"                                                   BANCO EGP   DE PANAMA\n"                               
                                                 +"                                     BANCO EGP DE PANAMA  S.A DE  CV  \n"
                                                 +"                    TUMBA MUERTO UNIVERSIDAD TECNOLOGICA DE PANAMA  \n"
                                                 +"                                            PISO 7 , FACULTAD DE PROGRAMACION  \n"   
                                                 +"                                                        RCF SOM 101125 \n"
                                                 +"TNDA         REG         TRAN        FECHA        #EST          HORA          CAJERO \n"
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"            
                                                 +"F#123        1345        0013        6/5/2021     245445        10:24         1258878 \n"
                                                 +"                    \n"
                                                 +"TIPO DE CUENTA                                                                                             "+Cuenta+"\n"
                                                 +"SALDO ACTUAL                                                                                                  B./"+d.format(saldo)+" \n"
                                                 +"SALDO A DEPOSITAR                                                                                        B/."+d.format(obj1.getDeposito())+ "\n"
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"
                                                 +"TOTAL                                                                                                       B/."+d.format(obj1.realizarDeposito())+" \n" 
                                                 +" \n"
                                              
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"      
                                                 +"                                        ||!|!|||!||!||||!|||||||||!||!||||||||!|||||!|||||||||||!|||||||||||||||¡|| \n"
                                                 +"                                        ||¡|¡|||¡||¡||||¡||||||||¡||||||||||||¡|||||¡|||||||||||¡|||||||||||||||!||  \n" 
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"
                                                 +"                                                GRACIAS POR SU VISITA  \n"
    			                        ,"BANCO EGP - COMPROBANTE   \n" 
                                               
    			                       ,JOptionPane.YES_NO_OPTION
    			                       ,JOptionPane.QUESTION_MESSAGE
    			                       	,null
    			                       	,  opcionC
    			                       	,"default"
    		            	);
                           deposito=0;
                           obj1.setDeposito(deposito);
                           saldo = (double)obj1.realizarDeposito();
                            }
                            else
                            {
                             JOptionPane.showMessageDialog(null,"  USTED HA CANCELADO LA TRANSACCION");
                             System.exit(0);
                            }   
                              break;
                
               
                            case "RETIRAR":
                   
                            retiro=Double.parseDouble(JOptionPane.showInputDialog(null, "USUARIO : "+nombre+"\n"
                            +"\n"
                            +"INGRESE MONTO A RETIRAR \n","BANCO EGP",JOptionPane.INFORMATION_MESSAGE));
                            if("CUENTA DORADA".equals(Cuenta) || (saldo>(retiro+(retiro*0.06))))
                            {
                       
                               respuesta = JOptionPane.showConfirmDialog(null,"  ESTA USTED REALIZANDO UN RETIRO DE B/."+d.format(retiro)+
                                                                      "\n   ¿DESEA SEGUIR CON LA TRANSACCION?",
                                                                      "ADVERTENCIA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                             if (respuesta == JOptionPane.YES_OPTION)
                              {
                                obj1.setRetiro(retiro);              
                                JOptionPane.showMessageDialog(null, ""+obj1.realizarRetiro());
                       
                       if(saldo >= retiro)
                       {JOptionPane.showOptionDialog(
    		                           null
    		                           	,"                                                       PUESTO DE VENTA \n"
                                                 +"                                                   BANCO EGP   DE PANAMA\n"                               
                                                 +"                                     BANCO EGP DE PANAMA  S.A DE  CV  \n"
                                                 +"                    TUMBA MUERTO UNIVERSIDAD TECNOLOGICA DE PANAMA  \n"
                                                 +"                                            PISO 7 , FACULTAD DE PROGRAMACION  \n"   
                                                 +"                                                        RCF SOM 101125 \n"
                                                 +"TNDA         REG         TRAN        FECHA        #EST          HORA          CAJERO \n"
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"            
                                                 +"F#123        1345        0013        6/5/2021     245445        10:24         1258878 \n"
                                                 +"USUARIO                                                                                                  "+nombre+"\n"
                                                 +"TIPO DE CUENTA                                                                                            "+Cuenta+"\n"
                                                 +"SALDO ACTUAL                                                                                                  B/."+d.format(saldo)+" \n"
                                                 +"SALDO A RETIRAR                                                                                             B/.-"+d.format(retiro)+ "\n"
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"
                                                 +"INTERESES                                                                                                         B/-"+d.format(0.06)+" \n"
                                                 +"SUBTOTAL                                                                                                           B/."+d.format((saldo-retiro))+"\n"
                                                 +"TOTAL                                                                                                                   B/."+(d.format((saldo-retiro)-0.06))+" \n" 
                                                 +" \n"
                                                 +" \n"  
                                                 +" \n"
                                                 +" \n"
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"      
                                                 +"                                        ||!|!|||!||!||||!|||||||||!||!||||||||!|||||!|||||||||||!|||||||||||||||¡|| \n"
                                                 +"                                        ||¡|¡|||¡||¡||||¡||||||||¡||||||||||||¡|||||¡|||||||||||¡|||||||||||||||!||  \n" 
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"
                                                 +"                                                GRACIAS POR SU VISITA  \n"
    			                        ,"BANCO EGP - COMPROBANTE  \n" 
    			                       ,JOptionPane.YES_NO_OPTION
    			                       ,JOptionPane.QUESTION_MESSAGE
    			                       	,null
    			                       	,opcionC
    			                       	,"default");
                               saldo=(double)((saldo-retiro)-0.06);
                               retiro=0;
                         }
                      }
                   }
                  else
                   {
                        JOptionPane.showMessageDialog(null,"TRANSACCION DENEGADA", "LO SENTIMOS  \n",JOptionPane.ERROR_MESSAGE);
                   }  
                   
                break;
                case "CALCULAR INTERES":
                    {
                    JOptionPane.showOptionDialog(
                                                null
                                                ,"                                                       PUESTO DE VENTA \n"
                                                 +"                                                   BANCO EGP   DE PANAMA\n"                               
                                                 +"                                     BANCO EGP DE PANAMA  S.A DE  CV  \n"
                                                 +"                    TUMBA MUERTO UNIVERSIDAD TECNOLOGICA DE PANAMA  \n"
                                                 +"                                            PISO 7 , FACULTAD DE PROGRAMACION  \n"   
                                                 +"                                                        RCF SOM 101125 \n"
                                                 +"TNDA         REG         TRAN        FECHA        #EST          HORA          CAJERO \n"
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"            
                                                 +"F#123        1345        0013        6/5/2021     245445        10:24         1258878 \n"
                                                 +"                    \n"
                                                 +"CUENTA                                                                                                "+Cuenta+"\n"
                                                 +"INTERESES ACOMULADOS                                                                                                  B/."+d.format(obj1.calcularInteres())+" \n"
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"      
                                                 +"                                        ||!|!|||!||!||||!|||||||||!||!||||||||!|||||!|||||||||||!|||||||||||||||¡|| \n"
                                                 +"                                        ||¡|¡|||¡||¡||||¡||||||||¡||||||||||||¡|||||¡|||||||||||¡|||||||||||||||!||  \n" 
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"
                                                 +"                                                GRACIAS POR SU VISITA  \n"
                                                ,"BANCO EPG   \n" 

                                               ,JOptionPane.YES_NO_OPTION
                                               ,JOptionPane.QUESTION_MESSAGE
                                                ,null
                                                ,  opcionC
                                                ,"default"
                                ); 
                    }
                break;
                
                case "SALDO ACTUAL":
                    {
                    JOptionPane.showOptionDialog(
                                                null
                                                ,"                                                       PUESTO DE VENTA \n"
                                                 +"                                                   BANCO EGP   DE PANAMA\n"                               
                                                 +"                                     BANCO EGP DE PANAMA  S.A DE  CV  \n"
                                                 +"                    TUMBA MUERTO UNIVERSIDAD TECNOLOGICA DE PANAMA  \n"
                                                 +"                                            PISO 7 , FACULTAD DE PROGRAMACION  \n"   
                                                 +"                                                        RCF SOM 101125 \n"
                                                 +"TNDA         REG         TRAN        FECHA        #EST          HORA          CAJERO \n"
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"            
                                                 +"F#123        1345        0013        6/5/2021     245445        10:24         1258878 \n"
                                                 +"                    \n"
                                                 +"CUENTA                                                                                                "+Cuenta+"\n"
                                                 +"SALDO ACTUAL                                                                                                  B/."+d.format(saldo)+" \n"
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"      
                                                 +"                                        ||!|!|||!||!||||!|||||||||!||!||||||||!|||||!|||||||||||!|||||||||||||||¡|| \n"
                                                 +"                                        ||¡|¡|||¡||¡||||¡||||||||¡||||||||||||¡|||||¡|||||||||||¡|||||||||||||||!||  \n" 
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"
                                                 +"                                                GRACIAS POR SU VISITA  \n"
                                                ,"BANCO EPG   \n" 

                                               ,JOptionPane.YES_NO_OPTION
                                               ,JOptionPane.QUESTION_MESSAGE
                                                ,null
                                                ,  opcionC
                                                ,"default"
                                ); 

                    }
                break;
                   
                case "CAMBIAR CUENTA*":
                    ejecucion2=2;
                    Cuenta = JOptionPane.showInputDialog(null, "SELECCIONE EL TIPO DE CUENTA AL QUE DESEA CAMBIAR ","BANCO EGP",JOptionPane.PLAIN_MESSAGE,null,new Object[] {"CUENTA REGULAR","CUENTA DORADA"},"SELECCIONE").toString();
                break;
                
                case "SALIR":
                    JOptionPane.showMessageDialog(null,"   ¡HASTA PRONTO! ","SALIDA",JOptionPane.INFORMATION_MESSAGE);
                    condicion=1;
                   break;
                 }
                
                
                }
    //------------------------------------------------------------------------------------------------------------------------------------------
    case "CUENTA DORADA":
           JOptionPane.showMessageDialog(null," INGRESO POR CUENTA DORADA");
                obj2 = new CuentaDoradaA(nombre,saldo);
                while(ejecucion==1)
                {
                opcion= (String) JOptionPane.showInputDialog(null, "¿QUE OPERACION DESEA USTED REALIZAR?   ","BANCO EGP",JOptionPane.PLAIN_MESSAGE,null,new Object[] {"DEPOSITAR","RETIRAR","CALCULAR INTERES","SALDO ACTUAL","CAMBIAR CUENTA*","SALIR"},"SLECCIONE UNA OPCION").toString();
                switch(opcion)
                {
                case "DEPOSITAR":
                   deposito =Double.parseDouble(JOptionPane.showInputDialog(null, "USUARIO : "+nombre+"\n"
                       +"\n"
                       +"INGRESE MONTO A  DEPOSITAR \n","BANCO EGP",JOptionPane.INFORMATION_MESSAGE)); 
                   respuesta = JOptionPane.showConfirmDialog(null,"  ESTA USTED REALIZANDO UN DEPOSITO DE B/."+d.format(deposito)+
                                                                      "\n   ¿DESEA SEGUIR CON LA TRANSACCION?",
                                                                      "ADVERTENCIA",JOptionPane.YES_NO_OPTION);
                   if (respuesta == JOptionPane.YES_OPTION)
                   {    
                       obj2.setDeposito(deposito);
                       JOptionPane.showMessageDialog(null,"  EL DEPOSITO DE B/."+deposito+" SE HA REALIZADO SATISFACTORIAMENTE");
                       JOptionPane.showOptionDialog(
    		                           null
    		                           	,"                                                       PUESTO DE VENTA \n"
                                                 +"                                                   BANCO EGP   DE PANAMA\n"                               
                                                 +"                                     BANCO EGP DE PANAMA  S.A DE  CV  \n"
                                                 +"                    TUMBA MUERTO UNIVERSIDAD TECNOLOGICA DE PANAMA  \n"
                                                 +"                                            PISO 7 , FACULTAD DE PROGRAMACION  \n"   
                                                 +"                                                        RCF SOM 101125 \n"
                                                 +"TNDA         REG         TRAN        FECHA        #EST          HORA          CAJERO \n"
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"            
                                                 +"F#123        1345        0013        6/5/2021     245445        10:24         1258878 \n"
                                                 +"                    \n"
                                                 +"TIPO DE CUENTA                                                                                             "+Cuenta+"\n"
                                                 +"SALDO ACTUAL                                                                                                  B/."+d.format(saldo)+" \n"
                                                 +"SALDO A DEPOSITAR                                                                                        B/."+d.format(deposito)+ "\n"
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"
                                                 +"TOTAL                                                                                                       B/."+d.format(obj2.realizarDeposito())+" \n" 
                                                 +" \n"
                                              
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"      
                                                 +"                                        ||!|!|||!||!||||!|||||||||!||!||||||||!|||||!|||||||||||!|||||||||||||||¡|| \n"
                                                 +"                                        ||¡|¡|||¡||¡||||¡||||||||¡||||||||||||¡|||||¡|||||||||||¡|||||||||||||||!||  \n" 
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"
                                                 +"                                                GRACIAS POR SU VISITA  \n"
    			                        ,"PUESTO DE VENTA   \n" 
                                               
    			                       ,JOptionPane.YES_NO_OPTION
    			                       ,JOptionPane.QUESTION_MESSAGE
    			                       	,null
    			                       	,  opcionC
    			                       	,"default"
    		            	);
                       deposito=0;
                       obj2.setDeposito(deposito);
                       saldo = (double)obj2.realizarDeposito();
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null,"  USTED HA CANCELADO LA TRANSACCION");
                       System.exit(0);
                   }   
                break;
                case "RETIRAR":
                   retiro=Double.parseDouble(JOptionPane.showInputDialog(null, "USUARIO : "+nombre+"\n"
                   +"\n"
                   +"INGRESE MONTO A RETIRAR \n","BANCO EGP",JOptionPane.INFORMATION_MESSAGE));
                   
                   respuesta = JOptionPane.showConfirmDialog(null,"  ESTA USTED REALIZANDO UN RETIRO DE B/."+d.format(retiro)+
                                                                      "\n   ¿DESEA SEGUIR CON LA TRANSACCION?",
                                                                      "ADVERTENCIA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                   if (respuesta == JOptionPane.YES_OPTION)
                   {
                       
                       obj2.setRetiro(retiro);              
                       JOptionPane.showMessageDialog(null, ""+obj2.realizarRetiro());
                       
                       {JOptionPane.showOptionDialog(
    		                           null
    		                           	,"                                                       PUESTO DE VENTA \n"
                                                 +"                                                   BANCO EGP   DE PANAMA\n"                               
                                                 +"                                     BANCO EGP DE PANAMA  S.A DE  CV  \n"
                                                 +"                    TUMBA MUERTO UNIVERSIDAD TECNOLOGICA DE PANAMA  \n"
                                                 +"                                            PISO 7 , FACULTAD DE PROGRAMACION  \n"   
                                                 +"                                                        RCF SOM 101125 \n"
                                                 +"TNDA         REG         TRAN        FECHA        #EST          HORA          CAJERO \n"
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"            
                                                 +"F#123        1345        0013        6/5/2021     245445        10:24         1258878 \n"
                                                 +"USUARIO                                                                                               "+nombre+"\n"
                                                 +"TIPO DE CUENTA                                                                                             "+Cuenta+"\n"
                                                 +"SALDO ACTUAL                                                                                                  B/."+d.format(saldo)+" \n"
                                                 +"SALDO A RETIRAR                                                                                             B/.-"+d.format(retiro)+ "\n"
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"
                                                 +"INTERESES                                                                                                         B/.-"+d.format(0.02)+"\n"
                                                 +"IMPUESTO POR RETIRO                                                                                                B/.-1.00\n"
                                                 +"SUBTOTAL                                                                                                           B/."+d.format((saldo-retiro))+"\n"
                                                 +"TOTAL                                                                                                               B/."+d.format((((saldo-retiro)-0.02)-1))+" \n" 
                                                 +" \n"
                                                 +" \n"  
                                                 +" \n"
                                                 +" \n"
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"      
                                                 +"                                        ||!|!|||!||!||||!|||||||||!||!||||||||!|||||!|||||||||||!|||||||||||||||¡|| \n"
                                                 +"                                        ||¡|¡|||¡||¡||||¡||||||||¡||||||||||||¡|||||¡|||||||||||¡|||||||||||||||!||  \n" 
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"
                                                 +"                                                GRACIAS POR SU VISITA  \n"
    			                        ,"BANCO EGP - COMPROBANTE  \n" 
    			                       ,JOptionPane.YES_NO_OPTION
    			                       ,JOptionPane.QUESTION_MESSAGE
    			                       	,null
    			                       	,opcionC
    			                       	,"default");
                               saldo=(double)(((saldo-retiro)-0.02)-1);
                               retiro=0;
                       }
                   }
                  else
                   {
                       JOptionPane.showMessageDialog(null,"  TRANSACCION FINALIZADA");
                       System.exit(0);
                   }   
                break;
                case "CALCULAR INTERES":
                    {
                    JOptionPane.showOptionDialog(
                                                null
                                                ,"                                                       PUESTO DE VENTA \n"
                                                 +"                                                   BANCO EGP   DE PANAMA\n"                               
                                                 +"                                     BANCO EGP DE PANAMA  S.A DE  CV  \n"
                                                 +"                    TUMBA MUERTO UNIVERSIDAD TECNOLOGICA DE PANAMA  \n"
                                                 +"                                            PISO 7 , FACULTAD DE PROGRAMACION  \n"   
                                                 +"                                                        RCF SOM 101125 \n"
                                                 +"TNDA         REG         TRAN        FECHA        #EST          HORA          CAJERO \n"
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"            
                                                 +"F#123        1345        0013        6/5/2021     245445        10:24         1258878 \n"
                                                 +"                    \n"
                                                 +"CUENTA                                                                                                "+Cuenta+"\n"
                                                 +"INTERESES ACOMULADO                                                                                              B/."+d.format(obj2.calcularInteres())+" \n"
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"      
                                                 +"                                        ||!|!|||!||!||||!|||||||||!||!||||||||!|||||!|||||||||||!|||||||||||||||¡|| \n"
                                                 +"                                        ||¡|¡|||¡||¡||||¡||||||||¡||||||||||||¡|||||¡|||||||||||¡|||||||||||||||!||  \n" 
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"
                                                 +"                                                GRACIAS POR SU VISITA  \n"
                                                ,"BANCO EPG   \n" 

                                               ,JOptionPane.YES_NO_OPTION
                                               ,JOptionPane.QUESTION_MESSAGE
                                                ,null
                                                ,  opcionC
                                                ,"default"
                                ); 
                    }
                break;
                case "SALDO ACTUAL":
                    {
                    JOptionPane.showOptionDialog(
                                                null
                                                ,"                                                       PUESTO DE VENTA \n"
                                                 +"                                                   BANCO EGP   DE PANAMA\n"                               
                                                 +"                                     BANCO EGP DE PANAMA  S.A DE  CV  \n"
                                                 +"                    TUMBA MUERTO UNIVERSIDAD TECNOLOGICA DE PANAMA  \n"
                                                 +"                                            PISO 7 , FACULTAD DE PROGRAMACION  \n"   
                                                 +"                                                        RCF SOM 101125 \n"
                                                 +"TNDA         REG         TRAN        FECHA        #EST          HORA          CAJERO \n"
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"            
                                                 +"F#123        1345        0013        6/5/2021     245445        10:24         1258878 \n"
                                                 +"                    \n"
                                                 +"CUENTA                                                                                                "+Cuenta+"\n"
                                                 +"SALDO ACTUAL                                                                                                  B/."+d.format(saldo)+" \n"
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"      
                                                 +"                                        ||!|!|||!||!||||!|||||||||!||!||||||||!|||||!|||||||||||!|||||||||||||||¡|| \n"
                                                 +"                                        ||¡|¡|||¡||¡||||¡||||||||¡||||||||||||¡|||||¡|||||||||||¡|||||||||||||||!||  \n" 
                                                 +"-------------------------------------------------------------------------------------------------------------------- \n"
                                                 +"                                                GRACIAS POR SU VISITA  \n"
                                                ,"BANCO EPG   \n" 

                                               ,JOptionPane.YES_NO_OPTION
                                               ,JOptionPane.QUESTION_MESSAGE
                                                ,null
                                                ,  opcionC
                                                ,"default"
                                ); 

                       break;
                   }
                case "CAMBIAR CUENTA*":
                    ejecucion=2;
                    Cuenta = JOptionPane.showInputDialog(null, "SELECCIONE EL TIPO DE CUENTA AL QUE DESEA CAMBIAR ","BANCO EGP",JOptionPane.PLAIN_MESSAGE,null,new Object[] {"CUENTA REGULAR","CUENTA DORADA"},"SELECCIONE").toString();
                break;
                case "SALIR":
                    JOptionPane.showMessageDialog(null,"  ¡HASTA LUEGO! ");
                   condicion=1;
                break;
                }
                }
    break;
    default:
	JOptionPane.showMessageDialog(null,"\n**NUMERO FUERA DE RANGO** \n   -INTENTE DE NUEVO-");
    break;
    }
    }
    }
}