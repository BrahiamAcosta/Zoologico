package Usuarios;

/**
 *
 * @author brahiam.acosta
 */
public class Personas {
    private String name;
    private String identificacion;
    private int edad;

    public Personas() {
    }

    public Personas(String name, String identificacion, int edad) {
        this.name = name;
        this.identificacion = identificacion;
        this.edad = edad;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Personas{" + "name=" + name + ", identificacion=" + identificacion + ", edad=" + edad + '}';
    }
}
