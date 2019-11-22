/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasMesero;

import Aplicacion.SistemaRestauranteFrames;
import Excepciones.IndiceArrayListException;
import javax.swing.JOptionPane;

/**
 *
 * @author Naomi
 */
public class JFrmEliminarPostre extends javax.swing.JFrame {

    /**
     * Creates new form JFrmEliminarPlatillo
     */
    public JFrmEliminarPostre() {
        initComponents();
        this.setLocationRelativeTo(null);
        imprimirPostres();
    }

    private void imprimirPostres() {
        for (int i = 0; i < SistemaRestauranteFrames.listapedidos.get(JFrmEditarCuenta.noCuenta).getPedido().getPostre().size(); i++) {
            this.textAreaVisualizarPostres.append("" + i + ". "
                    + SistemaRestauranteFrames.listapedidos.get(JFrmEditarCuenta.noCuenta).getPedido().getPostre().get(i).toString() + "\n");
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
        textAreaVisualizarPostres = new javax.swing.JTextArea();
        labelEliminarPostre = new javax.swing.JLabel();
        textEliminarPostre = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonEliminarPostre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        labelTitulo.setText("Postres en la Cuenta:");

        textAreaVisualizarPostres.setColumns(20);
        textAreaVisualizarPostres.setRows(5);
        jScrollPane1.setViewportView(textAreaVisualizarPostres);

        labelEliminarPostre.setText("No. del postre a eliminar:");

        buttonCancelar.setBackground(new java.awt.Color(204, 0, 0));
        buttonCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        buttonCancelar.setText("Cancelar");
        buttonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCancelarMouseClicked(evt);
            }
        });

        buttonEliminarPostre.setBackground(new java.awt.Color(255, 153, 0));
        buttonEliminarPostre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonEliminarPostre.setForeground(new java.awt.Color(255, 255, 255));
        buttonEliminarPostre.setText("Eliminar Postre");
        buttonEliminarPostre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEliminarPostreMouseClicked(evt);
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
                        .addComponent(buttonEliminarPostre))
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
                                .addComponent(labelEliminarPostre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textEliminarPostre, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(labelEliminarPostre)
                    .addComponent(textEliminarPostre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelar)
                    .addComponent(buttonEliminarPostre))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelarMouseClicked
        this.dispose();
        new JFrmEditarPedido().setVisible(true);
    }//GEN-LAST:event_buttonCancelarMouseClicked

    private void buttonEliminarPostreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEliminarPostreMouseClicked

        try {
            int nopost = Integer.parseInt(this.textEliminarPostre.getText());

            if (nopost > SistemaRestauranteFrames.listapedidos.get(JFrmEditarCuenta.noCuenta).getPedido().getPostre().size()
                    || nopost < SistemaRestauranteFrames.listapedidos.get(JFrmEditarCuenta.noCuenta).getPedido().getPostre().size()) {
                throw new IndiceArrayListException("El número ingresado no coincide con el"
                        + "\nnúmero de postres registrados");
            }

            SistemaRestauranteFrames.listapedidos.get(JFrmEditarCuenta.noCuenta).getPedido().getPostre().remove(nopost);
            JOptionPane.showMessageDialog(null, "El postre se ha removido correctamente");

        } catch (IndiceArrayListException except1) {
            JOptionPane.showMessageDialog(null, except1.getMessage());
        }
    }//GEN-LAST:event_buttonEliminarPostreMouseClicked

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
            java.util.logging.Logger.getLogger(JFrmEliminarPostre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmEliminarPostre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmEliminarPostre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmEliminarPostre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmEliminarPostre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonEliminarPostre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEliminarPostre;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextArea textAreaVisualizarPostres;
    private javax.swing.JTextField textEliminarPostre;
    // End of variables declaration//GEN-END:variables
}
