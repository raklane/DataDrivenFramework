package com.rakesh.rough;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalHostAddr {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		
		String localHost = InetAddress.getLocalHost().getHostAddress();
		System.out.println(localHost);
		
	}

}
