package br.com.guifr.top75leetcodequestions;

public class GasStation {

    public static int canCompleteCircuit(int[] gas, int[] cost) {

        if (gas.length == 1 & gas[0] >= cost[0]) return 0;

        for (int i = 0; i < gas.length >> 1; i++) {

            if (gas[i] == cost[i]) continue;

            int result = canCompleteCircuit(gas, cost, i);
            if (result != -1) return result;

            result = canCompleteCircuit(gas, cost, gas.length - 1 - i);
            if (result != -1) return result;

        }

        return -1;
    }

    public static int canCompleteCircuit(int[] gas, int[] cost, int start) {


        int process = start;
        int tank = 0;

        while (tank >= 0) {
            tank += gas[process] - cost[process];
            process++;
            if (process >= gas.length) process = 0;
            if (tank >= 0 && process == start) return start;
        }

        return -1;

    }


    public int canCompleteCircuitPassedLazy(int[] gas, int[] cost) {

        if (gas.length == 1 & gas[0] >= cost[0]) return 0;

        int start = 0;
        int process = 0;
        int tank = 0;

        for (int i = 0; i < gas.length; i++) {

            if (gas[i] == cost[i]) continue;

            //tank = gas[i] - cost[i];
            process = i;
            tank = 0;

            while (tank >= 0) {
                tank += gas[process] - cost[process];
                process++;
                if (process >= gas.length) process = 0;
                if (tank >= 0 && process == i) return i;
            }

        }


        return -1;
    }

}
