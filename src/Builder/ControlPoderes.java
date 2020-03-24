/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import java.io.IOException;
import javax.swing.JPanel;

/**
 *
 * @author Montes Martinez
 */
public abstract class ControlPoderes extends Personaje{
     protected Personaje personaje;

    public ControlPoderes(Personaje personaje, JPanel panel) throws IOException {
        this.personaje = personaje;
        this.personaje.setPanel(panel);
    }
}
