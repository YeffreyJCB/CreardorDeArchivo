
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Jair Fernandez
 */
public class CreadorDeArchivo {
    public static void guardarLista(List<Persona> lstPersona){
        try{
            ObjectOutputStream objSalida = new ObjectOutputStream(new FileOutputStream("./src/estudiante1.txt"));
            objSalida.writeObject(lstPersona);
            objSalida.close();
            System.out.println("Archivo guardado");   
        } catch (IOException e){e.printStackTrace();
        }
        
    }
    
    public static List<Persona> leerLista() {
    List<Persona> lstPersona = null;
    try {
    ObjectInputStream in = new ObjectInputStream(new FileInputStream("./src/estudiante1.txt"));
    lstPersona = (List<Persona>) in.readObject();
    in.close();
    System.out.println("Archivo leído");
    } catch (IOException e){e.printStackTrace();} catch (ClassNotFoundException e){e.printStackTrace();}
    return lstPersona;
    }

    public static void main (String []args){
        List <Persona> lstPersona = new ArrayList<Persona>();
        lstPersona.add(new Persona("sss", "sss", "sss", 19, 1));
        //lstPersona.add(new Persona("001-123","Juan","Calle Almeida",24,1.55));
        guardarLista(lstPersona);
        
        
        lstPersona = leerLista();
        for(Persona p : lstPersona){
            System.out.println(p);  
        }
    }    
}
