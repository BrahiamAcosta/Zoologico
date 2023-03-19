/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

import Animales.Caracteristicas.Dieta;
import Animales.Caracteristicas.CaracteristicasEspecie;
import Animales.Caracteristicas.Peligrosidad;
import Animales.Caracteristicas.Ubicacion;

/**
 *
 * @author Alisser
 */
public class AnimalesInsectos extends Animales {
    private String nivelPeligrosidad, precauciones[], tipoVeneno;
    private boolean metaforfosis;
    private int paresPatas, paresAlas;
    
    public AnimalesInsectos(
        int codigo,
        CaracteristicasEspecie morfologia,
        Ubicacion ubicacion,
        Dieta dieta,
        Peligrosidad peligrosidad
    ){
        super(
                codigo, 
                morfologia.getNombre(), 
                morfologia.getEspecie(), 
                morfologia.getRiesgoExtincion(),
                ubicacion.getHabitad(), 
                ubicacion.getUbicacion(),
                dieta.getDietaPrincipal(), 
                dieta.getDieta(),
                peligrosidad.isPeligroso(), 
                peligrosidad.isVenenoso(), 
                morfologia.getCantidad()
        );
        if(peligrosidad.isPeligroso()){
            this.nivelPeligrosidad = peligrosidad.getNivelPeligrosidad();
            this.precauciones = peligrosidad.getPrecauciones();
        }
        if(peligrosidad.isVenenoso()){
            this.tipoVeneno = peligrosidad.getTipoVeneno();
        }
        this.metaforfosis = morfologia.isMetamorfosis();
        this.paresAlas = morfologia.getParesAlas();
        this.paresPatas = morfologia.getParesPatas();
    }
}
