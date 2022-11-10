package InstrumentosConAbstracta;

public class Guitarra extends Instrumento
{   private String tipoInstrumento;
    private String musico;
    
    //acceso por referencia
    public void setTipoInstrumento(String tipoInstrumento) 
    {
        this.tipoInstrumento = tipoInstrumento;
    }

    public void setMusico(String musico) 
    {
        this.musico = musico;
    }
    
    
@Override//metodos abstractos
    public void afinar()
    {
        System.out.println("Debe afinar el/la "+tipoInstrumento);
    }
    
@Override
    public void tocar()
    {
        System.out.println(musico +" Toca el/la "+tipoInstrumento);
    }
    
}
