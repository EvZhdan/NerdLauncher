import java.awt.HeadlessException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;


public class Server implements Runnable{
	static private ServerSocket	server;
	static private Socket connection;
	static private ObjectOutputStream output;
	static private ObjectInputStream input;
	
	public void run() {
		// TODO Auto-generated method stub
		try {
			
			server = new ServerSocket(5678,10);
			while(true){
				connection = server.accept();
				output = new ObjectOutputStream(connection.getOutputStream());
				input = new ObjectInputStream(connection.getInputStream());
				try {
					output.writeObject("Вы прислали " + (String) input.readObject());
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					JOptionPane.showMessageDialog(null,(String) input.readObject());
				} catch (HeadlessException e) {
				} catch (ClassNotFoundException e) {}
			}
		} catch (IOException e) { }
	}	
	}
