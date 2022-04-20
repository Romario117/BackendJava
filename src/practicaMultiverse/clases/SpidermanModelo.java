package practicaMultiverse.clases;

public class SpidermanModelo {
    private String nombre;
    private String universo;
    private String colorTraje;
    private int edad;
    private int fuerza;
    private int resistencia;
    private int experiencia;
    private int sensibilidad;
    private int dañoOponente;

    public SpidermanModelo() {}

    public SpidermanModelo(String nombre, String universo, String colorTraje, int edad, int fuerza, int resistencia, int experiencia, int sensibilidad, int dañoOponente) {
        this.nombre = nombre;
        this.universo = universo;
        this.colorTraje = colorTraje;
        this.edad = edad;
        this.fuerza = fuerza;
        this.resistencia = resistencia;
        this.experiencia = experiencia;
        this.sensibilidad = sensibilidad;
        this.dañoOponente = dañoOponente;

    }

    public void setNombre(String nombre){ this.nombre = nombre; };
    public void setUniverso(String universo){ this.universo = universo; }
    public void setColorTraje(String colorTraje){ this.colorTraje = colorTraje; }
    public void setEdad(int edad){ this.edad = edad; }
    public void setFuerza(int fuerza){ this.fuerza = fuerza; }
    public void setResistencia(int resistencia){this.resistencia = resistencia; }
    public void setExperiencia(int experiencia){ this.experiencia = experiencia; }
    public void setSensibilidad(int sensibilidad){ this.sensibilidad = sensibilidad; }
    public void setDañoOponente(int dañoOponente) {  this.dañoOponente = dañoOponente;  }

    public String getNombre(){ return nombre;}
    public String getUniverso() { return universo;}
    public String getColorTraje(){ return colorTraje;}
    public int getEdad() { return edad; }
    public int getFuerza(){ return fuerza; }
    public int getResistencia(){ return  resistencia; }
    public int getExperiencia(){ return experiencia; }
    public int getSensibilidad(){ return  sensibilidad; }
    public int getDañoOponente() {  return dañoOponente;  }

    @Override
    public String toString() {
        return "SpidermanModelo{" +
                "nombre='" + nombre + '\'' +
                ", universo='" + universo + '\'' +
                ", colorTraje='" + colorTraje + '\'' +
                ", edad=" + edad +
                ", fuerza=" + fuerza +
                ", resistencia=" + resistencia +
                ", experiencia=" + experiencia +
                '}';
    }
}
