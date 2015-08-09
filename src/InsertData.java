import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.*;


public class InsertData {

	public static void main(String[] args) {
		try
		{
			String property="/basketball/basketball_team/head_coach";
			String[] p=property.split("/");
			String propertyValue=null;
			if(p[3].equalsIgnoreCase("position_s") )
			{
			String[] propValue=p[3].split("_");
			propertyValue=propValue[0];
			}
			else if( p[3].equalsIgnoreCase("head_coach"))
			{
				String[] propValue=p[3].split("_");
				propertyValue=propValue[1];
			}
			else if(p[3].equalsIgnoreCase("teams"))
			{
				propertyValue="team";
			}
			else if(p[3].equalsIgnoreCase("divisions"))
			{
				propertyValue="division";
			}
			else
			{
				propertyValue=p[3];
			}
			
			System.out.println(propertyValue);

		     
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}


	}

}
