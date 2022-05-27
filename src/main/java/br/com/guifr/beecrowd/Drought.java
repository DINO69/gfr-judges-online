package br.com.guifr.beecrowd;


import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Drought {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        Integer houses = Integer.valueOf(sc.nextLine());
        int city = 0;
        while (houses != 0) {
            HousesConsumption housesConsumption = HousesConsumption.build();
            city++;
            for (int h = 1; h <= houses; h++) {
                String l = sc.nextLine();
                housesConsumption.add(l);
            }
            System.out.println(houses(city, housesConsumption));
            houses = Integer.valueOf(sc.nextLine());
        }
    }

    protected static class HousesConsumption {

        private int totPeople;
        private int totConsumption;
        private Map<Integer, Integer> perPerson = new TreeMap<>();

        public HousesConsumption(int people, int consumption) {
            totPeople = people;
            totConsumption = consumption;
        }

        public BigDecimal getAverage() {
            BigDecimal bPeople = new BigDecimal(totPeople);
            BigDecimal bConsumption = new BigDecimal(totConsumption);
            BigDecimal result = bConsumption.divide(bPeople, 2, RoundingMode.FLOOR);
            return result;
        }

        public String getConsumption() {
            StringBuilder sb = new StringBuilder();

            for (Map.Entry<Integer, Integer> c : perPerson.entrySet()) {
                int people = c.getValue();
                int consumption = c.getKey();

                sb.append(" ").append(String.format("%d-%d", people, consumption));
            }
            return sb.substring(1);
        }

        public static HousesConsumption build() {
            return new HousesConsumption(0, 0);
        }

        public void add(String houseConsumption) {
            String[] values = houseConsumption.split(" ");
            int people = Integer.parseInt(values[0]);
            int consumption = Integer.parseInt(values[1]);

            totPeople += people;
            totConsumption += consumption;

            int averageInHouse = consumption / people;

            if (!perPerson.containsKey(averageInHouse)) {
                perPerson.put(averageInHouse, 0);
            }
            Integer peopleSameConsumption = perPerson.get(averageInHouse) + people;
            perPerson.put(averageInHouse, peopleSameConsumption);

        }

        public static HousesConsumption calculate(List<List<Integer>> arr) {

            List<String> arrString = new ArrayList<>();
            for (List<Integer> l : arr) {
                String s = String.format("%d %d", l.get(0), l.get(1));
                arrString.add(s);
            }

            return calculateListString(arrString);
        }

        public static HousesConsumption calculateListString(List<String> arr) {

            HousesConsumption housesConsumption = HousesConsumption.build();
            for(String h : arr){
                housesConsumption.add(h);
            }
            return housesConsumption;

        }

    }


    public static String houses(int city, List<List<Integer>> arr) {

        HousesConsumption housesConsumption = HousesConsumption.calculate(arr);

        return houses(city,housesConsumption);
    }

    public static String houses(int city, HousesConsumption housesConsumption) {

        return String.format("Cidade# %d:\n%s\nConsumo medio: %s m3.", city, housesConsumption.getConsumption(), housesConsumption.getAverage().toString());
    }

    public static String housesInputString(int city, List<String> arr) {

        HousesConsumption housesConsumption = HousesConsumption.calculateListString(arr);

        return String.format("Cidade# %d:\n%s\nConsumo medio: %s m3.", city, housesConsumption.getConsumption(), housesConsumption.getAverage().toString());
    }


}
