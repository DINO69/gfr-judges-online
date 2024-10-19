package br.com.guifr.top75leetcodequestions.binary;

import java.util.ArrayList;
import java.util.List;

public class SumOfTwoIntegers {

    public static void main(String[] args) {
        System.out.println(getSum(10,11));
    }

    public static int getSum(int a, int b) {
        while (b != 0) {
            int tmp = (a & b) << 1; // carry calculation
            a = a ^ b; // sum without carry
            b = tmp; // carry shifted left
        }
        return a;
    }

//    public static int getSum(int a, int b) {
//
////        if(Math.min(a,b) < 0) return a + b;
//
//        List<Integer> binaryA = new ArrayList<>();
//        List<Integer> binaryB = new ArrayList<>();
//
//        while(a != 0 | b != 0){
//            binaryA.add(a % 2);
//            binaryB.add(b % 2);
//            a = a / 2;
//            b = b / 2;
//
//        }
//
//        int result = 0;
//        int jumpToNext = 0;
//        for(int power = 0; power < binaryA.size(); power++){
//            int valueA = binaryA.get(power);
//            int analysisPrevious = jumpToNext ^ valueA;
//
//            if(analysisPrevious == 1){
//                valueA = 1;
//                jumpToNext = 0;
//            }else{
//                valueA = 0;
//                if(jumpToNext == 1){
//                    jumpToNext = 1;
//                }else{
//                    jumpToNext = 0;
//                }
//            }
//
//            int activePotential = valueA ^ binaryB.get(power);
//            if(activePotential == 1) result += Math.pow(2,power);
//            else if (valueA == 1) jumpToNext = 1;
//        }
//
//        if(jumpToNext == 1) result += Math.pow(2,binaryA.size());
//
//        System.out.println(binaryA);
//        System.out.println(binaryB);
//
//        return result;
//
//    }


}
