package _02_Chat_Application;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/*
 * Using the Click_Chat example, write an application that allows a server computer to chat with a client computer.
 */

public class ChatApp {
	String ip = "localhost";
	int port = 8080;
	
	public void Client() {
		try {
	      Socket s = new Socket(ip, port);
				DataOutputStream dos = new DataOutputStream(s.getOutputStream());
				dos.writeUTF("hiii");
				DataInputStream dis = new DataInputStream(s.getInputStream());
				System.out.println(dis.readUTF());
				s.close();
	   } catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void Server() {
		
	}
	
	
}
