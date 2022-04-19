package practicaMona;

public class MonaChef extends MonaCatModelo{

    public int experiencia;
    public String especialidad;
    public String restaurante;

    public MonaChef(){ }

    public MonaChef(double altura, String color, String genero, String nombre, int experiencia, String especialidad, String restaurante) {
        super(altura, color, genero, nombre);
        this.experiencia = experiencia;
        this.especialidad = especialidad;
        this.restaurante = restaurante;
    }
}
