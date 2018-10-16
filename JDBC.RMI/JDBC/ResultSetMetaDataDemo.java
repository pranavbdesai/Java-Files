import java.sql.*;

class ResultSetMetaDataDemo
{
	public static void main(String ar[])
	{
		Connection con=null;
		Statement stmt =null;
		ResultSet rs =null;
		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con=DriverManager.getConnection("jdbc:odbc:connect","scott","tiger");
		 // (dsnname,username,password
		stmt = con.createStatement();
		rs = stmt.executeQuery("Select * from " + ar[0]);	
		
		ResultSetMetaData RSMD = rs.getMetaData();
		int TCo = RSMD.getColumnCount();
		System.out.println("Total Column " + TCo);
		for(int i=1;i<=TCo;i++)	
		{
			String CName=RSMD.getColumnName(i);
		System.out.println("Column " + CName);
		}
		}
		catch(Exception e)
		{	
		System.out.println("Error " + e);
		}
	}
}