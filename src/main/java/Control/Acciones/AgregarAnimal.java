/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.Acciones;

import Animales.*;
import Animales.AnimalesAnfibios;
import Animales.Caracteristicas.CaracteristicasEspecie;
import Animales.Caracteristicas.Dieta;
import Animales.Caracteristicas.Peligrosidad;
import Animales.Caracteristicas.Reproduccion;
import Animales.Caracteristicas.Ubicacion;

/**
 *
 * @author Alisser
 */
public class AgregarAnimal {

    public AnimalesAnfibios crearAnfibio(
            int codigo,
            String nombre,
            String especie,
            String genero,
            String riesgoExtincion,
            String temperaturaHabitad,
            String habitad,
            String zona,
            String tipoReproduccion,
            String dietaPrincipal,
            String dietaCompleta[],
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            String precauciones[]
    ) {
        CaracteristicasEspecie caracteristicas = new CaracteristicasEspecie(nombre, especie, genero, riesgoExtincion, temperaturaHabitad);
        Ubicacion ubicacion = new Ubicacion(habitad, zona);
        Reproduccion reproduccion = new Reproduccion(tipoReproduccion);
        Dieta dieta = new Dieta(dietaPrincipal, dietaCompleta);
        Peligrosidad peligrosidad = new Peligrosidad(peligroso, nivelPeligrosidad, venenoso, tipoVeneno, precauciones);
        AnimalesAnfibios anfibio = new AnimalesAnfibios(codigo, caracteristicas, ubicacion, reproduccion, dieta, peligrosidad);
        Animales.animales.add(anfibio);
        Animales.animalesAnfibios.add(anfibio);
        Animales.cantAnimales += 1;
        Animales.cantAnimalesAnfibios += 1;
        return anfibio;
    }

    public AnimalesAvesAcuaticas crearAveAcuatica(
            int codigo,
            String nombre,
            String especie,
            String genero,
            float peso,
            String envergadura,
            int edad,
            boolean vuela,
            String tipoPico,
            String colorPlumaje,
            String riesgoExtincion,
            String habitad,
            String zona,
            boolean gestacion,
            String tipoGestacion,
            String tiempoGestacion,
            String dietaPrincipal,
            String dietaCompleta[],
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            boolean maltratado,
            String comportamientoSocial,
            String caracter,
            String[] precauciones,
            String tempHabitad,
            String tiempoBuceo
    ) {
        CaracteristicasEspecie caracteristicas = new CaracteristicasEspecie(nombre, especie, genero, peso, envergadura, edad, vuela, tipoPico, colorPlumaje, riesgoExtincion);
        Ubicacion ubicacion = new Ubicacion(habitad, zona);
        Reproduccion reproduccion = new Reproduccion(gestacion, tipoGestacion, tiempoGestacion);
        Dieta dieta = new Dieta(dietaPrincipal, dietaCompleta);
        Peligrosidad peligrosidad = new Peligrosidad(peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones);
        AnimalesAvesAcuaticas aveAcuatica = new AnimalesAvesAcuaticas(codigo, caracteristicas, ubicacion, reproduccion, dieta, peligrosidad, tempHabitad, tiempoBuceo);
        Animales.animales.add(aveAcuatica);
        Animales.animalesAves.add(aveAcuatica);
        Animales.cantAnimales += 1;
        Animales.cantAnimalesAves += 1;
        return aveAcuatica;
    }

    public AnimalesAvesCarroñaRapiña crearAveCarroñaRapiña(
            int codigo,
            String nombre,
            String especie,
            String genero,
            float peso,
            String envergadura,
            int edad,
            boolean vuela,
            String tipoPico,
            String colorPlumaje,
            String riesgoExtincion,
            String habitad,
            String zona,
            boolean gestacion,
            String tipoGestacion,
            String tiempoGestacion,
            String dietaPrincipal,
            String dietaCompleta[],
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            boolean maltratado,
            String comportamientoSocial,
            String caracter,
            String[] precauciones,
            String[] especiesCompatibles
    ) {
        CaracteristicasEspecie caracteristicas = new CaracteristicasEspecie(nombre, especie, genero, peso, envergadura, edad, vuela, tipoPico, colorPlumaje, riesgoExtincion);
        Ubicacion ubicacion = new Ubicacion(habitad, zona);
        Reproduccion reproduccion = new Reproduccion(gestacion, tipoGestacion, tiempoGestacion);
        Dieta dieta = new Dieta(dietaPrincipal, dietaCompleta);
        Peligrosidad peligrosidad = new Peligrosidad(peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones);
        AnimalesAvesCarroñaRapiña aveCarroñaRapiña = new AnimalesAvesCarroñaRapiña(codigo, caracteristicas, ubicacion, reproduccion, dieta, peligrosidad, especiesCompatibles);
        Animales.animales.add(aveCarroñaRapiña);
        Animales.animalesAves.add(aveCarroñaRapiña);
        Animales.cantAnimales += 1;
        Animales.cantAnimalesAves += 1;
        return aveCarroñaRapiña;
    }

