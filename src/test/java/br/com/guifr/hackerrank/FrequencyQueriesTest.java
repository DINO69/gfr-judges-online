package br.com.guifr.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class FrequencyQueriesTest {


    @Test
    @DisplayName("Return [0,1] When frequency queris With first exemple")
    public void test1() {

        List<List<Integer>> queries = Arrays.asList(
                Arrays.asList(1, 1),
                Arrays.asList(2, 2),
                Arrays.asList(3, 2),
                Arrays.asList(1, 1),
                Arrays.asList(1, 1),
                Arrays.asList(2, 1),
                Arrays.asList(3, 2)
        );
        List<Integer> actual = FrequencyQueries.of(queries);

        Assertions.assertAll(() -> {
            Assertions.assertEquals(2, actual.size(), "Size is 2");
            Assertions.assertEquals(0, actual.get(0), "First position is 0");
            Assertions.assertEquals(1, actual.get(1), "Second position is 1");
        });
    }

    @Test
    @DisplayName("Return [0,1] When frequency queris With second exemple")
    public void test2() {
        List<List<Integer>> queries = Arrays.asList(
                Arrays.asList(1, 5),
                Arrays.asList(1, 6),
                Arrays.asList(3, 2),
                Arrays.asList(1, 10),
                Arrays.asList(1, 10),
                Arrays.asList(1, 6),
                Arrays.asList(2, 5),
                Arrays.asList(3, 2)
        );
        List<Integer> actual = FrequencyQueries.of(queries);

        Assertions.assertAll(() -> {
            Assertions.assertEquals(2, actual.size());
            Assertions.assertEquals(0, actual.get(0));
            Assertions.assertEquals(1, actual.get(1));
        });
    }

    @Test
    @DisplayName("Return [0,1] When frequency queris With third exemple")
    public void test3() {
        List<List<Integer>> queries = Arrays.asList(
                Arrays.asList(3, 4),
                Arrays.asList(2, 1003),
                Arrays.asList(1, 16),
                Arrays.asList(3, 1)
        );
        List<Integer> actual = FrequencyQueries.of(queries);

        Assertions.assertAll(() -> {
            Assertions.assertEquals(2, actual.size());
            Assertions.assertEquals(0, actual.get(0));
            Assertions.assertEquals(1, actual.get(1));
        });
    }

    @Test
    @DisplayName("Return [0,0] When frequency queris With third exemple")
    public void test6() {
        List<List<Integer>> queries = Arrays.asList(
                Arrays.asList(3, 4),
                Arrays.asList(2, 1003),
                Arrays.asList(1, 16),
                Arrays.asList(2, 16),
                Arrays.asList(3, 1)
        );
        List<Integer> actual = FrequencyQueries.of(queries);

        Assertions.assertAll(() -> {
            Assertions.assertEquals(2, actual.size());
            Assertions.assertEquals(0, actual.get(0));
            Assertions.assertEquals(0, actual.get(1));
        });
    }

    @Test
    @DisplayName("Return [0,1,1] When frequency queris With third exemple")
    public void test4() {

        List<List<Integer>> queries = Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(2, 3),
                Arrays.asList(3, 2),
                Arrays.asList(1, 4),
                Arrays.asList(1, 5),
                Arrays.asList(1, 5),
                Arrays.asList(1, 4),
                Arrays.asList(3, 2),
                Arrays.asList(2, 4),
                Arrays.asList(3, 2)
        );
        List<Integer> actual = FrequencyQueries.of(queries);

        Assertions.assertAll(() -> {
            Assertions.assertEquals(3, actual.size());
            Assertions.assertEquals(0, actual.get(0));
            Assertions.assertEquals(1, actual.get(1));
            Assertions.assertEquals(1, actual.get(2));
        });
    }

    @Test
    @DisplayName("Return [...].size()=42 When frequency queris With hackerrank exemple")
    public void test5() {

        List<List<Integer>> queries = Arrays.asList(
                Arrays.asList(1, 100021),
                Arrays.asList(3, 3),
                Arrays.asList(1, 100043),
                Arrays.asList(1, 100062),
                Arrays.asList(1, 100089),
                Arrays.asList(1, 100007),
                Arrays.asList(2, 3),
                Arrays.asList(3, 4),
                Arrays.asList(3, 3),
                Arrays.asList(3, 4),
                Arrays.asList(2, 5),
                Arrays.asList(1, 100092),
                Arrays.asList(3, 5),
                Arrays.asList(2, 1),
                Arrays.asList(3, 1),
                Arrays.asList(1, 100091),
                Arrays.asList(1, 100053),
                Arrays.asList(1, 100044),
                Arrays.asList(2, 2),
                Arrays.asList(3, 3),
                Arrays.asList(1, 100063),
                Arrays.asList(1, 100068),
                Arrays.asList(2, 3),
                Arrays.asList(1, 100084),
                Arrays.asList(2, 2),
                Arrays.asList(1, 100004),
                Arrays.asList(2, 1),
                Arrays.asList(3, 5),
                Arrays.asList(2, 5),
                Arrays.asList(3, 3),
                Arrays.asList(1, 100077),
                Arrays.asList(1, 100080),
                Arrays.asList(3, 1),
                Arrays.asList(1, 100020),
                Arrays.asList(1, 100093),
                Arrays.asList(3, 1),
                Arrays.asList(2, 3),
                Arrays.asList(3, 2),
                Arrays.asList(3, 4),
                Arrays.asList(2, 5),
                Arrays.asList(2, 5),
                Arrays.asList(2, 5),
                Arrays.asList(3, 2),
                Arrays.asList(3, 4),
                Arrays.asList(3, 5),
                Arrays.asList(2, 2),
                Arrays.asList(3, 2),
                Arrays.asList(3, 2),
                Arrays.asList(1, 100056),
                Arrays.asList(3, 3),
                Arrays.asList(2, 4),
                Arrays.asList(1, 100070),
                Arrays.asList(3, 5),
                Arrays.asList(3, 3),
                Arrays.asList(3, 3),
                Arrays.asList(3, 1),
                Arrays.asList(1, 100038),
                Arrays.asList(1, 100026),
                Arrays.asList(2, 5),
                Arrays.asList(3, 2),
                Arrays.asList(1, 100043),
                Arrays.asList(2, 2),
                Arrays.asList(3, 3),
                Arrays.asList(1, 100080),
                Arrays.asList(1, 100073),
                Arrays.asList(2, 2),
                Arrays.asList(1, 100005),
                Arrays.asList(2, 5),
                Arrays.asList(1, 100078),
                Arrays.asList(1, 100085),
                Arrays.asList(1, 100070),
                Arrays.asList(1, 100077),
                Arrays.asList(2, 1),
                Arrays.asList(3, 3),
                Arrays.asList(3, 3),
                Arrays.asList(1, 100056),
                Arrays.asList(3, 1),
                Arrays.asList(3, 4),
                Arrays.asList(3, 4),
                Arrays.asList(3, 1),
                Arrays.asList(3, 1),
                Arrays.asList(2, 5),
                Arrays.asList(1, 100021),
                Arrays.asList(3, 1),
                Arrays.asList(2, 2),
                Arrays.asList(3, 5),
                Arrays.asList(2, 3),
                Arrays.asList(3, 2),
                Arrays.asList(1, 100050),
                Arrays.asList(1, 100098),
                Arrays.asList(3, 3),
                Arrays.asList(2, 5),
                Arrays.asList(3, 1),
                Arrays.asList(3, 1),
                Arrays.asList(3, 1),
                Arrays.asList(3, 5),
                Arrays.asList(1, 100007),
                Arrays.asList(3, 3),
                Arrays.asList(3, 4),
                Arrays.asList(2, 5)
        );
        List<Integer> actual = FrequencyQueries.of(queries);

        Assertions.assertAll(() -> {
            Assertions.assertEquals(42, actual.size(), "Size is 42");
            Assertions.assertEquals(30, actual.stream().filter(n->n==0).count(), "Quantity 0 is 30");
            Assertions.assertEquals(12, actual.stream().filter(n->n==1).count(),"Quantity 1 is 12");
        });
    }

    @Test
    @DisplayName("Return frequency.get(1) = 1 When plusFrequency Given frequency=1")
    void addFrequency1() {
        Map<Integer,Integer> frequencies = new HashMap<>();

        int frequency = 1;
        FrequencyQueries.plusFrequency(frequencies,frequency);
        Assertions.assertEquals(1,frequencies.get(1));
    }

    @Test
    @DisplayName("Return frequency.get(2) = 1 When subtractFrequency Given value = 2 .get(2) = 2")
    void subtractFrequency1() {
        Map<Integer,Integer> frequency = new HashMap<>();
        frequency.put(2,2);

        int value = 2;
        FrequencyQueries.minusFrequency(frequency,value);
        Assertions.assertEquals(1,frequency.get(2));
    }
    @Test
    @DisplayName("Return frequency.get(2) = null When subtractFrequency Given value = 2 .get(2) = 1")
    void subtractFrequency2() {
        Map<Integer,Integer> frequency = new HashMap<>();
        frequency.put(2,1);

        int value = 2;
        FrequencyQueries.minusFrequency(frequency,value);
        Assertions.assertEquals(0,frequency.size());
        Assertions.assertNull(frequency.get(2));
    }
}