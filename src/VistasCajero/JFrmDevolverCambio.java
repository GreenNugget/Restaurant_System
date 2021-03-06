/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasCajero;

import Aplicacion.SistemaRestauranteFrames;
import Excepciones.IndiceArrayListException;
import Modelos.Cajero;
import Vistas.JFrmMenuCajero;
import javax.swing.JOptionPane;

/**
 *
 * @author Naomi
 */
public class JFrmDevolverCambio extends javax.swing.JFrame {

    /**
     * Creates new form JFrmDevolverCambio
     */
    public JFrmDevolverCambio() {
        initComponents();
        this.setLocationRelativeTo(null);
        imprimirCuentas();
    }

    private void imprimirCuentas() {

        for (int w = 0; w < SistemaRestauranteFrames.listapedidos.size(); w++) {
            //Si las cuentas tienen como método de pago "Efectivo" entonces se calcular su cambio, ya que con tarjeta no es necesario
            if (SistemaRestauranteFrames.listapedidos.get(w).getMetodoDePago().equals("Efectivo")
                    || SistemaRestauranteFrames.listapedidos.get(w).getMetodoDePago().equals("efectivo")) {
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
            }

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

        labelImagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaVisualizarCuentas = new javax.swing.JTextArea();
        labelRecibido = new javax.swing.JLabel();
        textEfectivoRecibido = new javax.swing.JTextField();
        labelNoCuenta = new javax.swing.JLabel();
        textNoCuenta = new javax.swing.JTextField();
        buttonRegresar = new javax.swing.JButton();
        buttonCalcularCambio = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/propina.png"))); // NOI18N

        textAreaVisualizarCuentas.setColumns(20);
        textAreaVisualizarCuentas.setRows(5);
        jScrollPane1.setViewportView(textAreaVisualizarCuentas);

        labelRecibido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelRecibido.setText("Efectivo Recibido:");

        labelNoCuenta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelNoCuenta.setText("No. Cuenta:");

        buttonRegresar.setBackground(new java.awt.Color(204, 0, 0));
        buttonRegresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        buttonRegresar.setText("Regresar");
        buttonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonRegresarMouseClicked(evt);
            }
        });

        buttonCalcularCambio.setBackground(new java.awt.Color(0, 153, 153));
        buttonCalcularCambio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonCalcularCambio.setForeground(new java.awt.Color(255, 255, 255));
        buttonCalcularCambio.setText("Calcular");
        buttonCalcularCambio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCalcularCambioMouseClicked(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        labelTitulo.setText("Devolviendo Cambio...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonCalcularCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelRecibido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textEfectivoRecibido, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelNoCuenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textNoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textEfectivoRecibido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelRecibido))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textNoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelNoCuenta)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(buttonCalcularCambio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonRegresar)
                        .addGap(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRegresarMouseClicked
        this.dispose();
        new JFrmMenuCajero().setVisible(true);
    }//GEN-LAST:event_buttonRegresarMouseClicked

    private void buttonCalcularCambioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCalcularCambioMouseClicked

        try {
            double efectivorec = Double.parseDouble(this.textEfectivoRecibido.getText());
            int nocuenta = Integer.parseInt(this.textNoCuenta.getText());

            //Si el índice de nocuenta es menor o mayor que el tamaño del arreglo de cuentas, se arroja una excepción
            if (nocuenta > SistemaRestauranteFrames.listapedidos.size() || nocuenta < 0) {
                throw new IndiceArrayListException("El número de cuenta ingresado no coincide"
                        + "\ncon el número de cuentas registradas");
            }

            //Se recorre el arreglo de empleados y cuando se encuentra al cajero que ingresó, entonces se accede al método
            for (int g = 0; g < SistemaRestauranteFrames.listaempleados.size(); g++) {

                if (SistemaRestauranteFrames.listaempleados.get(g) instanceof Cajero) {
                    //Se crea un objeto de tipo cajero para poder calcular el cambio
                    Cajero uncajero = (Cajero) SistemaRestauranteFrames.listaempleados.get(g);
                    //Se llama al método que hace el cálculo y se imprime en pantalla
                    double cambio = uncajero.devolverCambio(efectivorec, SistemaRestauranteFrames.listapedidos.get(nocuenta));
                    //Se muestra el mensaje de cuánto se debe devolver
                    if (cambio > 0) {//Si el cambio es positivo, quiere decir que sí alcanza cambio
                        JOptionPane.showMessageDialog(null, "El cambio es de: $" + cambio);
                    } else {//si el cambio es negativo, quiere decir que le faltó dinero
                        JOptionPane.showMessageDialog(null, "Le hacen falta: $" + (cambio * -1));
                    }

                    //Se forza a salir del ciclo for
                    g = SistemaRestauranteFrames.listaempleados.size();

                }

            }
        } catch (IndiceArrayListException except1) {
            JOptionPane.showMessageDialog(null, except1.getMessage());
        }
        //FIN DEL BUTTON
    }//GEN-LAST:event_buttonCalcularCambioMouseClicked

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
            java.util.logging.Logger.getLogger(JFrmDevolverCambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmDevolverCambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmDevolverCambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmDevolverCambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmDevolverCambio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCalcularCambio;
    private javax.swing.JButton buttonRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelImagen;
    private javax.swing.JLabel labelNoCuenta;
    private javax.swing.JLabel labelRecibido;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextArea textAreaVisualizarCuentas;
    private javax.swing.JTextField textEfectivoRecibido;
    private javax.swing.JTextField textNoCuenta;
    // End of variables declaration//GEN-END:variables
}
