/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

import Builder.Personaje;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 *
 * @author Montes Martinez
 */
public class MovimientoJ1 implements Estado{

    @Override
    public void EjecutarAccion(KeyEvent e, ArrayList<Personaje> p) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_D:
                
                p.get(0).desplazamiento = 1;
                p.get(1).desplazamiento = 1;
                p.get(0).mover();
                p.get(1).mover();
                break;

            case KeyEvent.VK_W:
                p.get(0).desplazamiento = 2;
                p.get(1).desplazamiento = 2;
                p.get(0).mover();
                p.get(1).mover();
                break;

            case KeyEvent.VK_A:
                p.get(0).desplazamiento = 3;
                p.get(1).desplazamiento = 3;
                p.get(0).mover();
                p.get(1).mover();
                break;

            case KeyEvent.VK_S:
                p.get(0).desplazamiento = 4;
                p.get(1).desplazamiento = 4;
                p.get(0).mover();
                p.get(1).mover();
                break;
         

        }
    }    


}
