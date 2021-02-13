package com.live.streaming.udp.test;

import java.net.InetAddress;
import java.util.ArrayList;

import com.live.streaming.udp.service.LiveStreamingSender;


public class Test {

	public static void main(String[] args) {
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
		System.out.println(inetAddress.getHostAddress());
		}catch(Exception ex){
			System.out.println("IN Exception :: " + ex.getMessage());
		}finally {
			
		}
	}
}
