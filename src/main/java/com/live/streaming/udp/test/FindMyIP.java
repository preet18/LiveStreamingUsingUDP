package com.live.streaming.udp.test;

import java.net.InetAddress;

import com.live.streaming.udp.service.Sender;

public class FindMyIP {

	public static void main(String[] args) {
		
		try {
			Sender sender = new Sender();
			System.out.println("Calling the UDP establishment connection method...");
			sender.performUDPConnection();
			System.out.println("Ending the UDP establishment connection method...");
		}catch(Exception ex) {
			System.out.println("In Exception :: " + ex.getMessage());
		}
		
		
		
		/*try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			System.out.println(inetAddress.getHostAddress());
		}catch(Exception ex) {
			System.out.println("In Exception :: " + ex.getMessage());
		}*/

	}

}
