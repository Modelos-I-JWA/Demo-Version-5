/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Montes Martinez
 */
class Teletransporte extends Poder{
     
    Teletransporte() {
        Graphics g = getGraphics(); 
        super.setHilo(g);
        super.alto=100;
        super.ancho=100;
        super.Pteletransporte = new ImageIcon[1];
    }
}
