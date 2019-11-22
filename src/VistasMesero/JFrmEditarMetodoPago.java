/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasMesero;

import Aplicacion.SistemaRestauranteFrames;
import javax.swing.JOptionPane;

/**
 *
 * @author Naomi
 */
public class JFrmEditarMetodoPago extends javax.swing.JFrame {

    /**
     * Creates new form JFrmEditarMetodoPago
     */
    public JFrmEditarMetodoPago() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private void showMetodoPago() {
        this.textMetoPagoActual.setText(SistemaRestauranteFrames.listapedidos.get(JFrmEditarCuenta.noCuenta).getMetodoDePago());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        labelPagoActual = new javax.swing.JLabel();
        labelPagoNuevo = new javax.swing.JLabel();
        textMetoPagoActual = new javax.swing.JTextField();
        textMetPagoNuevo = new javax.swing.JTextField();
        buttonRegresar = new javax.swing.JButton();
        buttonModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        labelTitulo.setText("Cambiando el Método de Pago...");

        labelPagoActual.setText("Método de Pago Actual:");

        labelPagoNuevo.setText("Método de Pago Nuevo:");

        buttonRegresar.setBackground(new java.awt.Color(204, 0, 0));
        buttonRegresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        buttonRegresar.setText("Regresar");
        buttonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonRegresarMouseClicked(evt);
            }
        });

        buttonModificar.setBackground(new java.awt.Color(102, 153, 0));
        buttonModificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonModificar.setForeground(new java.awt.Color(255, 255, 255));
        buttonModificar.setText("Modificar");
        buttonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonModificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(labelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPagoActual)
                            .addComponent(labelPagoNuevo))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textMetoPagoActual)
                            .addComponent(textMetPagoNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(buttonRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPagoActual)
                    .addComponent(textMetoPagoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPagoNuevo)
                    .addComponent(textMetPagoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRegresar)
                    .addComponent(buttonModificar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRegresarMouseClicked
        this.dispose();
        new JFrmMenuEditarCuenta().setVisible(true);
    }//GEN-LAST:event_buttonRegresarMouseClicked

    private void buttonModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonModificarMouseClicked

        String metodopago = this.textMetPagoNuevo.getText();

        //procedemos a modficar el número de mesa
        SistemaRestauranteFrames.listapedidos.get(JFrmEditarCuenta.noCuenta).setMetodoDePago(metodopago);
        JOptionPane.showMessageDialog(null, "El método de pago ha sido modificado correctamente");

        this.textMetPagoNuevo.setText("");

    }//GEN-LAST:event_buttonModificarMouseClicked

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
            java.util.logging.Logger.getLogger(JFrmEditarMetodoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmEditarMetodoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmEditarMetodoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmEditarMetodoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmEditarMetodoPago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonModificar;
    private javax.swing.JButton buttonRegresar;
    private javax.swing.JLabel labelPagoActual;
    private javax.swing.JLabel labelPagoNuevo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textMetPagoNuevo;
    private javax.swing.JTextField textMetoPagoActual;
    // End of variables declaration//GEN-END:variables
}
