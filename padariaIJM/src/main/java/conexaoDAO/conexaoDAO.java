/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexaoDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class conexaoDAO {
    public Connection conectaBD(){
       Connection con = null;
       
        try {
            String url = "jdbc:mysql://localhost:3306/ijm?user=root&password=192835209";
            con = DriverManager.getConnection(url);
            
        } catch (SQLException errocon) {
            JOptionPane.showMessageDialog(null,"conexaoDAO" + errocon.getMessage());
        }
        return con;
    }
    
}
