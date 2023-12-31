/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TiendaLaModa;

import java.awt.List;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author tifanycantillo
 */
public class Editardatosdeempleados extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    private DefaultListModel EmpleadosModelDL;
    
    
    public Editardatosdeempleados() {
        initComponents();
        connection = DBConnection.ConnectionDB();//Usa el metodo ConnectionDB para establecer conexion...
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
        ListaEmpleados = new javax.swing.JList<>();
        EditarButton = new javax.swing.JButton();
        MostrarEmpleadosButton = new javax.swing.JButton();
        CedulaTF = new javax.swing.JTextField();
        NombreTF = new javax.swing.JTextField();
        SalarioTF = new javax.swing.JTextField();
        PuestoTF = new javax.swing.JTextField();
        PApellidoTF = new javax.swing.JTextField();
        LabelCedula = new javax.swing.JLabel();
        LabelNombre = new javax.swing.JLabel();
        LabelSalario = new javax.swing.JLabel();
        LabelPApellido = new javax.swing.JLabel();
        LabelPuesto = new javax.swing.JLabel();
        GuardarButton = new javax.swing.JButton();
        AtrasBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ListaEmpleados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListaEmpleados.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ListaEmpleadosFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(ListaEmpleados);

        EditarButton.setText("Editar");
        EditarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarButtonActionPerformed(evt);
            }
        });

        MostrarEmpleadosButton.setText("Mostrar Empleados");
        MostrarEmpleadosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarEmpleadosButtonActionPerformed(evt);
            }
        });

        CedulaTF.setEditable(false);

        LabelCedula.setText("Cedula:");

        LabelNombre.setText("Nombre:");

        LabelSalario.setText("Salario:");

        LabelPApellido.setText("Primer Apellido");

        LabelPuesto.setText("Puesto que ocupa:");

        GuardarButton.setText("Guardar");
        GuardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarButtonActionPerformed(evt);
            }
        });

        AtrasBoton.setText("Atras");
        AtrasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EditarButton)
                            .addComponent(MostrarEmpleadosButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelSalario)
                                    .addComponent(LabelPuesto)
                                    .addComponent(LabelPApellido)
                                    .addComponent(LabelCedula)
                                    .addComponent(LabelNombre)
                                    .addComponent(AtrasBoton))
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addComponent(GuardarButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(NombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CedulaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PApellidoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PuestoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SalarioTF, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(MostrarEmpleadosButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EditarButton)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CedulaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelCedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNombre)
                    .addComponent(NombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PApellidoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPApellido))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPuesto)
                    .addComponent(PuestoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalarioTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSalario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarButton)
                    .addComponent(AtrasBoton))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarButtonActionPerformed
        
        try {
        
            int index = ListaEmpleados.getSelectedIndex();
            String s = (String) ListaEmpleados.getSelectedValue();


            /*for (int i = 0; i < ListaEmpleados.getModel().getSize(); i++){
                //System.out.println(ListaEmpleados.getModel().getElementAt(i));
                String item = ListaEmpleados.getModel().getElementAt(i);
                String[] parts = item.split("/");

                Nombretxtfield.setText(parts[0]);
                PApellidotxtfield.setText(parts[1]);
                Cedulatxtfield.setText(parts[2]);
                Puestotxtfield.setText(parts[3]);
                Salariotxtfield.setText(parts[4]);
            }*/

           String[] parts = s.split("/");

           CedulaTF.setText(parts[0]);
           NombreTF.setText(parts[1]);
           PApellidoTF.setText(parts[2]);
           PuestoTF.setText(parts[3]);
           SalarioTF.setText(parts[4]);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un empleado de la lista.");
        }
        
       
    }//GEN-LAST:event_EditarButtonActionPerformed

    private void MostrarEmpleadosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarEmpleadosButtonActionPerformed
        String sql = "SELECT * FROM Empleados";
        EmpleadosModelDL = new DefaultListModel();
        ListaEmpleados.setModel(EmpleadosModelDL);
        
        try{
            String CedulaEmp, Nombre, Apellido, Puesto, Salario;
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while  (rs.next()) {
                
                CedulaEmp = rs.getString("Cedula");
                Nombre = rs.getString("Nombre");
                Apellido = rs.getString("Apellido");
                Puesto = rs.getString("Puesto");
                Salario = rs.getString("Salario");
                
                
               
                String EmpleadosAll = CedulaEmp + "/" + Nombre + "/" + Apellido + "/" + Puesto + "/" + Salario;
                EmpleadosModelDL.addElement(EmpleadosAll);

            }
            //rs.close();
            //connection.close();
        
        }catch (Exception e){
        
        
        }
    }//GEN-LAST:event_MostrarEmpleadosButtonActionPerformed

    private void GuardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarButtonActionPerformed
        String sql = "UPDATE Empleados SET Nombre= ?, Apellido=?, Puesto=?, Salario=? WHERE Cedula = ?";
        
        try{
            pst = connection.prepareStatement(sql);  
            pst.setString(1, NombreTF.getText()); 
            pst.setString(2, PApellidoTF.getText());
            pst.setString(3, PuestoTF.getText());
            pst.setString(4, SalarioTF.getText());
            pst.setString(5, CedulaTF.getText());
            int resultado = pst.executeUpdate();
            
            if(resultado == 1){
                 JOptionPane.showMessageDialog(null, "Empleado editado exitosamente");
            
                 
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
        
    }//GEN-LAST:event_GuardarButtonActionPerformed

    private void AtrasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasBotonActionPerformed
        ModuloEmpleados newframe = new ModuloEmpleados();
       newframe.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_AtrasBotonActionPerformed

    private void ListaEmpleadosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ListaEmpleadosFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaEmpleadosFocusGained

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
            java.util.logging.Logger.getLogger(Editardatosdeempleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editardatosdeempleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editardatosdeempleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editardatosdeempleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editardatosdeempleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtrasBoton;
    private javax.swing.JTextField CedulaTF;
    private javax.swing.JButton EditarButton;
    private javax.swing.JButton GuardarButton;
    private javax.swing.JLabel LabelCedula;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelPApellido;
    private javax.swing.JLabel LabelPuesto;
    private javax.swing.JLabel LabelSalario;
    private javax.swing.JList<String> ListaEmpleados;
    private javax.swing.JButton MostrarEmpleadosButton;
    private javax.swing.JTextField NombreTF;
    private javax.swing.JTextField PApellidoTF;
    private javax.swing.JTextField PuestoTF;
    private javax.swing.JTextField SalarioTF;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
