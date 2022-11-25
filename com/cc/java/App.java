package com.cc.java;

// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.LocalTime;
// import java.time.Month;

import java.time.*;
import java.util.Calendar;

public class App {

	public static void main(String[] args) {
		ausgabe("\n" + App.c("#y") + "--- Datum / Ausgaben ----------------------------");
			// aktuelle Datum
				LocalDate today = LocalDate.now();
				ausgabe("\t" + App.c("#g") + "Heutiges Datum: " + App.c("#c") + today);
			// bestimmtes Datum
				LocalDate givenDate = LocalDate.of(2012, Month.SEPTEMBER, 21);
				ausgabe("\t" + App.c("#g") + "Bestimmtes Datum: " + App.c("#c") + givenDate);
			// nächste Woche
				LocalDate aWeekFromToday = today.plusWeeks(1);
				ausgabe("\t" + App.c("#g") + "Datum in einer Woche: " + App.c("#c") + aWeekFromToday);
			// gestern
				LocalDate yesterday = today.minusDays(1);
				ausgabe("\t" + App.c("#g") + "Gestern: " + App.c("#c") + yesterday);
		
		ausgabe("\n" + App.c("#y") + "--- Vergleiche ----------------------------");
			ausgabe("\t" + App.c("#g") + "Schaltjahr?: " + App.c("#c") + givenDate.isLeapYear() );
			ausgabe("\t" + App.c("#g") + "Heute/Gestern: " + App.c("#c") + today.isAfter(yesterday) );
			ausgabe("\t" + App.c("#g") + "Gestern/Heute: " + App.c("#c") + yesterday.isBefore(today));
			ausgabe("\t" + App.c("#g") + "heute/heute: " + App.c("#c") + today.isEqual(yesterday));

		ausgabe("\n" + App.c("#y") + "--- Extraktion ----------------------------");
			int year = today.getYear();
			ausgabe("\t" + App.c("#g") + "aktuelles Jahr: " + App.c("#c") + year );
			
			givenDate = LocalDate.of(2020, Month.OCTOBER, 9);		
			String weekday = givenDate.getDayOfWeek().name();
			ausgabe("\t" + App.c("#g") + "Wochentag: " + App.c("#c") + weekday );
			ausgabe("\t" + App.c("#g") + "Thank God it's " + App.c("#c") + weekday );
			ausgabe("\t" + App.c("#g") + "Tag im Monat: " + App.c("#c") + today.getDayOfMonth());
			
		ausgabe("\n" + App.c("#y") + "--- Zeit / Ausgaben ----------------------------");
			LocalTime justNow = LocalTime.now();
			ausgabe("\t" + App.c("#g") + "Jetzt: " + App.c("#c") + justNow );
			
			LocalTime newTime = LocalTime.of(12, 00);
			ausgabe("\t" + App.c("#g") + "Mittag: " + App.c("#c") + newTime );
			
			LocalTime inOneHour = justNow.plusHours(1);
			ausgabe("\t" + App.c("#g") + "In einer Stunde: " + App.c("#c") + inOneHour );
		
		ausgabe("\n" + App.c("#y") + "--- Extraktion ----------------------------");
			int hour = justNow.getHour(); // hora
			ausgabe("\t" + App.c("#g") + "H: " + App.c("#c") + hour );
			
			int minute = justNow.getMinute();
			ausgabe("\t" + App.c("#g") + "MIN: " + App.c("#c") + minute );
		
		ausgabe("\n" + App.c("#y") + "--- DateTime ----------------------------");
			LocalDateTime timeStamp = LocalDateTime.now();
			ausgabe("\t" + App.c("#g") + "timeStamp: " + App.c("#c") + timeStamp );
		
		System.out.println("\n" + App.c("#y") + "--- Kalenderwoche ----------------------------");
			Calendar cal = Calendar.getInstance();
			ausgabe("\t" + App.c("#g") + "Kalenderwoche: " + App.c("#c") + cal.get(Calendar.WEEK_OF_YEAR)); 

	}

	public static void ausgabe(String outputStr) {
		System.out.println(outputStr);  
	}
	public static String c( String c ) {
        switch ( c ) {
            case "#r":
                return "\u001b[31m";
            case "#g":
                return "\u001b[32m";
            case "#y":
                return "\u001b[33m";
            case "#b":
                return "\u001b[34m";
            case "#p":
                return "\u001b[35m";
            case "#c":
                return "\u001b[36m";
            default:
                return "\u001b[0m";
        }
    }
}
