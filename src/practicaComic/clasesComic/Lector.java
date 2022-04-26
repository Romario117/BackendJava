package practicaComic.clasesComic;

public class Lector extends Thread{

    Comics comics = new Comics();
public void llenado(){
    comics.llenarComic();
}

    @Override
    public void run() {
    llenado();
        try {
            Thread.sleep(1000);
            comics.LeerComic();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
