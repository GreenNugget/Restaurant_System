/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasGerente;

import Excepciones.IndiceArrayListException;
import Modelos.TablaMostrarPlatillos;
import Vistas.JFrmCrearGerente;
import javax.swing.JOptionPane;

/**
 *
 * @author Naomi
 */
public class JFrmEliminarPlatillo extends javax.swing.JFrame {

    TablaMostrarPlatillos datos = new TablaMostrarPlatillos();

    /**
     * Creates new form JFrmEliminarPlatillo
     */
    public JFrmEliminarPlatillo() {
        initComponents();
        this.setLocationRelativeTo(null);
        inicializar();
    }

    private void inicializar() {
        datos.tablaPlatillos(tableVisualizarPlatillos);
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
        tableVisualizarPlatillos = new javax.swing.JTable();
        labelTitulo = new javax.swing.JLabel();
        labelNoPlatillo = new javax.swing.JLabel();
        labelSubtitulo = new javax.swing.JLabel();
        textNoPlatillo = new javax.swing.JTextField();
        buttonEliminarPlatillo = new javax.swing.JButton();
        buttonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableVisualizarPlatillos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableVisualizarPlatillos);

        labelTitulo.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        labelTitulo.setText("Platillos en el Menú:");

        labelNoPlatillo.setText("No. Platillo:");

        labelSubtitulo.setText("Ingrese el número del platillo que desea eliminar");

        buttonEliminarPlatillo.setBackground(new java.awt.Color(0, 51, 153));
        buttonEliminarPlatillo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonEliminarPlatillo.setForeground(new java.awt.Color(255, 255, 255));
        buttonEliminarPlatillo.setText("Eliminar");
        buttonEliminarPlatillo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEliminarPlatilloMouseClicked(evt);
            }
        });

        buttonRegresar.setBackground(new java.awt.Color(204, 0, 0));
        buttonRegresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        buttonRegresar.setText("Regresar");
        buttonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonRegresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(labelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(labelSubtitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(labelNoPlatillo)
                        .addGap(18, 18, 18)
                        .addComponent(textNoPlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(buttonRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonEliminarPlatillo)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelSubtitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textNoPlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNoPlatillo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEliminarPlatillo)
                    .addComponent(buttonRegresar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRegresarMouseClicked
        this.dispose();
        new JFrmEliminarAlimento().setVisible(true);
    }//GEN-LAST:event_buttonRegresarMouseClicked

    private void buttonEliminarPlatilloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEliminarPlatilloMouseClicked

        try {//Excepción

            int noplatillo = Integer.parseInt(this.textNoPlatillo.getText());

            if (noplatillo > JFrmCrearGerente.platillos.size() || noplatillo < JFrmCrearGerente.platillos.size()) {
                throw new IndiceArrayListException("  El número ingresado no coincide"
                        + "\ncon el número de platillos en el menú");
            }

            JFrmCrearGerente.platillos.remove(noplatillo);

            JOptionPane.showMessageDialog(null, "El platillo se ha eliminado correctamente");

        } catch (java.lang.IndexOutOfBoundsException except1) {//Caso 1 : el ArrayList está vacío
            JOptionPane.showMessageDialog(null, "Aún no hay Bebidas en el menú");
        } catch (IndiceArrayListException except2) {
            JOptionPane.showMessageDialog(null, except2.getMessage());
        }

        this.textNoPlatillo.setText("");
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
    private javax.swing.JButton buttonEliminarPlatillo;
    private javax.swing.JButton buttonRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNoPlatillo;
    private javax.swing.JLabel labelSubtitulo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tableVisualizarPlatillos;
    private javax.swing.JTextField textNoPlatillo;
    // End of variables declaration//GEN-END:variables
}
