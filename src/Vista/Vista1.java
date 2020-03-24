package Vista;

import Builder.Builder;
import Builder.ConstructorElfo;
import Builder.ConstructorHumano;
import Builder.ConstructorOrco;
import Builder.Elfo;
import Builder.Poder;
import Builder.Personaje;
import Decorator.Component;
import Decorator.RealComponent;
import Decorator.WrapperUno;
import Observer.Observador;
import State.Estado;
import State.MovimientoJ1;
import State.MovimientoJ2;
import State.TeletransporteJ1;
import State.TeletransporteJ2;
import Strategy.Control;
import Strategy.Selector;
import chainofresponsability.Implementar;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan David
 */
public class Vista1 extends javax.swing.JFrame implements KeyListener {

    ArrayList<Personaje> p1 = new ArrayList<>();
    ArrayList<Personaje> p2 = new ArrayList<>();
    ArrayList<Poder> poderes = new ArrayList<>();
    Observador observar=new Observador();
    Estado estado;
    Boolean est1;
    Boolean est2;
    Selector s = new Selector();
    
   
    int c;
    Control ctr = new Control() {};


    public Vista1(Personaje per,Personaje per2, Poder poderS, Poder poderA, Poder poderT) {
        initComponents();
        this.setEstado1(true);
        this.setEstado2(true);
        est1=this.getvAnimacion1();
        est2=this.getvAnimacion2();
        poderS.setPanel(panel);
        poderA.setPanel(panel);
        poderT.setPanel(panel);
        poderS.setx(1);
        poderA.setx(2);
        poderT.setx(3);
        
        per.setPanel(panel);
        per2.setPanel(panel);
        
        
        this.p1.add(per);
        this.p1.add(per.clone());
        
        this.p1.get(0).setHitbox(0,250 , this.p1.get(0).getAncho(), this.p1.get(0).getAlto());
        this.p1.get(0).setDesplazamientoVertical(250);
        this.p1.get(0).setPlayer(1);
 
        this.p1.get(1).setHitbox(200, 250, this.p1.get(1).getAncho(), this.p1.get(1).getAlto());
        this.p1.get(1).setDesplazamientoHorizontal(200);
        this.p1.get(1).setDesplazamientoVertical(250);
        this.p1.get(1).setPlayer(1);
        
        this.p2.add(per2);
        this.p2.add(per2.clone());
        this.p2.get(0).setHitbox(1150, 250, this.p2.get(1).getAncho(), this.p2.get(1).getAlto());
        this.p2.get(0).setDesplazamientoHorizontal(1150);
        this.p2.get(0).setDesplazamientoVertical(250);
        this.p2.get(0).setPlayer(2);
        
        this.p2.get(1).setHitbox(950, 250, this.p2.get(1).getAncho(), this.p2.get(1).getAlto());
        this.p2.get(1).setDesplazamientoHorizontal(950);
        this.p2.get(1).setDesplazamientoVertical(250);
        this.p2.get(1).setPlayer(2);
        
        panel.add(this.p1.get(0));
        panel.add(this.p1.get(1));
        panel.add(this.p2.get(0));
        panel.add(this.p2.get(1));
        
        
        this.poderes.add(poderT);
        this.poderes.add(poderA);
        this.poderes.add(poderA.clone());
        this.poderes.add(poderS);
        this.poderes.add(poderS.clone());
        
        this.poderes.get(0).setHitbox(570, 250, this.poderes.get(0).getAncho() , this.poderes.get(0).getAlto());
        this.poderes.get(0).setDesplazamientoVertical(250);
        this.poderes.get(0).setDesplazamientoHorizontal(570);
        
        this.poderes.get(1).setHitbox(10, 10, this.poderes.get(1).getAncho() , this.poderes.get(1).getAlto());
        this.poderes.get(1).setDesplazamientoVertical(10);
        this.poderes.get(1).setDesplazamientoHorizontal(10);
        
        this.poderes.get(2).setHitbox(1050, 550, this.poderes.get(2).getAncho() , this.poderes.get(2).getAlto());    
        this.poderes.get(2).setDesplazamientoVertical(550);
        this.poderes.get(2).setDesplazamientoHorizontal(1050);
        
        this.poderes.get(3).setHitbox(10, 550, this.poderes.get(3).getAncho() , this.poderes.get(3).getAlto());
        this.poderes.get(3).setDesplazamientoVertical(550);
        this.poderes.get(3).setDesplazamientoHorizontal(10);
        
        this.poderes.get(4).setHitbox(1050, 10, this.poderes.get(4).getAncho() , this.poderes.get(4).getAlto());
        this.poderes.get(4).setDesplazamientoVertical(10);
        this.poderes.get(4).setDesplazamientoHorizontal(1050);
        
        
        panel.add(this.poderes.get(0));
        panel.add(this.poderes.get(1));
        panel.add(this.poderes.get(2));
        panel.add(this.poderes.get(3));
        panel.add(this.poderes.get(4));

        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(true);
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(est1){
            estado=new MovimientoJ1();
            estado.EjecutarAccion(e,p1);
        }else{
            estado=new TeletransporteJ1();
            estado.EjecutarAccion(e,p1);
        }
        if(est2){
            estado=new MovimientoJ2();
            estado.EjecutarAccion(e,p2);
        }else{
            estado=new TeletransporteJ2();
            estado.EjecutarAccion(e,p2);
        }
                
        switch (e.getKeyCode()) {
           
            case KeyEvent.VK_X:
                p1.get(0).atacar();
                p1.get(1).atacar();
                break;
                
            case KeyEvent.VK_1:
                p2.get(0).atacar();
                p2.get(1).atacar();
                break;

        }
            
        for (int i = 0; i < p1.size(); i++) {
                if (p1.get(i).getHitbox().intersects(poderes.get(0).getHitbox())) {
                    notificar1(est1);
            }
        }
        for (int i = 0; i < p2.size(); i++) {
                if (p2.get(i).getHitbox().intersects(poderes.get(0).getHitbox())) {
                    notificar2(est2);
            }
        }
        for (int i = 0; i < p1.size(); i++) {
                if (p1.get(i).getHitbox().intersects(poderes.get(1).getHitbox()) || p1.get(i).getHitbox().intersects(poderes.get(2).getHitbox())) {
                    c = 1;
                    ctr.operar(c, p1.get(0));
            }
        }
        for (int i = 0; i < p2.size(); i++) {
                if ( p2.get(i).getHitbox().intersects(poderes.get(1).getHitbox()) || p2.get(i).getHitbox().intersects(poderes.get(2).getHitbox())) {
                    c = 1;
                    ctr.operar(c, p2.get(0));
            }
        }
        for (int i = 0; i < p1.size(); i++) {
                if (p1.get(i).getHitbox().intersects(poderes.get(3).getHitbox()) || p1.get(i).getHitbox().intersects(poderes.get(4).getHitbox())) {
                    c = 3;
                    ctr.operar(c, p1.get(0));
            }
        }
        for (int i = 0; i < p2.size(); i++) {
                if ( p2.get(i).getHitbox().intersects(poderes.get(3).getHitbox()) || p2.get(i).getHitbox().intersects(poderes.get(4).getHitbox())) {
                    c = 3;
                    ctr.operar(c, p2.get(0));
            }
        }
        
        for (int i = 0; i < p1.size(); i++) {
            for(int j = 0; j < p2.size(); j++)
                if ( p1.get(i).getHitbox().intersects(p2.get(j).getHitbox()) && p1.get(i).golpear==true) {
                    c = 2;
                    ctr.operar(c, p2.get(0)); 
            }
        }
        for (int i = 0; i < p1.size(); i++) {
            for(int j = 0; j < p2.size(); j++)
                if ( p1.get(i).getHitbox().intersects(p2.get(j).getHitbox()) && p2.get(i).golpear==true) {
                    c = 2;
                    ctr.operar(c, p1.get(0)); 
            }
        }
   
     if(p1.get(0).vAnimacion==0){
         p1.get(0).velocidad=240;
         p1.get(0).morir();
         JOptionPane.showMessageDialog(null,"Ganador Jugador 2");
     }
     
     if(p2.get(0).vAnimacion==0){
         p2.get(0).velocidad=240;
         p2.get(0).morir();
         JOptionPane.showMessageDialog(null,"Ganador Jugador 2");
     }   
        
    }       
    public void notificar1(boolean est) {
            
            this.setEstado1(observar.update(est));
    }
    public void notificar2(boolean est) {
            
            this.setEstado2(observar.update(est));
    }

    
    public  void setEstado2(boolean est) {
    this.est2=est;
    }

