package br.com.guifr.top75leetcodequestions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasStationTest {

    @Test
    @DisplayName("Return 3 When GasStation.canCompleteCircuit Given gas=[1,2,3,4,5] cost=[3,4,5,1,2]")
    void test1() {
        int[] gas = new int []{1,2,3,4,5};
        int[] cost = new int[]{3,4,5,1,2};

        Assertions.assertEquals(3,GasStation.canCompleteCircuit(gas,cost));
    }

    @Test
    @DisplayName("Return 1 When GasStation.canCompleteCircuit Given gas='[3,1,1]' cost =[1,2,2]")
    void test2() {
        int[] gas = new int[]{3,1,1};
        int[] cost = new int []{1,2,2};

        Assertions.assertEquals(0,GasStation.canCompleteCircuit(gas,cost));
    }


}