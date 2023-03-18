/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Alisser
 */
public class AnimalesMamiferos extends Animales{
    private String tipoGestacion;
    private String nivelPeligrosidad;
    private String[] dieta;
    private String tipoVeneno;
    private String tiempoGestacion;
    
    public AnimalesMamiferos(
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
            int cantidad,
            String[] precauciones
    ){
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
                peligroso, 
                venenoso, 
                gestacion,
                cantidad,
                precauciones
        );
        if (peligroso){
            this.nivelPeligrosidad = nivelPeligrosidad;
        }
        if(gestacion){
            this.tipoGestacion = tipoGestacion;
            this.tiempoGestacion = tiempoGestacion;
        }
        this.dieta = dieta;
        if(venenoso){
            this.tipoVeneno = tipoVeneno;
        }
    }

    public String getTipoGestacion() {
        return tipoGestacion;
    }

    public void setTipoGestacion(String tipoGestacion) {
        this.tipoGestacion = tipoGestacion;
    }

    public String getNivelPeligrosidad() {
        return nivelPeligrosidad;
    }

    public void setNivelPeligrosidad(String nivelPeligrosidad) {
        this.nivelPeligrosidad = nivelPeligrosidad;
    }

    public String[] getDieta() {
        return dieta;
    }

    public void setDieta(String[] dieta) {
        this.dieta = dieta;
    }

    public String getTipoVeneno() {
        return tipoVeneno;
    }

    public void setTipoVeneno(String tipoVeneno) {
        this.tipoVeneno = tipoVeneno;
    }

    public String getTiempoGestacion() {
        return tiempoGestacion;
    }

    public void setTiempoGestacion(String tiempoGestacion) {
        this.tiempoGestacion = tiempoGestacion;
    }
    
    
}
