package it.my.time;

import java.time.Period;

public class Time3 {
	
	public static void main(String [] args){
				
		Period p = Period.parse("P13M");
		System.out.println(p.getMonths());
		System.out.println(p.getDays());
			
	}
}
