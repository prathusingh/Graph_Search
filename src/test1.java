import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.*;
public class test1 {

	public static void main(String[] args) {
	
		try{
		 String url = "jdbc:mysql://localhost:3306/";
	     String dbName ="demo";
	     String driver = "com.mysql.jdbc.Driver";
	     String userName = "root";
	     String password = "prathu";
	     Statement pstmt1;
	     ResultSet resultSet1;
	     
	     Class.forName(driver).newInstance();
	     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/freebase_basketball","root","prathu");
	
	     File file1 = new File("D://Project/Tuples.doc");
		 
			// if file doesnt exists, then create it
			if (!file1.exists()) {
				file1.createNewFile();
			}

			
			BufferedReader reader = new BufferedReader(new FileReader("D://Project/Tuples.doc"));
			String line = null;
			while ((line = reader.readLine()) != null)
			{
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
