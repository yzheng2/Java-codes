import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;


public class Test01 {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress address = InetAddress.getLocalHost();
		System.out.println(address.getHostName());
		System.out.println(address.getHostAddress());
		byte[] bytes = address.getAddress();
		System.out.println(Arrays.toString(bytes));
		System.out.println(address);
		
		InetAddress address2 = InetAddress.getByName("ZY-PC");
		InetAddress address3 = InetAddress.getByName("130.215.23.63");
		System.out.println(address3);
	}

}
