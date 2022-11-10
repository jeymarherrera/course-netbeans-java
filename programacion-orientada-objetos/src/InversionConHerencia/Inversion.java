
package InversionConHerencia;

public class Inversion 
{   private float inver1;
    private float inver2;
    private float inver3;

    //accesos por referencias
    public float getInver1() 
    {
        return inver1;
    }

    public void setInver1(float inver1) 
    {
        this.inver1 = inver1;
    }

    public float getInver2() 
    {
        return inver2;
    }

    public void setInver2(float inver2) 
    {
        this.inver2 = inver2;
    }

    public float getInver3() 
    {
        return inver3;
    }

    public void setInver3(float inver3) 
    {
        this.inver3 = inver3;
    }
    
    //metodo propio de la subclase
    public void calcularInversion()
    { float totalInversion;
    
        totalInversion=inver1+inver2+inver3;
        inver1=inver1/totalInversion*100;
        inver2=inver2/totalInversion*100;
        inver3=inver3/totalInversion*100;
    }

}
