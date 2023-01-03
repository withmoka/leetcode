package com.sxt.test.time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestDate {
    public static void main(String[] args) {
        Date date  = new Date();
        System.out.println(date.getTime());
        Calendar calendar = new GregorianCalendar(2999,10,9,22,10,50);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        calendar.add(Calendar.MONTH,-7);
        System.out.println(calendar.get(Calendar.MONTH));
    }
}
