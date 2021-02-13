package com.live.streaming.udp.test;

import java.util.ArrayList;

import com.live.streaming.udp.service.LiveStreamingSender;

public class Test {

	public static void main(String[] args) {
		LiveStreamingSender sender = new LiveStreamingSender();
		sender.sendLiveStream(new ArrayList<String>());
	}
}
