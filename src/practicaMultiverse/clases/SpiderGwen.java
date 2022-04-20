package practicaMultiverse.clases;

public class SpiderGwen extends SpidermanModelo implements  habilidadesSpiderman{


    @Override
    public void sentidoAracnido(int experiencia) {
        if(experiencia >= 0 && experiencia <= 2)
            setSensibilidad(5);
        if (experiencia >= 3 && experiencia <= 5)
            setSensibilidad(10);
        if (experiencia > 6)
            setSensibilidad(15);
    }

    //cambiar return fuerza por dañoOponente
    @Override
    public int golpeDebil(int fuerza, int resistencia) {
        if ((fuerza>=10 && fuerza<= 40) && (resistencia>=100)){
            setDañoOponente(10);
            setResistencia(getResistencia()-5);
            return getDañoOponente();
        }else if ((fuerza>=50 && fuerza<= 100) && (resistencia>=100)){
            setDañoOponente(15);
            setResistencia(getResistencia()-10);
            return getDañoOponente();
        }else if ((fuerza>=10 && fuerza<= 40) && (resistencia<=100)){
            setDañoOponente(7);
            setResistencia(getResistencia()-7);
            return getDañoOponente();
        }else if ((fuerza >=50 && fuerza <= 100) && (resistencia<=100)){
            setDañoOponente(8);
            setResistencia(getResistencia()-15);
            return getDañoOponente();
        }else{
            setDañoOponente(0);
        }
        return getDañoOponente();
    }

    @Override
    public int golpeFuerte(int fuerza, int resistencia) {
        if ((fuerza>=10 && fuerza<= 40) && (resistencia>=100)){
            setDañoOponente(15);
            setResistencia(getResistencia()-10);
            return getDañoOponente();
        }else if ((fuerza>=50 && fuerza<= 100) && (resistencia>=100)){
            setDañoOponente(20);
            setResistencia(getResistencia()-15);
            return getDañoOponente();
        }else if ((fuerza>=10 && fuerza<= 40) && (resistencia<=100)){
            setDañoOponente(16);
            setResistencia(getResistencia()-14);
            return getDañoOponente();
        }else if ((fuerza>=50 && fuerza<= 100) && (resistencia<=100)){
            setDañoOponente(16);
            setResistencia(getResistencia()-15);
            return getDañoOponente();
        }else{
            setDañoOponente(0);
        }
        return getDañoOponente();
    }

    @Override
    public int patadaDebil(int fuerza, int resistencia) {
        return 0;
    }

    @Override
    public int patadaFuerte(int fuerza, int resistencia) {
        return 0;
    }
}
