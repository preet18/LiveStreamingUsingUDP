package com.live.streaming.udp.service;

public class LiveStreamingReceiver {

	public void getLiveStreaming() {
		
		/*
		 * To get live streaming, just establishing tcp ip connection, so that the
		 * server knows the ip to which it need to send the live streaming data.
		 */
		TCP_IP_Client tcpClient = new TCP_IP_Client();
		tcpClient.doTCPIPConnection();
		
		/* 
		 * To Receive the live streaming data from the user
		 */
		UDP_Server udpServer = new UDP_Server();
		System.out.println(udpServer.receiveLiveStreamingData());
	}
}
