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
    boolean tamañop1=false;
    boolean tamañop2=false;
    Estado estado;
    Boolean est1;
    Boolean est2;
    Personaje per;
    Personaje per2;
    Selector s = new Selector();
    int c;
    Control ctr = new Control() {};


    public Vista1(Personaje per,Personaje per2, Poder poderS, Poder poderA, Poder poderT, Poder poderC) {
        initComponents();
        this.per=per;
        this.per2=per2;
        this.setEstado1(true);
        this.setEstado2(true);
        est1=this.getvAnimacion1();
        est2=this.getvAnimacion2();
        poderS.setPanel(panel);
        poderA.setPanel(panel);
        poderT.setPanel(panel);
        poderC.setPanel(panel);
        
        poderS.setx(1);
        poderA.setx(2);
        poderT.setx(3);
        poderC.setx(4);
        
        per.setPanel(panel);
        per2.setPanel(panel);
        
        
        this.p1.add(per);
        //this.p1.add(per.clone());
        
        this.p1.get(0).setHitbox(0,250 , this.p1.get(0).getAncho(), this.p1.get(0).getAlto());
        this.p1.get(0).setDesplazamientoVertical(250);
        this.p1.get(0).setPlayer(1);
 
        //this.p1.get(1).setHitbox(200, 250, this.p1.get(1).getAncho(), this.p1.get(1).getAlto());
        //this.p1.get(1).setDesplazamientoHorizontal(200);
        //this.p1.get(1).setDesplazamientoVertical(250);
        //this.p1.get(1).setPlayer(1);
        
        this.p2.add(per2);
        //this.p2.add(per2.clone());
        this.p2.get(0).setHitbox(1150, 250, this.p2.get(0).getAncho(), this.p2.get(0).getAlto());
        this.p2.get(0).setDesplazamientoHorizontal(1150);
        this.p2.get(0).setDesplazamientoVertical(250);
        this.p2.get(0).setPlayer(2);
        
        //this.p2.get(1).setHitbox(950, 250, this.p2.get(1).getAncho(), this.p2.get(1).getAlto());
        //this.p2.get(1).setDesplazamientoHorizontal(950);
        //this.p2.get(1).setDesplazamientoVertical(250);
        //this.p2.get(1).setPlayer(2);
        
        panel.add(this.p1.get(0));
        //panel.add(this.p1.get(1));
        panel.add(this.p2.get(0));
        //panel.add(this.p2.get(1));
        
        
        this.poderes.add(poderT);
        this.poderes.add(poderA);
        this.poderes.add(poderA.clone());
        this.poderes.add(poderS);
        this.poderes.add(poderS.clone());
        this.poderes.add(poderC);
        
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
        
        this.poderes.get(5).setHitbox(570, 10, this.poderes.get(5).getAncho() , this.poderes.get(5).getAlto());
        this.poderes.get(5).setDesplazamientoVertical(10);
        this.poderes.get(5).setDesplazamientoHorizontal(570);
        
        panel.add(this.poderes.get(0));
        panel.add(this.poderes.get(1));
        panel.add(this.poderes.get(2));
        panel.add(this.poderes.get(3));
        panel.add(this.poderes.get(4));
        panel.add(this.poderes.get(5));

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
                for(int i=0;i<p1.size();i++)
                p1.get(i).atacar();
                
                break;
                
            case KeyEvent.VK_NUMPAD1:
                for(int i=0;i<p2.size();i++)
                p2.get(i).atacar();
                
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
                    p2.get(0).tamañop=true;
                    c = 1;
                    ctr.operar(c, p1.get(0));
            }
        }
        for (int i = 0; i < p2.size(); i++) {
                if ( p2.get(i).getHitbox().intersects(poderes.get(1).getHitbox()) || p2.get(i).getHitbox().intersects(poderes.get(2).getHitbox())) {
                    p1.get(0).tamañop=true;
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
                if ( p1.get(i).getHitbox().intersects(poderes.get(5).getHitbox())) {
                    this.p1.add(per.clone());
                    this.p1.get(1).setHitbox(670, 10, this.p1.get(1).getAncho(), this.p1.get(1).getAlto());
                    this.p1.get(1).setDesplazamientoHorizontal(670);
                    this.p1.get(1).setDesplazamientoVertical(10);
                    this.p1.get(1).setPlayer(1);
                    poderes.get(5).setHitbox(5000,10,30,10);
                    panel.add(this.p1.get(1));
            }
        }
        for (int i = 0; i < p2.size(); i++) {
                 if ( p2.get(i).getHitbox().intersects(poderes.get(5).getHitbox())) {
                    this.p2.add(per2.clone());
                    this.p2.get(1).setHitbox(470, 10, this.p2.get(1).getAncho(), this.p2.get(1).getAlto());
                    this.p2.get(1).setDesplazamientoHorizontal(470);
                    this.p2.get(1).setDesplazamientoVertical(10);
                    this.p2.get(1).setPlayer(2);
                    poderes.get(5).setHitbox(5000,10,30,10);
                    panel.add(this.p2.get(1)); 
            }
        }
        
        for (int i = 0; i < p1.size(); i++) {
            for(int j = 0; j < p2.size(); j++){
                if ( p1.get(i).getHitbox().intersects(p2.get(j).getHitbox()) && e.getKeyCode()==KeyEvent.VK_NUMPAD1) {
                    System.out.println("GOPLE J1");
                    c = 2;
                    ctr.operar(c, p1.get(0)); 
                }
            }
        }
        for (int i = 0; i < p1.size(); i++) {
            for(int j = 0; j < p2.size(); j++){
                if ( p1.get(i).getHitbox().intersects(p2.get(j).getHitbox()) && e.getKeyCode()==KeyEvent.VK_X) {
                    System.out.println("GOPLE J2");
                    c = 2;
                    ctr.operar(c, p2.get(0)); 
                }
            }
        }
     if(p1.get(0).vAnimacion==0){
        p1.get(0).velocidad=240;
        for(int i=0;i<p1.size();i++)
        p1.get(i).morir();
        Resultado result=new Resultado("GANADOR JUGADOR 1");
        result.setVisible(true);
        result.setResizable(false);
        panel.setEnabled(false);
        this.setVisible(false);
            dispose();
     }
     
     if(p2.get(0).vAnimacion==0){
        p2.get(0).velocidad=240;
        for(int i=0;i<p2.size();i++)
            p2.get(i).morir();
        Resultado result=new Resultado("GANADOR JUGADOR 2");
        result.setVisible(true);
        result.setResizable(false);
        panel.setEnabled(false);
        this.setVisible(false);
            dispose();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1293, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 655, Short.MAX_VALUE)
        );

        jLabel1.setText("Jugador 1");

        jLabel2.setText("Flechas y 1");

        jLabel3.setText("Jugador 2");

        jLabel4.setText("WASD y X");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(51, 51, 51)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KP(java.awt.event.KeyEvent evt) {
        keyPressed(evt);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

}
