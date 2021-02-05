package com.live.streaming.udp.service;

import java.io.OutputStream;
import java.net.Socket;

public class TCP_IP_Client {

	public void doTCPIPConnection() {
		
		try {
			String ipAddress = "123.321.342.342";
			int port = 9000;
			byte[] data = new byte[100];
			data = "Me".getBytes();
			Socket socket = new Socket(ipAddress, port);
			OutputStream outputStream = socket.getOutputStream();
			outputStream.write(data);
			outputStream.close();
			socket.close();
		}catch(Exception ex) {
			System.out.println("In Exception :: " + ex.getMessage());
		}
	}
}
