package br.com.guifr.beecrowd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static br.com.guifr.beecrowd.Drought.*;

class DroughtTest {

    @Test
    @DisplayName("Return inf about city and consumption When calculate With [[3 22][2 11][3 39]]")
    public void testComplete1() {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(3,22));
        arr.add(Arrays.asList(2,11));
        arr.add(Arrays.asList(3,39));
        String actual = houses(1,arr);
        Assertions.assertEquals("Cidade# 1:\n" +
                "2-5 3-7 3-13\n" +
                "Consumo medio: 9.00 m3.",actual);
    }

    @Test
    @DisplayName("Return inf about city and consumption When calculate With [[1 25][2 20][3 31][2 40][6 70]]")
    public void testComplete2() {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1,25));
        arr.add(Arrays.asList(2,20));
        arr.add(Arrays.asList(3,31));
        arr.add(Arrays.asList(2,40));
        arr.add(Arrays.asList(6,70));
        int city = 2;
        String actual = houses(city,arr);
        Assertions.assertEquals("Cidade# 2:\n" +
                "5-10 6-11 2-20 1-25\n" +
                "Consumo medio: 13.28 m3.",actual);
    }

    @Test
    @DisplayName("Return inf about city and consumption When calculate With [[1 1][3 2]]")
    public void testComplete3() {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1,1));
        arr.add(Arrays.asList(3,2));
        int city = 3;
        String actual = houses(city,arr);
        Assertions.assertEquals("Cidade# 3:\n" +
                "3-0 1-1\n" +
                "Consumo medio: 0.75 m3.",actual);
    }

    @Test
    @DisplayName("Return 0.75 When calculate average With [[1 1][3 2]]")
    public void testAverage1() {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1,1));
        arr.add(Arrays.asList(3,2));
        Assertions.assertEquals("0.75",HousesConsumption.calculate(arr).getAverage().toString());
    }

    @Test
    @DisplayName("Return 13.28 When calculate average With [[1 25][2 20][3 31][2 40][6 70]]")
    public void testAverage2() {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1,25));
        arr.add(Arrays.asList(2,20));
        arr.add(Arrays.asList(3,31));
        arr.add(Arrays.asList(2,40));
        arr.add(Arrays.asList(6,70));
        Assertions.assertEquals("13.28",HousesConsumption.calculate(arr).getAverage().toString());
    }

    @Test
    @DisplayName("Return 9.00 When calculate average With [[3 22][2 11][3 39]]")
    public void testAverage3() {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(3,22));
        arr.add(Arrays.asList(2,11));
        arr.add(Arrays.asList(3,39));
        Assertions.assertEquals("9.00",HousesConsumption.calculate(arr).getAverage().toString());
    }

    @Test
    @DisplayName("Return obj with consumption and average When read all houses With [[3 22][2 11][3 39]]")
    public void testObjConsumption() {

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(3,22));
        arr.add(Arrays.asList(2,11));
        arr.add(Arrays.asList(3,39));

        HousesConsumption obj = HousesConsumption.calculate(arr);
        Assertions.assertEquals("9.00",obj.getAverage().toString());
        Assertions.assertEquals("2-5 3-7 3-13",obj.getConsumption());
    }

    @Test
    @DisplayName("Return inf about city and consumption When calculate With list String ['3 22' '2 11' '3 39']")
    public void testCompleteWithString1() {
        List<String> arr = new ArrayList<>();
        arr.add("3 22");
        arr.add("2 11");
        arr.add("3 39");
        String actual = housesInputString(1,arr);
        Assertions.assertEquals("Cidade# 1:\n" +
                "2-5 3-7 3-13\n" +
                "Consumo medio: 9.00 m3.",actual);
    }

    @Test
    @DisplayName("Return inf about city and consumption When calculate add each house separete With [[1 25][2 20][3 31][2 40][6 70]]")
    public void testCompleteInTime1() {
        List<String> arr = new ArrayList<>();
        arr.add("1 25");
        arr.add("2 20");
        arr.add("3 31");
        arr.add("2 40");
        arr.add("6 70");

        HousesConsumption housesConsumption = HousesConsumption.build();
        for(String l : arr){
            housesConsumption.add(l);
        }

        Assertions.assertEquals("13.28",housesConsumption.getAverage().toString());
        Assertions.assertEquals("5-10 6-11 2-20 1-25",housesConsumption.getConsumption());

    }

    @Test
    @DisplayName("Return inf about city and consumption When calculate add each house separete With [[1 25][2 20][3 31][2 40][6 70]]")
    public void testCompleteInTime2() {
        List<String> arr = new ArrayList<>();
        arr.add("1 25");
        arr.add("2 20");
        arr.add("3 31");
        arr.add("2 40");
        arr.add("6 70");

        HousesConsumption housesConsumption = HousesConsumption.build();
        for(String l : arr){
            housesConsumption.add(l);
        }

        Assertions.assertEquals("13.28",housesConsumption.getAverage().toString());
        Assertions.assertEquals("5-10 6-11 2-20 1-25",housesConsumption.getConsumption());
        String actual = houses(2,housesConsumption);
        Assertions.assertEquals("Cidade# 2:\n" +
                "5-10 6-11 2-20 1-25\n" +
                "Consumo medio: 13.28 m3.",actual);

    }

}