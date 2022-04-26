package practicaComic.clasesComic;

import java.util.List;

public class ComicModelo {
    private String titulo;
    private String autor;
    private List contenido;

    public  ComicModelo(){

    }

    public ComicModelo(String titulo, String autor, List contenido){
        this.titulo = titulo;
        this.autor = autor;
        this.contenido = contenido;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setContenido(List contenido) {
        this.contenido = contenido;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List getContenido() {
        return contenido;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }
}
