package practicaMona.modelos;

public class MonaBicker extends MonaCatModelo{

    public String tipoBicicleta;
    public double kilometrosRecorridos;
    public String motoFavorita;
    public String ciudadDestino;
    public String ciudadOrigen;

    public MonaBicker(){}

    public MonaBicker(double altura, String color, String genero, String nombre, String tipoBicicleta, double kilometrosRecorridos, String motoFavorita, String ciudadDestino, String ciudadOrigen) {
        super(altura, color, genero, nombre);
        this.tipoBicicleta = tipoBicicleta;
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.motoFavorita = motoFavorita;
        this.ciudadDestino = ciudadDestino;
        this.ciudadOrigen = ciudadOrigen;
    }
}
