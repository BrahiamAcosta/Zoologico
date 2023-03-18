package Usuarios;

import Usuarios.Personas;

/**
 *
 * @author brahiam.acosta
 */
public class Usuario extends Personas{
    String trabajo;
    int frecuenciaAnual;
    int puntosAcumulados;

    public Usuario() {
    }

    public Usuario(String trabajo, int frecuenciaAnual, int puntosAcumulados, String name, String identificacion, int edad) {
        super(name, identificacion, edad);
        this.trabajo = trabajo;
        this.frecuenciaAnual = frecuenciaAnual;
        this.puntosAcumulados = puntosAcumulados;
    }

    public int getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(int puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }
    
    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public int getFrecuenciaAnual() {
        return frecuenciaAnual;
    }

    public void setFrecuenciaAnual(int frecuenciaAnual) {
        this.frecuenciaAnual = frecuenciaAnual;
    }

    @Override
    public String toString() {
        return "Usuario{" + "trabajo=" + trabajo + ", frecuenciaAnual=" + frecuenciaAnual;
    }    
}
