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
public class AnimalesReptilesAcuaticos extends AnimalesReptiles {

    private String metodoRespiracion;
    private int numAletas;

    public AnimalesReptilesAcuaticos(
            int codigo,
            CaracteristicasEspecie morfologia,
            Ubicacion ubicacion,
            Reproduccion reproduccion,
            Dieta dieta,
            Peligrosidad peligrosidad,
            String metodoRespiracion,
            int numAletas
    ) {
        super(
                codigo,
                morfologia,
                ubicacion,
                reproduccion,
                dieta,
                peligrosidad
        );
        this.metodoRespiracion = metodoRespiracion;
        this.numAletas = numAletas;
    }

    public String getMetodoRespiracion() {
        return metodoRespiracion;
    }

    public void setMetodoRespiracion(String metodoRespiracion) {
        this.metodoRespiracion = metodoRespiracion;
    }

    public int getNumAletas() {
        return numAletas;
    }

    public void setNumAletas(int numAletas) {
        this.numAletas = numAletas;
    }
    
}
