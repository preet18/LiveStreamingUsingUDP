package com.live.streaming.udp.test;

import com.live.streaming.udp.service.AudioReceiver;

public class TestAudioReceiver {

	public static void main(String[] args) {
		AudioReceiver audioReceiver = new AudioReceiver();
		audioReceiver.receiveAudio();
	}
}
