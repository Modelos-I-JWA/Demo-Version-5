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
public class MovimientoJ2 implements Estado{
      //JUGADOR 2
            
    @Override
    public void EjecutarAccion(KeyEvent e, ArrayList<Personaje> p) {
        switch (e.getKeyCode()) {    
            case KeyEvent.VK_RIGHT:    
                for(int i=0;i<p.size();i++){
                p.get(i).desplazamiento = 1;
                p.get(i).mover();
                }
                break;

            case KeyEvent.VK_UP:
                for(int i=0;i<p.size();i++){
                p.get(i).desplazamiento = 2;
                p.get(i).mover();
                }
                break;

            case KeyEvent.VK_LEFT:
                for(int i=0;i<p.size();i++){
                p.get(i).desplazamiento = 3;
                p.get(i).mover();
                }
                break;

            case KeyEvent.VK_DOWN:
                for(int i=0;i<p.size();i++){
                p.get(i).desplazamiento = 4;
                p.get(i).mover();
                }
         }      
    }
}