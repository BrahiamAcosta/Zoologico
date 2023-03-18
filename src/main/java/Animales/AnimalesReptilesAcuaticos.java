/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author Alisser
 */
public class AnimalesReptilesAcuaticos extends AnimalesReptiles {

    private String metodoRespiracion;
    private int numAletas;

    public AnimalesReptilesAcuaticos(
            int codigo, 
            String nombre, 
            String especie, 
            String riesgoExtincion,
            int edad,
            String genero,
            float peso, 
            String tipoPiel,
            int numAletas,
            String coloracion,
            String metodoRespiracion,
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
    ) {
        super(
                codigo,
                nombre,
                especie,
                riesgoExtincion,
                edad,
                genero,
                peso,
                tipoPiel,
                coloracion,
                habitad,
                ubicacion,
                reproduccion,
                gestacion,
                tipoGestacion,
                tiempoGestacion,
                tempEncubacion,
                dietaPrincipal,
                dieta,
                peligroso,
                nivelPeligrosidad,
                venenoso,
                tipoVeneno,
                precauciones
        );
        this.metodoRespiracion = metodoRespiracion;
        this.numAletas = numAletas;
    }

    public String getMetodoRespiracion() {
        return metodoRespiracion;
    }

    public void setMetodoRespiracion(String metodoRespiracion) {
        this.metodoRespiracion = metodoRespiracion;
    }

    public int getNumAletas() {
        return numAletas;
    }

    public void setNumAletas(int numAletas) {
        this.numAletas = numAletas;
    }

}
