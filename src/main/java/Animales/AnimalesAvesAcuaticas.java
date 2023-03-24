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
public class AnimalesAvesAcuaticas extends AnimalesAves {
    private String tiempoBuceo, tempHabitad;

    public AnimalesAvesAcuaticas(
            int codigo,
            CaracteristicasEspecie morfologia,
            Ubicacion ubicacion,
            Reproduccion reproduccion,
            Dieta dieta,
            Peligrosidad peligrosidad,
            String tempHabitad,
            String tiempoBuceo
    ) {
        super(
                codigo,
                morfologia,
                ubicacion,
                reproduccion,
                dieta,
                peligrosidad
        );
        this.tempHabitad = tempHabitad;
        this.tiempoBuceo = tiempoBuceo;
    }

    public String getTiempoBuceo() {
        return tiempoBuceo;
    }

    public void setTiempoBuceo(String tiempoBuceo) {
        this.tiempoBuceo = tiempoBuceo;
    }

    public String getTempHabitad() {
        return tempHabitad;
    }

    public void setTempHabitad(String tempHabitad) {
        this.tempHabitad = tempHabitad;
    }
    
}
