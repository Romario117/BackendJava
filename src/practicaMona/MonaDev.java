package practicaMona;

public class MonaDev extends MonaCatModelo{

    public String lenguaje;
    public String nivel;
    public int aniosXp;

    public MonaDev(double altura, String color, String genero, String nombre, String lenguaje, String nivel, int aniosXp) {
        super(altura, color, genero, nombre);
        this.lenguaje = lenguaje;
        this.nivel = nivel;
        this.aniosXp = aniosXp;
    }

    public MonaDev(){}


}
