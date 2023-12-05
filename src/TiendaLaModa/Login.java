/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package TiendaLaModa;
import java.sql.*; //Es necesario importarlo para usar las clases
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    //Variables necesarias para correr cualquier codigo de SQL
    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    public Login() {
        
        initComponents();
        
        connection = DBConnection.ConnectionDB();//Usa el metodo ConnectionDB para establecer conexion...
        //llama la clase DBConnection.java
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Clave_ingresada = new javax.swing.JPasswordField();
        Usuario_ingresado = new javax.swing.JTextField();
        BotonIngresar = new javax.swing.JButton();
        Usuario = new javax.swing.JLabel();
        Clave = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonIngresar.setText("Ingresar");
        BotonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresarActionPerformed(evt);
            }
        });

        Usuario.setText("Usuario:");

        Clave.setText("Clave:");

        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Usuario)
                    .addComponent(Clave))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Clave_ingresada, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(Usuario_ingresado))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario)
                    .addComponent(Usuario_ingresado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clave_ingresada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clave))
                .addGap(31, 31, 31)
                .addComponent(BotonIngresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonSalir)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void BotonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarActionPerformed
        //Aqui se configura el boton ingresar 
        String sql = "SELECT * FROM Administradores WHERE Usuario LIKE ? AND Password LIKE ?;";  
        //String sql = "select sqlite_version();";
         // Para ingresar usamos user: Admin y clave; Admin 
         //y aun no estan habilitados todos los botones ni todas las BD      
        try{
            pst = connection.prepareStatement(sql);
            pst.setString(1, Usuario_ingresado.getText());//Esto es para indicar que el primer argumento (el primer ?)
            //viene de el primer espacio del texto User
            pst.setString(2, Clave_ingresada.getText());//El segundo argumento (?)
            //viene del segundo espacio de Pass
            rs = pst.executeQuery();
            //System.out.print(rs);
            if  (rs.next()) {
                JOptionPane.showMessageDialog(null, "Accesso concedido");
                
                MenudeModulos newframe = new MenudeModulos();
                newframe.setVisible (true);
                this.dispose();
                
            } else {
                JOptionPane.showMessageDialog(null, "Accesso denegado. Credenciales incorrectas");

            }
            rs.close();
            connection.close();
            
        }
        catch (Exception e) {
            System.out.print("Error: " + e);

        }
        
    }//GEN-LAST:event_BotonIngresarActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed

    /**
     * @param args the commandline arguments
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIngresar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JLabel Clave;
    private javax.swing.JPasswordField Clave_ingresada;
    private javax.swing.JLabel Usuario;
    private javax.swing.JTextField Usuario_ingresado;
    // End of variables declaration//GEN-END:variables

}
