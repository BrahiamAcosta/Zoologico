/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico;

/**
 *
 * @author brahiam.acosta
 */
//Es una clase hija de la clase animales, salvajes se extiende de animales
public class AnimalesSalvajes extends Animales{
    private String peligrosidad;
    private String habitad;
    private String especie;
    
    public AnimalesSalvajes(){
    }
    
    public AnimalesSalvajes(String peligrosidad, String habitad, String especie, int codigo, String nombre, float peso) {
        super(codigo, nombre, peso);
        this.peligrosidad = peligrosidad;
        this.habitad = habitad;
        this.especie = especie;
    }
    
    

    public String getPeligrosidad() {
        return peligrosidad;
    }

    public void setPeligrosidad(String peligrosidad) {
        this.peligrosidad = peligrosidad;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "AnimalesSalvajes{" + "peligrosidad=" + peligrosidad + ", habitad=" + habitad + ", especie=" + especie + '}';
    }
    
    
    
    
}
