/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasGerente;

import Excepciones.IndiceArrayListException;
import Modelos.TablaMostrarPostres;
import Vistas.JFrmCrearGerente;
import javax.swing.JOptionPane;

/**
 *
 * @author Naomi
 */
public class JFrmEliminarPostre extends javax.swing.JFrame {

    TablaMostrarPostres datos = new TablaMostrarPostres();

    /**
     * Creates new form JFrmEliminarPostre
     */
    public JFrmEliminarPostre() {
        initComponents();
        this.setLocationRelativeTo(null);
        inicializar();
    }

    private void inicializar() {
        datos.tablaPostres(tableVisualizarPostres);
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
        tableVisualizarPostres = new javax.swing.JTable();
        labelSubtitulo = new javax.swing.JLabel();
        textNoPostre = new javax.swing.JTextField();
        labelNoPostre = new javax.swing.JLabel();
        buttonRegresar = new javax.swing.JButton();
        buttonEliminarPostre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        labelTitulo.setText("Postres en el Menú:");

        tableVisualizarPostres.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableVisualizarPostres);

        labelSubtitulo.setText("Ingrese el número del postre que desea eliminar");

        labelNoPostre.setText("No. Postre:");

        buttonRegresar.setBackground(new java.awt.Color(204, 0, 0));
        buttonRegresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        buttonRegresar.setText("Regresar");
        buttonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonRegresarMouseClicked(evt);
            }
        });

        buttonEliminarPostre.setBackground(new java.awt.Color(0, 51, 153));
        buttonEliminarPostre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonEliminarPostre.setForeground(new java.awt.Color(255, 255, 255));
        buttonEliminarPostre.setText("Eliminar");
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(labelTitulo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelNoPostre)
                .addGap(45, 45, 45)
                .addComponent(textNoPostre, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(labelSubtitulo)
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(buttonRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonEliminarPostre)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelSubtitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textNoPostre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNoPostre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRegresar)
                    .addComponent(buttonEliminarPostre))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRegresarMouseClicked
        this.dispose();
        new JFrmEliminarAlimento().setVisible(true);
    }//GEN-LAST:event_buttonRegresarMouseClicked

    private void buttonEliminarPostreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEliminarPostreMouseClicked

        try {

            int nopostre = Integer.parseInt(this.textNoPostre.getText());

            if (nopostre > JFrmCrearGerente.bebidas.size() || nopostre < JFrmCrearGerente.bebidas.size()) {
                throw new IndiceArrayListException("  El número ingresado no coincide"
                        + "\ncon el número de postres en el menú");
            }

            JFrmCrearGerente.postres.remove(nopostre);

            JOptionPane.showMessageDialog(null, "El postre se ha eliminado correctamente");

        } catch (java.lang.IndexOutOfBoundsException except1) {
            JOptionPane.showMessageDialog(null, "Aún no hay Postres en el menú");
        } catch (IndiceArrayListException except2) {
            JOptionPane.showMessageDialog(null, except2.getMessage());
        }

        this.textNoPostre.setText("");
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmEliminarPostre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEliminarPostre;
    private javax.swing.JButton buttonRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNoPostre;
    private javax.swing.JLabel labelSubtitulo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tableVisualizarPostres;
    private javax.swing.JTextField textNoPostre;
    // End of variables declaration//GEN-END:variables
}
