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
public class MuerteIzqElfo implements MuerteIzq{

    @Override
     public ArrayList<String> operacion() {
        ArrayList<String> MuerElf = new ArrayList<String>();
        MuerElf.add("Recursos\\ImagenesElfo\\MuerteIzquierda\\ElfMuer1.jpg");
        MuerElf.add("Recursos\\ImagenesElfo\\MuerteIzquierda\\ElfMuer2.jpg");
        MuerElf.add("Recursos\\ImagenesElfo\\MuerteIzquierda\\ElfMuer3.jpg");
        MuerElf.add("Recursos\\ImagenesElfo\\MuerteIzquierda\\ElfMuer4.jpg");
        MuerElf.add("Recursos\\ImagenesElfo\\MuerteIzquierda\\ElfMuer5.jpg");
        MuerElf.add("/Sonidos/HumanoMuerte.wav");
        return MuerElf;
    }
}
