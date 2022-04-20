package practicaMultiverse;

import practicaMultiverse.clases.SpiderBParker;
import practicaMultiverse.clases.SpiderGwen;
import practicaMultiverse.clases.SpiderMiles;

public class MainSpiderman {
    public static void main(String[] args) {

        SpiderGwen gwen = new SpiderGwen();
        SpiderMiles miles = new SpiderMiles();
        SpiderBParker parker = new SpiderBParker();

        gwen.setFuerza(100);
        gwen.setExperiencia(2);
        gwen.setResistencia(100);
        gwen.golpeDebil(gwen.getFuerza(), gwen.getResistencia());

        miles.setFuerza(75);
        miles.setExperiencia(1);
        miles.setResistencia(125);
        miles.golpeFuerte(miles.getFuerza(), miles.getResistencia());

        parker.setFuerza(150);
        parker.setExperiencia(5);
        parker.setResistencia(120);
        parker.patadaFuerte(parker.getFuerza(), parker.getResistencia());

        System.out.println("Gwen hizo el siguiente daño : "+gwen.getDañoOponente());
        System.out.println("Miles hizo el siguiente daño : "+miles.getDañoOponente());
        System.out.println("Peter B Parker hizo el siguiente daño : "+parker.getDañoOponente());

    }
}
