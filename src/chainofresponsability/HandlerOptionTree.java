/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

import Builder.Personaje;

/**
 *
 * @author Montes Martinez
 */
public class HandlerOptionTree extends Handler{

    @Override
    public void handlerRequest(int opt, Personaje per) {
        if(opt == 3){
            System.out.println("BAJA VIDA GRANDE");
                per.perderVida(true);
             }else{
            successor.handlerRequest(opt,per);
        
        }
    }
    
}
