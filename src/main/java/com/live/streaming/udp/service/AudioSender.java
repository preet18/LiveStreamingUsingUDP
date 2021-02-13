package com.live.streaming.udp.service;

import java.util.List;

public class AudioSender {

	public void sendAudio() {
		System.out.println("Send Audio in Audio Sender...");
		TCP_IP_Server tcpServer = new TCP_IP_Server();
		tcpServer.getTCPIPConnection(new SendAudioDataViaTCPIP());
	}
}
