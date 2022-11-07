/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import maquina.de.doce.Maquina;
import java.awt.Color;

public class JFrameMaquina extends javax.swing.JFrame {
    
    Maquina maquina = new Maquina();
    
    

    public JFrameMaquina() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        btnDoceA = new javax.swing.JButton();
        btnDoceB = new javax.swing.JButton();
        javax.swing.JButton btnDoceC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn1Real = new javax.swing.JButton();
        btn2Reais = new javax.swing.JButton();
        btn5Reais = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDoceA.setText("Doce A");
        btnDoceA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoceAActionPerformed(evt);
            }
        });

        btnDoceB.setText("Doce B");
        btnDoceB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoceBActionPerformed(evt);
            }
        });

        btnDoceC.setText("Doce C");
        btnDoceC.setName(""); // NOI18N
        btnDoceC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoceCActionPerformed(evt);
            }
        });

        jLabel1.setText("Notas:");

        btn1Real.setText("1 Real");
        btn1Real.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1RealActionPerformed(evt);
            }
        });

        btn2Reais.setText("2 Reais");
        btn2Reais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ReaisActionPerformed(evt);
            }
        });

        btn5Reais.setText("5 Reais");
        btn5Reais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ReaisActionPerformed(evt);
            }
        });

        jLabel2.setText("Saldo:");

        lblSaldo.setText("0.0");

        jLabel4.setText("jLabel4");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Selecionar Doce");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSaldo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn1Real)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn2Reais))
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnDoceA)
                                        .addGap(63, 63, 63)
                                        .addComponent(btnDoceB)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn5Reais)
                                    .addComponent(btnDoceC, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(38, 38, 38))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDoceC)
                    .addComponent(btnDoceB)
                    .addComponent(btnDoceA))
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn2Reais)
                    .addComponent(btn5Reais)
                    .addComponent(btn1Real))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblSaldo))
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel4)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btn1RealActionPerformed(java.awt.event.ActionEvent evt) {                                         
        maquina.inserirNota(1);
        lblSaldo.setText(Integer.toString(maquina.getSaldo()));
        
        
    }                                        

    private void btn5ReaisActionPerformed(java.awt.event.ActionEvent evt) {                                          
        maquina.inserirNota(5);
         lblSaldo.setText(Integer.toString(maquina.getSaldo()));
    }                                         

    private void btn2ReaisActionPerformed(java.awt.event.ActionEvent evt) {                                          
        maquina.inserirNota(2);
         lblSaldo.setText(Integer.toString(maquina.getSaldo()));
    }                                         

    private void btnDoceAActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void btnDoceBActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void btnDoceCActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    


    

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn1Real;
    private javax.swing.JButton btn2Reais;
    private javax.swing.JButton btn5Reais;
    private javax.swing.JButton btnDoceA;
    private javax.swing.JButton btnDoceB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblSaldo;
    // End of variables declaration                   
}
