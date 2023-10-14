package database;
import java.sql.*;
public class JDBCDemo
{    
    public static void main(String arg[])
    {
	Connection connection = null;
	try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/mysql",
		"root", "mallesh");
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery("select * from mallesh");
            int code1,code2;
            String title;
            while (resultSet.next()) {
                code1 = resultSet.getInt("c1");
                code2 = resultSet.getInt("c2");
                System.out.println("Code1 : " + code1+ " Code2 : " + code2);
            }
            PreparedStatement p=null;
            String updateStmt="update mallesh set c2=2000 where c1=1";
            p=connection.prepareStatement(updateStmt);
            p.execute();

            PreparedStatement p1=null;
            String deleteStmt="delete from mallesh where c1=350";
            p1=connection.prepareStatement(deleteStmt);
            p1.execute();

            PreparedStatement p2=null;
            String insertStmt="insert into mallesh values(200,300)";
            p2=connection.prepareStatement(insertStmt);
            p2.execute();

            resultSet.close();
            statement.close();
            connection.close();
	}
	catch (Exception exception) {
            System.out.println(exception);
	}
    } // function ends
} // class ends