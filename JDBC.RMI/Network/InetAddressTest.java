import java.net.*;
class InetAddressTest
{
	public static void main(String a[])
	{
		try
		{
			InetAddress address = InetAddress.getLocalHost();
			System.out.println("\n Addres : " + address);
			System.out.println("\n Name : " + address.getHostName());	
			System.out.println("\n Name : " + address.getHostAddress());
			String List [] = {"bitnet","bestcc-104","bestcc-112","bestcc-114"};

		for(int i=0;i<List.length;i++)
		{
			InetAddress sw [] = InetAddress.getAllByName(List[i]);
			for(int j=0;j<sw.length;j++)
			{
				System.out.println(sw[j].getHostAddress() +  "  is " + List[i] + "And its Name is :" + sw[j].getHostName());
			}
		}
		}
		catch(UnknownHostException e)
		{
			System.out.println("\n Connection : " +e);
		}
	}
}