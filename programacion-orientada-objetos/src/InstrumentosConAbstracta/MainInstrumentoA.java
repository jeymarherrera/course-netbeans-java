package InstrumentosConAbstracta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainInstrumentoA 
{ public static void main(String[] args) throws IOException
    { String musico , instru;
    
       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
       Guitarra obj = new Guitarra ();
       
       System.out.println("Ingrese el nombre del musico ");
       musico=br.readLine();
       
       System.out.println("Ingrese el instrumento ");
       instru=br.readLine();
       
       obj.setMusico(musico);
       obj.setTipoInstrumento(instru);
       obj.afinar();
       obj.tocar();  
    } 
}
