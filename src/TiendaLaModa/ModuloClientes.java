/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TiendaLaModa;


public class ModuloClientes extends javax.swing.JFrame {

    /**
     * Creates new form ModuloClientes
     */
    public ModuloClientes() {
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

        TextoModuloClientes = new javax.swing.JLabel();
        BotonAgregarClientes = new javax.swing.JButton();
        BotonEditarDatosClientes = new javax.swing.JButton();
        BotonVolveralMenuPrin = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextoModuloClientes.setText("Bienvenido al modulo de clientes, por favor haz click sobre la opcion deseada: ");

        BotonAgregarClientes.setText("Agregar clientes a la base de datos");
        BotonAgregarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarClientesActionPerformed(evt);
            }
        });

        BotonEditarDatosClientes.setText("Editar datos de clientes");
        BotonEditarDatosClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarDatosClientesActionPerformed(evt);
            }
        });

        BotonVolveralMenuPrin.setText("Volver al menu principal");
        BotonVolveralMenuPrin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolveralMenuPrinActionPerformed(evt);
            }
        });

        jButton1.setText("Borrar clientes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotonEditarDatosClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonAgregarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(TextoModuloClientes)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotonVolveralMenuPrin)
                .addGap(165, 165, 165))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(TextoModuloClientes)
                .addGap(78, 78, 78)
                .addComponent(BotonAgregarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(BotonEditarDatosClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(BotonVolveralMenuPrin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAgregarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarClientesActionPerformed
        AgregarClientes newframe = new AgregarClientes();
       newframe.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BotonAgregarClientesActionPerformed

    private void BotonEditarDatosClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEditarDatosClientesActionPerformed
       EditarDatosClientes newframe = new EditarDatosClientes();
       newframe.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BotonEditarDatosClientesActionPerformed

    private void BotonVolveralMenuPrinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolveralMenuPrinActionPerformed
        MenudeModulos newframe = new MenudeModulos();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonVolveralMenuPrinActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BorrarClientes newframe = new BorrarClientes();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ModuloClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModuloClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModuloClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModuloClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModuloClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregarClientes;
    private javax.swing.JButton BotonEditarDatosClientes;
    private javax.swing.JButton BotonVolveralMenuPrin;
    private javax.swing.JLabel TextoModuloClientes;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
