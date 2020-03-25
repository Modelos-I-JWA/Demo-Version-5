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
public class AtaqueIzqElfo implements AtaqueIzq{
      @Override
    public ArrayList<String> operacion() {
        ArrayList<String> AtqHum = new ArrayList<String>();
        AtqHum.add("Recursos\\ImagenesElfo\\AtaqueIzquierda\\AtqElfIzq1.jpg");
        AtqHum.add("Recursos\\ImagenesElfo\\AtaqueIzquierda\\AtqElfIzq2.jpg");
        AtqHum.add("Recursos\\ImagenesElfo\\AtaqueIzquierda\\AtqElfIzq3.jpg");
        AtqHum.add("Recursos\\ImagenesElfo\\AtaqueIzquierda\\AtqElfIzq4.jpg");
        AtqHum.add("Recursos\\ImagenesElfo\\AtaqueIzquierda\\AtqElfIzq5.jpg");
        AtqHum.add("/Sonidos/HumanoAtaque.wav");
        return AtqHum;
    }
}
