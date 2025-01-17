package br.com.guifr.leetcode;

import java.util.*;

public class ConstructStringWithRepeatLimit {


    public static String repeatLimitedStringCursor(String s, int repeatLimit) {

        int maxLetters = 'z' - 'a';

        int[] charsAmount = new int[maxLetters + 1];
        // qual a diferença de array para lista ?!
        //array -> ele tem taminho definido
        // quando sabemos o indice que eu quero acessar
        // array e a lista possuem 10 registro.
        //arr[4] -> custo O(1)
        //lista.get(4) -> custo O(4)
        List<Integer> brenao = new ArrayList<>();
        brenao.get(4);

        Map<Integer,Integer> map = new HashMap<>();
        boolean key = map.containsKey("key");
        boolean key1 = map.get("key") != null;

        for(char c : s.toCharArray()){
            charsAmount['z' - c]++;
        }

        StringBuilder result = new StringBuilder();

        int first = -1;

        while(++first < charsAmount.length && charsAmount[first] <= 0);

        int second = first;

        while(++second < charsAmount.length && charsAmount[second] <= 0);

        while(first != second){

            int limit = repeatLimit;

            while (limit > 0 && charsAmount[first] > 0){
                result.append((char) ('z' - first));
                charsAmount[first]--;
                limit--;
            }

            if(charsAmount[first] > 0){
                while(second < charsAmount.length && charsAmount[second] <= 0) second++;
                if(second < charsAmount.length) {
                    result.append((char) ('z' - second));
                    charsAmount[second]--;
                }
                else break;
            }else{
                first = second;
                if(second < charsAmount.length)
                    while(++second < charsAmount.length && charsAmount[second] <= 0);
            }

        }



        return result.toString();
    }

    /**
     * @param s asdasd
     * @pre asdad
     * @param repeatLimit asdasd
     * @post asdasd
     *
     * */
    public static String repeatLimitedString(String s, int repeatLimit) {
        Map<Integer, Integer> lettersAmount = buildLettersAmount(s);

        //System.out.println(lettersAmount);

        StringBuilder result = new StringBuilder();

        Iterator<Map.Entry<Integer, Integer>> iterator = lettersAmount.entrySet().iterator();
        Map.Entry<Integer, Integer> first = tryNextOrNull(iterator);
        Map.Entry<Integer, Integer> second = tryNextOrNull(iterator);

        while(first != null){

            int limit = repeatLimit;
            while(isValid(first) && limit > 0){
                result.append(extractOne(first));
                limit--;
            }

            if(isValid(first)) {
                while (isNotValid(second)){
                    if(!iterator.hasNext()) return result.toString();// change this
                    second = tryNextOrNull(iterator);
                }
                result.append(extractOne(second));
                continue;
            }

            first = second;
            second = tryNextOrNull(iterator);
        }

        return result.toString();
    }

    private static boolean isValid(Map.Entry<Integer, Integer> entry) {
        return entry != null && entry.getValue() > 0;
    }

    private static boolean isNotValid(Map.Entry<Integer, Integer> entry) {
        return !isValid(entry);
    }

    private static char extractOne(Map.Entry<Integer, Integer> entry) {
        char result = (char) entry.getKey().intValue();
        entry.setValue(entry.getValue() - 1);
        return result;
    }

    protected static Map<Integer, Integer> buildLettersAmount(String s) {
        Map<Integer,Integer> lettersAmount = new TreeMap<>(Collections.reverseOrder());

        for(char c : s.toCharArray()){
            int asc = c;
            if(lettersAmount.get(asc) == null){
                lettersAmount.put(asc,0);
            }
            lettersAmount.put(asc,lettersAmount.get(asc) + 1);
        }
        return lettersAmount;

    }

    protected static <T> T tryNextOrNull(Iterator<T> iterator){
        if (iterator.hasNext()) return iterator.next();
        return null;
    }

}
