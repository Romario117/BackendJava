package practicaMona.modelos;

public class MonaCatModelo {
    private double altura;
    private String color;
    private String genero;
    private String nombre;

    public MonaCatModelo(){

    }

    public MonaCatModelo(double altura, String color, String genero, String nombre) {
        this.altura = altura;
        this.color = color;
        this.genero = genero;
        this.nombre = nombre;
    }

    public void setAltura(double altura) {    this.altura = altura;    }
    public void setColor(String color) { this.color = color;  }
    public void setGenero(String genero) { this.genero = genero;  }
    public void setNombre(String nombre) { this.nombre = nombre;  }

    public double getAltura() { return altura; }
    public String getColor() { return color;  }
    public String getGenero() {  return genero;  }
    public String getNombre()  { return nombre;  }
}
