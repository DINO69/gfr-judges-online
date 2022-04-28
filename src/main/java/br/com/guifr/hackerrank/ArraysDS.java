package br.com.guifr.hackerrank;

import java.util.Collections;
import java.util.List;

public class ArraysDS {

    public static void reverse(List<Integer> a) {
        Collections.reverse(a);
    }

    public static void reverseRecursion(List<Integer> a) {

        if(a == null || a.size() <= 1) return;

        Integer value = a.remove(0);

        reverseRecursion(a);

        a.add(value);
    }
}
