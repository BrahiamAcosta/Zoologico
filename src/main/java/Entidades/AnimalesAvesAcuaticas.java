/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Alisser
 */
public class AnimalesAvesAcuaticas extends AnimalesAves{
    private String tiempoBuceo, tempHabitad;
    
    public AnimalesAvesAcuaticas(
            int codigo, 
            String nombre, 
            String especie, 
            int edad,
            String genero,
            float peso, 
            String envergadura,
            boolean vuela,
            String tipoPico,
            String colorPlumaje,
            String tiempoBuceo,
            String habitad,
            String tempHabitad,
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
            String[] precauciones,
            int cantidad
    ){
        super(
                codigo, 
                nombre, 
                especie, 
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
                precauciones,
                cantidad
        );
        this.tempHabitad = tempHabitad;
        this.tiempoBuceo =tiempoBuceo;
    }
}
