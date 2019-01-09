package com.talkingdata.sdmk.java8.jodatime;

import java.time.*;

/**
 * User：    ysl
 * Date:   2018/1/22
 * Time:   10:29
 */
public class JodaTimeDemo {

    public static void main(String[] args){
        final Clock clock = Clock.systemUTC();
        System.out.println();
        System.out.println(clock.instant());
        System.out.println(clock.millis());


        // Get the local date and local time
        final LocalDate date = LocalDate.now();
        final LocalDate dateFromClock = LocalDate.now(clock);

        System.out.println( date );
        System.out.println( dateFromClock );

        // Get the local date and local time
        final LocalTime time = LocalTime.now();
        final LocalTime timeFromClock = LocalTime.now(clock);

        System.out.println( time );
        System.out.println( timeFromClock );


        // Get the local date/time
        final LocalDateTime datetime = LocalDateTime.now();
        final LocalDateTime datetimeFromClock = LocalDateTime.now(clock);

        System.out.println( datetime );
        System.out.println( datetimeFromClock );



        //Get the zoned date/time
        final ZonedDateTime zonedDateTime = ZonedDateTime.now();
        final ZonedDateTime zoneDatetimeFromClock = ZonedDateTime.now(clock);
        final ZonedDateTime zonedDatetimeFromZone = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("-----------------------------------");
        System.out.println( zonedDateTime );
        System.out.println( zoneDatetimeFromClock );
        System.out.println( zonedDatetimeFromZone );




        // Get duration between two dates
        final LocalDateTime from = LocalDateTime.of( 2014, Month.APRIL, 16, 0, 0, 0 );
        final LocalDateTime to = LocalDateTime.of( 2015, Month.APRIL, 16, 23, 59, 59 );

        final Duration duration = Duration.between( from, to );
        System.out.println( "Duration in days: " + duration.toDays() );
        System.out.println( "Duration in hours: " + duration.toHours() );
    }
}
