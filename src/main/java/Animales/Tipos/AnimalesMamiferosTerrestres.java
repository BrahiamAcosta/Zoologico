/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales.Tipos;

import Animales.Caracteristicas.CaracteristicasEspecie;
import Animales.Caracteristicas.Dieta;
import Animales.Caracteristicas.Peligrosidad;
import Animales.Caracteristicas.Reproduccion;
import Animales.Caracteristicas.Ubicacion;

/**
 *
 * @author Alisser
 */
public class AnimalesMamiferosTerrestres extends AnimalesMamiferos {

    private int numeroPatas;

    public AnimalesMamiferosTerrestres(
        int codigo, 
        CaracteristicasEspecie morfologia,
        Ubicacion ubicacion,
        Reproduccion reproduccion,
        Dieta dieta,
        Peligrosidad peligrosidad,
        int numeroPatas,
        String comportamiento
    ) 
    {
        super(
                codigo, 
                morfologia,
                ubicacion,
                reproduccion,
                dieta,
                peligrosidad
        );
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    
}