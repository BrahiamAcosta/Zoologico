package Entidades;

/**
 *
 * @author brahiam.acosta
 */
public class AnimalesTerrestres extends Animales{
    private boolean peligrosidad;
    private String habitat;
    
    public AnimalesTerrestres(){
    }
    
    public AnimalesTerrestres(boolean peligrosidad, String habitat) {
        super(codigo, especie, tipo, ubicacion, edad, peso);
        this.peligrosidad = peligrosidad;
        this.habitat = habitat;
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
        StringBuilder sb = new StringBuilder();
        sb.append("AnimalesTerrestres{");
        sb.append("peligrosidad=").append(peligrosidad);
        sb.append(", habitat=").append(habitat);
        sb.append('}');
        return sb.toString();
    }

    
}
