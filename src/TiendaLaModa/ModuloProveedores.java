/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TiendaLaModa;


public class ModuloProveedores extends javax.swing.JFrame {

    /**
     * Creates new form ModuloProveedores
     */
    public ModuloProveedores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        TextoModuloProveedores = new javax.swing.JLabel();
        BotonAgregarProveedores = new javax.swing.JButton();
        BotonEditarDatosProveedores = new javax.swing.JButton();
        BotonVolveralMenuPrin = new javax.swing.JButton();
        BotonBorrarProveedores = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextoModuloProveedores.setText("Bienvenido al modulo de proveedores, por favor haz click sobre la opcion deseada: ");

        BotonAgregarProveedores.setText("Agregar proveedores a la base de datos");
        BotonAgregarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarProveedoresActionPerformed(evt);
            }
        });

        BotonEditarDatosProveedores.setText("Editar datos de proveedores");
        BotonEditarDatosProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarDatosProveedoresActionPerformed(evt);
            }
        });

        BotonVolveralMenuPrin.setText("Volver al menu principal");
        BotonVolveralMenuPrin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolveralMenuPrinActionPerformed(evt);
            }
        });

        BotonBorrarProveedores.setText("Borrar proveedores");
        BotonBorrarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarProveedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotonVolveralMenuPrin)
                        .addGap(171, 171, 171))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextoModuloProveedores)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonAgregarProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonEditarDatosProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonBorrarProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(TextoModuloProveedores)
                .addGap(70, 70, 70)
                .addComponent(BotonAgregarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonEditarDatosProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(BotonBorrarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonVolveralMenuPrin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAgregarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarProveedoresActionPerformed
        AgregarProveedores newframe = new AgregarProveedores();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonAgregarProveedoresActionPerformed

    private void BotonEditarDatosProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEditarDatosProveedoresActionPerformed
        EditarDatosProveedores newframe = new EditarDatosProveedores();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonEditarDatosProveedoresActionPerformed

    private void BotonVolveralMenuPrinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolveralMenuPrinActionPerformed
        MenudeModulos newframe = new MenudeModulos();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonVolveralMenuPrinActionPerformed

    private void BotonBorrarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarProveedoresActionPerformed
        BorrarProveedores newframe = new BorrarProveedores();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonBorrarProveedoresActionPerformed

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
            java.util.logging.Logger.getLogger(ModuloProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModuloProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModuloProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModuloProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModuloProveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregarProveedores;
    private javax.swing.JButton BotonBorrarProveedores;
    private javax.swing.JButton BotonEditarDatosProveedores;
    private javax.swing.JButton BotonVolveralMenuPrin;
    private javax.swing.JLabel TextoModuloProveedores;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
