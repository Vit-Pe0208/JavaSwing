/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancodados;
import java.awt.Component;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
/**
 *
 * @author Vitor55679526
 */
public class ConexaoMysql {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
      private static final String URL = "jdbc:mysql://localhost:3306/sistem_vendaprofessor";
      private static final String USER = "root";
      private static final String PASS = "senac";
   
   
    public static Connection conexaoBanco() throws SQLException {
        try {
             Class.forName(DRIVER);
             Component parentComponent = null;
             return DriverManager.getConnection(URL,USER, PASS);
         } catch (ClassNotFoundException ex) {
            Component parentComponent = null;
           
             
      throw new RuntimeException("Erro no banco de dados",ex);
       
         } 
    }
    
    
}
