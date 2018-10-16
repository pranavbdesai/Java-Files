import java.io.*;
import java.net.*;

public class FClient
{
	public static void main(String ap[]) throws IOException
	{
		Socket echoSocket =null;
		BufferedReader in = null;
 
		try
		{
		  echoSocket = new Socket(ap[0],9191); //Server Ip Address - ap[0];
		  in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
		}catch(UnknownHostException e)
		{
		System.out.println("Dont KnowAbout  Host");
		System.exit(1);
		}
		catch(IOException e)
		{
		System.out.println("Could NOt Get TheConnect ion");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("Please Enter the machine Ip Which You Want to Connect ");
		}
		String userInput;
		while((userInput = in.readLine())!=null)
		{
		 System.out.println(userInput+"\n");
		}
	in.close();
	echoSocket.close();
	}
    }
