//	Write a program for client and server to send and receive message using connectionless networking.
import java.net.*;
public class Program35_Sender {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			DatagramSocket ds = new DatagramSocket();
			String str = "Welcome";
			InetAddress ip = InetAddress.getByName("127.0.0.1");
			DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),ip,3000);
			ds.send(dp);
			ds.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
