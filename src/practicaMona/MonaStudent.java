package practicaMona;

public class MonaStudent extends MonaCatModelo{
    String escuela;
    double promedio;
    int numAsignaturas;

    public MonaStudent(){}

    public MonaStudent(double altura, String color, String genero, String nombre, String escuela, double promedio, int numAsignaturas) {
        super(altura, color, genero, nombre);
        this.escuela = escuela;
        this.promedio = promedio;
        this.numAsignaturas = numAsignaturas;
    }
}
