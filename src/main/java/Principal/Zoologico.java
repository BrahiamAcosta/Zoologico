package Principal;
import Animales.Animales;
import Animales.AnimalesAves;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import Control.*;
import InfoJSON.GetInfoJSON;
import InfoJSON.ReadJSON;

/**
 *
 * @author brahiam.acosta
 */
public class Zoologico {

    public static void main(String[] args) throws IOException{
        boolean continua;
        int opcion = 0;
        do{
            //JSON info to Animals static attributes (ArrayList)
            GetInfoJSON info = new GetInfoJSON();
            info.GetInfoAnfibios();
            info.GetInfoAvesAcuaticas();
            info.GetInfoAvesCarroñaRapiña();
            info.GetInfoAvesExoticas();
            info.GetInfoAvesTerrestres();
            info.GetInfoInsectos();
            info.GetInfoMamiferosAcuaticos();
            info.GetInfoMamiferosTerrestres();
            info.GetInfoPeces();
            info.GetInfoReptilesAcuaticos();
            info.GetInfoReptilesTerrestres();
            
            System.out.println("Nuestros Animales: \n");
            System.out.println(Animales.animales);
            
            System.out.println("\n\nBienvenido \n ¿Que desea hacer?: \n1. Gestionar Animales \n2. Consultar contabilidad \n3. Vender plan");
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
            case 3 -> new DptoComercial();
        }
        
    }
    public static String Leer() throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        return stdin.readLine();
    }
}
