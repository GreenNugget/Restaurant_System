/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasMesero;

import Aplicacion.SistemaRestauranteFrames;
import Modelos.Cuenta;
import Modelos.Menu;
import SubModelos.Bebida;
import SubModelos.Fecha;
import SubModelos.Platillo;
import SubModelos.Postre;
import Vistas.JFrmMenuMesero;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Naomi
 */
public class JFrmHacerPedido extends javax.swing.JFrame {

    public static ArrayList<Platillo> platillos = new ArrayList<>();
    public static ArrayList<Bebida> bebidas = new ArrayList<>();
    public static ArrayList<Postre> postres = new ArrayList<>();

    /**
     * Creates new form JFrmHacerPedido
     */
    public JFrmHacerPedido() {
        initComponents();
        this.setLocationRelativeTo(null);
        //llama al método para realizar el pedido
    }

    private void agregarPlatillos() {
        this.dispose();
        new JFrmPedidoPlatillos().setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        buttonSalir = new javax.swing.JButton();
        buttonHacerPedido = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        labelNoMesa = new javax.swing.JLabel();
        labelSubtitulo = new javax.swing.JLabel();
        labelDia = new javax.swing.JLabel();
        labelMes = new javax.swing.JLabel();
        labelAnio = new javax.swing.JLabel();
        textDia = new javax.swing.JTextField();
        textMes = new javax.swing.JTextField();
        textAnio = new javax.swing.JTextField();
        textNoMesa = new javax.swing.JTextField();
        labelTipoPago = new javax.swing.JLabel();
        textTipoPago = new javax.swing.JTextField();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonSalir.setBackground(new java.awt.Color(204, 0, 0));
        buttonSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonSalir.setForeground(new java.awt.Color(255, 255, 255));
        buttonSalir.setText("Salir");
        buttonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSalirMouseClicked(evt);
            }
        });

        buttonHacerPedido.setBackground(new java.awt.Color(102, 153, 0));
        buttonHacerPedido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonHacerPedido.setForeground(new java.awt.Color(255, 255, 255));
        buttonHacerPedido.setText("Hacer Pedido");
        buttonHacerPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonHacerPedidoMouseClicked(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        labelTitulo.setText("Haciendo Pedido...");

        labelNoMesa.setText("No. Mesa:");

        labelSubtitulo.setText("Ingrese los datos de la venta a continuación:");

        labelDia.setText("Día:");

        labelMes.setText("Mes:");

        labelAnio.setText("Año:");

        labelTipoPago.setText("Tipo de Pago:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(labelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelDia)
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelSubtitulo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textDia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelMes)
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(textTipoPago, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(textMes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(30, 30, 30)
                                                        .addComponent(labelAnio)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(textAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(textNoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonHacerPedido)))))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTipoPago)
                    .addComponent(labelNoMesa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelSubtitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDia)
                    .addComponent(labelMes)
                    .addComponent(labelAnio)
                    .addComponent(textDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNoMesa)
                    .addComponent(textNoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTipoPago)
                    .addComponent(textTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSalir)
                    .addComponent(buttonHacerPedido))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSalirMouseClicked
        this.dispose();
        new JFrmMenuMesero().setVisible(true);
    }//GEN-LAST:event_buttonSalirMouseClicked

    private void buttonHacerPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHacerPedidoMouseClicked

        agregarPlatillos();

        int day = Integer.parseInt(this.textDia.getText());
        int month = Integer.parseInt(this.textMes.getText());
        int year = Integer.parseInt(this.textAnio.getText());

        int nomesa = Integer.parseInt(this.textNoMesa.getText());
        String tipopago = this.textTipoPago.getText();

        SistemaRestauranteFrames.listapedidos.add(new Cuenta(nomesa, new Menu(platillos, bebidas, postres), tipopago, new Fecha(day, month, year)));

        JOptionPane.showMessageDialog(null, "El pedido se realizó exitosamente");
    }//GEN-LAST:event_buttonHacerPedidoMouseClicked

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
            java.util.logging.Logger.getLogger(JFrmHacerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmHacerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmHacerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmHacerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmHacerPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHacerPedido;
    private javax.swing.JButton buttonSalir;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelAnio;
    private javax.swing.JLabel labelDia;
    private javax.swing.JLabel labelMes;
    private javax.swing.JLabel labelNoMesa;
    private javax.swing.JLabel labelSubtitulo;
    private javax.swing.JLabel labelTipoPago;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textAnio;
    private javax.swing.JTextField textDia;
    private javax.swing.JTextField textMes;
    private javax.swing.JTextField textNoMesa;
    private javax.swing.JTextField textTipoPago;
    // End of variables declaration//GEN-END:variables
}
