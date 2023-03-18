/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author Alisser
 */
public class AnimalesAvesExoticas extends AnimalesAves{
    private String origen, especiesCompatibles[];
    
    public AnimalesAvesExoticas(
            int codigo, 
            String nombre, 
            String especie, 
            String riesgoExtincion,
            int edad,
            String genero,
            float peso, 
            String envergadura,
            boolean vuela,
            String tipoPico,
            String colorPlumaje,
            String origen,
            String habitad,
            String ubicacion,
            boolean gestacion,
            String tipoGestacion,
            String tiempoGestacion,
            String dietaPrincipal,
            String dieta[],
            boolean peligroso,
            String nivelPeligrosidad,
            String[] especiesCompatibles,
            boolean venenoso,
            String tipoVeneno,
            String[] precauciones
    ){
        super(
                codigo, 
                nombre, 
                especie,
                riesgoExtincion,
                edad, 
                genero, 
                peso,
                envergadura,
                vuela,
                tipoPico,
                colorPlumaje,
                habitad, 
                ubicacion,
                gestacion,
                tipoGestacion,
                tiempoGestacion,
                dietaPrincipal, 
                dieta,
                peligroso, 
                nivelPeligrosidad,
                venenoso, 
                tipoVeneno,
                precauciones
        );
        this.especiesCompatibles = especiesCompatibles;
        this.origen = origen;
    }
}
