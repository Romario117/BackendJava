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
        if ((fuerza>1 && fuerza< 4) && (resistencia>10)){
            setFuerza(10);
            setResistencia(getResistencia()-5);
            return getFuerza();
        }else if ((fuerza>5 && fuerza< 10) && (resistencia>10)){
            setFuerza(15);
            setResistencia(getResistencia()-10);
            return getFuerza();
        }else if ((fuerza>1 && fuerza< 4) && (resistencia<10)){
            setFuerza(7);
            setResistencia(getResistencia()-7);
            return getFuerza();
        }else if ((fuerza>5 && fuerza< 10) && (resistencia<10)){
            setFuerza(8);
            setResistencia(getResistencia()-15);
            return getFuerza();
        }else{
            setFuerza(0);
        }
        return getFuerza();
    }

    @Override
    public int golpeFuerte(int fuerza, int resistencia) {
        if ((fuerza>6 && fuerza< 15) && (resistencia>20)){
            setFuerza(10);
            return getFuerza();
        }else if ((fuerza>5 && fuerza< 10) && (resistencia>10)){
            setFuerza(15);
            return getFuerza();
        }else if ((fuerza>1 && fuerza< 4) && (resistencia<10)){
            setFuerza(7);
            return getFuerza();
        }else if ((fuerza>5 && fuerza< 10) && (resistencia<10)){
            setFuerza(8);
            return getFuerza();
        }else{
            setFuerza(0);
        }
        return getFuerza();
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
