package Builder;

import java.util.ArrayList;

public class Builder {

    private BuilderPersonaje constructor;
    private BuilderPoder constructor2;

    public void setConstructor(BuilderPersonaje constructor) {
        this.constructor = constructor;
    }
    public void setConstructorp(BuilderPoder constructor2){
        this.constructor2=constructor2;
    }

    public Personaje getPersonaje() {
        return constructor.getPersonaje();
    }
    
    public Poder getPoder(){
        return constructor2.getPoder();
    }

    public void CrearPersonaje() {
        constructor.ConstruirPersonaje();
        constructor.CrearAnimaciones();
    }
    public void CrearPoder() {
        constructor2.ConstruirPoder();
        constructor2.CrearAnimaciones();
    }
}
