package com.live.streaming.udp.service;

import com.live.streaming.udp.interfaces.ReceiveDataViaTCPIP;

public class ReceiveAudioDataViaTCPIP implements ReceiveDataViaTCPIP{

	@Override
	public void receiveDataViaTCPIP(byte[] data) {
		System.out.println("Inside receiveDataViaTCPIP...");
		try {
			System.out.println("Audio Data is :: " + data[0] + " Size :: " + data.length);
		}catch(Exception ex) {
			System.out.println("Exception in receiveDataViaTCPIP :: " + ex.getMessage());
		}
	}

}
