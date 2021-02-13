package com.live.streaming.udp.service;

import java.io.OutputStream;
import java.net.Socket;

public class TCP_IP_Client {

	public void doTCPIPConnection() {
		System.out.println("TCP IP Client... TO Receive the live streaming data...");
		try {
			String ipAddress = "172.20.10.9";
			int port = 9000;
			byte[] data = new byte[100];
			data = "Me".getBytes();
			Socket socket = new Socket(ipAddress, port);
			OutputStream outputStream = socket.getOutputStream();
			outputStream.write(data);
			outputStream.flush();
			outputStream.close();
			socket.close();
		}catch(Exception ex) {
			System.out.println("In Exception :: " + ex.getMessage());
		}
	}
}
