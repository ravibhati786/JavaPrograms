/*	Write a java program to display IP Address and Name of client machine. (Socket Programming)
 */
import java.net.*;
public class Program29 {
	public static void main(String args[])
	{
		try
		{
			InetAddress ip = InetAddress.getLocalHost();
			System.out.println("Host Name: "+ip.getHostName());
			System.out.println("Host Address: "+ip.getHostAddress());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
