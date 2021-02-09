package com.mphasis.training.java8;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class JavaTimeApi {

	public static void main(String[] args) {
	
		Date d=new Date();//jav.util.Date
		System.out.println(d);
		System.out.println(d.getMonth()+1);
		System.out.println(d.getDate());
		System.out.println(d.getDay());
		System.out.println(d.getYear()+1900);
		
		Date d1=new Date("12-Mar-1998");
		System.out.println(d1.getYear());
		
		SimpleDateFormat sd=
		new SimpleDateFormat("u  E dd-MMM-yyyy hh:mm:ss");
		System.out.println(sd.format(d1));
		//sd.parse(d1);
		
		Calendar cal=Calendar.getInstance();
		System.out.println(cal);
		System.out.println("Setting date");
		cal.set(1987, 11, 03);
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		//java 8 java.time.*;
		System.out.println("Java 8 features");
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		System.out.println(ld.getDayOfYear());
		
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDate ld1=LocalDate.of(1987, 11, 03);
		System.out.println(ld1);
		
		Period p1=Period.between(ld1, ld);
		System.out.println(p1);
		
		System.out.println("Zone Ids");
		System.out.println(ZoneId.getAvailableZoneIds());
		
		ZoneId zone=ZoneId.of("America/Cuiaba");
		
		LocalDateTime ld2=LocalDateTime.now(zone);
		System.out.println(ld2);
	
	}

}
