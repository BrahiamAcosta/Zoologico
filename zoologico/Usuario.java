/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico;

/**
 *
 * @author brahiam.acosta
 */
public class Usuario extends Personas{
    String trabajo;
    int frecuenciaAnual;
    Double ahorro;

    public Usuario() {
    }

    public Usuario(String trabajo, int frecuenciaAnual, Double ahorro, String name, String identificacion, int edad) {
        super(name, identificacion, edad);
        this.trabajo = trabajo;
        this.frecuenciaAnual = frecuenciaAnual;
        this.ahorro = ahorro;
    }
    
    

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public int getFrecuenciaAnual() {
        return frecuenciaAnual;
    }

    public void setFrecuenciaAnual(int frecuenciaAnual) {
        this.frecuenciaAnual = frecuenciaAnual;
    }

    public Double getAhorro() {
        return ahorro;
    }

    public void setAhorro(Double ahorro) {
        this.ahorro = ahorro;
    }

    @Override
    public String toString() {
        return "Usuario{" + "trabajo=" + trabajo + ", frecuenciaAnual=" + frecuenciaAnual + ", ahorro=" + ahorro + '}';
    }
    
    
    
    
}
