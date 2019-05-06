//	Write a program to exchange the data from client to server until client sends “Bye” to the server.
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.io.*;

public class Program13_Client {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//InetAddress ip = InetAddress.getLocalHost();
		Socket s = new Socket("localhost",3334);
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Client is ready =");
		String str1=" ", str2=" ";
		while(!str1.equals("Bye"))
		{
			str1 = br.readLine();
			dout.writeUTF(str1);
			dout.flush();
			str2 = din.readUTF();
			System.out.println("Server says : "+str2);
		}
		dout.close();
		s.close();
		
	}

}