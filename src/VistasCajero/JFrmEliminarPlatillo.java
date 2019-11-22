/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasCajero;

import Aplicacion.SistemaRestauranteFrames;
import Excepciones.IndiceArrayListException;
import javax.swing.JOptionPane;

/**
 *
 * @author Naomi
 */
public class JFrmEliminarPlatillo extends javax.swing.JFrame {

    /**
     * Creates new form JFrmEliminarPlatillo
     */
    public JFrmEliminarPlatillo() {
        initComponents();
        this.setLocationRelativeTo(null);
        imprimirPlatillos();
    }

    private void imprimirPlatillos() {
        for (int i = 0; i < SistemaRestauranteFrames.listapedidos.get(JFrmEditarCuenta.noCuenta).getPedido().getPlatillo().size(); i++) {
            this.textAreaVisualizarPlatillos.append("" + i + ". "
                    + SistemaRestauranteFrames.listapedidos.get(JFrmEditarCuenta.noCuenta).getPedido().getPlatillo().get(i).toString() + "\n");
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

        labelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaVisualizarPlatillos = new javax.swing.JTextArea();
        labelEliminarPlatillo = new javax.swing.JLabel();
        textEliminarPlatillo = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonEliminarPlatillo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        labelTitulo.setText("Platillos en la Cuenta:");

        textAreaVisualizarPlatillos.setColumns(20);
        textAreaVisualizarPlatillos.setRows(5);
        jScrollPane1.setViewportView(textAreaVisualizarPlatillos);

        labelEliminarPlatillo.setText("No. del platillo a eliminar:");

        buttonCancelar.setBackground(new java.awt.Color(204, 0, 0));
        buttonCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        buttonCancelar.setText("Cancelar");
        buttonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCancelarMouseClicked(evt);
            }
        });

        buttonEliminarPlatillo.setBackground(new java.awt.Color(255, 153, 0));
        buttonEliminarPlatillo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonEliminarPlatillo.setForeground(new java.awt.Color(255, 255, 255));
        buttonEliminarPlatillo.setText("Eliminar Platillo");
        buttonEliminarPlatillo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEliminarPlatilloMouseClicked(evt);
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
                        .addComponent(buttonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonEliminarPlatillo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(labelTitulo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(labelEliminarPlatillo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textEliminarPlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEliminarPlatillo)
                    .addComponent(textEliminarPlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelar)
                    .addComponent(buttonEliminarPlatillo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelarMouseClicked
        this.dispose();
        new JFrmEditarPedido().setVisible(true);
    }//GEN-LAST:event_buttonCancelarMouseClicked

    private void buttonEliminarPlatilloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEliminarPlatilloMouseClicked

        try {
            int noplat = Integer.parseInt(this.textEliminarPlatillo.getText());

            if (noplat > SistemaRestauranteFrames.listapedidos.get(JFrmEditarCuenta.noCuenta).getPedido().getPlatillo().size()
                    || noplat < SistemaRestauranteFrames.listapedidos.get(JFrmEditarCuenta.noCuenta).getPedido().getPlatillo().size()) {
                throw new IndiceArrayListException("El número ingresado no coincide con el"
                        + "\nnúmero de platillos registrados");
            }

            SistemaRestauranteFrames.listapedidos.get(JFrmEditarCuenta.noCuenta).getPedido().getPlatillo().remove(noplat);
            JOptionPane.showMessageDialog(null, "El platillo se ha removido correctamente");

        } catch (IndiceArrayListException except1) {
            JOptionPane.showMessageDialog(null, except1.getMessage());
        }
    }//GEN-LAST:event_buttonEliminarPlatilloMouseClicked

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
            java.util.logging.Logger.getLogger(JFrmEliminarPlatillo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmEliminarPlatillo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmEliminarPlatillo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmEliminarPlatillo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmEliminarPlatillo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonEliminarPlatillo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEliminarPlatillo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextArea textAreaVisualizarPlatillos;
    private javax.swing.JTextField textEliminarPlatillo;
    // End of variables declaration//GEN-END:variables
}