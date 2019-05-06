/*	Write a java socket program, which accepts a message from client and send 
 * 	the same to client by changing the case.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;
public class Program33_Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ServerSocket ss = new ServerSocket(5000);
			Socket s = ss.accept();
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			
			String str = din.readUTF();
			char[] ch = str.toCharArray();
			for(int i=0; i<ch.length; i++)
			{
				if(Character.isUpperCase(ch[i]))
					ch[i] = Character.toLowerCase(ch[i]);
				else if(Character.isLowerCase(ch[i]))
					ch[i] = Character.toUpperCase(ch[i]);
			}
			str = String.valueOf(ch);
			
			dout.writeUTF(str);
			dout.flush();
			s.close();
			ss.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
