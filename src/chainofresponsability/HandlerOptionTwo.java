/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

import Builder.Personaje;

/**
 *
 * @author estudiantes
 */
public class HandlerOptionTwo extends Handler{

    @Override
    public void handlerRequest(int opt, Personaje per) {
        System.out.println("entraaaaaaaa");
        if(opt == 2){
            System.out.println("SUBE VIDAAAA");
            per.setvAnimacion(per.getvAnimacion() + 1);
             per.velocidad=per.velocidad-40;
             }else{
            successor.handlerRequest(opt,per);
        }
    }

    
    
}
