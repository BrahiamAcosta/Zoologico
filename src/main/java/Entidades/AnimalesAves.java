/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Alisser
 */
public class AnimalesAves extends Animales{
    private String nivelPeligrosidad;
    private String envergadura;
    private String tipoPico;
    private String colorPlumaje;
    private String[] dieta;
    private String tipoVeneno;
    private String tipoGestacion;
    private String tiempoGestacion;
    
    public AnimalesAves(
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
        String envergadura,
        String tipoPico,
        String colorPlumaje,
        String[] dieta,
        boolean venenoso,
        String tipoVeneno,
        boolean gestacion,
        String tipoGestacion,
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
        this.envergadura = envergadura;
        this.tipoPico = tipoPico;
        this.colorPlumaje = colorPlumaje;
        this.dieta = dieta;
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
