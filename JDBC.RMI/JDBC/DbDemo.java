import java.sql.*;

class DbDemo
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
			rs = stmt.executeQuery("Select * from  " + ar[0]);
			while(rs.next())
			{	
		System.out.println("\n"+rs.getString(1)+"\t"+rs.getString(2));
			}
			rs.close();
			stmt.close();
			con.close();
		}catch(SQLException e)
		{
			System.out.println("Error : " + e);
		}		
		catch(Exception e)
		{
			System.out.println("Error : " + e);
		}
	}
}