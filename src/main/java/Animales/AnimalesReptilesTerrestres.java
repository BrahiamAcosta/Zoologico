/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

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
        String riesgoExtincion,
        int edad,
        String genero,
        float peso, 
        String tipoPiel,
        String coloracion,
        int numPatas,
        String habitad,
        String ubicacion,
        String reproduccion,
        boolean gestacion,
        String tipoGestacion,
        String tiempoGestacion,
        String tempEncubacion,
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
                tipoPiel,
                coloracion,
                habitad,
                ubicacion,
                reproduccion,
                gestacion,
                tipoGestacion,
                tiempoGestacion,
                tempEncubacion,
                dietaPrincipal,
                dieta,
                peligroso,
                nivelPeligrosidad,
                venenoso,
                tipoVeneno,
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