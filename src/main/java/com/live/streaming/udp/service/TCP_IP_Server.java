package com.live.streaming.udp.service;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class TCP_IP_Server {
	/**
	 * TCP IP Server which is used to get the client address before streaming the data over that IP Address.
	 * @return 
	 * **/
	public List<String> getClientIPAddress() {
		System.out.println("TCP_IP_Server....Send Live Stream Data...");
		List<String>  ipList = new ArrayList<>();
		try {
			int port = 9000;
			ServerSocket serverSocket = new ServerSocket(port);
			boolean isStopped = false;
			System.out.println("Accepting the TCP/IP connections from clients...");
			while(!isStopped) {
				Socket socket = serverSocket.accept();
				System.out.println("Client IP Address :: " + socket.getInetAddress().getHostAddress());
				ipList.add(socket.getInetAddress().getHostAddress());
				isStopped = true;
			}
			System.out.println("List of IPs...");
			for(String ip: ipList) {
				System.out.println(ip);
			}
		}catch(Exception ex) {
			System.out.println("In TCP IP Server Exception :: " + ex.getMessage());
		}
		return ipList;
	}
}
