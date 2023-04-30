package Principal;
import Animales.Tipos.Animales;
import Animales.Tipos.AnimalesAves;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import Control.*;
import CopiaAnimales.InfoJSON.GetInfoJSON;
import CopiaAnimales.InfoJSON.ReadJSON;

/**
 *
 * @author brahiam.acosta
 */
public class Zoologico {

    public static void main(String[] args) throws IOException{
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
            System.out.println(Animales.getAnimales());
    }
    public static String Leer() throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        return stdin.readLine();
    }
}
