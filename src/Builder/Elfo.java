/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author Juan David
 */
public class Elfo extends Personaje {
    public Elfo() {
        super.setHilo(6 , 6 , 6, 5, 5, velocidad);
        super.ancho = 100;
        super.alto = 80;
        super.relacion = 1;
        super.derecha = new ImageIcon[6];
        super.izquierda=new ImageIcon[6];
        super.atacarIzq=new ImageIcon[5];
        super.morirIzq=new ImageIcon[5];
        super.saltar = new ImageIcon[6];
        super.morir = new ImageIcon[5];
        super.atacar = new ImageIcon[5];
        
    }
}
