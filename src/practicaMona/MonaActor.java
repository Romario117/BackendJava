package practicaMona;

public class MonaActor extends MonaCatModelo{

    public String pelicula;
    public int edad;

    public MonaActor(){

    }

    public MonaActor(double altura, String color, String genero, String nombre, String pelicula, int edad) {
        super(altura, color, genero, nombre);
        this.pelicula = pelicula;
        this.edad = edad;
    }
}
