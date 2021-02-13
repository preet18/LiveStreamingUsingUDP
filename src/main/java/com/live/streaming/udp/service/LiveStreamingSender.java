package com.live.streaming.udp.service;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.List;

public class LiveStreamingSender {

	public void doLiveStreaming() {
		/*
		 * 
		 */
		TCP_IP_Server_old tcpServer = new TCP_IP_Server_old();
		List<String> ipList = tcpServer.getClientIPAddress();
		
		/* 
		 * To Receive the live streaming data from the user
		 */
		UDP_Client udpClient = new UDP_Client();
		udpClient.sendLiveStreamingData(ipList);
	}
	
}
