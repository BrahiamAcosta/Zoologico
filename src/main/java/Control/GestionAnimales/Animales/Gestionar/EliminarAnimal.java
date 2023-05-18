/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.GestionAnimales.Animales.Gestionar;

import Control.GestionAnimales.Animales.Tipos.AnimalesAnfibios;
import Control.GestionAnimales.Animales.Tipos.AnimalesAvesAcuaticas;
import Control.GestionAnimales.Animales.Tipos.AnimalesAvesCarroñaRapiña;
import Control.GestionAnimales.Animales.Tipos.AnimalesAvesExoticas;
import Control.GestionAnimales.Animales.Tipos.AnimalesAvesTerrestres;
import Control.GestionAnimales.Animales.Tipos.AnimalesInsectos;
import Control.GestionAnimales.Animales.Tipos.AnimalesMamiferosAcuaticos;
import Control.GestionAnimales.Animales.Tipos.AnimalesMamiferosTerrestres;
import Control.GestionAnimales.Animales.Tipos.AnimalesPeces;
import Control.GestionAnimales.Animales.Tipos.AnimalesReptilesAcuaticos;
import Control.GestionAnimales.Animales.Tipos.AnimalesReptilesTerrestres;
import Control.GestionAnimales.CopiaAnimales.InfoJSON.ReadJSON;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Alisser
 */
public class EliminarAnimal {

    ReadJSON readJson = new ReadJSON();

