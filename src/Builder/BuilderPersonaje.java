package Builder;

import AbstractFactory.Ataque;
import AbstractFactory.AtaqueIzq;
import AbstractFactory.AtaqueIzqHumano;
import AbstractFactory.Derecha;
import AbstractFactory.FabricaAbstracta;
import AbstractFactory.FabricaHumanos;
import AbstractFactory.Izquierda;
import AbstractFactory.Muerte;
import AbstractFactory.MuerteIzq;
import AbstractFactory.MuerteIzqHumano;
import AbstractFactory.Salto;


public abstract class BuilderPersonaje {

    protected Personaje personaje;
    protected Ataque ataque;
    protected Derecha derecha;
    protected Izquierda izquierda;
    protected Salto salto;
    protected Muerte muerte;
    protected AtaqueIzq atqIzq; 
    protected MuerteIzq muerIzq; 
    
    public Personaje getPersonaje() {
        return personaje;
    }

    public abstract void ConstruirPersonaje();
    public abstract void CrearAnimaciones();
}