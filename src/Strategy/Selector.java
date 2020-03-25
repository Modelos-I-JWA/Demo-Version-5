/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import Builder.Personaje;
import Decorator.Component;
import Decorator.RealComponent;
import Decorator.WrapperUno;
import chainofresponsability.Implementar;
import java.util.ArrayList;

/**
 *
 * @author AndresFWilT
 */
public class Selector {
   
    
    

    public void selector(int accion, Personaje a,boolean tamaño) {
 
        if (accion == 1) {
            Component real = new RealComponent();    
            Component wrapper = new WrapperUno(real);
            Component wrapper2 = new WrapperUno(wrapper);
            wrapper2.doThis(a);
        }
        if (accion == 2) {
            if(a.tamañop==false){
            Implementar imp = new Implementar();
            imp.operacion(1, a);
            }else
            if (a.tamañop==true){
            Implementar imp = new Implementar();
            imp.operacion(3, a);   
            }
        
        }
        if (accion == 3) {
            Implementar imp = new Implementar();
            imp.operacion(2, a);
        }
    }

}






