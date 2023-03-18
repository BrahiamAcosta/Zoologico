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
    private String capacidadBuceo;
    private String[] especiesCompatibles;
    private String mecanismoRespiracion;
    
    public AnimalesMamiferosAcuaticos(
        int codigo, 
        String nombre, 
        String especie, 
        int edad, 
        String genero, 
        float peso, 
        String dietaPrincipal, 
        String habitad, 
        String ubicacion,
        String nivelPeligrosidad,
        boolean gestacion,
        String tipoGestacion,
        String[] dieta,
        boolean peligroso,
        boolean venenoso,
        String tipoVeneno,
        int numAletas,
        String capacidadBuceo,
        String[] especiesCompatibles,
        String tiempoGestacion,
        String mecanismoRespiracion,
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
                habitad, ubicacion, 
                nivelPeligrosidad, 
                gestacion, 
                tipoGestacion, 
                dieta, 
                peligroso, 
                venenoso, 
                tipoVeneno, 
                tiempoGestacion,
                cantidad,
                precauciones
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
