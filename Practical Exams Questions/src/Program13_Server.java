//	Write a program to exchange the data from client to server until client sends “Bye” to the server.

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.io.*;

public class Program13_Server {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(3334);
		Socket s = ss.accept();
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 =" ", str2=" ";
		while(!str1.equals("Bye"))
		{
			str1 = din.readUTF();
			System.out.println("Client Says : "+str1);
			str2 = br.readLine();
			dout.writeUTF(str2);
			dout.flush();
		}
		
		din.close();
		dout.close();
		s.close();
		ss.close();
	}

}
