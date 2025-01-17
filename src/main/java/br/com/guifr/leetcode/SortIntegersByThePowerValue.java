package br.com.guifr.leetcode;


import java.util.*;

public class SortIntegersByThePowerValue {

    public static int getKth(int lo, int hi, int k) {
        List<Element> nums = new ArrayList<>();
        Map<Integer,Integer> memory = new HashMap<>();
        while(lo <= hi){
            int power = calcPower(lo,memory);
            nums.add(new Element(lo,power));
            lo++;
        }

        Collections.sort(nums);

        return nums.get(k-1).value;
    }

    private static int calcPower(int value,Map<Integer,Integer> memory) {

        int result = 0;

        if(value == 1) return result;

        if(memory.get(value) != null) return memory.get(value);

        if(value % 2 == 0)
            result = calcPower(value / 2, memory) + 1;//odd
        else
            result = calcPower(value * 3 + 1, memory) + 1;//even

        memory.put(value,result);

        return result;
    }

    static class Element implements Comparable {
        int value;
        int power;

        public Element(int value) {
            this(value,0);
        }

        public Element(int value, int power) {
            this.value = value;
            this.power = power;
        }

        @Override
        public int compareTo( Object o) {
            if(this.equals(o)) return 0;

            if(!(o instanceof Element e)) return 0;

            if(this.power < e.power) return -1;
            if(this.power > e.power) return 1;

            if(this.value < e.value) return -1;
            if(this.value > e.value) return 1;


            return 0;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Element element = (Element) o;
            return value == element.value && power == element.power;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value, power);
        }

    }
}