    public AnimalesAvesExoticas crearAveExotica(
            int codigo,
            String nombre,
            String especie,
            String genero,
            float peso,
            String envergadura,
            int edad,
            boolean vuela,
            String tipoPico,
            String colorPlumaje,
            String riesgoExtincion,
            String habitad,
            String zona,
            boolean gestacion,
            String tipoGestacion,
            String tiempoGestacion,
            String dietaPrincipal,
            String dietaCompleta[],
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            boolean maltratado,
            String comportamientoSocial,
            String caracter,
            String[] precauciones,
            String origen,
            String[] especiesCompatibles
    ) {
        CaracteristicasEspecie caracteristicas = new CaracteristicasEspecie(nombre, especie, genero, peso, envergadura, edad, vuela, tipoPico, colorPlumaje, riesgoExtincion);
        Ubicacion ubicacion = new Ubicacion(habitad, zona);
        Reproduccion reproduccion = new Reproduccion(gestacion, tipoGestacion, tiempoGestacion);
        Dieta dieta = new Dieta(dietaPrincipal, dietaCompleta);
        Peligrosidad peligrosidad = new Peligrosidad(peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones);
        AnimalesAvesExoticas aveExotica = new AnimalesAvesExoticas(codigo, caracteristicas, ubicacion, reproduccion, dieta, peligrosidad, origen, especiesCompatibles);
        Animales.animales.add(aveExotica);
        Animales.animalesAves.add(aveExotica);
        Animales.cantAnimales += 1;
        Animales.cantAnimalesAves += 1;
        return aveExotica;
    }

    public AnimalesAvesTerrestres crearAveTerrestre(
            int codigo,
            String nombre,
            String especie,
            String genero,
            float peso,
            String envergadura,
            int edad,
            boolean vuela,
            String tipoPico,
            String colorPlumaje,
            String riesgoExtincion,
            String habitad,
            String zona,
            boolean gestacion,
            String tipoGestacion,
            String tiempoGestacion,
            String dietaPrincipal,
            String dietaCompleta[],
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            boolean maltratado,
            String comportamientoSocial,
            String caracter,
            String[] precauciones,
            boolean aveDeCorral
    ) {
        CaracteristicasEspecie caracteristicas = new CaracteristicasEspecie(nombre, especie, genero, peso, envergadura, edad, vuela, tipoPico, colorPlumaje, riesgoExtincion);
        Ubicacion ubicacion = new Ubicacion(habitad, zona);
        Reproduccion reproduccion = new Reproduccion(gestacion, tipoGestacion, tiempoGestacion);
        Dieta dieta = new Dieta(dietaPrincipal, dietaCompleta);
        Peligrosidad peligrosidad = new Peligrosidad(peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones);
        AnimalesAvesTerrestres aveTerrestre = new AnimalesAvesTerrestres(codigo, caracteristicas, ubicacion, reproduccion, dieta, peligrosidad, aveDeCorral);
        Animales.animales.add(aveTerrestre);
        Animales.animalesAves.add(aveTerrestre);
        Animales.cantAnimales += 1;
        Animales.cantAnimalesAves += 1;
        return aveTerrestre;
    }

