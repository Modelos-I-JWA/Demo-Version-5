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
public class MuerteIzqOrco implements MuerteIzq{

  
    @Override
     public ArrayList<String> operacion() {
        ArrayList<String> MuerHum = new ArrayList<String>();
        MuerHum.add("Recursos\\ImagenesOrco\\MuerteIzquierda\\MuerOrc1.jpg");
        MuerHum.add("Recursos\\ImagenesOrco\\MuerteIzquierda\\MuerOrc2.jpg");
        MuerHum.add("Recursos\\ImagenesOrco\\MuerteIzquierda\\MuerOrc3.jpg");
        MuerHum.add("Recursos\\ImagenesOrco\\MuerteIzquierda\\MuerOrc4.jpg");
        MuerHum.add("/Sonidos/HumanoMuerte.wav");
        return MuerHum;
    }
}
