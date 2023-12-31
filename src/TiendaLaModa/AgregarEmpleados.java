/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TiendaLaModa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class AgregarEmpleados extends javax.swing.JFrame {
    Connection connection = null;
    PreparedStatement pst = null;
    
    //Variables necesarias para correr cualquier codigo de SQL
    public AgregarEmpleados() {
        
        initComponents();
        connection = DBConnection.ConnectionDB();//Usa el metodo ConnectionDB para establecer conexion...
        //llama la clase DBConnection.java
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NombreIngresado = new javax.swing.JTextField();
        PApellidoIngresado = new javax.swing.JTextField();
        CedulaIngresada = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        PrimerApellido = new javax.swing.JLabel();
        Cedula = new javax.swing.JLabel();
        Salario = new javax.swing.JLabel();
        Puesto = new javax.swing.JLabel();
        PuestoIngresado = new javax.swing.JTextField();
        SalarioIngresado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BotonAgregarEmpleado = new javax.swing.JButton();
        BotonVolverModuloEmpleados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NombreIngresado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreIngresadoActionPerformed(evt);
            }
        });

        PApellidoIngresado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PApellidoIngresadoActionPerformed(evt);
            }
        });

        Nombre.setText("Nombre:");

        PrimerApellido.setText("Primer Apellido:");

        Cedula.setText("Cedula:");

        Salario.setText("Salario:");

        Puesto.setText("Puesto que ocupa:");

        jLabel6.setText("Ingrese los datos del nuevo empleado:");

        BotonAgregarEmpleado.setText("Agregar");
        BotonAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarEmpleadoActionPerformed(evt);
            }
        });

        BotonVolverModuloEmpleados.setText("Volver");
        BotonVolverModuloEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverModuloEmpleadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(134, 134, 134))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PrimerApellido)
                            .addComponent(Nombre)
                            .addComponent(Cedula)
                            .addComponent(Puesto)
                            .addComponent(Salario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonVolverModuloEmpleados)
                        .addGap(44, 44, 44)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonAgregarEmpleado)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(PApellidoIngresado, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                        .addComponent(NombreIngresado)
                        .addComponent(CedulaIngresada)
                        .addComponent(PuestoIngresado)
                        .addComponent(SalarioIngresado)))
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel6)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PApellidoIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrimerApellido))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CedulaIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PuestoIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Puesto))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SalarioIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salario))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAgregarEmpleado)
                    .addComponent(BotonVolverModuloEmpleados))
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreIngresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreIngresadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreIngresadoActionPerformed

    private void PApellidoIngresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PApellidoIngresadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PApellidoIngresadoActionPerformed

    private void BotonVolverModuloEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverModuloEmpleadosActionPerformed
       ModuloEmpleados newframe = new ModuloEmpleados();
       newframe.setVisible(true);
       this.dispose();
              
    }//GEN-LAST:event_BotonVolverModuloEmpleadosActionPerformed

    private void BotonAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarEmpleadoActionPerformed
     String sql = "INSERT INTO Empleados VALUES (?,?,?,?,?)";
     
     try{
            pst = connection.prepareStatement(sql);
            pst.setString(1, CedulaIngresada.getText());//Se obtiene el valor del campo basado en la variable, no la BD
            pst.setString(2, NombreIngresado.getText()); 
            pst.setString(3, PApellidoIngresado.getText());
            pst.setString(4, PuestoIngresado.getText());
            pst.setString(5, SalarioIngresado.getText());
            int resultado = pst.executeUpdate();
            
            if(resultado == 1){
                 JOptionPane.showMessageDialog(null, "Usuario agregado exitosamente");
            
                 
                ModuloEmpleados newframe = new ModuloEmpleados();
                newframe.setVisible (true);
                this.dispose();
             }
            pst.close();
            connection.close(); //IMPORTANTE:  Aqui se debe cerrar la base de datos
            // para poder usarla en otro modulo
            //si no se cierra en cada uso, nos da error de bloqueo
       
        }
        catch (Exception e) {
            System.out.print("Error: " + e.getMessage());

        }
     
    }//GEN-LAST:event_BotonAgregarEmpleadoActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregarEmpleado;
    private javax.swing.JButton BotonVolverModuloEmpleados;
    private javax.swing.JLabel Cedula;
    private javax.swing.JTextField CedulaIngresada;
    private javax.swing.JLabel Nombre;
    private javax.swing.JTextField NombreIngresado;
    private javax.swing.JTextField PApellidoIngresado;
    private javax.swing.JLabel PrimerApellido;
    private javax.swing.JLabel Puesto;
    private javax.swing.JTextField PuestoIngresado;
    private javax.swing.JLabel Salario;
    private javax.swing.JTextField SalarioIngresado;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
