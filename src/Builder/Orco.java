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
public class Orco extends Personaje{
    public Orco() {
        super.setHilo(5,5, 5, 4, 3, velocidad);
        super.ancho = 100;
        super.alto = 80;
        super.relacion = 3;
        super.derecha = new ImageIcon[5];
        super.izquierda= new ImageIcon[5];
        super.saltar = new ImageIcon[5];
        super.morir = new ImageIcon[4];
        super.atacar = new ImageIcon[3];
        super.atacarIzq=new ImageIcon[3];
        super.morirIzq=new ImageIcon[4];
    }
}
