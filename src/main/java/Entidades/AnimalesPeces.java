/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Alisser
 */
public class AnimalesPeces extends Animales{
    private String tipoAgua;
    private String temperaturaAcuario;
    private String nivelPeligrosidad;
    private String coloracion;
    private String reproduccion;
    private String tipoGestacion;
    private String[] dieta;
    private String[] especiesCompatibles;
    private String tipoVeneno;
    private String tiempoGestacion;
    
    public AnimalesPeces(
        int codigo, 
        String nombre, 
        String especie, 
        int edad, 
        String genero, 
        float peso, 
        String dietaPrincipal, 
        String habitad, 
        String ubicacion,
        boolean peligrosidad,
        String nivelPeligrosidad,
        String tipoAgua,
        String temperaturaAcuario,
        String coloracion,
        String reproduccion,
        boolean gestacion,
        String tipoGestacion,
        String[] dieta,
        String[] especiesCompatibles,
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
        if (peligrosidad){
            this.nivelPeligrosidad = nivelPeligrosidad;
        }
        this.tipoAgua = tipoAgua;
        this.coloracion = coloracion;
        this.dieta = dieta;
        this.especiesCompatibles = especiesCompatibles;
        this.nivelPeligrosidad = nivelPeligrosidad;
        this.reproduccion = reproduccion;
        this.temperaturaAcuario = temperaturaAcuario;
        if(gestacion){
            this.tipoGestacion = tipoGestacion;
            this.tiempoGestacion = tiempoGestacion;
        }
        if(venenoso){
            this.tipoVeneno = tipoVeneno;
        }
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public String getTemperaturaAcuario() {
        return temperaturaAcuario;
    }

    public void setTemperaturaAcuario(String temperaturaAcuario) {
        this.temperaturaAcuario = temperaturaAcuario;
    }

    public String getNivelPeligrosidad() {
        return nivelPeligrosidad;
    }

    public void setNivelPeligrosidad(String nivelPeligrosidad) {
        this.nivelPeligrosidad = nivelPeligrosidad;
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

    public String[] getEspeciesCompatibles() {
        return especiesCompatibles;
    }

    public void setEspeciesCompatibles(String[] especiesCompatibles) {
        this.especiesCompatibles = especiesCompatibles;
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
