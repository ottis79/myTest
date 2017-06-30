package it.my.time;

import java.time.LocalDate;
import java.time.Month;

public class Time2 {
	
	public static void main(String [] args){
		
		LocalDate ld = LocalDate.of(1940, Month.JANUARY, 3);
		
		ld = ld.minusYears(3).plusMonths(10).plusDays(15);
		
		ld.minusYears(10);
		
		System.out.println(ld.getMonth()+" "+ld.getYear());
		
		
	}
}
