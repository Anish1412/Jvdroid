package com.company;

import java.time.*;

public class cwh_100_java_time {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        
        LocalDate d2 = LocalDate.parse("2021-05-27");
                System.out.println(d2.withYear(2001));
                
                LocalDate d3 = LocalDate.parse("2021-05-27");
                LocalDate d4= LocalDate.parse("2021-05-26");
                LocalDate d5= LocalDate.parse("2021-05-26");

                System.out.println(d4.equals(d3));
                System.out.println(d5.equals(d4));
                
                Duration d1 = Duration.between(LocalTime.MIN,LocalTime.MIDNIGHT);  //LocalTime.MIN = '00:00' , LocalTime.NOON = '00:00'
        System.out.println(d1.isZero());

        Duration d6 = Duration.between(LocalTime.MAX,LocalTime.MIN);  //LocalTime.MAX =  '23:59:59.999999999' ,  LocalTime.MIN = '00:00'

        System.out.println(d6.isZero());
    
    Clock cl = Clock.systemUTC();

        System.out.println(cl.instant());
    
    Clock cl1 = Clock.systemDefaultZone();
        System.out.println(cl1.getZone());
    
    }
}
