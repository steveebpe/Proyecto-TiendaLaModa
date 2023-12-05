/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TiendaLaModa;


public class ModuloEmpleados extends javax.swing.JFrame {

    
    public ModuloEmpleados() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextoModuloEmpleados = new javax.swing.JLabel();
        BotonAgregarEmpleados = new javax.swing.JButton();
        BotonEditarDatosEmpleados = new javax.swing.JButton();
        BotonVolveralMenuPrin = new javax.swing.JButton();
        BotonBorrarDatosEmpleados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextoModuloEmpleados.setText("Bienvenido al modulo de empleados, por favor haz click sobre la opcion deseada: ");

        BotonAgregarEmpleados.setText("Agregar empleados a la base de datos");
        BotonAgregarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarEmpleadosActionPerformed(evt);
            }
        });

        BotonEditarDatosEmpleados.setText("Editar datos de empleados");
        BotonEditarDatosEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarDatosEmpleadosActionPerformed(evt);
            }
        });

        BotonVolveralMenuPrin.setText("Volver al menu principal");
        BotonVolveralMenuPrin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolveralMenuPrinActionPerformed(evt);
            }
        });

        BotonBorrarDatosEmpleados.setText("Borrar empleados");
        BotonBorrarDatosEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarDatosEmpleadosActionPerformed(evt);
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
                        .addComponent(TextoModuloEmpleados)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 119, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BotonVolveralMenuPrin)
                                .addGap(171, 171, 171))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BotonBorrarDatosEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotonEditarDatosEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(138, 138, 138))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(BotonAgregarEmpleados)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(TextoModuloEmpleados)
                .addGap(54, 54, 54)
                .addComponent(BotonAgregarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonEditarDatosEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonBorrarDatosEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(BotonVolveralMenuPrin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAgregarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarEmpleadosActionPerformed
        AgregarEmpleados newframe = new AgregarEmpleados ();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonAgregarEmpleadosActionPerformed

    private void BotonEditarDatosEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEditarDatosEmpleadosActionPerformed
       Editardatosdeempleados newframe = new Editardatosdeempleados();
       newframe.setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_BotonEditarDatosEmpleadosActionPerformed

    private void BotonVolveralMenuPrinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolveralMenuPrinActionPerformed
        MenudeModulos newframe = new MenudeModulos();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonVolveralMenuPrinActionPerformed

    private void BotonBorrarDatosEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarDatosEmpleadosActionPerformed
        BorrarEmpleados newframe = new BorrarEmpleados ();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonBorrarDatosEmpleadosActionPerformed

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
            java.util.logging.Logger.getLogger(ModuloEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModuloEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModuloEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModuloEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModuloEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregarEmpleados;
    private javax.swing.JButton BotonBorrarDatosEmpleados;
    private javax.swing.JButton BotonEditarDatosEmpleados;
    private javax.swing.JButton BotonVolveralMenuPrin;
    private javax.swing.JLabel TextoModuloEmpleados;
    // End of variables declaration//GEN-END:variables
}
