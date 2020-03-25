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


public class ConstructorPoderSacarClone extends BuilderPoder{
    public void ConstruirPoder() {
        poder = new SacarClone();
    }

    @Override
    public void CrearAnimaciones() {

        try {
            poder.PsacarClone[0]= new ImageIcon(ImageIO.read(new File("Recursos\\ImagenPoder\\clonar.jpg")));            
        } catch (IOException ex) {
            Logger.getLogger(Poder.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
