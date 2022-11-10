
package InversionSinHerencia;
public class Inversion 
{
    private float inver1;
    private float inver2;
    private float inver3;
    
    //metodo de acceso por valor
    public void asignar (float inversion1,float inversion2,float inversion3)
    {
        inver1=inversion1;
        inver2=inversion2;
        inver3=inversion3;
    }
    
    //metodo de calculos propio de la subclase
    public String calcularInversion()
    {float res1,res2,res3,totalInversion;
     String mensaje="";
     
        totalInversion=inver1+inver2+inver3;
        
        res1=inver1/totalInversion *100;
        res2=inver2/totalInversion *100;
        res3=inver3/totalInversion *100;
        
        mensaje=" La inversion para la primera persona es "+res1+"\n";
        mensaje=mensaje+" La inversion para la segunda persona es "+res2+"\n";
        mensaje=mensaje+" La inversion para la tercera persona es "+res3+"\n";
        
        return mensaje;
    }  
}    

