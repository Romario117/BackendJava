package practicaComic.clasesComic;

import java.util.ArrayList;
import java.util.List;

public class Comics implements AccionesComic {
    ComicModelo c = new ComicModelo();
    @Override
    public List llenarComic() {
        List comic = new ArrayList();
        comic.add("JOJOS Bizarre ADVENTURE");
        comic.add("Jojo se dirige a Italia");
        comic.add("siguiendo las instrucciones de Stroheim");
        comic.add("");
        c.setContenido(comic);
        return c.getContenido();
    }

    @Override
    public String LeerComic() {
        String lectura =  "";
        for(int i = 0; i < c.getContenido().size(); i++)
            System.out.printf(c.getContenido().get(i).toString()+" ");
        return lectura;
    }
}
