/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author Alisser
 */
public class AnimalesAvesTerrestres extends AnimalesAves{
    private boolean aveDeCorral;
    private String comportamientoSocial;
    
    public AnimalesAvesTerrestres(
            int codigo, 
            String nombre, 
            String especie, 
            String riesgoExtincion,
            int edad,
            String genero,
            float peso, 
            boolean aveDeCorral,
            String comportamientoSocial,
            String envergadura,
            boolean vuela,
            String tipoPico,
            String colorPlumaje,
            String habitad,
            String ubicacion,
            boolean gestacion,
            String tipoGestacion,
            String tiempoGestacion,
            String dietaPrincipal,
            String dieta[],
            boolean peligroso,
            String nivelPeligrosidad,
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
        
        this.aveDeCorral = aveDeCorral;
        this.comportamientoSocial = comportamientoSocial;
    }
}
