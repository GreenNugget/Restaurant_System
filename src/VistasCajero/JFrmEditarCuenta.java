/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasCajero;

import Aplicacion.SistemaRestauranteFrames;
import Vistas.JFrmMenuCajero;

/**
 *
 * @author Naomi
 */
public class JFrmEditarCuenta extends javax.swing.JFrame {

    public static int noCuenta;

    /**
     * Creates new form JFrmEditarCuenta
     */
    public JFrmEditarCuenta() {
        initComponents();
        this.setLocationRelativeTo(null);
        imprimirCuentas();
    }

    private void imprimirCuentas() {

        for (int w = 0; w < SistemaRestauranteFrames.listapedidos.size(); w++) {
            this.textAreaVisualizarCuentas.append("CUENTA NO. " + w);
            this.textAreaVisualizarCuentas.append("\nNo. de Mesa: " + SistemaRestauranteFrames.listapedidos.get(w).getNumeroMesa());
            //CICLOS PARA CADA ALIMENTO
            for (int h = 0; h < SistemaRestauranteFrames.listapedidos.get(w).getPedido().getPlatillo().size(); h++) {
                this.textAreaVisualizarCuentas.append(SistemaRestauranteFrames.listapedidos.get(w).getPedido().getPlatillo().get(h).toString() + "\n");
            }
            for (int i = 0; i < SistemaRestauranteFrames.listapedidos.get(w).getPedido().getBebida().size(); i++) {
                this.textAreaVisualizarCuentas.append(SistemaRestauranteFrames.listapedidos.get(w).getPedido().getBebida().get(i).toString() + "\n");
            }
            for (int j = 0; j < SistemaRestauranteFrames.listapedidos.get(w).getPedido().getPostre().size(); j++) {
                this.textAreaVisualizarCuentas.append(SistemaRestauranteFrames.listapedidos.get(w).getPedido().getPostre().get(j).toString() + "\n");
            }
            this.textAreaVisualizarCuentas.append("\n");
            this.textAreaVisualizarCuentas.append("____________________________\n");
        }//CICLO FOR PARA IMPRIMIR LAS CUENTAS

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaVisualizarCuentas = new javax.swing.JTextArea();
        labelTitulo = new javax.swing.JLabel();
        labelSubtitulo = new javax.swing.JLabel();
        labelNoCuenta = new javax.swing.JLabel();
        textNoCuenta = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textAreaVisualizarCuentas.setColumns(20);
        textAreaVisualizarCuentas.setRows(5);
        jScrollPane1.setViewportView(textAreaVisualizarCuentas);

        labelTitulo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        labelTitulo.setText("Editanto Cuenta...");

        labelSubtitulo.setText("Seleccione un número de cuenta para modificar");

        labelNoCuenta.setText("No. Cuenta:");

        buttonCancelar.setBackground(new java.awt.Color(204, 0, 0));
        buttonCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        buttonCancelar.setText("Cancelar");
        buttonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCancelarMouseClicked(evt);
            }
        });

        buttonEditar.setBackground(new java.awt.Color(51, 153, 0));
        buttonEditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonEditar.setForeground(new java.awt.Color(255, 255, 255));
        buttonEditar.setText("Editar");
        buttonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEditarMouseClicked(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(labelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(labelSubtitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(labelNoCuenta)
                        .addGap(18, 18, 18)
                        .addComponent(textNoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(buttonCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelSubtitulo)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNoCuenta)
                    .addComponent(textNoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelar)
                    .addComponent(buttonEditar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelarMouseClicked
        this.dispose();
        new JFrmMenuCajero().setVisible(true);
    }//GEN-LAST:event_buttonCancelarMouseClicked

    private void buttonEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditarMouseClicked

        //Se toma el número de cuenta para poder pasarlo al siguiente frame
        noCuenta = Integer.parseInt(this.textNoCuenta.getText());
        this.dispose();
        new JFrmMenuEditarCuenta().setVisible(true);
    }//GEN-LAST:event_buttonEditarMouseClicked

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
            java.util.logging.Logger.getLogger(JFrmEditarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmEditarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmEditarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmEditarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmEditarCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNoCuenta;
    private javax.swing.JLabel labelSubtitulo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextArea textAreaVisualizarCuentas;
    private javax.swing.JTextField textNoCuenta;
    // End of variables declaration//GEN-END:variables
}