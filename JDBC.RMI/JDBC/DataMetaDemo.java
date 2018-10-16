import java.sql.*;

class DataMetaDemo
{
	public static void main(String ar[])
	{
		Connection con=null;
		Statement stmt =null;
		ResultSet rs =null;
		DatabaseMetaData DMD ;
		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con=DriverManager.getConnection("jdbc:odbc:connect","scott","tiger");
		 // (dsnname,username,password
		DMD = con.getMetaData();
		System.out.println("Version " + DMD.getDatabaseProductVersion() );
		System.out.println("Name " + DMD.getDatabaseProductName() );
	System.out.println("DriverName " + DMD.getDriverName() );
	System.out.println("DriverName Version " + DMD.getDriverVersion() );

		}
		catch(Exception e)
		{
		System.out.println("Error  " + e);
		}
	}
}