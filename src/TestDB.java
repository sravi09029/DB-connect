import java.sql.SQLException;
import java.util.List;

import com.mysql.cj.exceptions.RSAException;

public class TestDB {

	public static void main(String[] args) throws Exception, SQLException {

		DbManager.setMysqlDbConnection();
		// System.out.println(DbManager.getQuery("select emp_name from duplicate_table
		// where emp_id = '101'"));

		List<String> query = DbManager.getQuery("select emp_name from duplicate_table where emp_id = '101'");

		for (int i = 0; i < query.size(); i++) {

			System.out.println(query.get(i));
		}

	}

}
