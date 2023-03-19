/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales.Caracteristicas;

/**
 *
 * @author Alisser
 */
public class Ubicacion {
    private String habitad, zona;
    public Ubicacion(String habitad, String zona){
        this.habitad = habitad;
        this.zona = zona;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public String getUbicacion() {
        return zona;
    }

    public void setUbicacion(String zona) {
        this.zona = zona;
    }
    
}