    public void EliminarAnfibio(AnimalesAnfibios animalAnfibio) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray anfibios = readJson.AnimalesAnfibiosJSON();
        for (int i = 0; i < anfibios.length(); i++) {
            JSONObject anfibio = (JSONObject) anfibios.get(i);
            if (anfibio.get("codigo").equals(animalAnfibio.getCodigo())) {
                anfibios.remove(i);
                break;
            }
        }
        infoJson.getJSONArray("animales_anfibios").clear();
        infoJson.getJSONArray("animales_anfibios").put(anfibios);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
    }
    
    public void EliminarAveAcuatica(AnimalesAvesAcuaticas animalAveAcuatica) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray avesAcuaticas = readJson.AnimalesAvesAcuaticasJSON();
        for (int i = 0; i < avesAcuaticas.length(); i++) {
            JSONObject aveAcuatica = (JSONObject) avesAcuaticas.get(i);
            if (aveAcuatica.get("codigo").equals(animalAveAcuatica.getCodigo())) {
                avesAcuaticas.remove(i);
                break;
            }
        }
        infoJson.getJSONArray("animales_aves_acuaticas").clear();
        infoJson.getJSONArray("animales_aves_acuaticas").put(avesAcuaticas);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
    }
    
    public void EliminarAveCarroñaRapiña(AnimalesAvesCarroñaRapiña animalAveCarroñaRapiña) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray avesCarroñaRapiña = readJson.AnimalesAvesCarroñaRapiñaJSON();
        for (int i = 0; i < avesCarroñaRapiña.length(); i++) {
            JSONObject aveCarroñaRapiña = (JSONObject) avesCarroñaRapiña.get(i);
            if (aveCarroñaRapiña.get("codigo").equals(animalAveCarroñaRapiña.getCodigo())) {
                avesCarroñaRapiña.remove(i);
                break;
            }
        }
        infoJson.getJSONArray("animales_aves_carroña_rapiña").clear();
        infoJson.getJSONArray("animales_aves_carroña_rapiña").put(avesCarroñaRapiña);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
    }
    
    public void EliminarAveExotica(AnimalesAvesExoticas animalAveExotica) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray avesExoticas = readJson.AnimalesAvesExoticasJSON();
        for (int i = 0; i < avesExoticas.length(); i++) {
            JSONObject aveExotica = (JSONObject) avesExoticas.get(i);
            if (aveExotica.get("codigo").equals(animalAveExotica.getCodigo())) {
                avesExoticas.remove(i);
                break;
            }
        }
        infoJson.getJSONArray("animales_aves_exoticas").clear();
        infoJson.getJSONArray("animales_aves_exoticas").put(avesExoticas);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
    }
    
    public void EliminarAveTerrestre(AnimalesAvesTerrestres animalAveTerrestre) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray avesTerrestres = readJson.AnimalesAvesTerrestresJSON();
        for (int i = 0; i < avesTerrestres.length(); i++) {
            JSONObject aveTerrestre = (JSONObject) avesTerrestres.get(i);
            if (aveTerrestre.get("codigo").equals(animalAveTerrestre.getCodigo())) {
                avesTerrestres.remove(i);
                break;
            }
        }
        infoJson.getJSONArray("animales_aves_terrestres").clear();
        infoJson.getJSONArray("animales_aves_terrestres").put(avesTerrestres);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
    }
    
    public void EliminarInsectos(AnimalesInsectos animalInsecto) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray insectos = readJson.AnimalesInsectosJSON();
        for (int i = 0; i < insectos.length(); i++) {
            JSONObject insecto = (JSONObject) insectos.get(i);
            if (insecto.get("codigo").equals(animalInsecto.getCodigo())) {
                insectos.remove(i);
                break;
            }
        }
        infoJson.getJSONArray("animales_insectos").clear();
        infoJson.getJSONArray("animales_insectos").put(insectos);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
    }
    
    public void EliminarMamiferoAcuatico(AnimalesMamiferosAcuaticos animalMamiferoAcuatico) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray mamiferosAcuaticos = readJson.AnimalesMamiferosAcuaticosJSON();
        for (int i = 0; i < mamiferosAcuaticos.length(); i++) {
            JSONObject mamiferoAcuatico = (JSONObject) mamiferosAcuaticos.get(i);
            if (mamiferoAcuatico.get("codigo").equals(animalMamiferoAcuatico.getCodigo())) {
                mamiferosAcuaticos.remove(i);
                break;
            }
        }
        infoJson.getJSONArray("animales_mamiferos_acuaticos").clear();
        infoJson.getJSONArray("animales_mamiferos_acuaticos").put(mamiferosAcuaticos);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
    }
    
    public void EliminarMamiferoTerrestre(AnimalesMamiferosTerrestres animalMamiferoTerrestre) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray mamiferosTerrestres = readJson.AnimalesMamiferosTerrestresJSON();
        for (int i = 0; i < mamiferosTerrestres.length(); i++) {
            JSONObject mamiferoTerrestre = (JSONObject) mamiferosTerrestres.get(i);
            if (mamiferoTerrestre.get("codigo").equals(animalMamiferoTerrestre.getCodigo())) {
                mamiferosTerrestres.remove(i);
                break;
            }
        }
        infoJson.getJSONArray("animales_mamiferos_terrestres").clear();
        infoJson.getJSONArray("animales_mamiferos_terrestres").put(mamiferosTerrestres);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
    }
    
    public void EliminarPeces(AnimalesPeces animalPez) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray peces = readJson.AnimalesAnfibiosJSON();
        for (int i = 0; i < peces.length(); i++) {
            JSONObject pez = (JSONObject) peces.get(i);
            if (pez.get("codigo").equals(animalPez.getCodigo())) {
                peces.remove(i);
                break;
            }
        }
        infoJson.getJSONArray("animales_peces").clear();
        infoJson.getJSONArray("animales_peces").put(peces);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
    }
    
    public void EliminarReptilAcuatico(AnimalesReptilesAcuaticos animalReptilAcuatico) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray reptilesAcuaticos = readJson.AnimalesAnfibiosJSON();
        for (int i = 0; i < reptilesAcuaticos.length(); i++) {
            JSONObject reptilAcuatico = (JSONObject) reptilesAcuaticos.get(i);
            if (reptilAcuatico.get("codigo").equals(animalReptilAcuatico.getCodigo())) {
                reptilesAcuaticos.remove(i);
                break;
            }
        }
        infoJson.getJSONArray("animales_reptiles_acuaticos").clear();
        infoJson.getJSONArray("animales_reptiles_acuaticos").put(reptilesAcuaticos);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
    }
    
    public void EliminarReptilTerrestre(AnimalesReptilesTerrestres animalReptilTerrestre) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray reptilesTerrestres = readJson.AnimalesAnfibiosJSON();
        for (int i = 0; i < reptilesTerrestres.length(); i++) {
            JSONObject reptilTerrestre = (JSONObject) reptilesTerrestres.get(i);
            if (reptilTerrestre.get("codigo").equals(animalReptilTerrestre.getCodigo())) {
                reptilesTerrestres.remove(i);
                break;
            }
        }
        infoJson.getJSONArray("animales_reptiles_terrestres").clear();
        infoJson.getJSONArray("animales_reptiles_terrestres").put(reptilesTerrestres);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
    }
}
