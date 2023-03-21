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
public abstract class AnimalesAves extends Animales{
    private String 
            nivelPeligrosidad, 
            envergadura, 
            tipoPico, 
            colorPlumaje, 
            tipoVeneno, 
            tipoGestacion, 
            tiempoGestacion,
            precauciones[],
            comportamientoSocial,
            caracter;
    private boolean vuela;
    
    public AnimalesAves(
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
                ubicacion.getZona(),
                reproduccion.isGestacion(),
                dieta.getDietaPrincipal(), 
                dieta.getDieta(),
                peligrosidad.isPeligroso(), 
                peligrosidad.isVenenoso(),
                peligrosidad.isMaltratado(),
                ubicacion.getProcedencia()
        );
        if (peligrosidad.isPeligroso()){
            this.nivelPeligrosidad = peligrosidad.getNivelPeligrosidad();
            this.precauciones = peligrosidad.getPrecauciones();
        }
        if(reproduccion.isGestacion()){
            this.tipoGestacion = reproduccion.getTipoGestacion();
            this.tiempoGestacion = reproduccion.getTiempoGestacion();
        }
        this.envergadura = morfologia.getEnvergadura();
        this.tipoPico = morfologia.getTipoPico();
        this.colorPlumaje = morfologia.getColorPlumaje();
        if(peligrosidad.isVenenoso()){
            this.tipoVeneno = peligrosidad.getTipoVeneno();
        }
        if(peligrosidad.isMaltratado()){
            this.comportamientoSocial = peligrosidad.getComportamientoSocial();
            this.caracter = peligrosidad.getCaracter();
        }
        this.vuela = morfologia.isVuela();
    }
}
