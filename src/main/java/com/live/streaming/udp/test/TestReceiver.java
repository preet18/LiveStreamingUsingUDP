package com.live.streaming.udp.test;

import com.live.streaming.udp.service.LiveStreamingReceiver;

public class TestReceiver {

	public static void main(String[] args) {
		LiveStreamingReceiver receiver = new LiveStreamingReceiver();
		receiver.getLiveStreaming();
	}
}
