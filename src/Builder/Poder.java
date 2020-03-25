/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author Montes Martinez
 */
public class Poder extends JComponent implements Cloneable {
        static JPanel panel;
        public Thread hilo;
        int x;
        int alto;
        int ancho;
        Rectangle hitbox;
        protected ImageIcon[] PsubeVida;
        protected ImageIcon[] PAgrandar;
        protected ImageIcon[] Pteletransporte;
        protected ImageIcon[] PsacarClone;
        int desplazamientoVertical = 0;
        int desplazamientoHorizontal = 0;
         int numero = 0;
        Graphics g;
        public Poder() {
            hilo = null;
            x=0;
            alto=0;
            ancho=0;
            PsubeVida=null;
            PAgrandar=null;
            Pteletransporte=null;
        }
        public void setx(int x){
            this.x=x;
        }
        
        
        
    public void setDesplazamientoVertical(int desplazamiento) {
        this.desplazamientoVertical = desplazamiento;
    }

    public void setDesplazamientoHorizontal(int desplazamiento) {
        this.desplazamientoHorizontal = desplazamiento;
    }

        public void setHilo (Graphics g)
   {        this.g=g;
            this.setH(10);
   }
            
        public void setH(final int sleep) {
            paint(g);
        this.hilo = new Thread() {
            @Override
            public void run() {
                try {
                    while(true){
                                numero++;
                                numero = numero % 10;
                                panel.repaint();
                                hilo.sleep(sleep);
                                 hitbox.x += 0;
                    }
                } catch (java.lang.InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        };
    }
        
        
    public void setPanel(JPanel panel) {
        this.panel = panel;  
        setBounds(0, 0, panel.getWidth(), panel.getHeight());
    }
    
    
    public void paint(Graphics g) {
   
        try {
            g.drawRect(hitbox.x, hitbox.y, hitbox.width, hitbox.height);

            switch (x) {
                case 1:
                        g.drawImage(PsubeVida[0].getImage(), 50 + desplazamientoHorizontal, 0 + desplazamientoVertical, ancho, alto , null);
                        break;
                case 2:
                        g.drawImage(PAgrandar[0].getImage(), 50 + desplazamientoHorizontal, desplazamientoVertical, ancho, alto , null);
                    break;
                 case 3:
                        g.drawImage(Pteletransporte[0].getImage(), 50 + desplazamientoHorizontal, desplazamientoVertical, ancho, alto, null);
                    break;
                case 4:
                        g.drawImage(PsacarClone[0].getImage(), 50 + desplazamientoHorizontal, desplazamientoVertical, ancho, alto, null);
                    break;    
                default:
                    break;
            }
        } catch (Exception ex) {

        }
       
    }
    
    
     @Override
    public Poder clone() {
        Poder PoderClonado = null;
        try {
            PoderClonado = (Poder) super.clone();
                PoderClonado.setHilo(g);
        } catch (CloneNotSupportedException e) {
        }
        return PoderClonado;
    }
    
     public ImageIcon[] getSacarClone() {
        return PsacarClone;
    }

    public void setSacarClone(ImageIcon[] PsacarClone) {
        this.PsacarClone = PsacarClone;
    }
    

    public ImageIcon[] getAgrandar() {
        return PAgrandar;
    }

    public void setAgrandar(ImageIcon[] PAgrandar) {
        this.PAgrandar = PAgrandar;
    }

    public ImageIcon[] getUpVida() {
        return PsubeVida;
    }

    public void setUpVida(ImageIcon[] PsubeVida) {
        this.PsubeVida = PsubeVida;
    }

    public ImageIcon[] getTeletransporte() {
        return Pteletransporte;
    }

    public void setTeletransporte(ImageIcon[] Pteletransporte) {
        this.Pteletransporte = Pteletransporte;
    }
    public void upVida() {
        x = 1;
        numero=10;
        if (!hilo.isAlive()) {
            hilo.start();
        }
    }
    public void gigante() {
        x = 2;
        numero=10;
        if (!hilo.isAlive()) {
            hilo.start();
        }
    }
    public void teletransporte() {
        x = 3;
        numero=10;
        if (!hilo.isAlive()) {
            hilo.start();
        }
    }
    public void sacarClone() {
        x = 4;
        numero=10;
        if (!hilo.isAlive()) {
            hilo.start();
        }
    }
    
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
     public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public Rectangle getHitbox() {
        return hitbox;
    }

    public void setHitbox(int x, int y, int ancho, int alto) {
         hitbox = new Rectangle(x+50, y , ancho-30, alto-10 );
    }
}

