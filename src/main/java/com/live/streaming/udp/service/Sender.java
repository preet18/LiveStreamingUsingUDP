package com.live.streaming.udp.service;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender {
	public void performUDPConnection() {
		try {
			//buffer = new byte[100];
			//Data to be sent
			byte[] buffer = "Hey!! This is Preeti..".getBytes();
			
			//Port over which UDP communication is done
			int port = 80;
			
			//IPAddress of Clients
			String maudieIPAddress = "";
			
			//InetAddress instance of clients
			InetAddress maudieInetAddress = InetAddress.getByName(maudieIPAddress);
			System.out.println("Creating the maudie InetAddress..");
			
			//Creating the Datagram Packet to send the data.
			DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length, maudieInetAddress, port);
			System.out.println("created the datagram packet..");
			
			//Creating a DatagramSocket to send the UDP Packet
			DatagramSocket datagramSocket = new DatagramSocket();
			System.out.println("Before sending the data");
			datagramSocket.send(datagramPacket);
			System.out.println("After sending the data");
			
		}catch(Exception ex) {
			System.out.println("In Exception :: " + ex.getMessage());
		}
 	}

}
