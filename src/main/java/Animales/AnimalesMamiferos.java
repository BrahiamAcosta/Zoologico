/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author Alisser
 */
public class AnimalesMamiferos extends Animales{
    private String 
            tipoGestacion, 
            nivelPeligrosidad, 
            tipoVeneno, 
            tiempoGestacion,
            precauciones[];
    
    public AnimalesMamiferos(
            int codigo, 
            String nombre, 
            String especie,
            String riesgoExtincion,
            int edad,
            String genero,
            float peso, 
            String habitad,
            String ubicacion,
            boolean gestacion,
            String tipoGestacion,
            String tiempoGestacion,
            String dietaPrincipal,
            String dieta[],
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            String[] precauciones 
    ){
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
                dietaPrincipal, 
                dieta,
                peligroso, 
                venenoso
        );
        if (peligroso){
            this.nivelPeligrosidad = nivelPeligrosidad;
            this.precauciones = precauciones;
        }
        if(gestacion){
            this.tipoGestacion = tipoGestacion;
            this.tiempoGestacion = tiempoGestacion;
        }
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

    public String[] getPrecauciones() {
        return precauciones;
    }

    public void setPrecauciones(String[] precauciones) {
        this.precauciones = precauciones;
    }
    
    
}
