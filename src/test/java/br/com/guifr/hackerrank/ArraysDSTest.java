package br.com.guifr.hackerrank;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertLinesMatch;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArraysDSTest {

    @Test
    @DisplayName("Return [2 3 4 1] When reverse With 1 4 3 2")
    public void test1() {

        List<Integer> actual = Arrays.asList(1, 4, 3, 2);

        ArraysDS.reverse(actual);

        List<String> actualInString = actual.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());

        assertLinesMatch(Arrays.asList("2", "3", "4", "1"), actualInString);
    }

    @Test
    @DisplayName("Return [9 7 5] When reverse With 5 7 9")
    public void test2() {

        List<Integer> actual = Arrays.asList(5, 7, 9);

        ArraysDS.reverse(actual);

        List<String> actualInString = actual.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());

        assertLinesMatch(Arrays.asList("9", "7", "5"), actualInString);
    }


    @Test
    @DisplayName("Return [2 3 4 1] When reverseRecursion With 1 4 3 2")
    public void testRecursion1() {

        List<Integer> actual = new ArrayList<>();
        actual.add(1);
        actual.add(4);
        actual.add(3);
        actual.add(2);

        ArraysDS.reverseRecursion(actual);

        List<String> actualInString = actual.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());

        assertLinesMatch(Arrays.asList("2", "3", "4", "1"), actualInString);
    }

    @Test
    @DisplayName("Return [9 7 5] When reverseRecursion With 5 7 9")
    public void testRecursion2() {

        List<Integer> actual = new ArrayList<>();
        actual.add(5);
        actual.add(7);
        actual.add(9);

        ArraysDS.reverseRecursion(actual);

        List<String> actualInString = actual.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());

        assertLinesMatch(Arrays.asList("9", "7", "5"), actualInString);
    }

    @Test
    @DisplayName("Return [9 7 5] When reverseRecursion With Arrays.asList 5 7 9")
    public void testRecursion3() {

        List<Integer> actual = new ArrayList<>(Arrays.asList(5,7,9));

        ArraysDS.reverseRecursion(actual);

        List<String> actualInString = actual.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());

        assertLinesMatch(Arrays.asList("9", "7", "5"), actualInString);
        assertTrue(actual.equals(Arrays.asList(9,7,5)));
    }

}