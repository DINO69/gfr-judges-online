package br.com.guifr.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {

    private Time chain;
    private int seconds;

    public TimeConversion(int seconds, Time chain) {
        this.seconds = seconds;
        this.chain = chain;
    }

    public static TimeConversion seconds(int seconds, Time chain) {
        return new TimeConversion(seconds,chain);
    }

    public String printTime() {
        return chain.result(seconds);
    }

    public static class Time {

        private int fator;
        private Time next;

        public Time(int fator, Time next) {
            this.fator = fator;
            this.next = next;
        }

        public String result(int time) {
            int result = time / fator;
            int remainder = time % fator;
            String s = String.valueOf(result);
            s = s.concat(next != null ? ":" + next.result(remainder) : "");
            return s;
        }
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();

        Time chain = new TimeConversion.Time(3600,
                        new TimeConversion.Time(60,
                            new TimeConversion.Time(1,null)));

        System.out.println(TimeConversion.seconds(seconds,chain).printTime());

    }

}
