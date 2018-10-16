import java.sql.*;

class DeleteData
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
		String Query = "delete from dept where deptno="+ Integer.parseInt(ar[0]);
		System.out.println("Qury " +Query);

		int i = stmt.executeUpdate(Query);
		rs= stmt.executeQuery("Select * from dept");
		while(rs.next())
			{	
		System.out.println("\n"+rs.getString(1)+"\t"+rs.getString(2) +"\t"+rs.getString(3));
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