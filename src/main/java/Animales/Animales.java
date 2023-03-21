package Animales;

import java.util.ArrayList;

/**
 *
 * @author brahiam.acosta
 */

public abstract class Animales {
    public static int cantAnimales = 0;
    public static ArrayList<Animales> animales = new ArrayList<>();
    public static int cantAnimalesReptiles = 0;
    public static ArrayList<AnimalesReptiles> animalesReptiles = new ArrayList<>();
    public static int cantAnimalesPeces = 0;
    public static ArrayList<AnimalesPeces> animalesPeces = new ArrayList<>();
    public static int cantAnimalesMamiferos = 0;
    public static ArrayList<AnimalesMamiferos> animalesMamiferos = new ArrayList<>();
    public static int cantAnimalesInsectos = 0;
    public static ArrayList<AnimalesInsectos> animalesInsectos = new ArrayList<>();
    public static int cantAnimalesAves = 0;
    public static ArrayList<AnimalesAves> animalesAves = new ArrayList<>();
    public static int cantAnimalesAnfibios = 0;
    public static ArrayList<AnimalesAnfibios> animalesAnfibios = new ArrayList<>();
    private int codigo, edad;
    private String nombre, especie, genero, dietaPrincipal, dieta[], habitad, ubicacion, riesgoExtincion, procedencia;
    private float peso;
    private boolean peligroso, venenoso, gestacion, maltratado;
    
    //Constructores
    
    //Constructor Insectos
    public Animales(
            int codigo,
            String nombre,
            String especie,
            String riesgoExtincion,
            String habitad,
            String ubicacion,
            String dietaPrincipal,
            String dieta[],
            boolean peligroso,
            boolean venenoso,
            String procedencia
    ){
        this.codigo = codigo;
        this.nombre = nombre;
        this.especie = especie;
        this.dietaPrincipal = dietaPrincipal;
        this.habitad = habitad;
        this.ubicacion = ubicacion;
        this.peligroso = peligroso;
        this.venenoso = venenoso;
        this.dieta = dieta;
        this.riesgoExtincion = riesgoExtincion;
        this.procedencia = procedencia;
    }
    
