package com;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtil {
    public DateUtil() {
    }

    public static long calDelay(int hour, int minute) {
        Calendar scheduler = Calendar.getInstance();
        long currentTime = scheduler.getTimeInMillis();
        scheduler.set(11, hour);
        scheduler.set(12, minute);
        long time = scheduler.getTimeInMillis();
        if( time < currentTime) {
            scheduler.add(5, 1);
        }

        return (scheduler.getTimeInMillis() - currentTime) / 1000L;
    }

    public static String calDate(String dateFormat, int days) {
        Calendar now = Calendar.getInstance();
        now.add(5, days);
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        return sdf.format(now.getTime());
    }


    public static void main(String[] args) {
        System.out.println(calDelay(3,0));
        System.out.println(DateUtil.calDate("yyyy-MM-dd", -1));
    }
}
