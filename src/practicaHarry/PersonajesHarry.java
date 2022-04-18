package practicaHarry;

public class PersonajesHarry {

    private String nombre;
    private String casa;
    private String boggart;
    private String patronus;
public PersonajesHarry(){

}

    public PersonajesHarry(String nombre, String casa, String boggart, String patronus) {
        this.nombre = nombre;
        this.casa = casa;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getBoggart() {
        return boggart;
    }

    public void setBoggart(String boggart) {
        this.boggart = boggart;
    }

    public String getPatronus() {
        return patronus;
    }

    public void setPatronus(String patronus) {
        this.patronus = patronus;
    }
}
