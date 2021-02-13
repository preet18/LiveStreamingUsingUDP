package com.live.streaming.udp.test;

import com.live.streaming.udp.service.AudioSender;

public class TestAudioSender {

	public static void main(String[] args) {
		AudioSender audioSender = new AudioSender();
		audioSender.sendAudio();
	}
}
