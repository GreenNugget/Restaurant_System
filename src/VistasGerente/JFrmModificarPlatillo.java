/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasGerente;

import Excepciones.IndiceArrayListException;
import Modelos.TablaMostrarPlatillos;
import SubModelos.Platillo;
import Vistas.JFrmCrearGerente;
import Vistas.JFrmMenuGerente;
import javax.swing.JOptionPane;

/**
 *
 * @author Naomi
 */
public class JFrmModificarPlatillo extends javax.swing.JFrame {

    TablaMostrarPlatillos datos = new TablaMostrarPlatillos();

    /**
     * Creates new form JFrameModificarPlatillo
     */
    public JFrmModificarPlatillo() {
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

        labelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVisualizarPlatillos = new javax.swing.JTable();
        labelSeleccione = new javax.swing.JLabel();
        labelNoPlatillo = new javax.swing.JLabel();
        textNoPlatillo = new javax.swing.JTextField();
        labelNewName = new javax.swing.JLabel();
        labelNewPrice = new javax.swing.JLabel();
        textNombreNuevo = new javax.swing.JTextField();
        textPrecioNuevo = new javax.swing.JTextField();
        buttonModificar = new javax.swing.JButton();
        buttonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        labelTitulo.setText("Platillos en el Menú:");

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
        tableVisualizarPlatillos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableVisualizarPlatillosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableVisualizarPlatillos);

        labelSeleccione.setText("Seleccione un número de platillo para modificar:");

        labelNoPlatillo.setText("No. de Platillo:");

        labelNewName.setText("Nombre Nuevo:");

        labelNewPrice.setText("Precio Nuevo:");

        buttonModificar.setBackground(new java.awt.Color(51, 153, 0));
        buttonModificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonModificar.setForeground(new java.awt.Color(255, 255, 255));
        buttonModificar.setText("Modificar");
        buttonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonModificarMouseClicked(evt);
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
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(labelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNoPlatillo)
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textPrecioNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                    .addComponent(textNoPlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textNombreNuevo)))
                            .addComponent(labelSeleccione)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(labelNewPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelNewName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(buttonRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonModificar)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelSeleccione)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNoPlatillo)
                    .addComponent(textNoPlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textNombreNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNewName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textPrecioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNewPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonModificar)
                    .addComponent(buttonRegresar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRegresarMouseClicked
        this.dispose();
        new JFrmEditarAlimentos().setVisible(true);
    }//GEN-LAST:event_buttonRegresarMouseClicked

    private void buttonModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonModificarMouseClicked

        try {

            String name = this.textNombreNuevo.getText();
            double price = Double.parseDouble(this.textPrecioNuevo.getText());
            int noplat = Integer.parseInt(this.textNoPlatillo.getText());

            if (noplat > JFrmCrearGerente.platillos.size() || noplat < 0) {
                throw new IndiceArrayListException("   El número ingresado no coincide"
                        + "\ncon el número de platillos en el menú");
            }

            JFrmCrearGerente.platillos.set(noplat, new Platillo(name, price));
            JOptionPane.showMessageDialog(null, "El platillo se ha modificado correctamente");

        } catch (java.lang.IndexOutOfBoundsException except1) {
            JOptionPane.showMessageDialog(null, "Aún no hay platillos en el menú");
        } catch (IndiceArrayListException except2) {
            JOptionPane.showMessageDialog(null, except2.getMessage());
        }

        this.textNoPlatillo.setText("");
        this.textNombreNuevo.setText("");
        this.textPrecioNuevo.setText("");

    }//GEN-LAST:event_buttonModificarMouseClicked

    private void tableVisualizarPlatillosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableVisualizarPlatillosMouseClicked
        this.dispose();
        new JFrmMenuGerente().setVisible(true);
    }//GEN-LAST:event_tableVisualizarPlatillosMouseClicked

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
            java.util.logging.Logger.getLogger(JFrmModificarPlatillo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmModificarPlatillo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmModificarPlatillo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmModificarPlatillo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmModificarPlatillo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonModificar;
    private javax.swing.JButton buttonRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNewName;
    private javax.swing.JLabel labelNewPrice;
    private javax.swing.JLabel labelNoPlatillo;
    private javax.swing.JLabel labelSeleccione;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tableVisualizarPlatillos;
    private javax.swing.JTextField textNoPlatillo;
    private javax.swing.JTextField textNombreNuevo;
    private javax.swing.JTextField textPrecioNuevo;
    // End of variables declaration//GEN-END:variables
}