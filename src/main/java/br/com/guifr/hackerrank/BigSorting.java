package br.com.guifr.hackerrank;

import java.util.*;

public class BigSorting {

    protected static class Element{

        private static final int FACTOR_TO_BE_INT = 10;

        int length;
        String value;

        public Element(int length, String value) {
            this.length = length;
            this.value = value;
        }

        public int compareTo(Element other){
            if(length < other.length){
                return -1;
            }else if (length > other.length){
                return 1;
            }

            if(length < FACTOR_TO_BE_INT){
                return Integer.valueOf(value).compareTo(Integer.valueOf(other.value));
            }

            for(int x = 0; x < value.length();x++){
                if (other.value.charAt(x) > value.charAt(x)){
                    return -1;
                }else if (value.charAt(x) > other.value.charAt(x)){
                    return 1;
                }
            }

            return 0;
        }

    }

    public static void ofInsertionSort(List<String> asList) {

        List<Element> elements = new ArrayList<>();

        for(String s : asList){
            elements.add(new Element(s.length(),s));
        }

        for(int i = 1;i < elements.size();i++){

            int iAux = i;
            Element aux = elements.get(i);

            while (iAux > 0 && elements.get(iAux - 1).compareTo(aux) > 0){
                elements.set(iAux,elements.get(iAux - 1));
                asList.set(iAux,elements.get(iAux - 1).value);
                iAux--;
            }
            elements.set(iAux,aux);
            asList.set(iAux,aux.value);
        }

    }

    public static List<String> bigSorting(List<String> unsorted) {

        List<String> result = new ArrayList<>();

        Map<Integer,List<String>> map = new TreeMap<>();

        for(String s: unsorted){

            if(!map.containsKey(s.length())){
                map.put(s.length(), new ArrayList<>());
            }
            map.get(s.length()).add(s);
        }

        Iterator<Integer> i = map.keySet().iterator();

        while(i.hasNext()){
            int index = i.next();
            Collections.sort(map.get(index));
            result.addAll(map.get(index));
        }

        return result;

    }

}
