/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Montes Martinez
 */
public class ConstructorPoderTeletransporte extends BuilderPoder{
      public void ConstruirPoder() {
        poder = new Teletransporte();
    }

    @Override
    public void CrearAnimaciones() {

        try {
            poder.Pteletransporte[0]= new ImageIcon(ImageIO.read(new File("Recursos\\ImagenPoder\\poder.jpg")));            
        } catch (IOException ex) {
            Logger.getLogger(Poder.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
