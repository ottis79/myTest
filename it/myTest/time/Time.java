package it.my.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Time {
	
	public static void main(String [] args){
		ArrayList <DateTimeFormatter> formatter = new ArrayList<>();
		
		formatter.add(DateTimeFormatter.BASIC_ISO_DATE);
		formatter.add(DateTimeFormatter.ISO_DATE);
		formatter.add(DateTimeFormatter.ISO_DATE_TIME);
		formatter.add(DateTimeFormatter.ISO_LOCAL_DATE);
		formatter.add(DateTimeFormatter.ISO_WEEK_DATE);
		
		LocalDateTime ldt = LocalDateTime.now();
		formatter.forEach(c -> System.out.println(ldt.format(c)));
		
		
	}
}
