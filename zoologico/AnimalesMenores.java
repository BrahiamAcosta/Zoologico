/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico;

/**
 *
 * @author brahiam.acosta
 */
public class AnimalesMenores extends Animales{
    private String nombreVulgar;
    private String habitad;
    private String uso;

    public AnimalesMenores() {
    }

    public AnimalesMenores(String nombreVulgar, String habitad, String uso, int codigo, String nombre, float peso) {
        super(codigo, nombre, peso);
        this.nombreVulgar = nombreVulgar;
        this.habitad = habitad;
        this.uso = uso;
    }
    
    

    public String getNombreVulgar() {
        return nombreVulgar;
    }

    public void setNombreVulgar(String nombreVulgar) {
        this.nombreVulgar = nombreVulgar;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    @Override
    public String toString() {
        return "AnimalesMenores{" + "nombreVulgar=" + nombreVulgar + ", habitad=" + habitad + ", uso=" + uso + '}';
    }
    
    
    
    
}
