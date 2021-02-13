package com.live.streaming.udp.service;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import com.live.streaming.udp.interfaces.SendDataViaTCPIP;

public class SendAudioDataViaTCPIP implements SendDataViaTCPIP{

	@Override
	public void fetchData(Socket socket) {
		System.out.println("Fetching the Data in AudioDataViaTCP...");
		try {
			byte[] buffer = null;
			System.out.println("Reading the File from the path...");
			InputStream inputStream = new FileInputStream("C:\\Users\\preet\\Music\\Ala Vaykuntapuramlo\\[iSongs.info] 01 - Samajavaragamana.mp3");
			buffer = inputStream.readAllBytes();
			System.out.println("Data..." + buffer[0] + " Size :: " + buffer.length);
			System.out.println("Sending the data over the network....");
			System.out.println("Audio Data :: " + buffer);
			OutputStream ouputStream = socket.getOutputStream();
			ouputStream.write(buffer);
			ouputStream.flush();
			ouputStream.close();
			socket.close();
			System.out.println("Audio Data is sent Successfully....");
		}catch (Exception ex) {
			System.out.println("In Exception :: " + ex.getMessage());
		}
		
	}

}
