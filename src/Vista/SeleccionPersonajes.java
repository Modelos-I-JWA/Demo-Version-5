/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Builder.Builder;
import Builder.ConstructorElfo;
import Builder.ConstructorHumano;
import Builder.ConstructorOrco;
import Builder.ConstructorPoderAgrandar;
import Builder.ConstructorPoderSacarClone;
import Builder.ConstructorPoderSubeVida;
import Builder.ConstructorPoderTeletransporte;
import javax.swing.JOptionPane;

/**
 *
 * @author Montes Martinez
 */
public class SeleccionPersonajes extends javax.swing.JFrame {
 
    Builder build;
    Builder build2;
    public SeleccionPersonajes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        humano1 = new javax.swing.JRadioButton();
        elfo1 = new javax.swing.JRadioButton();
        orco1 = new javax.swing.JRadioButton();
        humano2 = new javax.swing.JRadioButton();
        elfo2 = new javax.swing.JRadioButton();
        orco2 = new javax.swing.JRadioButton();
        jugar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Jugador 1");

        jLabel2.setText("Jugador 2");

        buttonGroup1.add(humano1);
        humano1.setText("Humano");

        buttonGroup1.add(elfo1);
        elfo1.setText("Elfo");
        elfo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elfo1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(orco1);
        orco1.setText("Orco");

        buttonGroup2.add(humano2);
        humano2.setText("Humano");

        buttonGroup2.add(elfo2);
        elfo2.setText("Elfo");

        buttonGroup2.add(orco2);
        orco2.setText("Orco");

        jugar.setText("Jugar");
        jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(103, 103, 103))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(humano1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(humano2)
                        .addGap(86, 86, 86))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orco1)
                            .addComponent(elfo1))
                        .addGap(190, 190, 190)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(elfo2)
                            .addComponent(orco2))
                        .addContainerGap(102, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(humano1)
                    .addComponent(humano2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elfo1)
                    .addComponent(elfo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orco1)
                    .addComponent(orco2))
                .addGap(18, 18, 18)
                .addComponent(jugar)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarActionPerformed
        if((humano1.isSelected() || orco1.isSelected() || elfo1.isSelected()) && (humano1.isSelected() || orco1.isSelected()) && (humano1.isSelected() || elfo1.isSelected()) && 
            (elfo1.isSelected() || orco1.isSelected()) || (humano2.isSelected() || orco2.isSelected() || elfo2.isSelected()) && (humano2.isSelected() || orco2.isSelected()) && 
            (humano2.isSelected() || elfo2.isSelected())&& (elfo2.isSelected() || orco2.isSelected())){
        
            JOptionPane.showMessageDialog(null, "Cada jugador debe seleccionar solo un personaje");
            
        }else{

        if(humano1.isSelected()){
            build = new Builder();
            build.setConstructor(new ConstructorHumano());
            build.CrearPersonaje();
        }
        if(orco1.isSelected()){
            build = new Builder();
            build.setConstructor(new ConstructorOrco());
            build.CrearPersonaje();
        }
        if(elfo1.isSelected()){
            build = new Builder();
            build.setConstructor(new ConstructorElfo());
            build.CrearPersonaje();
        }
        if(humano2.isSelected()){
            build2 = new Builder();
            build2.setConstructor(new ConstructorHumano());
            build2.CrearPersonaje();
        }
        if(orco2.isSelected()){
            
            build2 = new Builder();
            build2.setConstructor(new ConstructorOrco());
            build2.CrearPersonaje();
        }
        if(elfo2.isSelected()){
            
            build2 = new Builder();
            build2.setConstructor(new ConstructorElfo());
            build2.CrearPersonaje();
        }
        Builder poder1 = new Builder();
        poder1.setConstructorp(new ConstructorPoderSubeVida());
        poder1.CrearPoder();
        
        Builder poder2 = new Builder();
        poder2.setConstructorp(new ConstructorPoderAgrandar());
        poder2.CrearPoder();
        
        Builder poder3 = new Builder();
        poder3.setConstructorp(new ConstructorPoderTeletransporte());
        poder3.CrearPoder();
        
        Builder poder4 = new Builder();
        poder4.setConstructorp(new ConstructorPoderSacarClone());
        poder4.CrearPoder();
        try{
            Vista1 ventana = new Vista1(build.getPersonaje(),build2.getPersonaje(),poder1.getPoder(), poder2.getPoder(), poder3.getPoder(), poder4.getPoder());
            ventana.setVisible(true);
            ventana.setResizable(false);
            this.setVisible(false);
            dispose();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
            
        }
   
        
    }//GEN-LAST:event_jugarActionPerformed
    
    private void elfo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elfo1ActionPerformed

    }//GEN-LAST:event_elfo1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton elfo1;
    private javax.swing.JRadioButton elfo2;
    private javax.swing.JRadioButton humano1;
    private javax.swing.JRadioButton humano2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jugar;
    private javax.swing.JRadioButton orco1;
    private javax.swing.JRadioButton orco2;
    // End of variables declaration//GEN-END:variables
}
