/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaLaModa;

import java.sql.*;

//LIBRERIAS EN CLASE 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;


public class DBConnection {         // Esta es la clase que se encarga de crear la base conexion con la base de datos
      Connection connection = null;
      PreparedStatement pst = null;
      ResultSet rs = null;
      
    public static Connection ConnectionDB(){ // Este es el metodo de esta clase para conectarse a la base de datos
               
        try{
            
            String URL = "jdbc:mysql://127.0.0.1:3306/Tienda";
            String USERNAME = "root";
            String PASSWORD= "Katniss.1";
            
            //aqui esta lo anterior
            //Class.forName("org.sqlserver.JDBC");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.print("Conexion exitosa");
            //aqui termina lo anterior 
            //if (connection == null || connection.isClosed()) {
                //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                //connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                //System.out.println("Conexión exitosa");
            //}

            return connection;
                    
        }catch(SQLException e){
            System.out.print("Conexion fallida" + e);
            return null;
        
        }
        
    }
}
