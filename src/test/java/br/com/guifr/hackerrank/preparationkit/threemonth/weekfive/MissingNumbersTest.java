package br.com.guifr.hackerrank.preparationkit.threemonth.weekfive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class MissingNumbersTest {

    @Test
    @DisplayName("Return [4,6] When find the number in second array missing in the first With [7,2,5,3,5,3][7,2,5,4,6,3,5,3]")
    public void test1() {

        List<Integer> arr = Arrays.asList(7,2,5,3,5,3);
        List<Integer> brr = Arrays.asList(7,2,5,4,6,3,5,3);
        List<Integer> result = MissingNumbers.between(arr, brr);

        List<String> actual = result.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());

        Assertions.assertLinesMatch(Arrays.asList("4","6"),actual);
    }

    @Test
    @DisplayName("Return [204,205,206] When find the number in second array missing in the first With [203 204 205 206 207 208 203 204 205 206][203 204 204 205 206 207 205 208 203 206 205 206 204]")
    public void test2() {

        List<Integer> arr = Arrays.asList(203,204,205,206,207,208,203,204,205,206);
        List<Integer> brr = Arrays.asList(203,204,204,205,206,207,205,208,203,206,205,206,204);
        List<Integer> result = MissingNumbers.between(arr, brr);

        List<String> actual = result.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());

        Assertions.assertLinesMatch(Arrays.asList("204", "205", "206"),actual);
    }

    @Test
    @DisplayName("Return [204,205,206] When find the number in second array missing in the first return without double number With [203 204 205 206 207 208 203 204 205 206][203 204 204 205 206 207 205 208 203 206 205 206 204 204]")
    public void test3() {

        List<Integer> arr = Arrays.asList(203,204,205,206,207,208,203,204,205,206);
        List<Integer> brr = Arrays.asList(203,204,204,205,206,207,205,208,203,206,205,206,204,204);
        List<Integer> result = MissingNumbers.between(arr, brr);

        List<String> actual = result.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());

        Assertions.assertLinesMatch(Arrays.asList("204", "205", "206"),actual);
    }

}