/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import javax.swing.ImageIcon;
import java.awt.Graphics;
/**
 *
 * @author Montes Martinez
 */
class SubeVida extends Poder{

    SubeVida() {
        Graphics g = getGraphics();
        super.setHilo(g);
        super.alto=100;
        super.ancho=100;
        super.PsubeVida = new ImageIcon[1];
    }


    
}
