package houserental;

import java.sql.*;

public class db {
    public static Connection mycon() {
        Connection conn=null;
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ghar","root","");
        }
        catch(SQLException e) {
            System.out.println(e);
        }
        return conn;
    }
}  
