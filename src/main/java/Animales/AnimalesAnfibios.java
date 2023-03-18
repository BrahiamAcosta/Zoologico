/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author Alisser
 */
public class AnimalesAnfibios extends Animales{
    private String 
            tipoVeneno, 
            reproduccion, 
            temperaturaHabitad, 
            nivelPeligrosidad, 
            precauciones[];
    
    public AnimalesAnfibios(
        int codigo, 
        String nombre, 
        String especie, 
        String riesgoExtincion,
        String genero,
        String habitad,
        String ubicacion,
        String reproduccion, 
        String dietaPrincipal,
        String dieta[],
        boolean peligroso,
        String nivelPeligrosidad,
        boolean venenoso,
        String tipoVeneno,
        String[] precauciones,
        String temperaturaHabitad
    )
    {
        super(
                codigo, 
                nombre, 
                especie, 
                riesgoExtincion,
                genero, 
                habitad, 
                ubicacion,
                dietaPrincipal, 
                dieta,
                peligroso, 
                venenoso              
        );
        if (peligroso){
            this.nivelPeligrosidad = nivelPeligrosidad;
            this.precauciones = precauciones;
        }
        this.reproduccion = reproduccion;
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

    public String[] getPrecauciones() {
        return precauciones;
    }

    public void setPrecauciones(String[] precauciones) {
        this.precauciones = precauciones;
    }
    
    
    
}
