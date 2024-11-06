/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import com.mysql.jdbc.Connection;
import static java.lang.Character.UnicodeBlock.forName;
import java.sql.DriverManager;

/**
 *
 * @author Waruni
 */
public class DBConnection {

    public static Connection connect() {

        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/exdatabase", "root", "");
        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;

    }
}
    

