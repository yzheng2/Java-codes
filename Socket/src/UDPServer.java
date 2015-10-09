import java.io.IOException;
import java.net.*;


public class UDPServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket socket = new DatagramSocket(8800);
		byte[] data = new byte[1024];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		System.out.println("Server started, waiting for client");
		socket.receive(packet);
		String info = new String(data, 0, packet.getLength());
		System.out.println("I am server" + info);
		
		InetAddress address = packet.getAddress();
		int port = packet.getPort();
		byte[] data2 = "Welcome".getBytes();
		DatagramPacket packet2 = new DatagramPacket(data2, data2.length, address, port);
		socket.send(packet2);
		socket.close();
	}

}
