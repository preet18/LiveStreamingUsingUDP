package com.live.streaming.udp.service;

public class AudioReceiver {

	public void receiveAudio() {
		String ipAddress = "172.20.10.9";
		int port = 9000;
		TCP_IP_Client tcpClient = new TCP_IP_Client();
		tcpClient.receiveDataViaTCPIPConnection(new ReceiveAudioDataViaTCPIP(), ipAddress, port);
	}
}
