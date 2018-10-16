import java.sql.*;

class PreparedDemo
{
	public static void main(String ar[])
	{
		Connection con=null;
		Statement stmt =null;
		ResultSet rs =null;
		PreparedStatement p =null;
		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con=DriverManager.getConnection("jdbc:odbc:connect","","");
		stmt= con.createStatement();
		p=con.prepareStatement("insert into login (USERNAME,PASSWORD) values(?,?)");
		int i=0;
		for( i=0;i<ar.length;i=i+2)
		{
			p.setString(1,ar[i]);
			p.setString(2,ar[i+1]);
			p.addBatch();
		System.out.println("I : "+ i);
		System.out.println("I : "+ (i+1));
		}
		
		int r= p.executeUpdate();
		rs = stmt.executeQuery("Select * From Login");
		}catch(Exception e)
		{
			System.out.println("Error    ::: "  + e);
			try
			{
				con.rollback();
			}catch(Exception e1)
			{
				System.out.println("Error 1 1  " + e1);	
			}
		}
	}
}