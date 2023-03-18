/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author Alisser
 */
public class AnimalesReptiles extends Animales{
    private String 
            nivelPeligrosidad,
            tempEncubacion,
            tipoVeneno,
            tipoPiel,
            coloracion,
            reproduccion,
            tipoGestacion,
            tiempoGestacion,
            precauciones[];
    
    public AnimalesReptiles(
        int codigo, 
        String nombre, 
        String especie, 
        String riesgoExtincion,
        int edad,
        String genero,
        float peso, 
        String tipoPiel,
        String coloracion,
        String habitad,
        String ubicacion,
        String reproduccion,
        boolean gestacion,
        String tipoGestacion,
        String tiempoGestacion,
        String tempEncubacion,
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
        this.coloracion = coloracion;
        this.reproduccion = reproduccion;
        this.tempEncubacion = tempEncubacion;
        if(gestacion){
            this.tipoGestacion = tipoGestacion;
            this.tiempoGestacion = tiempoGestacion;
        }
        this.tipoPiel = tipoPiel;
        if(venenoso){
            this.tipoVeneno = tipoVeneno;
        }
    }

    public String getNivelPeligrosidad() {
        return nivelPeligrosidad;
    }

    public void setNivelPeligrosidad(String nivelPeligrosidad) {
        this.nivelPeligrosidad = nivelPeligrosidad;
    }

    public String getTempEncubacion() {
        return tempEncubacion;
    }

    public void setTempEncubacion(String tempEncubacion) {
        this.tempEncubacion = tempEncubacion;
    }

    public String getTipoVeneno() {
        return tipoVeneno;
    }

    public void setTipoVeneno(String tipoVeneno) {
        this.tipoVeneno = tipoVeneno;
    }

    public String getTipoPiel() {
        return tipoPiel;
    }

    public void setTipoPiel(String tipoPiel) {
        this.tipoPiel = tipoPiel;
    }

    public String getColoracion() {
        return coloracion;
    }

    public void setColoracion(String coloracion) {
        this.coloracion = coloracion;
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
