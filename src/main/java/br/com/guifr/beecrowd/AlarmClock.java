package br.com.guifr.beecrowd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AlarmClock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        while (!line.equals("0 0 0 0")) {
            String[] values = line.split(" ");

            int startHours = Integer.valueOf(values[0]);
            int startMinutes = Integer.valueOf(values[1]);
            int endHours = Integer.valueOf(values[2]);
            int endMinutes = Integer.valueOf(values[3]);

            System.out.println(startAndEnd(startHours, startMinutes, endHours, endMinutes));
            line = sc.nextLine();
        }
    }

    public static int startAndEnd(int startHours, int startMinutes, int endHours, int endMinutes) {

        Date date1 = getTime(getFormat(startHours, startMinutes));
        Date date2 = getTime(getFormat(endHours, endMinutes));

        if (isNextDay(date1, date2)) {
            date2 = plusDays(date2, 1);
        }

        return differenceInMinutes(date1,date2);
    }

    private static int differenceInMinutes(Date date1, Date date2) {
        int MILLISECONDS_IN_SECOND = 1000;
        int SECONDS_IN_MINUTE = 60;
        long difference = date2.getTime() - date1.getTime();
        return (int) (difference / MILLISECONDS_IN_SECOND / SECONDS_IN_MINUTE);
    }

    //TODO fazer este metodo utilizando LocalDateTime
    private static Date plusDays(Date date, int days) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, days);
        date = c.getTime();
        return date;
    }

    private static boolean isNextDay(Date date1, Date date2) {
        return date1.getTime() > date2.getTime();
    }

    private static Date getTime(String timeStart) {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date parse;
        try {
            parse = format.parse(timeStart);
        } catch (ParseException e) {
            parse = new Date();
        }
        return parse;
    }

    private static String getFormat(int startHours, int startMinutes) {
        return String.format("%d:%d:00", startHours, startMinutes);
    }

}
