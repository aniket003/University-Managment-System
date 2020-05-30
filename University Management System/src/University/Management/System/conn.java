package University.Management.System;
import java.sql.*;
public class conn {

	Connection c;
	Statement st;
	public conn()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ums","root","Anisachi3");
			st=c.createStatement();
			
		}  
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
