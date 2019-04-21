package com.rakesh.rough;

import java.util.Date;

public class TimeStampTest {
	
	public static void main(String args[]) {
		
		Date d = new Date();
		String screenshotName = d.toString().replaceAll(" ", "_").replaceAll(":", "_");
		System.out.println(screenshotName);
		
	}

}
