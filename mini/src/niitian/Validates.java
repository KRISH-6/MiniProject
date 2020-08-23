package niitian;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Validates {
	public static boolean checkUser(String mail,String password) 
    {
        boolean st =false;
        try {

            //loading drivers for mysql
            Class.forName("org.h2.Driver");

            //creating connection with the database
            Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","krishna","1234");
            System.out.println("connection done"); 
            PreparedStatement ps = con.prepareStatement("select * from customer where mail=? and password=?");
            ps.setString(1, mail);
            ps.setString(2, password);
            ResultSet rs =ps.executeQuery();
            st=rs.next();
            System.out.println("out");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;                 
    }   


}
