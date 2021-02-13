package com.live.streaming.udp.service;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.List;

public class UDP_Client {

	/**
	 * Sending the live stream to the clients who have subscribed...
	 * **/
	public void sendLiveStreamingData(List<String> ipList) {
		System.out.println("UDP_Client....Send Live Stream Data...");
		try {
			int port = 80;
			byte[] buffer = null;
			System.out.println("Reading the File from the path...");
			InputStream inputStream = new FileInputStream("C:\\Users\\preet\\Music\\Ala Vaykuntapuramlo\\[iSongs.info] 01 - Samajavaragamana.mp3");
			buffer = inputStream.readAllBytes();
			System.out.println("Data..." + buffer[0] + " Size :: " + buffer.length);
			System.out.println("Sending the data over the network....");
			for(String ip: ipList) {
				InetAddress inetAddress = InetAddress.getByAddress(ip.getBytes());
				DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length, inetAddress, port);
				DatagramSocket datagramSocket = new DatagramSocket();
				datagramSocket.send(datagramPacket);
				datagramSocket.close();
				
			}
		}catch(Exception ex) {
			System.out.println("In Send Live Stream Exception :: " + ex.getMessage());
		}
	}
}
