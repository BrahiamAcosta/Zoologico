/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Alisser
 */
public class AnimalesAnfibios extends Animales{
    private String 
            tipoVeneno, 
            reproduccion, 
            tipoGestacion, 
            temperaturaHabitad, 
            nivelPeligrosidad, 
            tiempoGestacion,
            precauciones[];
    
    public AnimalesAnfibios(
        int codigo, 
        String nombre, 
        String especie, 
        int edad,
        String genero,
        float peso, 
        String habitad,
        String ubicacion,
        String reproduccion, 
        boolean gestacion,
        String tipoGestacion,
        String tiempoGestacion,
        String dietaPrincipal,
        String dieta[],
        boolean peligroso,
        String nivelPeligrosidad,
        boolean venenoso,
        String tipoVeneno,
        String[] precauciones,
        int cantidad,   
        String temperaturaHabitad
    )
    {
        super(
                codigo, 
                nombre, 
                especie, 
                edad, 
                genero, 
                peso, 
                habitad, 
                ubicacion,
                gestacion,
                dietaPrincipal, 
                dieta,
                peligroso, 
                venenoso, 
                cantidad               
        );
        if (peligroso){
            this.nivelPeligrosidad = nivelPeligrosidad;
            this.precauciones = precauciones;
        }
        this.reproduccion = reproduccion;
        if(gestacion){
            this.tipoGestacion = tipoGestacion;
            this.tiempoGestacion = tiempoGestacion;
        }
        this.temperaturaHabitad = temperaturaHabitad;
        if(venenoso){
            this.tipoVeneno = tipoVeneno;
        }
    }

    public String getReproduccion() {
        return reproduccion;
    }

    public void setReproduccion(String reproduccion) {
        this.reproduccion = reproduccion;
    }

    public String getTipoGestacion() {
        return tipoGestacion;
    }

    public void setTipoGestacion(String tipoGestacion) {
        this.tipoGestacion = tipoGestacion;
    }

    public String getTemperaturaHabitad() {
        return temperaturaHabitad;
    }

    public void setTemperaturaHabitad(String temperaturaHabitad) {
        this.temperaturaHabitad = temperaturaHabitad;
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
