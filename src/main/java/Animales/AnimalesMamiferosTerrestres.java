/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

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
        String riesgoExtincion,
        int edad,
        String genero,
        float peso, 
        int numeroPatas,
        String habitad,
        String ubicacion,
        boolean gestacion,
        String tipoGestacion,
        String tiempoGestacion,
        String dietaPrincipal,
        String dieta[],
        boolean peligroso,
        String nivelPeligrosidad,
        String comportamiento,
        boolean venenoso,
        String tipoVeneno,
        String[] precauciones
    ) 
    {
        super(
                codigo, 
                nombre, 
                especie,
                riesgoExtincion,
                edad, 
                genero, 
                peso, 
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
