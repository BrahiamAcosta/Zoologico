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
    private String tipoVeneno;
    private String reproduccion;
    private String tipoGestacion;
    private String temperaturaHabitad;
    private String nivelPeligrosidad;
    private String[] dieta;
    private String tiempoGestacion;
    
    public AnimalesAnfibios(
        int codigo, 
        String nombre, 
        String especie, 
        int edad, 
        String genero, 
        float peso, 
        String dietaPrincipal, 
        String habitad, 
        String ubicacion,
        boolean peligroso,
        boolean venenoso,
        String nivelPeligrosidad,
        String reproduccion,
        boolean gestacion,
        String tipoGestacion,
        String temperaturaHabitad,
        String[] dieta,
        String tipoVeneno,
        String tiempoGestacion,
        int cantidad,
        String[] precauciones
    )
    {
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
        this.reproduccion = reproduccion;
        if(gestacion){
            this.tipoGestacion = tipoGestacion;
            this.tiempoGestacion = tiempoGestacion;
        }
        this.temperaturaHabitad = temperaturaHabitad;
        this.dieta = dieta;
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
