/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Alisser
 */
public class AnimalesMamiferosAcuaticos extends AnimalesMamiferos {
    private int numAletas;
    private String capacidadBuceo, especiesCompatibles[], mecanismoRespiracion;
    
    public AnimalesMamiferosAcuaticos(
        int codigo, 
        String nombre, 
        String especie, 
        int edad,
        String genero,
        float peso, 
        int numAletas,
        String capacidadBuceo,
        String mecanismoRespiracion,
        String habitad,
        String ubicacion,
        boolean gestacion,
        String tipoGestacion,
        String tiempoGestacion,
        String dietaPrincipal,
        String dieta[],
        boolean peligroso,
        String nivelPeligrosidad,
        String[] especiesCompatibles,
        boolean venenoso,
        String tipoVeneno,
        String[] precauciones,
        int cantidad 
    ){
        super(
                codigo, 
                nombre, 
                especie, 
                edad, 
                genero, 
                peso, 
                habitad, 
                ubicacion,
                gestacion, 
                tipoGestacion,
                tiempoGestacion,
                dietaPrincipal, 
                dieta,
                peligroso,
                nivelPeligrosidad, 
                venenoso, 
                tipoVeneno, 
                precauciones,
                cantidad
        );
        this.numAletas = numAletas;
        this.capacidadBuceo = capacidadBuceo;
        this.mecanismoRespiracion = mecanismoRespiracion;
        this.especiesCompatibles = especiesCompatibles;
    }

    public int getNumAletas() {
        return numAletas;
    }

    public void setNumAletas(int numAletas) {
        this.numAletas = numAletas;
    }

    public String getCapacidadBuceo() {
        return capacidadBuceo;
    }

    public void setCapacidadBuceo(String capacidadBuceo) {
        this.capacidadBuceo = capacidadBuceo;
    }

    public String[] getEspeciesCompatibles() {
        return especiesCompatibles;
    }

    public void setEspeciesCompatibles(String[] especiesCompatibles) {
        this.especiesCompatibles = especiesCompatibles;
    }

    public String getMecanismoRespiracion() {
        return mecanismoRespiracion;
    }

    public void setMecanismoRespiracion(String mecanismoRespiracion) {
        this.mecanismoRespiracion = mecanismoRespiracion;
    }
    
    
}
