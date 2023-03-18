/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Alisser
 */
public class AnimalesReptilesTerrestres extends AnimalesReptiles{
    private int numPatas;
    
    public AnimalesReptilesTerrestres(
    int codigo,
            String nombre,
            String especie,
            int edad,
            String genero,
            float peso,
            String dietaPrincipal,
            String habitad,
            String ubicacion,
            boolean peligroso,
            String nivelPeligrosidad,
            String tempEncubacion,
            boolean venenoso,
            String tipoVeneno,
            String tipoPiel,
            String coloracion,
            String reproduccion,
            boolean gestacion,
            String tipoGestacion,
            String[] dieta,
            String tiempoGestacion,
            int numPatas,
            int cantidad,
            String[] precauciones
    ){
        super(
                codigo,
                nombre, 
                especie, 
                edad, 
                genero, 
                peso, 
                dietaPrincipal, 
                habitad, 
                ubicacion, 
                peligroso, 
                nivelPeligrosidad, 
                tempEncubacion, 
                venenoso,
                tipoVeneno,
                tipoPiel,
                coloracion,
                reproduccion,
                gestacion,
                tipoGestacion,
                dieta,
                tiempoGestacion,
                cantidad,
                precauciones
        );
        this.numPatas = numPatas;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }
    
    
}
