/*	Write a java code in which client will send file name to server and server will
	send content of that file to client.
 */
import java.net.*;
import java.util.Scanner;
import java.io.*;
public class Program22_Client {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Socket s = new Socket("localhost",1000);
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			Scanner in = new Scanner(System.in);
			dout.writeUTF("D:\\java prog\\Files\\"+in.nextLine());
			dout.flush();
			BufferedReader br = new BufferedReader(new InputStreamReader(din));
			String data ="";
			while((data = br.readLine()) != null)
			{
				System.out.println(data);
			}
			br.close();
			din.close();
			dout.close();
			s.close();
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
