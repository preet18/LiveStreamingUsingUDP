package com.live.streaming.udp.service;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import com.live.streaming.udp.interfaces.SendDataViaTCPIP;

public class TCP_IP_Server {

	public void getTCPIPConnection(SendDataViaTCPIP tcpIPData) {
		System.out.println("TCP_IP_Server....Send Live Stream Data...");
		try {
			int port = 9000;
			ServerSocket serverSocket = new ServerSocket(port);
			boolean isStopped = false;
			System.out.println("Accepting the TCP/IP connections from clients...");
			while(!isStopped) {
				Socket socket = serverSocket.accept();
				System.out.println("Client IP Address :: " + socket.getInetAddress().getHostAddress());
				tcpIPData.fetchData(socket);
			}
		}catch(Exception ex) {
			System.out.println("In TCP IP Server Exception :: " + ex.getMessage());
		}
	}
}
