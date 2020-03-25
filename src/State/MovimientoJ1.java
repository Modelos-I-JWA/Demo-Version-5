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
               for(int i=0;i<p.size();i++){
                p.get(i).desplazamiento = 1;
                p.get(i).mover();
                }
                break;

            case KeyEvent.VK_W:
                for(int i=0;i<p.size();i++){
                p.get(i).desplazamiento = 2;
                p.get(i).mover();
                }
                break;

            case KeyEvent.VK_A:
               for(int i=0;i<p.size();i++){
                p.get(i).desplazamiento = 3;
                p.get(i).mover();
                }
                break;

            case KeyEvent.VK_S:
                for(int i=0;i<p.size();i++){
                p.get(i).desplazamiento = 4;
                p.get(i).mover();
                }
                break;
         

        }
    }    


}
