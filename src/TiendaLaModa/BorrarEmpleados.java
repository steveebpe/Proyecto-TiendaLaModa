/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TiendaLaModa;

import javax.swing.DefaultListModel;
import java.awt.List;
import java.sql.*;
import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.JOptionPane;
/**
 *
 * @author tifanycantillo
 */
public class BorrarEmpleados extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    private DefaultListModel EmpleadosModelDL;
    
    public BorrarEmpleados() {
        initComponents();
        connection = DBConnection.ConnectionDB();
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
        BotonMostrarEmpleados = new javax.swing.JButton();
        BotonBorrarEmpleado = new javax.swing.JButton();
        BotonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ListaEmpleados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {  };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListaEmpleados);

        BotonMostrarEmpleados.setText("Mostrar empleados");
        BotonMostrarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMostrarEmpleadosActionPerformed(evt);
            }
        });

        BotonBorrarEmpleado.setText("Borrar empleado");
        BotonBorrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarEmpleadoActionPerformed(evt);
            }
        });

        BotonAtras.setText("Atras");
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(BotonBorrarEmpleado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(BotonMostrarEmpleados))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(BotonAtras)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(BotonMostrarEmpleados)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonBorrarEmpleado)
                .addGap(18, 18, 18)
                .addComponent(BotonAtras)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonMostrarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMostrarEmpleadosActionPerformed
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
        
    }//GEN-LAST:event_BotonMostrarEmpleadosActionPerformed

    private void BotonBorrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarEmpleadoActionPerformed
        String sql = "DELETE FROM Empleados WHERE Cedula = ?";
        //EmpleadosModelDL = new DefaultListModel();
        //ListaEmpleados.setModel(EmpleadosModelDL);
        
        try{
            
                int index = ListaEmpleados.getSelectedIndex();
                String s = (String) ListaEmpleados.getSelectedValue();
                String[] parts = s.split("/");
                String Cedula = parts[0];
                System.out.print(Cedula);
                
                pst = connection.prepareStatement(sql);
                pst.setString(1, Cedula);
                int resultado = pst.executeUpdate();
                //rs.close();
                //connection.close();
        
        }catch (Exception e){
        
        
        }
        
        BotonMostrarEmpleadosActionPerformed(evt);
            
    }//GEN-LAST:event_BotonBorrarEmpleadoActionPerformed

    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        ModuloEmpleados newframe = new ModuloEmpleados();
       newframe.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BotonAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(BorrarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrarEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonBorrarEmpleado;
    private javax.swing.JButton BotonMostrarEmpleados;
    private javax.swing.JList<String> ListaEmpleados;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
