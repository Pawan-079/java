package database;
import java.sql.*;
public class JDBCDemo2
{    
    public static void main(String arg[])
    {
	Connection connection = null;
	try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/niet",
		"root", "mallesh");

            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery("select * from mytable");
            String name,age;
            String title;
            while (resultSet.next()) {
                name = resultSet.getString("name");
                age = resultSet.getString("age");
                System.out.println("Name : " + name+ " Age : " + age);
            }
            PreparedStatement p=null;
            String updateStmt="update mytable set age=35 where name=\"Seema\"";
            p=connection.prepareStatement(updateStmt);
            p.execute();

            PreparedStatement p1=null;
            String deleteStmt="delete from mytable where name=\"Mansi\"";
            p1=connection.prepareStatement(deleteStmt);
            p1.execute();

            PreparedStatement p2=null;
            String insertStmt="insert into mytable values(Mansi,24)";
            p2=connection.prepareStatement(insertStmt);
            p2.execute();

            while (resultSet.next()) {
                name = resultSet.getString("name");
                age = resultSet.getString("age");
                System.out.println("Name : " + name+ " Age : " + age);
            }

            resultSet.close();
            statement.close();
            connection.close();
	}
	catch (Exception exception) {
            System.out.println(exception);
	}
    }
}