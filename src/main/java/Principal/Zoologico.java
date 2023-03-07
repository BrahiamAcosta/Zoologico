package Principal;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import Control.*;

/**
 *
 * @author brahiam.acosta
 */
public class Zoologico {

    public static void main(String[] args) throws IOException{
        boolean continua;
        int opcion = 0;
        do{
            System.out.println("Bienvenido \n ¿Que desea hacer?: \n1. Gestionar Animales \n2. Consultar contabilidad \n3. Vender plan");
            try{
                continua = false;
                opcion = Integer.parseInt(Leer());
            }catch(NumberFormatException e){
            System.out.println("Ingrese la opción en números");
            continua = true;
            }   
        }while(continua);
        switch(opcion){
            case 1 -> new DptoLogistica();
            case 2 -> new DptoGerencial();
            case 3 -> new DptoComercial();
        }
        
    }
    public static String Leer() throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        return stdin.readLine();
    }
}
