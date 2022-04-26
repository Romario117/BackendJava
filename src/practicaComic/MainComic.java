package practicaComic;

import practicaComic.clasesComic.Comics;
import practicaComic.clasesComic.Lector;

public class MainComic {
    public static void main(String[] args) {
            Thread comics = new Lector();
            Thread hilo = new Lector();

            comics.run();
            hilo.run();

    }
}
