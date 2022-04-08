package br.com.guifr.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class LeftRotation {


    public static List<Integer> rotateLeft(int d, List<Integer> arr) {

        List<Integer> newList = new LinkedList<>(arr);

        IntStream.range(0,d)
                 .forEach( i -> newList.add(newList.remove(0)));

        return newList;
    }
}
