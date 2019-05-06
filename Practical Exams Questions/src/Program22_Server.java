/*	Write a java code in which client will send file name to server and server will
	send content of that file to client.
 */
import java.net.*;
import java.io.*;
public class Program22_Server {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try{
			ServerSocket ss = new ServerSocket(1000);
			Socket s = ss.accept();
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			
			String st = din.readUTF();
			BufferedReader br = new BufferedReader(new FileReader(st));
			PrintWriter pwrite = new PrintWriter(dout,true);
			String str="";
			while((str = br.readLine()) != null)
			{
				pwrite.println(str);
			}
			din.close();
			br.close();
			pwrite.close();
			dout.close();
			s.close();
			ss.close();
			
		}
		catch(Exception e)
		{
			
		}
	}

}
