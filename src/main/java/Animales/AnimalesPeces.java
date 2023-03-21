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
public class AnimalesPeces extends Animales{
    private String 
            tipoAgua, 
            temperaturaAcuario, 
            nivelPeligrosidad, 
            coloracion, 
            reproduccion, 
            especiesCompatibles[],
            tipoVeneno,
            precauciones[];
    
    public AnimalesPeces(
        int codigo, 
        CaracteristicasEspecie morfologia,
        Ubicacion ubicacion,
        String tipoAgua,
        String temperaturaAcuario,
        Reproduccion reproduccion,
        Dieta dieta,
        Peligrosidad peligrosidad    
    ){
        super(
                codigo, 
                morfologia.getNombre(), 
                morfologia.getEspecie(), 
                morfologia.getRiesgoExtincion(),
                morfologia.getGenero(), 
                ubicacion.getHabitad(), 
                ubicacion.getZona(),
                dieta.getDietaPrincipal(), 
                dieta.getDieta(),
                peligrosidad.isPeligroso(), 
                peligrosidad.isVenenoso(), 
                ubicacion.getProcedencia()
        );
        if (peligrosidad.isPeligroso()){
            this.nivelPeligrosidad = peligrosidad.getNivelPeligrosidad();
            this.precauciones = peligrosidad.getPrecauciones();
        }
        this.tipoAgua = tipoAgua;
        this.coloracion = morfologia.getColoracion();
        this.especiesCompatibles = peligrosidad.getEspeciesCompatibles();
        this.reproduccion = reproduccion.getReproduccion();
        this.temperaturaAcuario = temperaturaAcuario;
        if(peligrosidad.isVenenoso()){
            this.tipoVeneno = peligrosidad.getTipoVeneno();
        }
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public String getTemperaturaAcuario() {
        return temperaturaAcuario;
    }

    public void setTemperaturaAcuario(String temperaturaAcuario) {
        this.temperaturaAcuario = temperaturaAcuario;
    }
}
