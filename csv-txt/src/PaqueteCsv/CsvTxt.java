package PaqueteCsv;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CsvTxt {
    ArrayList<String> lista = new ArrayList<>();
    
    public void asignar(  ArrayList<String>  list){
        lista=list;
    }
    
    public boolean totalizar(){
        
        ArrayList<String> totales = new ArrayList<>();
        double sumatxt;
        String dato="";
        for(int x=0 ; x<lista.size();x++){
            sumatxt=0;
            String [] items = lista.get(x).split(";");
            for(int z=1 ; z<items.length;z++){
                sumatxt=sumatxt+Double.parseDouble(items[z]);
            }
            dato=" Cliente :"+items[0]+" - Total:"+sumatxt;
            totales.add(dato);
        }
        try {
            imprimir(totales);
            return true;
        }catch (IOException e){
            return false;
        }
        
    }
    
    public void imprimir(ArrayList<String>  list) throws IOException{
        String ruta ="C:\\JuegoLayo\\totales.txt";
        File file = new File( ruta);
        if (!file.exists()){
            file.createNewFile();
        }
        //FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
        FileWriter fw = new FileWriter(file);
        try(BufferedWriter bw = new BufferedWriter(fw)){
           for(int x=0; x<list.size();x++) {
               bw.write(list.get(x));
               bw.write("\n");
           }
        }
    }
}
