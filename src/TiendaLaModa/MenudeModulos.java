/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TiendaLaModa;


public class MenudeModulos extends javax.swing.JFrame {


    public MenudeModulos() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonModulodeEmpleados = new javax.swing.JButton();
        BotonModulodeClientes = new javax.swing.JButton();
        BotonModulodeProveedores = new javax.swing.JButton();
        BotonModulodeProductos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        TextoMenuModulos = new javax.swing.JLabel();
        BotonModulodeVentas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 45, 80));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BotonModulodeEmpleados.setText("Modulo de Empleados");
        BotonModulodeEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModulodeEmpleadosActionPerformed(evt);
            }
        });

        BotonModulodeClientes.setText("Modulo de Clientes");
        BotonModulodeClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModulodeClientesActionPerformed(evt);
            }
        });

        BotonModulodeProveedores.setText("Modulo de Proveedores");
        BotonModulodeProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModulodeProveedoresActionPerformed(evt);
            }
        });

        BotonModulodeProductos.setText("Modulo de Productos");
        BotonModulodeProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModulodeProductosActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TextoMenuModulos.setText("Por favor haz click sobre el modulo al que deseas ingresar ");

        BotonModulodeVentas.setText("Modulo de Ventas");
        BotonModulodeVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModulodeVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonModulodeProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonModulodeProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonModulodeClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonModulodeEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonModulodeVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(TextoMenuModulos)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(TextoMenuModulos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonModulodeEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonModulodeClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonModulodeProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonModulodeProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonModulodeVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonModulodeEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModulodeEmpleadosActionPerformed
        // TODO add your handling code here:
        ModuloEmpleados newframe = new ModuloEmpleados ();
        newframe.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BotonModulodeEmpleadosActionPerformed

    private void BotonModulodeProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModulodeProductosActionPerformed
        ModuloProductos newframe = new ModuloProductos();
        newframe.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BotonModulodeProductosActionPerformed

    private void BotonModulodeProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModulodeProveedoresActionPerformed
        ModuloProveedores newframe = new ModuloProveedores();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonModulodeProveedoresActionPerformed

    private void BotonModulodeClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModulodeClientesActionPerformed
        ModuloClientes newframe = new ModuloClientes();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonModulodeClientesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BotonModulodeVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModulodeVentasActionPerformed
        ModuloVentas newframe = new ModuloVentas();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonModulodeVentasActionPerformed

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
            java.util.logging.Logger.getLogger(MenudeModulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenudeModulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenudeModulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenudeModulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenudeModulos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonModulodeClientes;
    private javax.swing.JButton BotonModulodeEmpleados;
    private javax.swing.JButton BotonModulodeProductos;
    private javax.swing.JButton BotonModulodeProveedores;
    private javax.swing.JButton BotonModulodeVentas;
    private javax.swing.JLabel TextoMenuModulos;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
