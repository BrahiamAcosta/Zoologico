package Animales;

/**
 *
 * @author brahiam.acosta
 */

public class Animales {
    public static int cantAnimales = 0;
    private int codigo, edad, cantidad;
    private String nombre, especie, genero, dietaPrincipal, dieta[], habitad, ubicacion, riesgoExtincion;
    private float peso;
    private boolean peligroso, venenoso, gestacion;
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
            int cantidad          
    ){
        this.codigo = codigo;
        this.nombre = nombre;
        this.especie = especie;
        this.dietaPrincipal = dietaPrincipal;
        this.habitad = habitad;
        this.ubicacion = ubicacion;
        this.peligroso = peligroso;
        this.venenoso = venenoso;
        this.cantidad = cantidad;
        this.dieta = dieta;
        this.riesgoExtincion = riesgoExtincion;
    }
    
    //Constructor para peces
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
            int cantidad
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
        this.cantidad = cantidad;
        this.riesgoExtincion = riesgoExtincion;
    }
    
    //Constructor anfibios
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
            boolean venenoso
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
            boolean venenoso
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String[] getDieta() {
        return dieta;
    }

    public void setDieta(String[] dieta) {
        this.dieta = dieta;
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
