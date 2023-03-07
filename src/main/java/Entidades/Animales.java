package Entidades;

/**
 *
 * @author brahiam.acosta
 */

public class Animales {
    private int codigo;
    private String especie;
    private String tipo;
    private String ubicacion;
    private int edad;
    private float peso;
    
    //Constructores
    public Animales(){
    }

    public Animales(int codigo, float peso, String especie, String tipo, String ubicacion, int edad){
        this.codigo = codigo;
        this.especie = especie;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.edad = edad;
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    //meotdo toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Animales{");
        sb.append("codigo=").append(codigo);
        sb.append(", peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
