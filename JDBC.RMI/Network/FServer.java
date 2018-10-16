import java.io.*;
import java.net.*;

public class FServer
{
	public static void main(String ap[]) throws IOException
	{
		System.out.println("In the Server");
	
		ServerSocket serverSocket =null;
	
		try
		{
		serverSocket = new ServerSocket(9191); // PORT nO. 
		}catch(IOException e)
		{
		System.out.println("Could Not Listen on Port : 95 ");
		}
		
		Socket clientSocket =null;
		try
		{
		clientSocket = serverSocket.accept(); // iNcomming
		System.out.println("Connected to : " + clientSocket);
		}
		catch(IOException e)
		{
			System.out.println("Accept Failed ");
		}
		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);
		String inpuLine,outputLine;
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Data in Server ");
		String s= stdin.readLine();
		File f = new File(s);
		if(f.exists())
			{
		 BufferedReader d = new BufferedReader(new FileReader(s));
		 String line;
		 while((line=d.readLine())!=null)
		 {
			out.write(line+"\n");	
			out.flush();
		}
		d.close();
	     }
		out.close();
	clientSocket.close();
	serverSocket.close();
}
}