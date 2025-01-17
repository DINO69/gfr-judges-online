package br.com.guifr.top75leetcodequestions;

import java.util.*;

public class HashCollision {


    public static class MyObj{

        int hashCode;
        int equalsCode;

        public MyObj(int hash, int equals) {
            hashCode = hash;
            equalsCode = equals;

        }

        @Override
        public boolean equals(Object o) {
            MyObj myObj = (MyObj) o;
            return equalsCode == myObj.equalsCode;
        }

        @Override
        public int hashCode() {
            return hashCode;
        }

        @Override
        public String toString() {
            return "MyObj{" +
                    "hashCode=" + hashCode +
                    ", equalsCode=" + equalsCode +
                    '}';
        }
    }

    public static void main(String[] args) {

        Map<MyObj,Integer> map = new HashMap<>();

        List<MyObj> list = new ArrayList<>();


        MyObj o1 = new MyObj(1,2);
        MyObj o2 = new MyObj(2,2);

        MyObj o3 = new MyObj(4,3);
        MyObj o4 = new MyObj(4,5);

        list.add(o1);
        list.contains(o2);

        list.add(o3);
        list.contains(o4);


        map.put(o1,1);
        System.out.println(map);
        System.out.println(map.containsKey(o2));
        System.out.println(o1.equals(o2));

        map.put(o2,2);
        System.out.println(map);
        System.out.println(map.containsKey(o3));
        System.out.println(o2.equals(o3));

        map.put(o3,3);
        System.out.println(map);
        System.out.println(map.containsKey(o4));
        System.out.println(o3.equals(o4));

        map.put(o4,4);
        System.out.println(map);


    }

}
