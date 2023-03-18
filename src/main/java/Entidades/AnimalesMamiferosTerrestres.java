/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Alisser
 */
public class AnimalesMamiferosTerrestres extends AnimalesMamiferos {

    private int numeroPatas;
    private String comportamiento;

    public AnimalesMamiferosTerrestres(
        int codigo,
        String nombre,
        String especie,
        int edad,
        String genero,
        float peso,
        String dietaPrincipal,
        String habitad,
        String ubicacion,
        String nivelPeligrosidad,
        boolean gestacion,
        String tipoGestacion,
        String[] dieta,
        boolean peligroso,
        boolean venenoso,
        String tipoVeneno,
        String tiempoGestacion,
        int numeroPatas,
        String comportamiento,
        int cantidad,
        String[] precauciones
    ) 
    {
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
                nivelPeligrosidad, 
                gestacion, 
                tipoGestacion, 
                dieta, 
                peligroso, 
                venenoso, 
                tipoVeneno, 
                tiempoGestacion,
                cantidad,
                precauciones
        );
        this.comportamiento = comportamiento;
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }
    
    
}
