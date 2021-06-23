import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connectDB {

	public static void main(String[] args) throws SQLException {
		
		
		//create connection
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "localhost", "ravikumar");
		
		//create statement
		Statement stmt = con.createStatement();
		
		//execute query
		String tabledata = "insert into emp_details(firstname,lastname,city)values('ravikumar','kumar','pvld')";
		stmt.execute(tabledata);
		
		con.close();
		
		System.out.println("Program is executed");
		
		
	}

}
