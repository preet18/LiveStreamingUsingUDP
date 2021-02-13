package com.live.streaming.udp.service;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCP_IP_Client {

	public void receiveDataViaTCPIPConnection(ReceiveAudioDataViaTCPIP receiveAudioDataViaTCPIP, String ipAddress, int port) {
		System.out.println("TCP IP Client... TO Receive the live streaming data...");
		try {
			byte[] data = null;
			Socket socket = new Socket(ipAddress, port);
			InputStream inputStream = socket.getInputStream();
			data = inputStream.readAllBytes();
			receiveAudioDataViaTCPIP.receiveDataViaTCPIP(data);
			inputStream.close();
			socket.close();
		}catch(Exception ex) {
			System.out.println("In Exception :: " + ex.getMessage());
		}
	}
}
