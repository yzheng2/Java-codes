import java.io.*;
import java.net.*;

public class Server {
	public static void main(String[] args){
		try {
			ServerSocket serverSocket = new ServerSocket(8888);
			Socket socket = null;
			int count = 0;
			System.out.println("Server is ready to launch, waiting for connection to client");
			while(true){
				socket = serverSocket.accept();
				ServerThread serverThread = new ServerThread(socket);
				serverThread.start();
				count++;
				System.out.println(count);
				InetAddress address = socket.getInetAddress();
				System.out.println(address.getHostAddress());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