    public  void setEstado1(boolean est) {
    this.est1=est;
    }

    public boolean getvAnimacion1() {
        return est1;
    }
    
    public boolean getvAnimacion2() {
        return est2;
    }
    
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        BotonPoder = new javax.swing.JButton();
        BajarV = new javax.swing.JButton();
        SubirV = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1313, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        BotonPoder.setText("Poder");
        BotonPoder.setFocusable(false);
        BotonPoder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPoderActionPerformed(evt);
            }
        });
        BotonPoder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                KP(evt);
            }
        });

        BajarV.setText("Bajar Vida");
        BajarV.setFocusable(false);
        BajarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajarVActionPerformed(evt);
            }
        });
        BajarV.addKeyListener(new java.awt.event.KeyAdapter() {			//KeyPressed (Importante añadir este metodo a cada boton nuevo agregado)
            public void keyPressed(java.awt.event.KeyEvent evt) {
                KP(evt);
            }
        });

        SubirV.setText("Subir Vida");
        SubirV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubirVActionPerformed(evt);
            }
        });
        SubirV.addKeyListener(new java.awt.event.KeyAdapter() {			//KeyPressed (Importante añadir este metodo a cada boton nuevo agregado)
            public void keyPressed(java.awt.event.KeyEvent evt) {
                KP(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonPoder)
                    .addComponent(BajarV)
                    .addComponent(SubirV))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonPoder)
                .addGap(60, 60, 60)
                .addComponent(BajarV)
                .addGap(18, 18, 18)
                .addComponent(SubirV)
                .addContainerGap(528, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonPoderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPoderActionPerformed
       // c = 1;
       // ctr.operar(c, p1.get(0));
    }//GEN-LAST:event_BotonPoderActionPerformed

    private void BajarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajarVActionPerformed
        c = 2;
        ctr.operar(c, p1.get(0));
    }//GEN-LAST:event_BajarVActionPerformed

    private void SubirVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubirVActionPerformed
        c = 3;
        ctr.operar(c, p1.get(0));

    }//GEN-LAST:event_SubirVActionPerformed

    private void KP(java.awt.event.KeyEvent evt) {
        keyPressed(evt);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BajarV;
    private javax.swing.JButton BotonPoder;
    private javax.swing.JButton SubirV;
    public javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

}
