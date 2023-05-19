/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.GestionAnimales.Animales.Gestionar;

import Control.GestionAnimales.CopiaAnimales.CrearAnimal;
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
public class CrearNuevoAnimal {

    ReadJSON readJson = new ReadJSON();

    public AnimalesAnfibios crearNuevoAnfibio(
            int codigo,
            String nombre,
            String especie,
            String genero,
            String habitad,
            String zona,
            String procedencia,
            String dietaPrincipal,
            String dietaCompleta[],
            String temperaturaHabitad,
            String riesgoExtincion,
            String tipoReproduccion,
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            String precauciones[]
    ) throws IOException {
        System.out.println(nombre);
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray anfibios = readJson.AnimalesAnfibiosJSON();
        JSONObject nuevoAnfibio = new JSONObject();
        nuevoAnfibio.append("codigo", codigo);
        nuevoAnfibio.append("nombre", nombre);
        nuevoAnfibio.append("especie", especie);
        nuevoAnfibio.append("genero", genero);
        nuevoAnfibio.append("habitad", habitad);
        nuevoAnfibio.append("zona", zona);
        nuevoAnfibio.append("procedencia", procedencia);
        nuevoAnfibio.append("dietaPrincipal", dietaPrincipal);
        nuevoAnfibio.append("dietaCompleta", dietaCompleta);
        nuevoAnfibio.append("temperaturaHabitad", temperaturaHabitad);
        nuevoAnfibio.append("riesgoExtincion", riesgoExtincion);
        nuevoAnfibio.append("tipoReproduccion", tipoReproduccion);
        nuevoAnfibio.append("peligroso", peligroso);
        nuevoAnfibio.append("nivelPeligrosidad", nivelPeligrosidad);
        nuevoAnfibio.append("venenoso", venenoso);
        nuevoAnfibio.append("tipoVeneno", tipoVeneno);
        nuevoAnfibio.append("precauciones", precauciones);
        anfibios.put(nuevoAnfibio);
        infoJson.getJSONArray("animales_anfibios").put(nuevoAnfibio);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
        CrearAnimal crear = new CrearAnimal();
        return crear.crearAnfibio(codigo, nombre, especie, genero, habitad, zona, procedencia, dietaPrincipal, dietaCompleta, temperaturaHabitad, riesgoExtincion, tipoReproduccion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, precauciones);
    }

