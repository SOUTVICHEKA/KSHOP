package finalproject;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KsDB {
    private final String HOSTNAME="localhost";
    private final String USERNAME="root";
    private final String PASSWORD="";
    private final String DATABASE="KS";
    private final int PORT=3306;
    
    private Connection conn;
    private Statement stm1, stm2;
    
    Connection con= null;
    Statement stmt=null;
    Connection getconnection(){
        return this.con;
    }
    
    
    public KsDB(){
        try {
            String url="jdbc:mysql://"+HOSTNAME+":"+PORT+"/"+DATABASE;
            conn=DriverManager.getConnection(url,USERNAME,PASSWORD);
            
            // create table in 
            String sql = "CREATE TABLE IF NOT EXISTS REGISTER ("
                    + "Username VARCHAR(50) NOT NULL, "
                    + "Email VARCHAR(50) PRIMARY KEY UNIQUE, "
                    + "Password VARCHAR(50) NOT NULL"
                    + ")";  // Removed the trailing comma here
            stm1 = conn.prepareStatement(sql);
            stm1.execute(sql);

            String sql1 = "CREATE TABLE IF NOT EXISTS KsPRODUCT ("
                    + "ID INT PRIMARY KEY AUTO_INCREMENT, "
                    + "Name VARCHAR(50) NOT NULL, "
                    + "Qty INT, "
                    + "Price DOUBLE, "
                    + "Total DOUBLE, "
                    + "Email VARCHAR(50) NOT NULL, "
                    + "FOREIGN KEY (Email) REFERENCES REGISTER(Email) ON DELETE CASCADE"
                    + ")";  // Ensure correct closing parenthesis here
            stm2 = conn.prepareStatement(sql1);
            stm2.execute(sql1);

            
            System.out.println("Create success.");
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
    }
    public Connection connected(){   // it's liike connecthz Ready
        return conn;
    }

    
}
