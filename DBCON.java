import java.sql.*;

public class DBCON 
{
   Connection con;
    DBCON()
    {
        try
        {
            String connectionURL = "jdbc:mysql://localhost:3306/college"; 
            Class.forName("com.mysql.jdbc.Driver"); 
            con= DriverManager.getConnection(connectionURL, "root", "root");

            System.out.println("connection success.. ");
        }
        catch(Exception e)
        {
            System.out.println("connection failed.. "+e);
        }
    }
    public static void main(String args[])
    {
            DBCON obj = new DBCON();
    }
}
