/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Alisser
 */
public class AnimalesInsectos extends Animales {
    private String dieta[];
    private boolean metaforfosis;
    private int paresPatas;
    private int paresAlas;
    
    public AnimalesInsectos(
        int codigo,
        String nombre,
        String especie, 
        String dietaPrincipal,
        String habitad,
        String ubicacion,
        boolean peligroso,
        boolean venenoso,
        int cantidad,
        String dieta[],
        boolean metamorfosis,
        int paresPatas,
        int paresAlas,
        String[] precauciones
    ){
        super(codigo, nombre, especie, dietaPrincipal, habitad, ubicacion, peligroso, venenoso, cantidad, precauciones);
        this.dieta = dieta;
        this.metaforfosis = metamorfosis;
        this.paresAlas = paresAlas;
        this.paresPatas = paresPatas;
    }

    public String[] getDieta() {
        return dieta;
    }

    public void setDieta(String[] dieta) {
        this.dieta = dieta;
    }

    public boolean isMetaforfosis() {
        return metaforfosis;
    }

    public void setMetaforfosis(boolean metaforfosis) {
        this.metaforfosis = metaforfosis;
    }

    public int getParesPatas() {
        return paresPatas;
    }

    public void setParesPatas(int paresPatas) {
        this.paresPatas = paresPatas;
    }

    public int getParesAlas() {
        return paresAlas;
    }

    public void setParesAlas(int paresAlas) {
        this.paresAlas = paresAlas;
    }
    
    
}
