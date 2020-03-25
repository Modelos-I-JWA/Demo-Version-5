/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import java.util.ArrayList;

/**
 *
 * @author Montes Martinez
 */
public class AtaqueIzqOrco implements AtaqueIzq{

    @Override
    public ArrayList<String> operacion() {
        ArrayList<String> AtqHum = new ArrayList<String>();
        AtqHum.add("Recursos\\ImagenesOrco\\AtaqueIzquierda\\AtqOrc1.jpg");
        AtqHum.add("Recursos\\ImagenesOrco\\AtaqueIzquierda\\AtqOrc2.jpg");
        AtqHum.add("Recursos\\ImagenesOrco\\AtaqueIzquierda\\AtqOrc3.jpg");
        AtqHum.add("/Sonidos/HumanoAtaque.wav");
        return AtqHum;
    }
}
