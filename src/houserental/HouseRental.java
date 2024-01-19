package houserental;

import java.sql.*;
import java.util.*;

public class HouseRental {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name,phno,pwd;
        try(Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ghar","root","")){
            try (Statement st = conn.createStatement()) {
                System.out.println("Enter name: ");
                name=sc.next();
                System.out.println("Enter phno: ");
                phno=sc.next();
                System.out.println("Enter pwd: ");
                pwd=sc.next();
                String sql="insert into users values('" +name+ "','" +phno+ "','" +pwd+ "')";
                st.executeUpdate(sql);
            }
                System.out.println("User inserted successfully");
        }
        catch(Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("In Final");
        }
    }
}  
