package br.com.guifr.hackerrank;

import java.math.BigDecimal;
import java.util.*;

public class FindRunningMedian {

    public static List<Double> with(List<Integer> a) {

        List<Double> result = new ArrayList<>();

        List<Integer> partialGroup = new ArrayList<>();

        for(Integer number : a){
            addNumberWithSorted(number,partialGroup);
            result.add(median(partialGroup));
        }

        return result;
    }

    public static Double median(List<Integer> group) {

        if(group.size() == 1){
            return Double.valueOf(group.get(0));
        }

        if(group.size() % 2 == 1){
            int med = group.size() / 2;
            return Double.valueOf(group.get(med));
        }

        int med = group.size() / 2;
        int medLess = med - 1;

        BigDecimal number1 = BigDecimal.valueOf(group.get(med));
        BigDecimal number2 = BigDecimal.valueOf(group.get(medLess));
        BigDecimal result = number1.add(number2).divide(new BigDecimal("2.0"));
        result.setScale(1);
        return result.doubleValue();
    }


    public static void addNumberWithSorted(int data, List<Integer> asList) {
        if(asList.size() == 0){
            asList.add(data);
            return;
        }

        int first = asList.get(0);
        int last = asList.get(asList.size()-1);

        if(first > data){
            asList.add(0,data);
        }else if(last < data){
            asList.add(data);
        }else {

            int start = 1;
            int end = asList.size() - 2;
            int med = (start + end) / 2;
            int target = 1;

            while (start <= end) {

                Integer number = asList.get(med);
                if (number > data) {
                    target = med;
                    end = med - 1;
                }

                if (data > number) {
                    target = med + 1;
                    start = med + 1;
                }
                med = (start + end) / 2;

            }

            asList.add(target, data);
        }
    }

    public static List<Double> withMaxMinHeap(List<Integer> a) {

        List<Double> result = new ArrayList<>();

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(Integer number : a){

            if(maxHeap.isEmpty()){
                maxHeap.add(number);
            }else if(maxHeap.size() == minHeap.size()){
                if(minHeap.peek() > number){
                    maxHeap.add(number);
                }else{
                    minHeap.add(number);
                    maxHeap.add(minHeap.poll());
                }
            }else if(maxHeap.size() > minHeap.size()){
                if(number > maxHeap.peek()){
                    minHeap.add(number);
                }else{
                    maxHeap.add(number);
                    minHeap.add(maxHeap.poll());
                }
            }

            BigDecimal mediumCalc = null;
            if(maxHeap.size()==minHeap.size()){
                BigDecimal maxNumber = new BigDecimal(maxHeap.peek());
                BigDecimal minNumber = new BigDecimal(minHeap.peek());
                mediumCalc = maxNumber.add(minNumber).divide(new BigDecimal("2.0"));
            }else if(maxHeap.size() > minHeap.size()){
                mediumCalc = new BigDecimal(maxHeap.peek());
            }

            mediumCalc = mediumCalc.setScale(1);
            result.add(mediumCalc.doubleValue());

        }

        return result;

    }

    protected static void addMax(int data, List<Integer> maxHeap) {
        if(maxHeap.size()==0){
            maxHeap.add(data);
        }else{
            int first = maxHeap.get(0);
            if(first > data){
                maxHeap.add(0,data);
            }else{
                maxHeap.add(data);
            }
        }

    }

    public static void addMin(int data, List<Integer> minHeap) {
        if(minHeap.size()==0){
            minHeap.add(data);
        }else{
            int first = minHeap.get(0);
            if(data > first){
                minHeap.add(0,data);
            }else{
                minHeap.add(data);
            }
        }
    }
}
