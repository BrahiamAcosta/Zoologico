/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

import Animales.Caracteristicas.Dieta;
import Animales.Caracteristicas.CaracteristicasEspecie;
import Animales.Caracteristicas.Peligrosidad;
import Animales.Caracteristicas.Reproduccion;
import Animales.Caracteristicas.Ubicacion;

/**
 *
 * @author Alisser
 */
public abstract class AnimalesReptiles extends Animales{
    private String 
            nivelPeligrosidad,
            tempEncubacion,
            tipoVeneno,
            tipoPiel,
            coloracion,
            reproduccion,
            tipoGestacion,
            tiempoGestacion,
            precauciones[],
            comportamientoSocial,
            caracter;
    
    public AnimalesReptiles(
        int codigo,  
        CaracteristicasEspecie morfologia,
        Ubicacion ubicacion,
        Reproduccion reproduccion,
        Dieta dieta,
        Peligrosidad peligrosidad
    ){
        super(
                codigo, 
                morfologia.getNombre(), 
                morfologia.getEspecie(), 
                morfologia.getRiesgoExtincion(),
                morfologia.getEdad(), 
                morfologia.getGenero(), 
                morfologia.getPeso(), 
                ubicacion.getHabitad(), 
                ubicacion.getUbicacion(),
                reproduccion.isGestacion(),
                dieta.getDietaPrincipal(), 
                dieta.getDieta(),
                peligrosidad.isPeligroso(), 
                peligrosidad.isVenenoso(),
                peligrosidad.isMaltratado()
        );
        if (peligrosidad.isPeligroso()){
            this.nivelPeligrosidad = peligrosidad.getNivelPeligrosidad();
            this.precauciones = peligrosidad.getPrecauciones();
        }
        this.coloracion = morfologia.getColoracion();
        this.reproduccion = reproduccion.getReproduccion();
        this.tempEncubacion = reproduccion.getTempEncubacion();
        if(reproduccion.isGestacion()){
            this.tipoGestacion = reproduccion.getTipoGestacion();
            this.tiempoGestacion = reproduccion.getTiempoGestacion();
        }
        if(peligrosidad.isMaltratado()){
            this.comportamientoSocial = peligrosidad.getComportamientoSocial();
            this.caracter = peligrosidad.getCaracter();
        }
        this.tipoPiel = tipoPiel;
        if(peligrosidad.isVenenoso()){
            this.tipoVeneno = peligrosidad.getTipoVeneno();
        }
    }
}
