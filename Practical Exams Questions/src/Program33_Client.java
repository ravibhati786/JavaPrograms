/*	Write a java socket program, which accepts a message from client and send 
 * 	the same to client by changing the case.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Scanner;
import java.io.*;
public class Program33_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket s = new Socket("192.168.2.22",5000);
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			String str = "Hello RAVI";
			dout.writeUTF(str);
			dout.flush();
			String str1 = din.readUTF();
			System.out.println("After Conversion ="+str1);
		} 
		catch (Exception ex) 
		{
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
	}

}