    public AnimalesInsectos crearInsectos(
            int codigo,
            String nombre,
            String especie,
            int paresPatas,
            int paresAlas,
            boolean metamorfosis,
            String riesgoExtincion,
            String habitad,
            String zona,
            boolean gestacion,
            String tipoGestacion,
            String tiempoGestacion,
            String dietaPrincipal,
            String dietaCompleta[],
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            boolean maltratado,
            String comportamientoSocial,
            String caracter,
            String[] precauciones,
            int cantidad
    ) {
        CaracteristicasEspecie caracteristicas = new CaracteristicasEspecie(nombre, especie, metamorfosis, paresPatas, paresAlas, riesgoExtincion, cantidad);
        Ubicacion ubicacion = new Ubicacion(habitad, zona);
        Dieta dieta = new Dieta(dietaPrincipal, dietaCompleta);
        Peligrosidad peligrosidad = new Peligrosidad(peligroso, nivelPeligrosidad, venenoso, tipoVeneno, precauciones);
        AnimalesInsectos insecto = new AnimalesInsectos(codigo, caracteristicas, ubicacion, dieta, peligrosidad);
        Animales.animales.add(insecto);
        Animales.animalesInsectos.add(insecto);
        Animales.cantAnimales += 1;
        Animales.cantAnimalesInsectos += cantidad;
        return insecto;
    }

    public AnimalesMamiferosAcuaticos crearMamiferoAcuatico(
            int codigo,
            String nombre,
            String especie,
            String genero,
            float peso,
            int edad,
            String riesgoExtincion,
            String habitad,
            String zona,
            boolean gestacion,
            String tipoGestacion,
            String tiempoGestacion,
            String dietaPrincipal,
            String dietaCompleta[],
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            boolean maltratado,
            String comportamientoSocial,
            String caracter,
            String[] precauciones,
            String tiempoBuceo,
            int numAletas,
            String[] especiesCompatibles,
            String mecanismoRespiracion
    ) {
        CaracteristicasEspecie caracteristicas = new CaracteristicasEspecie(nombre, especie, genero, edad, peso, riesgoExtincion);
        Ubicacion ubicacion = new Ubicacion(habitad, zona);
        Reproduccion reproduccion = new Reproduccion(gestacion, tipoGestacion, tiempoGestacion);
        Dieta dieta = new Dieta(dietaPrincipal, dietaCompleta);
        Peligrosidad peligrosidad = new Peligrosidad(peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones);
        AnimalesMamiferosAcuaticos mamiferoAcuatico = new AnimalesMamiferosAcuaticos(codigo, caracteristicas, ubicacion, reproduccion, dieta, peligrosidad, numAletas, tiempoBuceo, especiesCompatibles, mecanismoRespiracion);
        Animales.animales.add(mamiferoAcuatico);
        Animales.animalesMamiferos.add(mamiferoAcuatico);
        Animales.cantAnimales += 1;
        Animales.cantAnimalesMamiferos += 1;
        return mamiferoAcuatico;
    }

    public AnimalesMamiferosTerrestres crearMamiferoTerrestre(
            int codigo,
            String nombre,
            String especie,
            String genero,
            float peso,
            int edad,
            String riesgoExtincion,
            String habitad,
            String zona,
            boolean gestacion,
            String tipoGestacion,
            String tiempoGestacion,
            String dietaPrincipal,
            String dietaCompleta[],
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            boolean maltratado,
            String comportamientoSocial,
            String caracter,
            String[] precauciones,
            String tiempoBuceo,
            int numPatas,
            String comportamiento
    ) {
        CaracteristicasEspecie caracteristicas = new CaracteristicasEspecie(nombre, especie, genero, edad, peso, riesgoExtincion);
        Ubicacion ubicacion = new Ubicacion(habitad, zona);
        Reproduccion reproduccion = new Reproduccion(gestacion, tipoGestacion, tiempoGestacion);
        Dieta dieta = new Dieta(dietaPrincipal, dietaCompleta);
        Peligrosidad peligrosidad = new Peligrosidad(peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones);
        AnimalesMamiferosTerrestres mamiferoTerrestre = new AnimalesMamiferosTerrestres(codigo, caracteristicas, ubicacion, reproduccion, dieta, peligrosidad, numPatas, comportamiento);
        Animales.animales.add(mamiferoTerrestre);
        Animales.animalesMamiferos.add(mamiferoTerrestre);
        Animales.cantAnimales += 1;
        Animales.cantAnimalesMamiferos += 1;
        return mamiferoTerrestre;
    }

