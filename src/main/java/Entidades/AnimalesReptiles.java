/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Alisser
 */
public class AnimalesReptiles extends Animales{
    private String nivelPeligrosidad;
    private String tempEncubacion;
    private String tipoVeneno;
    private String tipoPiel;
    private String coloracion;
    private String reproduccion;
    private String tipoGestacion;
    private String[] dieta;
    private String tiempoGestacion;
    
    public AnimalesReptiles(
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
        String nivelPeligrosidad,
        String tempEncubacion,
        boolean venenoso,
        String tipoVeneno,
        String tipoPiel,
        String coloracion,
        String reproduccion,
        boolean gestacion,
        String tipoGestacion,
        String[] dieta,
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
        this.coloracion = coloracion;
        this.dieta = dieta;
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

    public String[] getDieta() {
        return dieta;
    }

    public void setDieta(String[] dieta) {
        this.dieta = dieta;
    }
    
    
    
}
