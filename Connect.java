/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package music.instrument;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;

/**
 *
 * @author vivek
 */
public class Connect {
    public static Connection Connection(){
        Connection con;
            con = null;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mims?zeroDateTimeBehaviour=CONVERT_TO_NULL","root","Renu@2005");
           
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
