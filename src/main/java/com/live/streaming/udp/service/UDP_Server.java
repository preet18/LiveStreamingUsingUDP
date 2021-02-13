package com.live.streaming.udp.service;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDP_Server {

	public String receiveLiveStreamingData() {
		System.out.println("UDP_Server... TO Receive the live streaming data...");
		byte[] data; 
		try {
			//Port over which it is listening.
			int port = 80;
			byte[] buffer = new byte[100];

			//Datagram packet specifying the length of the message
			DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);
			System.out.println("created the datagram packet..");
			
			//Creation of datagram Datagram Socket
			DatagramSocket datagramSocket = new DatagramSocket(port);
			System.out.println("Before receiving the data");
			datagramSocket.receive(datagramPacket);
			System.out.println("After receiving the data");
			
			data = datagramPacket.getData();
			//System.out.println(data.toString());
			return data.toString();
		}catch(Exception ex) {
			System.out.println("In Exception :: " + ex.getMessage());
			data = "Connection Issue".getBytes(); 
		}
		return data.toString();
	}
	
}
