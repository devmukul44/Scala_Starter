import java.io.*;
import java.util.*;
import java.net.*;

class chat_client
{

	public static void main(String args[]) throws Exception
	{
		String sen,modSen;
		Socket clientSocket = new Socket("127.0.0.1",4000);
		Scanner user = new Scanner(System.in);
		Scanner server = new Scanner(clientSocket.getInputStream());
		DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());

		while(true)
		{
		sen = user.nextLine();
		out.writeBytes(sen+"\n");

		if( (modSen = server.nextLine()) != null)
		{
			System.out.println(modSen);
		}

		}
	}
}