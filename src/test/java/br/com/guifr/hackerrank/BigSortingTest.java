package br.com.guifr.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class BigSortingTest {

    @Test
    @DisplayName("Return [1 3 150 200] When call method of With [1 200 150 3]")
    public void test1() {
        List<String> actual = Arrays.asList("1", "200", "150", "3");
        BigSorting.ofInsertionSort(actual);
        Assertions.assertEquals("1", actual.get(0), "First 1");
        Assertions.assertEquals("3", actual.get(1), "Second 3");
        Assertions.assertEquals("150", actual.get(2), "Third 150");
        Assertions.assertEquals("200", actual.get(3), "fourth 200");
    }

    @Test
    @DisplayName("Return 31415926535897932384626433832795 in last When call method of With array number 0")
    public void test2() {
        List<String> actual = getArrayZero();
        BigSorting.ofInsertionSort(actual);
        Assertions.assertEquals("31415926535897932384626433832795", actual.get(actual.size() - 1));
        Assertions.assertTrue(Arrays.asList(
                "1",
                "3",
                "3",
                "5",
                "10",
                "31415926535897932384626433832795"
        ).equals(actual), "Sorted work");
    }

    @Test
    @DisplayName("Return [100 111 200] When call method of With array number 1")
    public void test3() {
        List<String> actual = getArrayOne();
        BigSorting.ofInsertionSort(actual);
        Assertions.assertTrue(Arrays.asList(
                "100",
                "111",
                "200"
        ).equals(actual), "Sorted work");
    }

    @Test
    @DisplayName("Return array sort test 1 When call method of With array number 2")
    public void test4() {
        List<String> actual = getArrayTwo();
        BigSorting.ofInsertionSort(actual);
        Assertions.assertTrue(Arrays.asList(
                "1",
                "2",
                "100",
                "111",
                "200",
                "3084193741082937",
                "3084193741082938",
                "12303479849857341718340192371"
        ).equals(actual), "Sorted work");
    }


    @Test
    @DisplayName("Return [1 3 150 200] When call bigSorting of With [1 200 150 3]")
    public void testBigSorting1() {
        List<String> actual = Arrays.asList("1", "200", "150", "3");
        actual = BigSorting.bigSorting(actual);
        Assertions.assertEquals("1", actual.get(0), "First 1");
        Assertions.assertEquals("3", actual.get(1), "Second 3");
        Assertions.assertEquals("150", actual.get(2), "Third 150");
        Assertions.assertEquals("200", actual.get(3), "fourth 200");
    }

    @Test
    @DisplayName("Return 31415926535897932384626433832795 in last When call bigSorting of With array number 0")
    public void testBigSorting2() {
        List<String> actual = getArrayZero();
        actual = BigSorting.bigSorting(actual);
        Assertions.assertEquals("31415926535897932384626433832795", actual.get(actual.size() - 1));
        Assertions.assertTrue(Arrays.asList(
                "1",
                "3",
                "3",
                "5",
                "10",
                "31415926535897932384626433832795"
        ).equals(actual), "Sorted work");
    }

    @Test
    @DisplayName("Return [100 111 200] When call bigSorting of With array number 1")
    public void testBigSorting3() {
        List<String> actual = getArrayOne();
        actual = BigSorting.bigSorting(actual);
        Assertions.assertTrue(Arrays.asList(
                "100",
                "111",
                "200"
        ).equals(actual), "Sorted work");
    }

    @Test
    @DisplayName("Return array sort test 1 When call bigSorting of With array number 2")
    public void testBigSorting4() {
        List<String> actual = getArrayTwo();
        actual = BigSorting.bigSorting(actual);
        Assertions.assertTrue(Arrays.asList(
                "1",
                "2",
                "100",
                "111",
                "200",
                "3084193741082937",
                "3084193741082938",
                "12303479849857341718340192371"
        ).equals(actual), "Sorted work");
    }

    private List<String> getArrayZero() {
        return Arrays.asList(
                "31415926535897932384626433832795",
                "1",
                "3",
                "10",
                "3",
                "5"
        );
    }

    private List<String> getArrayOne() {
        return Arrays.asList(
                "200",
                "100",
                "111"
        );
    }

    private List<String> getArrayTwo() {
        return Arrays.asList(
                "1",
                "2",
                "100",
                "12303479849857341718340192371",
                "3084193741082937",
                "3084193741082938",
                "111",
                "200"
        );
    }

}