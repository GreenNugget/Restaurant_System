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
public class JFrmEditarNoMesa extends javax.swing.JFrame {

    /**
     * Creates new form JFrmEditarNoMesa
     */
    public JFrmEditarNoMesa() {
        initComponents();
        this.setLocationRelativeTo(null);
        showMesaActual();
    }

    private void showMesaActual() {
        try {
            this.textMesaActual.setText("" + SistemaRestauranteFrames.listapedidos.get(JFrmEditarCuenta.noCuenta).getNumeroMesa());
        } catch (java.lang.IndexOutOfBoundsException except1) {
            JOptionPane.showMessageDialog(null, "Aún no se han realizado pedidos");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNoMesaActual = new javax.swing.JLabel();
        textMesaActual = new javax.swing.JTextField();
        labelTitulo = new javax.swing.JLabel();
        labelNoMesaActua = new javax.swing.JLabel();
        textMesaActualizada = new javax.swing.JTextField();
        buttonRegresar = new javax.swing.JButton();
        buttonCambiarMesa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNoMesaActual.setText("El número de mesa actual es:");

        labelTitulo.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        labelTitulo.setText("Cambiando el Número de Mesa...");

        labelNoMesaActua.setText("El nuevo número de mesa es:");

        buttonRegresar.setBackground(new java.awt.Color(204, 0, 0));
        buttonRegresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        buttonRegresar.setText("Regresar");
        buttonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonRegresarMouseClicked(evt);
            }
        });

        buttonCambiarMesa.setBackground(new java.awt.Color(51, 153, 0));
        buttonCambiarMesa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonCambiarMesa.setForeground(new java.awt.Color(255, 255, 255));
        buttonCambiarMesa.setText("Cambiar");
        buttonCambiarMesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCambiarMesaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNoMesaActual)
                                    .addComponent(labelNoMesaActua)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(buttonRegresar)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textMesaActualizada, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textMesaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCambiarMesa))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNoMesaActual)
                    .addComponent(textMesaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNoMesaActua)
                    .addComponent(textMesaActualizada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCambiarMesa)
                    .addComponent(buttonRegresar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRegresarMouseClicked
        this.dispose();
        new JFrmMenuEditarCuenta().setVisible(true);
    }//GEN-LAST:event_buttonRegresarMouseClicked

    private void buttonCambiarMesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCambiarMesaMouseClicked

        int nomesa = Integer.parseInt(this.textMesaActualizada.getText());

        //procedemos a modficar el número de mesa
        SistemaRestauranteFrames.listapedidos.get(JFrmEditarCuenta.noCuenta).setNumeroMesa(nomesa);
        JOptionPane.showMessageDialog(null, "El número de mesa ha sido modificado correctamente");

        this.textMesaActualizada.setText("");
    }//GEN-LAST:event_buttonCambiarMesaMouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmEditarNoMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFrmEditarNoMesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCambiarMesa;
    private javax.swing.JButton buttonRegresar;
    private javax.swing.JLabel labelNoMesaActua;
    private javax.swing.JLabel labelNoMesaActual;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textMesaActual;
    private javax.swing.JTextField textMesaActualizada;
    // End of variables declaration//GEN-END:variables
}