    public AnimalesAvesAcuaticas crearNuevaAveAcuatica(
            int codigo,
            String nombre,
            String especie,
            String genero,
            int edad,
            float peso,
            String dietaPrincipal,
            String dietaCompleta[],
            String envergadura,
            boolean vuela,
            String tipoPico,
            String colorPlumaje,
            String habitad,
            String zona,
            String procedencia,
            String tempHabitad,
            String tiempoBuceo,
            String riesgoExtincion,
            boolean gestacion,
            String tipoGestacion,
            String tiempoGestacion,
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            boolean maltratado,
            String comportamientoSocial,
            String caracter,
            String[] precauciones
    ) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray avesAcuaticas = readJson.AnimalesAvesAcuaticasJSON();
        JSONObject nuevaAveAcuatica = new JSONObject();
        nuevaAveAcuatica.append("codigo", codigo);
        nuevaAveAcuatica.append("nombre", nombre);
        nuevaAveAcuatica.append("especie", especie);
        nuevaAveAcuatica.append("genero", genero);
        nuevaAveAcuatica.append("edad", edad);
        nuevaAveAcuatica.append("peso", peso);
        nuevaAveAcuatica.append("dietaPrincipal", dietaPrincipal);
        nuevaAveAcuatica.append("dietaCompleta", dietaCompleta);
        nuevaAveAcuatica.append("envergadura", envergadura);
        nuevaAveAcuatica.append("vuela", vuela);
        nuevaAveAcuatica.append("tipoPico", tipoPico);
        nuevaAveAcuatica.append("colorPlumaje", colorPlumaje);
        nuevaAveAcuatica.append("habitad", habitad);
        nuevaAveAcuatica.append("zona", zona);
        nuevaAveAcuatica.append("procedencia", procedencia);
        nuevaAveAcuatica.append("tempHabitad", tempHabitad);
        nuevaAveAcuatica.append("riesgoExtincion", riesgoExtincion);
        nuevaAveAcuatica.append("gestacion", gestacion);
        nuevaAveAcuatica.append("tipoGestacion", tipoGestacion);
        nuevaAveAcuatica.append("tiempoGestacion", tiempoGestacion);
        nuevaAveAcuatica.append("peligroso", peligroso);
        nuevaAveAcuatica.append("nivelPeligrosidad", nivelPeligrosidad);
        nuevaAveAcuatica.append("venenoso", venenoso);
        nuevaAveAcuatica.append("tipoVeneno", tipoVeneno);
        nuevaAveAcuatica.append("maltratado", maltratado);
        nuevaAveAcuatica.append("comportamientoSocial", comportamientoSocial);
        nuevaAveAcuatica.append("caracter", caracter);
        nuevaAveAcuatica.append("precauciones", precauciones);
        avesAcuaticas.put(nuevaAveAcuatica);
        infoJson.getJSONArray("animales_aves_acuaticas").put(nuevaAveAcuatica);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
        CrearAnimal crear = new CrearAnimal();
        return crear.crearAveAcuatica(codigo, nombre, especie, genero, edad, peso, dietaPrincipal, dietaCompleta, envergadura, vuela, tipoPico, colorPlumaje, habitad, zona, procedencia, tempHabitad, tiempoBuceo, riesgoExtincion, gestacion, tipoGestacion, tiempoGestacion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones);
    }

    public AnimalesAvesCarroñaRapiña crearNuevaAveCarroñaRapiña(
            int codigo,
            String nombre,
            String especie,
            String genero,
            int edad,
            float peso,
            String dietaPrincipal,
            String dietaCompleta[],
            String envergadura,
            boolean vuela,
            String tipoPico,
            String colorPlumaje,
            String habitad,
            String zona,
            String procedencia,
            String riesgoExtincion,
            boolean gestacion,
            String tipoGestacion,
            String tiempoGestacion,
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            boolean maltratado,
            String comportamientoSocial,
            String caracter,
            String[] precauciones,
            String[] especiesCompatibles
    ) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray avesCarroñaRapiña = readJson.AnimalesAvesCarroñaRapiñaJSON();
        JSONObject nuevaAveCarroñaRapiña = new JSONObject();
        nuevaAveCarroñaRapiña.append("codigo", codigo);
        nuevaAveCarroñaRapiña.append("nombre", nombre);
        nuevaAveCarroñaRapiña.append("especie", especie);
        nuevaAveCarroñaRapiña.append("genero", genero);
        nuevaAveCarroñaRapiña.append("edad", edad);
        nuevaAveCarroñaRapiña.append("peso", peso);
        nuevaAveCarroñaRapiña.append("dietaPrincipal", dietaPrincipal);
        nuevaAveCarroñaRapiña.append("dietaCompleta", dietaCompleta);
        nuevaAveCarroñaRapiña.append("envergadura", envergadura);
        nuevaAveCarroñaRapiña.append("vuela", vuela);
        nuevaAveCarroñaRapiña.append("tipoPico", tipoPico);
        nuevaAveCarroñaRapiña.append("colorPlumaje", colorPlumaje);
        nuevaAveCarroñaRapiña.append("habitad", habitad);
        nuevaAveCarroñaRapiña.append("zona", zona);
        nuevaAveCarroñaRapiña.append("procedencia", procedencia);
        nuevaAveCarroñaRapiña.append("riesgoExtincion", riesgoExtincion);
        nuevaAveCarroñaRapiña.append("gestacion", gestacion);
        nuevaAveCarroñaRapiña.append("tipoGestacion", tipoGestacion);
        nuevaAveCarroñaRapiña.append("tiempoGestacion", tiempoGestacion);
        nuevaAveCarroñaRapiña.append("peligroso", peligroso);
        nuevaAveCarroñaRapiña.append("nivelPeligrosidad", nivelPeligrosidad);
        nuevaAveCarroñaRapiña.append("venenoso", venenoso);
        nuevaAveCarroñaRapiña.append("tipoVeneno", tipoVeneno);
        nuevaAveCarroñaRapiña.append("maltratado", maltratado);
        nuevaAveCarroñaRapiña.append("comportamientoSocial", comportamientoSocial);
        nuevaAveCarroñaRapiña.append("caracter", caracter);
        nuevaAveCarroñaRapiña.append("precauciones", precauciones);
        nuevaAveCarroñaRapiña.append("especiesCompatibles", especiesCompatibles);
        avesCarroñaRapiña.put(nuevaAveCarroñaRapiña);
        infoJson.getJSONArray("animales_aves_carroña_rapiña").put(nuevaAveCarroñaRapiña);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
        CrearAnimal crear = new CrearAnimal();
        return crear.crearAveCarroñaRapiña(codigo, nombre, especie, genero, edad, peso, dietaPrincipal, dietaCompleta, envergadura, vuela, tipoPico, colorPlumaje, habitad, zona, procedencia, riesgoExtincion, gestacion, tipoGestacion, tiempoGestacion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones, especiesCompatibles);
    }

    public AnimalesAvesExoticas crearNuevaAveExotica(
            int codigo,
            String nombre,
            String especie,
            String genero,
            int edad,
            float peso,
            String dietaPrincipal,
            String dietaCompleta[],
            String envergadura,
            boolean vuela,
            String tipoPico,
            String colorPlumaje,
            String habitad,
            String zona,
            String procedencia,
            String riesgoExtincion,
            boolean gestacion,
            String tipoGestacion,
            String tiempoGestacion,
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            boolean maltratado,
            String comportamientoSocial,
            String caracter,
            String[] precauciones,
            String[] especiesCompatibles
    ) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray avesExoticas = readJson.AnimalesAvesExoticasJSON();
        JSONObject nuevaAveExotica = new JSONObject();
        nuevaAveExotica.append("codigo", codigo);
        nuevaAveExotica.append("nombre", nombre);
        nuevaAveExotica.append("especie", especie);
        nuevaAveExotica.append("genero", genero);
        nuevaAveExotica.append("edad", edad);
        nuevaAveExotica.append("peso", peso);
        nuevaAveExotica.append("dietaPrincipal", dietaPrincipal);
        nuevaAveExotica.append("dietaCompleta", dietaCompleta);
        nuevaAveExotica.append("envergadura", envergadura);
        nuevaAveExotica.append("vuela", vuela);
        nuevaAveExotica.append("tipoPico", tipoPico);
        nuevaAveExotica.append("colorPlumaje", colorPlumaje);
        nuevaAveExotica.append("habitad", habitad);
        nuevaAveExotica.append("zona", zona);
        nuevaAveExotica.append("procedencia", procedencia);
        nuevaAveExotica.append("riesgoExtincion", riesgoExtincion);
        nuevaAveExotica.append("gestacion", gestacion);
        nuevaAveExotica.append("tipoGestacion", tipoGestacion);
        nuevaAveExotica.append("tiempoGestacion", tiempoGestacion);
        nuevaAveExotica.append("peligroso", peligroso);
        nuevaAveExotica.append("nivelPeligrosidad", nivelPeligrosidad);
        nuevaAveExotica.append("venenoso", venenoso);
        nuevaAveExotica.append("tipoVeneno", tipoVeneno);
        nuevaAveExotica.append("maltratado", maltratado);
        nuevaAveExotica.append("comportamientoSocial", comportamientoSocial);
        nuevaAveExotica.append("caracter", caracter);
        nuevaAveExotica.append("precauciones", precauciones);
        nuevaAveExotica.append("especiesCompatibles", especiesCompatibles);
        avesExoticas.put(nuevaAveExotica);
        infoJson.getJSONArray("animales_aves_exoticas").put(nuevaAveExotica);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
        CrearAnimal crear = new CrearAnimal();
        return crear.crearAveExotica(codigo, nombre, especie, genero, edad, peso, dietaPrincipal, dietaCompleta, envergadura, vuela, tipoPico, colorPlumaje, habitad, zona, procedencia, riesgoExtincion, gestacion, tipoGestacion, tiempoGestacion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones, especiesCompatibles);
    }

    public AnimalesAvesTerrestres crearNuevaAveTerrestre(
            int codigo,
            String nombre,
            String especie,
            String genero,
            int edad,
            float peso,
            String dietaPrincipal,
            String dietaCompleta[],
            String envergadura,
            boolean vuela,
            String tipoPico,
            String colorPlumaje,
            String habitad,
            String zona,
            String procedencia,
            String riesgoExtincion,
            boolean gestacion,
            String tipoGestacion,
            String tiempoGestacion,
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            boolean maltratado,
            String comportamientoSocial,
            String caracter,
            String[] precauciones,
            boolean aveDeCorral
    ) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray avesTerrestres = readJson.AnimalesAvesTerrestresJSON();
        JSONObject nuevaAveTerrestre = new JSONObject();
        nuevaAveTerrestre.append("codigo", codigo);
        nuevaAveTerrestre.append("nombre", nombre);
        nuevaAveTerrestre.append("especie", especie);
        nuevaAveTerrestre.append("genero", genero);
        nuevaAveTerrestre.append("edad", edad);
        nuevaAveTerrestre.append("peso", peso);
        nuevaAveTerrestre.append("dietaPrincipal", dietaPrincipal);
        nuevaAveTerrestre.append("dietaCompleta", dietaCompleta);
        nuevaAveTerrestre.append("envergadura", envergadura);
        nuevaAveTerrestre.append("vuela", vuela);
        nuevaAveTerrestre.append("tipoPico", tipoPico);
        nuevaAveTerrestre.append("colorPlumaje", colorPlumaje);
        nuevaAveTerrestre.append("habitad", habitad);
        nuevaAveTerrestre.append("zona", zona);
        nuevaAveTerrestre.append("procedencia", procedencia);
        nuevaAveTerrestre.append("riesgoExtincion", riesgoExtincion);
        nuevaAveTerrestre.append("gestacion", gestacion);
        nuevaAveTerrestre.append("tipoGestacion", tipoGestacion);
        nuevaAveTerrestre.append("tiempoGestacion", tiempoGestacion);
        nuevaAveTerrestre.append("peligroso", peligroso);
        nuevaAveTerrestre.append("nivelPeligrosidad", nivelPeligrosidad);
        nuevaAveTerrestre.append("venenoso", venenoso);
        nuevaAveTerrestre.append("tipoVeneno", tipoVeneno);
        nuevaAveTerrestre.append("maltratado", maltratado);
        nuevaAveTerrestre.append("comportamientoSocial", comportamientoSocial);
        nuevaAveTerrestre.append("caracter", caracter);
        nuevaAveTerrestre.append("precauciones", precauciones);
        nuevaAveTerrestre.append("aveDeCorral", aveDeCorral);
        avesTerrestres.put(nuevaAveTerrestre);
        infoJson.getJSONArray("animales_aves_terrestres").put(nuevaAveTerrestre);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
        CrearAnimal crear = new CrearAnimal();
        return crear.crearAveTerrestre(codigo, nombre, especie, genero, edad, peso, dietaPrincipal, dietaCompleta, envergadura, vuela, tipoPico, colorPlumaje, habitad, zona, procedencia, riesgoExtincion, gestacion, tipoGestacion, tiempoGestacion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones, aveDeCorral);
    }

    public AnimalesInsectos crearNuevosInsectos(
            int codigo,
            String nombre,
            String especie,
            boolean metamorfosis,
            String habitad,
            String zona,
            String procedencia,
            int cantidad,
            int paresPatas,
            int paresAlas,
            String riesgoExtincion,
            String dietaPrincipal,
            String dietaCompleta[],
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            String[] precauciones
    ) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray insectos = readJson.AnimalesInsectosJSON();
        JSONObject nuevoInsecto = new JSONObject();
        nuevoInsecto.append("codigo", codigo);
        nuevoInsecto.append("nombre", nombre);
        nuevoInsecto.append("especie", especie);
        nuevoInsecto.append("metamorfosis", metamorfosis);
        nuevoInsecto.append("habitad", habitad);
        nuevoInsecto.append("zona", zona);
        nuevoInsecto.append("procedencia", procedencia);
        nuevoInsecto.append("cantidad", cantidad);
        nuevoInsecto.append("paresPatas", paresPatas);
        nuevoInsecto.append("paresAlas", paresAlas);
        nuevoInsecto.append("riesgoExtincion", riesgoExtincion);
        nuevoInsecto.append("dietaPrincipal", dietaPrincipal);
        nuevoInsecto.append("dietaCompleta", dietaCompleta);
        nuevoInsecto.append("peligroso", peligroso);
        nuevoInsecto.append("nivelPeligrosidad", nivelPeligrosidad);
        nuevoInsecto.append("venenoso", venenoso);
        nuevoInsecto.append("tipoVeneno", tipoVeneno);
        nuevoInsecto.append("precauciones", precauciones);
        insectos.put(nuevoInsecto);
        infoJson.getJSONArray("animales_insectos").put(nuevoInsecto);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
        CrearAnimal crear = new CrearAnimal();
        return crear.crearInsectos(codigo, nombre, especie, metamorfosis, habitad, zona, procedencia, cantidad, paresPatas, paresAlas, riesgoExtincion, dietaPrincipal, dietaCompleta, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, precauciones);
    }

    public AnimalesMamiferosAcuaticos crearNuevoMamiferoAcuatico(
            int codigo,
            String nombre,
            String especie,
            String genero,
            float peso,
            String dietaPrincipal,
            String dietaCompleta[],
            int edad,
            String tiempoBuceo,
            String mecanismoRespiracion,
            int numAletas,
            String habitad,
            String zona,
            String procedencia,
            String riesgoExtincion,
            boolean gestacion,
            String tipoGestacion,
            String tiempoGestacion,
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            boolean maltratado,
            String comportamientoSocial,
            String caracter,
            String[] precauciones,
            String[] especiesCompatibles
    ) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray mamiferosAcuaticos = readJson.AnimalesMamiferosAcuaticosJSON();
        JSONObject nuevoMamiferoAcuatico = new JSONObject();
        nuevoMamiferoAcuatico.append("codigo", codigo);
        nuevoMamiferoAcuatico.append("nombre", nombre);
        nuevoMamiferoAcuatico.append("especie", especie);
        nuevoMamiferoAcuatico.append("genero", genero);
        nuevoMamiferoAcuatico.append("peso", peso);
        nuevoMamiferoAcuatico.append("dietaPrincipal", dietaPrincipal);
        nuevoMamiferoAcuatico.append("dietaCompleta", dietaCompleta);
        nuevoMamiferoAcuatico.append("edad", edad);
        nuevoMamiferoAcuatico.append("tiempoBuceo", tiempoBuceo);
        nuevoMamiferoAcuatico.append("mecanismoRespiracion", mecanismoRespiracion);
        nuevoMamiferoAcuatico.append("numAletas", numAletas);
        nuevoMamiferoAcuatico.append("habitad", habitad);
        nuevoMamiferoAcuatico.append("zona", zona);
        nuevoMamiferoAcuatico.append("procedencia", procedencia);
        nuevoMamiferoAcuatico.append("riesgoExtincion", riesgoExtincion);
        nuevoMamiferoAcuatico.append("gestacion", gestacion);
        nuevoMamiferoAcuatico.append("tipoGestacion", tipoGestacion);
        nuevoMamiferoAcuatico.append("tiempoGestacion", tiempoGestacion);
        nuevoMamiferoAcuatico.append("peligroso", peligroso);
        nuevoMamiferoAcuatico.append("nivelPeligrosidad", nivelPeligrosidad);
        nuevoMamiferoAcuatico.append("venenoso", venenoso);
        nuevoMamiferoAcuatico.append("tipoVeneno", tipoVeneno);
        nuevoMamiferoAcuatico.append("maltratado", maltratado);
        nuevoMamiferoAcuatico.append("comportamientoSocial", comportamientoSocial);
        nuevoMamiferoAcuatico.append("caracter", caracter);
        nuevoMamiferoAcuatico.append("precauciones", precauciones);
        nuevoMamiferoAcuatico.append("especiesCompatibles", especiesCompatibles);
        mamiferosAcuaticos.put(nuevoMamiferoAcuatico);
        infoJson.getJSONArray("animales_mamiferos_acuaticos").put(nuevoMamiferoAcuatico);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
        CrearAnimal crear = new CrearAnimal();
        return crear.crearMamiferoAcuatico(codigo, nombre, especie, genero, peso, dietaPrincipal, dietaCompleta, edad, tiempoBuceo, mecanismoRespiracion, numAletas, habitad, zona, procedencia, riesgoExtincion, gestacion, tipoGestacion, tiempoGestacion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones, especiesCompatibles);
    }

    public AnimalesMamiferosTerrestres crearNuevoMamiferoTerrestre(
            int codigo,
            String nombre,
            String especie,
            String genero,
            float peso,
            String dietaPrincipal,
            String dietaCompleta[],
            int edad,
            int numPatas,
            String habitad,
            String zona,
            String procedencia,
            String riesgoExtincion,
            boolean gestacion,
            String tipoGestacion,
            String tiempoGestacion,
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            boolean maltratado,
            String comportamientoSocial,
            String caracter,
            String comportamiento,
            String[] precauciones
    ) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray mamiferosTerrestres = readJson.AnimalesMamiferosTerrestresJSON();
        JSONObject nuevoMamiferoTerrestre = new JSONObject();
        nuevoMamiferoTerrestre.append("codigo", codigo);
        nuevoMamiferoTerrestre.append("nombre", nombre);
        nuevoMamiferoTerrestre.append("especie", especie);
        nuevoMamiferoTerrestre.append("genero", genero);
        nuevoMamiferoTerrestre.append("peso", peso);
        nuevoMamiferoTerrestre.append("dietaPrincipal", dietaPrincipal);
        nuevoMamiferoTerrestre.append("dietaCompleta", dietaCompleta);
        nuevoMamiferoTerrestre.append("edad", edad);
        nuevoMamiferoTerrestre.append("numPatas", numPatas);
        nuevoMamiferoTerrestre.append("habitad", habitad);
        nuevoMamiferoTerrestre.append("zona", zona);
        nuevoMamiferoTerrestre.append("procedencia", procedencia);
        nuevoMamiferoTerrestre.append("riesgoExtincion", riesgoExtincion);
        nuevoMamiferoTerrestre.append("gestacion", gestacion);
        nuevoMamiferoTerrestre.append("tipoGestacion", tipoGestacion);
        nuevoMamiferoTerrestre.append("tiempoGestacion", tiempoGestacion);
        nuevoMamiferoTerrestre.append("peligroso", peligroso);
        nuevoMamiferoTerrestre.append("nivelPeligrosidad", nivelPeligrosidad);
        nuevoMamiferoTerrestre.append("venenoso", venenoso);
        nuevoMamiferoTerrestre.append("tipoVeneno", tipoVeneno);
        nuevoMamiferoTerrestre.append("maltratado", maltratado);
        nuevoMamiferoTerrestre.append("comportamientoSocial", comportamientoSocial);
        nuevoMamiferoTerrestre.append("caracter", caracter);
        nuevoMamiferoTerrestre.append("comportamiento", comportamiento);
        nuevoMamiferoTerrestre.append("precauciones", precauciones);
        mamiferosTerrestres.put(nuevoMamiferoTerrestre);
        infoJson.getJSONArray("animales_mamiferos_terrestres").put(nuevoMamiferoTerrestre);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
        CrearAnimal crear = new CrearAnimal();
        return crear.crearMamiferoTerrestre(codigo, nombre, especie, genero, peso, dietaPrincipal, dietaCompleta, edad, numPatas, habitad, zona, procedencia, riesgoExtincion, gestacion, tipoGestacion, tiempoGestacion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, comportamiento, precauciones);
    }

    public AnimalesPeces crearNuevosPeces(
            int codigo,
            String nombre,
            String especie,
            String genero,
            String coloracion,
            String tipoAgua,
            String tempAcuario,
            String dietaPrincipal,
            String dietaCompleta[],
            String habitad,
            String zona,
            String procedencia,
            int cantidad,
            String riesgoExtincion,
            String reproduccion,
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            String[] precauciones,
            String[] especiesCompatibles
    ) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray peces = readJson.AnimalesPecesJSON();
        JSONObject nuevoPez = new JSONObject();
        nuevoPez.append("codigo", codigo);
        nuevoPez.append("nombre", nombre);
        nuevoPez.append("especie", especie);
        nuevoPez.append("genero", genero);
        nuevoPez.append("coloracion", coloracion);
        nuevoPez.append("tipoAgua", tipoAgua);
        nuevoPez.append("tempAcuario", tempAcuario);
        nuevoPez.append("dietaPrincipal", dietaPrincipal);
        nuevoPez.append("dietaCompleta", dietaCompleta);
        nuevoPez.append("habitad", habitad);
        nuevoPez.append("zona", zona);
        nuevoPez.append("procedencia", procedencia);
        nuevoPez.append("cantidad", cantidad);
        nuevoPez.append("riesgoExtincion", riesgoExtincion);
        nuevoPez.append("reproduccion", reproduccion);
        nuevoPez.append("peligroso", peligroso);
        nuevoPez.append("nivelPeligrosidad", nivelPeligrosidad);
        nuevoPez.append("venenoso", venenoso);
        nuevoPez.append("tipoVeneno", tipoVeneno);
        nuevoPez.append("precauciones", precauciones);
        nuevoPez.append("especiesCompatibles", especiesCompatibles);
        peces.put(nuevoPez);
        infoJson.getJSONArray("animales_peces").put(nuevoPez);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
        CrearAnimal crear = new CrearAnimal();
        return crear.crearPeces(codigo, nombre, especie, genero, coloracion, tipoAgua, tempAcuario, dietaPrincipal, dietaCompleta, habitad, zona, procedencia, cantidad, riesgoExtincion, reproduccion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, precauciones, especiesCompatibles);
    }

    public AnimalesReptilesAcuaticos crearNuevoReptilAcuatico(
            int codigo,
            String nombre,
            String especie,
            String genero,
            float peso,
            int edad,
            String dietaPrincipal,
            String dietaCompleta[],
            String tipoPiel,
            String coloracion,
            String metodoRespiracion,
            int numAletas,
            String habitad,
            String zona,
            String procedencia,
            String riesgoExtincion,
            boolean gestacion,
            String tipoGestacion,
            String tiempoGestacion,
            String tempEncubacion,
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            boolean maltratado,
            String comportamientoSocial,
            String caracter,
            String[] precauciones
    ) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray reptilesAcuaticos = readJson.AnimalesMamiferosAcuaticosJSON();
        JSONObject nuevoReptilAcuatico = new JSONObject();
        nuevoReptilAcuatico.append("codigo", codigo);
        nuevoReptilAcuatico.append("nombre", nombre);
        nuevoReptilAcuatico.append("especie", especie);
        nuevoReptilAcuatico.append("genero", genero);
        nuevoReptilAcuatico.append("peso", peso);
        nuevoReptilAcuatico.append("edad", edad);
        nuevoReptilAcuatico.append("dietaPrincipal", dietaPrincipal);
        nuevoReptilAcuatico.append("dietaCompleta", dietaCompleta);
        nuevoReptilAcuatico.append("tipoPiel", tipoPiel);
        nuevoReptilAcuatico.append("coloracion", coloracion);
        nuevoReptilAcuatico.append("metodoRespiracion", metodoRespiracion);
        nuevoReptilAcuatico.append("numAletas", numAletas);
        nuevoReptilAcuatico.append("habitad", habitad);
        nuevoReptilAcuatico.append("zona", zona);
        nuevoReptilAcuatico.append("procedencia", procedencia);
        nuevoReptilAcuatico.append("riesgoExtincion", riesgoExtincion);
        nuevoReptilAcuatico.append("gestacion", gestacion);
        nuevoReptilAcuatico.append("tipoGestacion", tipoGestacion);
        nuevoReptilAcuatico.append("tiempoGestacion", tiempoGestacion);
        nuevoReptilAcuatico.append("tempEncubacion", tempEncubacion);
        nuevoReptilAcuatico.append("peligroso", peligroso);
        nuevoReptilAcuatico.append("nivelPeligrosidad", nivelPeligrosidad);
        nuevoReptilAcuatico.append("venenoso", venenoso);
        nuevoReptilAcuatico.append("tipoVeneno", tipoVeneno);
        nuevoReptilAcuatico.append("maltratado", maltratado);
        nuevoReptilAcuatico.append("comportamientoSocial", comportamientoSocial);
        nuevoReptilAcuatico.append("caracter", caracter);
        nuevoReptilAcuatico.append("precauciones", precauciones);
        reptilesAcuaticos.put(nuevoReptilAcuatico);
        infoJson.getJSONArray("animales_peces").put(nuevoReptilAcuatico);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
        CrearAnimal crear = new CrearAnimal();
        return crear.crearReptilesAcuaticos(codigo, nombre, especie, genero, peso, edad, dietaPrincipal, dietaCompleta, tipoPiel, coloracion, metodoRespiracion, numAletas, habitad, zona, procedencia, riesgoExtincion, gestacion, tipoGestacion, tiempoGestacion, tempEncubacion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones);
    }

    public AnimalesReptilesTerrestres crearNuevoReptilTerrestre(
            int codigo,
            String nombre,
            String especie,
            String genero,
            float peso,
            int edad,
            String dietaPrincipal,
            String dietaCompleta[],
            String tipoPiel,
            String coloracion,
            int numPatas,
            String habitad,
            String zona,
            String procedencia,
            String riesgoExtincion,
            boolean gestacion,
            String tipoGestacion,
            String tiempoGestacion,
            String tempEncubacion,
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            boolean maltratado,
            String comportamientoSocial,
            String caracter,
            String[] precauciones
    ) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray reptilesTerrestres = readJson.AnimalesReptilesTerrestresJSON();
        JSONObject nuevoReptilTerrestre = new JSONObject();
        nuevoReptilTerrestre.append("codigo", codigo);
        nuevoReptilTerrestre.append("nombre", nombre);
        nuevoReptilTerrestre.append("especie", especie);
        nuevoReptilTerrestre.append("genero", genero);
        nuevoReptilTerrestre.append("peso", peso);
        nuevoReptilTerrestre.append("edad", edad);
        nuevoReptilTerrestre.append("dietaPrincipal", dietaPrincipal);
        nuevoReptilTerrestre.append("dietaCompleta", dietaCompleta);
        nuevoReptilTerrestre.append("tipoPiel", tipoPiel);
        nuevoReptilTerrestre.append("coloracion", coloracion);
        nuevoReptilTerrestre.append("numPatas", numPatas);
        nuevoReptilTerrestre.append("habitad", habitad);
        nuevoReptilTerrestre.append("zona", zona);
        nuevoReptilTerrestre.append("procedencia", procedencia);
        nuevoReptilTerrestre.append("riesgoExtincion", riesgoExtincion);
        nuevoReptilTerrestre.append("gestacion", gestacion);
        nuevoReptilTerrestre.append("tipoGestacion", tipoGestacion);
        nuevoReptilTerrestre.append("tiempoGestacion", tiempoGestacion);
        nuevoReptilTerrestre.append("tempEncubacion", tempEncubacion);
        nuevoReptilTerrestre.append("peligroso", peligroso);
        nuevoReptilTerrestre.append("nivelPeligrosidad", nivelPeligrosidad);
        nuevoReptilTerrestre.append("venenoso", venenoso);
        nuevoReptilTerrestre.append("tipoVeneno", tipoVeneno);
        nuevoReptilTerrestre.append("maltratado", maltratado);
        nuevoReptilTerrestre.append("comportamientoSocial", comportamientoSocial);
        nuevoReptilTerrestre.append("caracter", caracter);
        nuevoReptilTerrestre.append("precauciones", precauciones);
        reptilesTerrestres.put(nuevoReptilTerrestre);
        infoJson.getJSONArray("animales_peces").put(nuevoReptilTerrestre);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
        CrearAnimal crear = new CrearAnimal();
        return crear.crearReptilesTerrestres(codigo, nombre, especie, genero, peso, edad, dietaPrincipal, dietaCompleta, tipoPiel, coloracion, numPatas, habitad, zona, procedencia, riesgoExtincion, gestacion, tipoGestacion, tiempoGestacion, tempEncubacion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones);
    }
}
