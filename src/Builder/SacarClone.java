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
public class SacarClone extends Poder{
   

    SacarClone() {
        Graphics g = getGraphics();
        super.setHilo(g);
        super.alto=100;
        super.ancho=100;
        super.PsacarClone = new ImageIcon[1];
    }

}
