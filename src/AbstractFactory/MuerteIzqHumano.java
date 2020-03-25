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
public class MuerteIzqHumano implements MuerteIzq{
    @Override
     public ArrayList<String> operacion() {
        ArrayList<String> MuerHum = new ArrayList<String>();
        MuerHum.add("Recursos\\ImagenesHumano\\MuerteIzquierda\\MuerHum1.jpg");
        MuerHum.add("Recursos\\ImagenesHumano\\MuerteIzquierda\\MuerHum2.jpg");
        MuerHum.add("Recursos\\ImagenesHumano\\MuerteIzquierda\\MuerHum3.jpg");
        MuerHum.add("Recursos\\ImagenesHumano\\MuerteIzquierda\\MuerHum4.jpg");
        MuerHum.add("Recursos\\ImagenesHumano\\MuerteIzquierda\\MuerHum5.jpg");
        MuerHum.add("Recursos\\ImagenesHumano\\MuerteIzquierda\\MuerHum6.jpg");
        MuerHum.add("Recursos\\ImagenesHumano\\MuerteIzquierda\\MuerHum7.jpg");
        MuerHum.add("/Sonidos/HumanoMuerte.wav");
        return MuerHum;
    }
}
