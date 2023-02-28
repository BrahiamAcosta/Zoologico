/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico;

/**
 *
 * @author brahiam.acosta
 */

//
public class Animales {
    private int codigo;
    private String nombre;
    private float peso;
    
    //Constructores
    public Animales(){
    }

    public Animales(int codigo, String nombre, float peso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.peso = peso;
    }
    
    //Getters y setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    //meotdo toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Animales{");
        sb.append("codigo=").append(codigo);
        sb.append(", nombre=").append(nombre);
        sb.append(", peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
