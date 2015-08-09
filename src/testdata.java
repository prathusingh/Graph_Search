import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.*;
public class testdata {
	

	public static void main(String[] args) {
		
		testdata object=new testdata();
		try
		{
			 String url = "jdbc:mysql://localhost:3306/";
		     String dbName ="demo";
		     String driver = "com.mysql.jdbc.Driver";
		     String userName = "root";
		     String password = "prathu";
		     Statement pstmt1;
		     ResultSet resultSet1;
		     
		     Class.forName(driver).newInstance();
		     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/freebase_basketball","root","prathu");
		     Statement stmt=conn.createStatement();
		     
		     ArrayList<HashMap<String,String>> tuplesSource=new ArrayList<HashMap<String,String>>();
			    HashMap<String,String> tuplesDestination=new HashMap<String,String>();
			    
			    File file1 = new File("D://Project/Tuples.doc");
				 
				// if file doesnt exists, then create it
				if (!file1.exists()) {
					file1.createNewFile();
				}
	 
				FileWriter fwnew = new FileWriter(file1.getAbsoluteFile());
				BufferedWriter bwnew = new BufferedWriter(fwnew);
				
			    
			    ResultSet result=stmt.executeQuery("Select * from basketballdataset");
			    int count=1;
		 while (result.next()) {
			// System.out.println("D"+count);
			 //HashMap<String,String> tupleDestination=new HashMap<String,String>();
		        	
		        	String s=result.getString(1);
		        	String p=result.getString(2);
		        	String d=result.getString(3);
		        	String tuple=s+","+p+","+d;
		        	bwnew.write(tuple);
		        	bwnew.newLine();
		        	
		        	//System.out.println(id+ " "+value);
		        //	System.out.println(tuple);
		        	
		        //	bw.write(id+ ","+ value);
		        //	bw.newLine();
		        	count++;
		        	
		        	
		 }
		 
		 
		bwnew.close();
   	
   	
		     
		     
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
