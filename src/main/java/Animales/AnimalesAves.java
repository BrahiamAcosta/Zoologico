/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author Alisser
 */
public class AnimalesAves extends Animales{
    private String 
            nivelPeligrosidad, 
            envergadura, 
            tipoPico, 
            colorPlumaje, 
            tipoVeneno, 
            tipoGestacion, 
            tiempoGestacion,
            precauciones[];
    private boolean vuela;
    
    public AnimalesAves(
        int codigo, 
        String nombre, 
        String especie, 
        String riesgoExtincion,
        int edad,
        String genero,
        float peso, 
        String envergadura,
        boolean vuela,
        String tipoPico,
        String colorPlumaje,
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
        this.envergadura = envergadura;
        this.tipoPico = tipoPico;
        this.colorPlumaje = colorPlumaje;
        if(venenoso){
            this.tipoVeneno = tipoVeneno;
        }
        this.vuela = vuela;
    }

    public String getNivelPeligrosidad() {
        return nivelPeligrosidad;
    }

    public void setNivelPeligrosidad(String nivelPeligrosidad) {
        this.nivelPeligrosidad = nivelPeligrosidad;
    }

    public String getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(String envergadura) {
        this.envergadura = envergadura;
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    public String getColorPlumaje() {
        return colorPlumaje;
    }

    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }

    public String getTipoVeneno() {
        return tipoVeneno;
    }

    public void setTipoVeneno(String tipoVeneno) {
        this.tipoVeneno = tipoVeneno;
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
}
