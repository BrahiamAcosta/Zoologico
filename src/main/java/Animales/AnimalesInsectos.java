/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author Alisser
 */
public class AnimalesInsectos extends Animales {
    private String nivelPeligrosidad, precauciones[], tipoVeneno;
    private boolean metaforfosis;
    private int paresPatas, paresAlas;
    
    public AnimalesInsectos(
        int codigo,
        String nombre,
        String especie, 
        String riesgoExtincion,
        boolean metamorfosis,
        int paresPatas,
        int paresAlas,
        String habitad,
        String ubicacion,
        String dietaPrincipal,
        String dieta[],
        boolean peligroso,
        String nivelPeligrosidad,
        boolean venenoso,
        String tipoVeneno,
        String[] precauciones,
        int cantidad
    ){
        super(
                codigo, 
                nombre, 
                especie, 
                riesgoExtincion,
                habitad, 
                ubicacion,
                dietaPrincipal, 
                dieta,
                peligroso, 
                venenoso, 
                cantidad  
        );
        if(peligroso){
            this.nivelPeligrosidad = nivelPeligrosidad;
            this.precauciones = precauciones;
        }
        if(venenoso){
            this.tipoVeneno = tipoVeneno;
        }
        this.metaforfosis = metamorfosis;
        this.paresAlas = paresAlas;
        this.paresPatas = paresPatas;
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

    public String getNivelPeligrosidad() {
        return nivelPeligrosidad;
    }

    public void setNivelPeligrosidad(String nivelPeligrosidad) {
        this.nivelPeligrosidad = nivelPeligrosidad;
    }

    public String[] getPrecauciones() {
        return precauciones;
    }

    public void setPrecauciones(String[] precauciones) {
        this.precauciones = precauciones;
    }

    public String getTipoVeneno() {
        return tipoVeneno;
    }

    public void setTipoVeneno(String tipoVeneno) {
        this.tipoVeneno = tipoVeneno;
    }
    
    
}
