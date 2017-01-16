import java.io.*;
import java.util.*;
import java.net.*;

class chat_server
{
	public static void main(String args[]) throws Exception
	{
		String sen,modSen;
		ServerSocket welcomeSocket = new ServerSocket(4000);
		Socket connectionSocket = welcomeSocket.accept();
		Scanner user = new Scanner(System.in);
		Scanner client = new Scanner(connectionSocket.getInputStream());
		DataOutputStream out = new DataOutputStream(connectionSocket.getOutputStream());

		while(true)
		{
		if((modSen = client.nextLine()) != null)
		{
			System.out.println(modSen);
		}
			sen = user.nextLine();
			out.writeBytes(sen+"\n");
		}	
}

}