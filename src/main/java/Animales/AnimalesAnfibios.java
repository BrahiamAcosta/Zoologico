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
public class AnimalesAnfibios extends Animales{
    private String 
            tipoVeneno, 
            reproduccion, 
            temperaturaHabitad, 
            nivelPeligrosidad, 
            precauciones[];
    
    public AnimalesAnfibios(
        int codigo, 
        CaracteristicasEspecie morfologia,
        Ubicacion ubicacion,
        Reproduccion reproduccion, 
        Dieta dieta,
        Peligrosidad peligrosidad
    )
    {
        super(
                codigo, 
                morfologia.getNombre(),  
                morfologia.getEspecie(),
                morfologia.getRiesgoExtincion(),
                morfologia.getGenero(),
                ubicacion.getHabitad(), 
                ubicacion.getUbicacion(),
                dieta.getDietaPrincipal(), 
                dieta.getDieta(),
                peligrosidad.isPeligroso(), 
                peligrosidad.isVenenoso()
        );
        if (peligrosidad.isPeligroso()){
            this.nivelPeligrosidad = peligrosidad.getNivelPeligrosidad();
            this.precauciones = peligrosidad.getPrecauciones();
        }
        this.reproduccion = reproduccion.getReproduccion();
        this.temperaturaHabitad = morfologia.getTemperaturaHabitad();
        if(peligrosidad.isVenenoso()){
            this.tipoVeneno = peligrosidad.getTipoVeneno();
        }
    }
}
