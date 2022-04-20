package practicaMultiverse.clases;

public class SpiderBParker extends SpidermanModelo implements habilidadesSpiderman{

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
        if ((fuerza>=100 && fuerza<= 400) && (resistencia>=1000)){
            setDañoOponente(100);
            setResistencia(getResistencia()-5);
            return getDañoOponente();
        }else if ((fuerza>=500 && fuerza<= 1000) && (resistencia>=1000)){
            setDañoOponente(150);
            setResistencia(getResistencia()-10);
            return getDañoOponente();
        }else if ((fuerza>=100 && fuerza<= 400) && resistencia<=1000){
            setDañoOponente(70);
            setResistencia(getResistencia()-7);
            return getDañoOponente();
        }else if ((fuerza >=500 && fuerza <= 1000) && (resistencia<=1000)){
            setDañoOponente(80);
            setResistencia(getResistencia()-15);
            return getDañoOponente();
        }else{
            setDañoOponente(0);
        }
        return getDañoOponente();
    }

    @Override
    public int golpeFuerte(int fuerza, int resistencia) {
        if ((fuerza>=100 && fuerza<= 400) && (resistencia>=1000)){
            setDañoOponente(100);
            setResistencia(getResistencia()-5);
            return getDañoOponente();
        }else if ((fuerza>=500&& fuerza<= 1000) && (resistencia>=1000)){
            setDañoOponente(105);
            setResistencia(getResistencia()-10);
            return getDañoOponente();
        }else if ((fuerza>=100 && fuerza<= 400) && (resistencia<=1000)){
            setDañoOponente(70);
            setResistencia(getResistencia()-7);
            return getDañoOponente();
        }else if ((fuerza >=500 && fuerza <= 1000) && (resistencia<=1000)){
            setDañoOponente(80);
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
        if ((fuerza>=100 && fuerza<= 400) && (resistencia>=1000)){
            setDañoOponente(100);
            setResistencia(getResistencia()-5);
            return getDañoOponente();
        }else if ((fuerza>=500&& fuerza<= 1000) && (resistencia>=1000)){
            setDañoOponente(105);
            setResistencia(getResistencia()-10);
            return getDañoOponente();
        }else if ((fuerza>=100 && fuerza<= 400) && (resistencia<=1000)){
            setDañoOponente(70);
            setResistencia(getResistencia()-7);
            return getDañoOponente();
        }else if ((fuerza >=500 && fuerza <= 1000) && (resistencia<=1000)){
            setDañoOponente(80);
            setResistencia(getResistencia()-15);
            return getDañoOponente();
        }else{
            setDañoOponente(0);
        }
        return getDañoOponente();
    }
}