    public AnimalesPeces crearPeces(
            int codigo,
            String nombre,
            String especie,
            String genero,
            String coloracion,
            String riesgoExtincion,
            String habitad,
            String zona,
            String reproduccion,
            String dietaPrincipal,
            String dietaCompleta[],
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            boolean maltratado,
            String comportamientoSocial,
            String caracter,
            String[] precauciones,
            String[] especiesCompatibles,
            int cantidad,
            String tipoAgua,
            String tempAcuario
    ) {
        CaracteristicasEspecie caracteristicas = new CaracteristicasEspecie(nombre, especie, genero, coloracion, riesgoExtincion, cantidad);
        Ubicacion ubicacion = new Ubicacion(habitad, zona);
        Reproduccion reprod = new Reproduccion(reproduccion);
        Dieta dieta = new Dieta(dietaPrincipal, dietaCompleta);
        Peligrosidad peligrosidad = new Peligrosidad(peligroso, nivelPeligrosidad, venenoso, tipoVeneno, especiesCompatibles, precauciones);
        AnimalesPeces pez = new AnimalesPeces(codigo, caracteristicas, ubicacion, tipoAgua, tempAcuario, reprod, dieta, peligrosidad);
        Animales.animales.add(pez);
        Animales.animalesPeces.add(pez);
        Animales.cantAnimales += 1;
        Animales.cantAnimalesPeces += cantidad;
        return pez;
    }

    public AnimalesReptilesAcuaticos crearReptilesAcuaticos(
            int codigo,
            String nombre,
            String especie,
            String genero,
            float peso,
            int edad,
            String tipoPiel,
            String coloracion,
            String riesgoExtincion,
            String habitad,
            String zona,
            boolean gestacion,
            String tipoGestacion,
            String tiempoGestacion,
            String dietaPrincipal,
            String dietaCompleta[],
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            boolean maltratado,
            String comportamientoSocial,
            String caracter,
            String[] precauciones,
            String tempEncubacion,
            String metodoRespiracion,
            int numAletas
    ) {
        CaracteristicasEspecie caracteristicas = new CaracteristicasEspecie(nombre, especie, genero, peso, edad, tipoPiel, coloracion, riesgoExtincion);
        Ubicacion ubicacion = new Ubicacion(habitad, zona);
        Reproduccion reproduccion = new Reproduccion(gestacion, tipoGestacion, tiempoGestacion, tempEncubacion);
        Dieta dieta = new Dieta(dietaPrincipal, dietaCompleta);
        Peligrosidad peligrosidad = new Peligrosidad(peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones);
        AnimalesReptilesAcuaticos reptilAcuatico = new AnimalesReptilesAcuaticos(codigo, caracteristicas, ubicacion, reproduccion, dieta, peligrosidad, metodoRespiracion, numAletas);
        Animales.animales.add(reptilAcuatico);
        Animales.animalesReptiles.add(reptilAcuatico);
        Animales.cantAnimales += 1;
        Animales.cantAnimalesReptiles += 1;
        return reptilAcuatico;
    }

    public AnimalesReptilesTerrestres crearReptilesTerrestres(
            int codigo,
            String nombre,
            String especie,
            String genero,
            float peso,
            int edad,
            String tipoPiel,
            String coloracion,
            String riesgoExtincion,
            String habitad,
            String zona,
            boolean gestacion,
            String tipoGestacion,
            String tiempoGestacion,
            String dietaPrincipal,
            String dietaCompleta[],
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            boolean maltratado,
            String comportamientoSocial,
            String caracter,
            String[] precauciones,
            String tempEncubacion,
            int numPatas
    ) {
        CaracteristicasEspecie caracteristicas = new CaracteristicasEspecie(nombre, especie, genero, peso, edad, tipoPiel, coloracion, riesgoExtincion);
        Ubicacion ubicacion = new Ubicacion(habitad, zona);
        Reproduccion reproduccion = new Reproduccion(gestacion, tipoGestacion, tiempoGestacion, tempEncubacion);
        Dieta dieta = new Dieta(dietaPrincipal, dietaCompleta);
        Peligrosidad peligrosidad = new Peligrosidad(peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones);
        AnimalesReptilesTerrestres reptilTerrestre = new AnimalesReptilesTerrestres(codigo, caracteristicas, ubicacion, reproduccion, dieta, peligrosidad, numPatas);
        Animales.animales.add(reptilTerrestre);
        Animales.animalesReptiles.add(reptilTerrestre);
        Animales.cantAnimales += 1;
        Animales.cantAnimalesReptiles += 1;
        return reptilTerrestre;
    }
}
