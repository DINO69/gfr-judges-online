package br.com.guifr.beecrowd;

import java.util.Scanner;

public class PowerCrisis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cities = sc.nextInt();
        while(cities != 0){
            System.out.println(minimumRandomOf(cities));
            cities = sc.nextInt();
        }

    }

    public static int minimumRandomOf(int amountOfCities) {

        int minimumRandom = Integer.MAX_VALUE;

        City city = initialCities(amountOfCities);

        int random = 1;
        while (minimumRandom == Integer.MAX_VALUE) {

            city = initialCities(amountOfCities);
            for(int i = 1;i<= amountOfCities;i++){
                if(city.number == 13){
                    if(City.illuminated == 1){
                        minimumRandom = random;
                    }
                    break;
                }
                city.blacked();

                int initRemove = random;
                while(initRemove-- > 0){
                    city = city.next;
                }
            }

            random++;
        }


        return minimumRandom;
    }

    private static City initialCities(int amountOfCities) {
        City.illuminated = 0;
        City first = new City(1);

        City previous = first;
        for (int i = 2; i <= amountOfCities; i++) {
            City city = new City(i);
            previous.next = city;
            city.previous = previous;
            previous = city;
        }
        previous.next = first;
        first.previous = previous;
        return first;
    }

    public static class City {
        public static int illuminated = 0;

        public final int number;
        public boolean blacked = false;
        public City next;
        public City previous;

        public City(int number) {
            this.number = number;
            illuminated++;
        }

        public void blacked() {
            illuminated--;
            if (this.next != null) {
                this.next.previous = this.previous;
            }
            if (this.previous != null) {
                this.previous.next = this.next;
            }
        }

        public String print() {
            return "City{" +
                    "number=" + number +
                    ", next=" + next +
                    ", previous=" + previous +
                    '}';
        }
    }
}
