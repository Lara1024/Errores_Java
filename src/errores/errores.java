/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errores;

import javax.swing.JOptionPane;

/**
 *
 * @author hecto
 */
public class errores extends javax.swing.JFrame {

    /**
     * Creates new form errores
     */
    public errores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        absoluto = new javax.swing.JButton();
        relativo = new javax.swing.JButton();
        porcentual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Propagación de errores");

        jLabel2.setText("medida de lo que se quiere medir (pulgadas)");

        jLabel3.setText("Error");

        absoluto.setText("Error Absoluto");
        absoluto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absolutoActionPerformed(evt);
            }
        });

        relativo.setText("Error Relativo");
        relativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relativoActionPerformed(evt);
            }
        });

        porcentual.setText("Error Porcentual");
        porcentual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porcentualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(absoluto)
                                .addGap(27, 27, 27)
                                .addComponent(relativo)))))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(porcentual)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(absoluto)
                    .addComponent(relativo)
                    .addComponent(porcentual))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void absolutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absolutoActionPerformed
double valorRadio,valorError,RespuestaAbsoluta,Area;
valorRadio= Double.parseDouble(jTextField1.getText());
valorError= Double.parseDouble(jTextField2.getText());
Area=3.1416*valorRadio*valorRadio;
RespuestaAbsoluta=2*3.1416*valorRadio*valorError;
JOptionPane.showMessageDialog(null,"el error absoluto es de: "+RespuestaAbsoluta+" pulgadas al cuadrado y el area: "+Area);
    }//GEN-LAST:event_absolutoActionPerformed

    private void relativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relativoActionPerformed
double valorRadio,valorError,errorRel,Area,abs;
valorRadio= Double.parseDouble(jTextField1.getText());
valorError= Double.parseDouble(jTextField2.getText());
Area=3.1416*valorRadio*valorRadio;
abs=2*3.1416*valorRadio*valorError;
errorRel=abs/Area;
JOptionPane.showMessageDialog(null,"el valor relativo es: "+errorRel+"  y el area es: "+Area);
    }//GEN-LAST:event_relativoActionPerformed

    private void porcentualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porcentualActionPerformed
        double valorRadio,valorError,errorRel,Area,ErrorPorcentual;
valorRadio= Double.parseDouble(jTextField1.getText());
valorError= Double.parseDouble(jTextField2.getText());
Area=3.1416*valorRadio*valorRadio;
errorRel=2*valorError/valorRadio;
ErrorPorcentual=errorRel*100;
JOptionPane.showMessageDialog(null,"Por cada 100 pulgadas se estará cometiendo un error de: "+errorRel);
    }//GEN-LAST:event_porcentualActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(errores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(errores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(errores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(errores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new errores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton absoluto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton porcentual;
    private javax.swing.JButton relativo;
    // End of variables declaration//GEN-END:variables
}
