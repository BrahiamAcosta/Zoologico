/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author Alisser
 */
public class AnimalesPeces extends Animales{
    private String 
            tipoAgua, 
            temperaturaAcuario, 
            nivelPeligrosidad, 
            coloracion, 
            reproduccion, 
            especiesCompatibles[],
            tipoVeneno,
            precauciones[];
    
    public AnimalesPeces(
        int codigo, 
        String nombre, 
        String especie, 
        String riesgoExtincion,
        String genero,
        String coloracion,
        String habitad,
        String ubicacion,
         String tipoAgua,
        String temperaturaAcuario,
        String reproduccion,
        String dietaPrincipal,
        String dieta[],
        boolean peligroso,
        String nivelPeligrosidad,
        boolean venenoso,
        String tipoVeneno,
        String[] precauciones,
        String[] especiesCompatibles,
        int cantidad    
    ){
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
                venenoso, 
                cantidad 
        );
        if (peligroso){
            this.nivelPeligrosidad = nivelPeligrosidad;
            this.precauciones = precauciones;
        }
        this.tipoAgua = tipoAgua;
        this.coloracion = coloracion;
        this.especiesCompatibles = especiesCompatibles;
        this.nivelPeligrosidad = nivelPeligrosidad;
        this.reproduccion = reproduccion;
        this.temperaturaAcuario = temperaturaAcuario;
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

    public String[] getPrecauciones() {
        return precauciones;
    }

    public void setPrecauciones(String[] precauciones) {
        this.precauciones = precauciones;
    }
    
    
}
