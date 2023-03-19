/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

import Animales.Caracteristicas.CaracteristicasEspecie;
import Animales.Caracteristicas.Dieta;
import Animales.Caracteristicas.Peligrosidad;
import Animales.Caracteristicas.Reproduccion;
import Animales.Caracteristicas.Ubicacion;

/**
 *
 * @author Alisser
 */
public class AnimalesAvesTerrestres extends AnimalesAves{
    private boolean aveDeCorral;
    
    public AnimalesAvesTerrestres(
            int codigo,
            CaracteristicasEspecie morfologia,
            Ubicacion ubicacion,
            Reproduccion reproduccion,
            Dieta dieta,
            Peligrosidad peligrosidad,
            boolean aveDeCorral
    ){
        super(
                codigo,
                morfologia,
                ubicacion,
                reproduccion,
                dieta,
                peligrosidad
        );
        
        this.aveDeCorral = aveDeCorral;
    }

    public boolean isAveDeCorral() {
        return aveDeCorral;
    }

    public void setAveDeCorral(boolean aveDeCorral) {
        this.aveDeCorral = aveDeCorral;
    }
    
}
