package br.com.guifr.hackerrank.preparationkit.threemonth.weekseven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class GoodlandElectricityTest {

    @Test
    @DisplayName("Return -1 When can't put electricity in all houses With [0,1,1,1,0,0,0] and maxDistance=3")
    public void test1() {
        int result = GoodlandElectricity.numberNewPowerPlants(Arrays.asList(0,1,1,1,0,0,0),3);
        Assertions.assertEquals(-1,result);
    }

    @Test
    @DisplayName("Return -1 When can't put electricity in all houses With [0,1,0,0,0,1,0] and maxDistance=2")
    public void test2() {
        int result = GoodlandElectricity.numberNewPowerPlants(Arrays.asList(0,1,0,0,0,1,0),2);
        Assertions.assertEquals(-1,result);
    }


    @Test
    @DisplayName("Return 2 When can put electricity in all houses With [0,1,1,1,1,0] and maxDistance=2")
    public void testCould1() {
        int result = GoodlandElectricity.numberNewPowerPlants(Arrays.asList(0,1,1,1,1,0),2);
        Assertions.assertEquals(2,result);
    }

    @Test
    @DisplayName("Return 3 When can put electricity in all houses With [0,1,0,0,0,1,1,1,1,1] and maxDistance=3")
    public void testCould2() {
        int result = GoodlandElectricity.numberNewPowerPlants(Arrays.asList(0,1,0,0,0,1,1,1,1,1),3);
        Assertions.assertEquals(3,result);
    }

    @Test
    @DisplayName("Return 3 When can put electricity in all houses With [0,1,1,1,1,0,1] and maxDistance=2")
    public void testCould3() {
        int result = GoodlandElectricity.numberNewPowerPlants(Arrays.asList(0,1,1,1,1,0,1),2);
        Assertions.assertEquals(3,result);
    }

    @Test
    @DisplayName("Return 4 When can put electricity in all houses With [1,0,1,1,1,1,0,1] and maxDistance=2")
    public void testCould4() {
        int result = GoodlandElectricity.numberNewPowerPlants(Arrays.asList(1,0,1,1,1,1,0,1),2);
        Assertions.assertEquals(4,result);
    }

    @Test
    @DisplayName("Return 3 When can put electricity in all houses With [....] and maxDistance=20")
    public void testCould5() {
        List<Integer> cities = Arrays.asList(0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0);
        int result = GoodlandElectricity.numberNewPowerPlants(cities,20);
        Assertions.assertEquals(3,result);
    }

    @Test
    @DisplayName("Return 3 When can put electricity in all houses With [....] and maxDistance=20")
    public void testCould6() {
        List<Integer> cities = Arrays.asList(0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0);
        int result = GoodlandElectricity.pylons(20,cities);
        Assertions.assertEquals(3,result);
    }


}