package Entidades;

/**
 *
 * @author Brahiam
 */
public class AnimalesAcuaticos extends Animales{
    private float temperaturaHabitad;
    private boolean peligrosidad;
    
    public AnimalesAcuaticos(){
    }
    public AnimalesAcuaticos(float temperaturaHabitad, boolean peligrosidad){
        super(codigo, especie, tipo,ubicacion, edad, peso);
        this.temperaturaHabitad = temperaturaHabitad;
        this.peligrosidad = peligrosidad;
    }

    public boolean getPeligrosidad() {
        return peligrosidad;
    }

    public void setPeligrosidad(boolean peligrosidad) {
        this.peligrosidad = peligrosidad;
    }
    
    
    public float getTemperaturaHabitad() {
        return temperaturaHabitad;
    }

    public void setTemperaturaHabitad(float temperaturaHabitad) {
        this.temperaturaHabitad = temperaturaHabitad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AnimalesAcuaticos{");
        sb.append("temperaturaHabitad=").append(temperaturaHabitad);
        sb.append(", peligrosidad=").append(peligrosidad);
        sb.append('}');
        return sb.toString();
    }
    
}
