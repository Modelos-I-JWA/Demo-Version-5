/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author Montes Martinez
 */
public abstract class BuilderPoder {
    protected Poder poder;
    protected SubeVida subeVida;
    protected Agrandar agrandar;
    protected Teletransporte tele;

    public Poder getPoder() {
        return poder;
    }

    public abstract void ConstruirPoder();
    public abstract void CrearAnimaciones();

}


