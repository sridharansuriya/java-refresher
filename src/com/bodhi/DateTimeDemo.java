package com.bodhi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateTimeDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LocalDate d = LocalDate.now();
		System.out.println(d);
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		System.out.println(DateTimeDemo.getUtcTime());
		Thread.sleep(1000);
		System.out.println(DateTimeDemo.getUtcTime());
	}
	
	private static Instant getUtcTime() {
		return Instant.now().atZone(ZoneId.of("UTC")).toInstant();
	}

}
