import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CreadorArchivo {
    public static ArrayList<String> leerArchivo() throws IOException{
	File archivo = null;
	FileReader in = null;
        BufferedReader lectura;
        ArrayList<String> datos = new ArrayList<>();      
	try{
            archivo = new File("./src/estudiante.txt");
            in = new FileReader(archivo);
            lectura = new BufferedReader(in);
            String cadena; 
            while((cadena = lectura.readLine())!=null) {
                datos.add(cadena +"\n");
            }
	}catch (FileNotFoundException e){e.printStackTrace();} 
	 catch (IOException e) {e.printStackTrace();} 
	finally {
	//close() garantiza que se cierre el stream
	if(in!=null) {in.close();}
        }
        return datos;
    }
    
    public static void escribirArchivo(ArrayList contenido){
        File archivo = new File("./src/estudiante2.txt");
        try{
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
        }catch(FileNotFoundException ex){
         ex.printStackTrace(System.out);
        }        
    }
    
    public static void main(String [] args) throws IOException{
        leerArchivo();
        escribirArchivo(leerArchivo());
        
        ArrayList<String> datos = leerArchivo();
        for(String p : datos){
            System.out.println(p);  
        }
    }
}