    //Constructor para peces y anfibios
    public Animales(
            int codigo, 
            String nombre, 
            String especie, 
            String riesgoExtincion,
            String genero,
            String habitad,
            String ubicacion,
            String dietaPrincipal,
            String dieta[],
            boolean peligroso,
            boolean venenoso,
            String procedencia
    )
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.especie = especie;
        this.genero = genero;
        this.dietaPrincipal = dietaPrincipal;
        this.habitad = habitad;
        this.ubicacion = ubicacion;
        this.peligroso = peligroso;
        this.venenoso = venenoso;
        this.dieta = dieta;
        this.riesgoExtincion = riesgoExtincion;
        this.procedencia = procedencia;
    }
    
    
    //Constructor resto animales
    public Animales(
            int codigo, 
            String nombre, 
            String especie, 
            String riesgoExtincion,
            int edad,
            String genero,
            float peso, 
            String habitad,
            String ubicacion,
            boolean gestacion,
            String dietaPrincipal,
            String dieta[],
            boolean peligroso,
            boolean venenoso,
            boolean maltratado,
            String procedencia
    )
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.dietaPrincipal = dietaPrincipal;
        this.habitad = habitad;
        this.ubicacion = ubicacion;
        this.peligroso = peligroso;
        this.venenoso = venenoso;
        this.gestacion = gestacion;
        this.dieta = dieta;
        this.riesgoExtincion = riesgoExtincion;
        this.maltratado = maltratado;
        this.procedencia = procedencia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getDietaPrincipal() {
        return dietaPrincipal;
    }

    public void setDietaPrincipal(String dietaPrincipal) {
        this.dietaPrincipal = dietaPrincipal;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isPeligroso() {
        return peligroso;
    }

    public void setPeligroso(boolean peligrosidad) {
        this.peligroso = peligrosidad;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public boolean isGestacion() {
        return gestacion;
    }

    public void setGestacion(boolean gestacion) {
        this.gestacion = gestacion;
    }

    public String[] getDieta() {
        return dieta;
    }

    public void setDieta(String[] dieta) {
        this.dieta = dieta;
    }

    public static int getCantAnimales() {
        return cantAnimales;
    }

    public static void setCantAnimales(int cantAnimales) {
        Animales.cantAnimales = cantAnimales;
    }

    public static ArrayList<Animales> getAnimales() {
        return animales;
    }

    public static void setAnimales(Animales animal) {
        animales.add(animal);
    }

    public static int getCantAnimalesReptiles() {
        return cantAnimalesReptiles;
    }

    public static void setCantAnimalesReptiles(int cantAnimalesReptiles) {
        Animales.cantAnimalesReptiles = cantAnimalesReptiles;
    }

    public static ArrayList<AnimalesReptiles> getAnimalesReptiles() {
        return animalesReptiles;
    }

    public static void setAnimalesReptiles(ArrayList<AnimalesReptiles> animalesReptiles) {
        Animales.animalesReptiles = animalesReptiles;
    }

    public static int getCantAnimalesPeces() {
        return cantAnimalesPeces;
    }

    public static void setCantAnimalesPeces(int cantAnimalesPeces) {
        Animales.cantAnimalesPeces = cantAnimalesPeces;
    }

    public static ArrayList<AnimalesPeces> getAnimalesPeces() {
        return animalesPeces;
    }

    public static void setAnimalesPeces(ArrayList<AnimalesPeces> animalesPeces) {
        Animales.animalesPeces = animalesPeces;
    }

    public static int getCantAnimalesMamiferos() {
        return cantAnimalesMamiferos;
    }

    public static void setCantAnimalesMamiferos(int cantAnimalesMamiferos) {
        Animales.cantAnimalesMamiferos = cantAnimalesMamiferos;
    }

    public static ArrayList<AnimalesMamiferos> getAnimalesMamiferos() {
        return animalesMamiferos;
    }

    public static void setAnimalesMamiferos(ArrayList<AnimalesMamiferos> animalesMamiferos) {
        Animales.animalesMamiferos = animalesMamiferos;
    }

    public static int getCantAnimalesInsectos() {
        return cantAnimalesInsectos;
    }

    public static void setCantAnimalesInsectos(int cantAnimalesInsectos) {
        Animales.cantAnimalesInsectos = cantAnimalesInsectos;
    }

    public static ArrayList<AnimalesInsectos> getAnimalesInsectos() {
        return animalesInsectos;
    }

    public static void setAnimalesInsectos(ArrayList<AnimalesInsectos> animalesInsectos) {
        Animales.animalesInsectos = animalesInsectos;
    }

    public static int getCantAnimalesAves() {
        return cantAnimalesAves;
    }

    public static void setCantAnimalesAves(int cantAnimalesAves) {
        Animales.cantAnimalesAves = cantAnimalesAves;
    }

    public static ArrayList<AnimalesAves> getAnimalesAves() {
        return animalesAves;
    }

    public static void setAnimalesAves(ArrayList<AnimalesAves> animalesAves) {
        Animales.animalesAves = animalesAves;
    }

    public static int getCantAnimalesAnfibios() {
        return cantAnimalesAnfibios;
    }

    public static void setCantAnimalesAnfibios(int cantAnimalesAnfibios) {
        Animales.cantAnimalesAnfibios = cantAnimalesAnfibios;
    }

    public static ArrayList<AnimalesAnfibios> getAnimalesAnfibios() {
        return animalesAnfibios;
    }

    public static void setAnimalesAnfibios(ArrayList<AnimalesAnfibios> animalesAnfibios) {
        Animales.animalesAnfibios = animalesAnfibios;
    }

    public String getRiesgoExtincion() {
        return riesgoExtincion;
    }

    public void setRiesgoExtincion(String riesgoExtincion) {
        this.riesgoExtincion = riesgoExtincion;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public boolean isMaltratado() {
        return maltratado;
    }

    public void setMaltratado(boolean maltratado) {
        this.maltratado = maltratado;
    }
    
    
    
    //meotdo toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Animal: \n");
        sb.append("Codigo= ").append(codigo);
        sb.append("\n");
        sb.append("Nombre= ").append(nombre);
        sb.append("\n");
        sb.append("Especie= ").append(especie);
        sb.append("\n");
        sb.append("Edad= ").append(edad);
        sb.append("\n");
        sb.append("Genero= ").append(genero);
        sb.append("\n");
        sb.append("Peso= ").append(peso);
        sb.append("\n");
        sb.append("Dieta= ").append(dietaPrincipal);
        sb.append("\n");
        sb.append("Habitad=").append(habitad);
        sb.append("\n");
        sb.append("Ubicación=").append(ubicacion);
        sb.append("\n");
        return sb.toString();
    }
    
    
    
}
