
package Problema4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class CsvTxt4
{
    private ArrayList <String> lista = new ArrayList<>();
    
    public void lectura (String patch) throws FileNotFoundException
    {
        String linea="";
        try
        {
            BufferedReader leerDoc = new BufferedReader(new FileReader(patch));
            while((linea = leerDoc.readLine()) !=null)
            {
            lista.add(linea);
            }
        }
        catch (FileNotFoundException e)
        {    
        }
        catch (IOException e)
        {
        }
    }
    
    
    public ArrayList NotaMedia()
    {
        ArrayList<String> mediaA= new ArrayList<>();
        String dato="";
        double prom=0;
        int contador=0;
        for(int i=0; i<lista.size(); i++)
        {
            String[] valorPromedio = lista.get(i).split(",");
            for(int j=2; j<valorPromedio.length;j++)
            {
            contador++;
            prom=prom+Double.parseDouble(valorPromedio[j]);
            }
        }
        prom=prom/contador;
        dato="La nota media del curso: "+prom+"\n";
        mediaA.add(dato);
        return mediaA;
    }

    
    public static String[] ObtenerMedia (ArrayList <String> mediaTemporal)
    {
        String lista[] = null;
        int tam=mediaTemporal.size();
        lista = new String [tam];
        for(int i=0; i<tam; i++)
        {
            lista[i]=mediaTemporal.get(i);
        }
        return lista;
    }
    
    
    public ArrayList NotaAlta()
    {
        ArrayList<String> altaA = new ArrayList<>();
        String dato="";
        int max = 0, aux=0, contador=0;
        String mayor[]= null;
        for(int i=0; i<lista.size(); i++)
        {
            mayor = lista.get(i).split(",");
            contador=0;
            aux=0;
            for(int j=2; j<mayor.length; j++){
            contador++;
            aux = aux+Integer.parseInt(mayor[j]);
        }
            System.out.println(contador);
            aux = aux/contador;
            if(aux>max){
                max=aux;
            }
        }
        dato = "Identificacion: "+ mayor[1] + " La nota más alta: "+max+"\n";
        altaA.add(dato);
        return altaA;
    }
    
    
    public static String[] ObtenerProm(ArrayList<String> tempNota)
    {
        String lista[] = null;
        int tam = tempNota.size();
        lista = new String[tam];
        for(int i=0; i<tam; i++)
        {
            lista[i]= tempNota.get(i);
        }
        return lista;
    }
    
}
