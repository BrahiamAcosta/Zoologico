package Entidades;

/**
 *
 * @author brahiam.acosta
 */
public class AnimalesMenores extends Animales{
    private String habitat;
    private boolean peligrosidad;

    public AnimalesMenores() {
    }

    public AnimalesMenores(String habitat, boolean peligrosidad) {
        super(codigo, especie, tipo, ubicacion, edad, peso);
        this.habitat = habitat;
        this.peligrosidad = peligrosidad;
        
    }

    public boolean getPeligrosidad() {
        return peligrosidad;
    }

    public void setPeligrosidad(boolean peligrosidad) {
        this.peligrosidad = peligrosidad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }


    @Override
    public String toString() {
        return "AnimalesMenores{" + ", habitat=" + habitat;
    }  
}
