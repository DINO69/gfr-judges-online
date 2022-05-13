package br.com.guifr.hackerrank.preparationkit.threemonth.weekone;

public class TimeConversion {

    public static String military(String time) {
        int hours = Integer.valueOf(time.substring(0,2));
        if(time.contains(("PM"))){
            hours+=12;
        }
        if(hours % 12 == 0){
            hours-=12;
        }
        return String.format("%02d%s",hours,time.substring(2,8));
    }
}
