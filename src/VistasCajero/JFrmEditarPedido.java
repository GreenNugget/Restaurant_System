/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasCajero;

/**
 *
 * @author Naomi
 */
public class JFrmEditarPedido extends javax.swing.JFrame {

    /**
     * Creates new form JFrmEditarPedido
     */
    public JFrmEditarPedido() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        labelTitulo2 = new javax.swing.JLabel();
        labelTitulo3 = new javax.swing.JLabel();
        labelImagen = new javax.swing.JLabel();
        buttonCancelar = new javax.swing.JButton();
        menubarOpciones = new javax.swing.JMenuBar();
        menuAgregar = new javax.swing.JMenu();
        menuAgregarPlatillo = new javax.swing.JMenu();
        menuAgregarBebida = new javax.swing.JMenu();
        menuAgregarPostre = new javax.swing.JMenu();
        menuEliminar = new javax.swing.JMenu();
        menuPlatilloD = new javax.swing.JMenu();
        menuBebidaD = new javax.swing.JMenu();
        menuPostreD = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        labelTitulo.setText("Menú de la Edición");

        labelTitulo2.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        labelTitulo2.setText("de un ");

        labelTitulo3.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        labelTitulo3.setText("Tipo de Alimento");

        labelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cubiertos.jpg"))); // NOI18N

        buttonCancelar.setBackground(new java.awt.Color(204, 0, 0));
        buttonCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        buttonCancelar.setText("Cancelar");
        buttonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCancelarMouseClicked(evt);
            }
        });

        menuAgregar.setText("Agregar Alimento");

        menuAgregarPlatillo.setText("Platillo");
        menuAgregarPlatillo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAgregarPlatilloMouseClicked(evt);
            }
        });
        menuAgregar.add(menuAgregarPlatillo);

        menuAgregarBebida.setText("Bebida");
        menuAgregarBebida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAgregarBebidaMouseClicked(evt);
            }
        });
        menuAgregar.add(menuAgregarBebida);

        menuAgregarPostre.setText("Postre");
        menuAgregarPostre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAgregarPostreMouseClicked(evt);
            }
        });
        menuAgregar.add(menuAgregarPostre);

        menubarOpciones.add(menuAgregar);

        menuEliminar.setText("Eliminar Alimento");

        menuPlatilloD.setText("Platillo");
        menuPlatilloD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPlatilloDMouseClicked(evt);
            }
        });
        menuEliminar.add(menuPlatilloD);

        menuBebidaD.setText("Bebida");
        menuBebidaD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBebidaDMouseClicked(evt);
            }
        });
        menuEliminar.add(menuBebidaD);

        menuPostreD.setText("Postre");
        menuPostreD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPostreDMouseClicked(evt);
            }
        });
        menuEliminar.add(menuPostreD);

        menubarOpciones.add(menuEliminar);

        setJMenuBar(menubarOpciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(labelTitulo2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTitulo)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelTitulo3)
                                .addGap(9, 9, 9))
                            .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(buttonCancelar)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTitulo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelImagen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(buttonCancelar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelarMouseClicked
        this.dispose();
        new JFrmMenuEditarCuenta().setVisible(true);
    }//GEN-LAST:event_buttonCancelarMouseClicked

    private void menuAgregarPlatilloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAgregarPlatilloMouseClicked
        this.dispose();
        new JFrmAgregarPlatillo().setVisible(true);
    }//GEN-LAST:event_menuAgregarPlatilloMouseClicked

    private void menuAgregarBebidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAgregarBebidaMouseClicked
        this.dispose();
        new JFrmAgregarBebida().setVisible(true);
    }//GEN-LAST:event_menuAgregarBebidaMouseClicked

    private void menuAgregarPostreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAgregarPostreMouseClicked
        this.dispose();
        new JFrmAgregarPostre().setVisible(true);
    }//GEN-LAST:event_menuAgregarPostreMouseClicked

    private void menuPlatilloDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPlatilloDMouseClicked
        this.dispose();
        new JFrmEliminarPlatillo().setVisible(true);
    }//GEN-LAST:event_menuPlatilloDMouseClicked

    private void menuBebidaDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBebidaDMouseClicked
        this.dispose();
        new JFrmEliminarBebida().setVisible(true);
    }//GEN-LAST:event_menuBebidaDMouseClicked

    private void menuPostreDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPostreDMouseClicked
        this.dispose();
        new JFrmEliminarPostre().setVisible(true);
    }//GEN-LAST:event_menuPostreDMouseClicked

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
            java.util.logging.Logger.getLogger(JFrmEditarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmEditarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmEditarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmEditarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmEditarPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JLabel labelImagen;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTitulo2;
    private javax.swing.JLabel labelTitulo3;
    private javax.swing.JMenu menuAgregar;
    private javax.swing.JMenu menuAgregarBebida;
    private javax.swing.JMenu menuAgregarPlatillo;
    private javax.swing.JMenu menuAgregarPostre;
    private javax.swing.JMenu menuBebidaD;
    private javax.swing.JMenu menuEliminar;
    private javax.swing.JMenu menuPlatilloD;
    private javax.swing.JMenu menuPostreD;
    private javax.swing.JMenuBar menubarOpciones;
    // End of variables declaration//GEN-END:variables
}
