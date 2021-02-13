package com.live.streaming.udp.test;

import com.live.streaming.udp.service.LiveStreamingSender;

public class TestSender {

	public static void main(String[] args) {
		LiveStreamingSender sender = new LiveStreamingSender();
		sender.doLiveStreaming();
	}

}
