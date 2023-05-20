package assignment;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class TimeConversion {
	
	public static void main(String[] args) {
		ZonedDateTime localDateTime = ZonedDateTime.now();
		System.out.println(localDateTime);
		ZonedDateTime utcDateTime = ZonedDateTime.ofInstant(
		  localDateTime.toInstant(), 
		  ZoneOffset.UTC
		);
		System.out.println(utcDateTime);
	}

}
