package br.com.guifr.hackerrank.sorted;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntroTutorialChallengesTest {

    private static int amount = 100000;
    private static int indexBig = 0;
    private static int findBig = 0;
    private static List<Integer> arr = new ArrayList<>();

    @BeforeAll
    static void beforeAll() {

        int range = amount * 10;

        while(amount-- > 0){
            int n = new Random().nextInt(range);
            while(arr.contains(n)) {
                n = new Random().nextInt(range);
            }
            arr.add(n);
        }

        Collections.sort(arr);

        indexBig = new Random().nextInt(arr.size());
        findBig = arr.get(indexBig);

    }

    @Test
    @DisplayName("Return 1 When find index number 4 With [1 4 5 7 9 12]")
    public void test1() {
        int actual = IntroTutorialChallenges.indexAt(4, Arrays.asList(1,4,5,7,9,12));
        assertEquals(1,actual);
    }

    @Test
    @DisplayName("Return 0 When find index number 1 With [1 4 5 7 9 12]")
    public void test2() {
        int actual = IntroTutorialChallenges.indexAt(1, Arrays.asList(1,4,5,7,9,12));
        assertEquals(0,actual);
    }

    @Test
    @DisplayName("Return 2 When find index number 5 With [1 4 5 7 9 12]")
    public void test3() {
        int actual = IntroTutorialChallenges.indexAt(5, Arrays.asList(1,4,5,7,9,12));
        assertEquals(2,actual);
    }

    @Test
    @DisplayName("Return 1 When find index number 4 With BinarySearch [1 4 5 7 9 12]")
    public void testBinarySearch1() {
        int actual = IntroTutorialChallenges.indexAtBinarySearch(4, Arrays.asList(1,4,5,7,9,12));
        assertEquals(1,actual);
    }

    @Test
    @DisplayName("Return 0 When find index number 1 With BinarySearch [1 4 5 7 9 12]")
    public void testBinarySearch2() {
        int actual = IntroTutorialChallenges.indexAtBinarySearch(1, Arrays.asList(1,4,5,7,9,12));
        assertEquals(0,actual);
    }

    @Test
    @DisplayName("Return 2 When find index number 5 With BinarySearch [1 4 5 7 9 12]")
    public void testBinarySearch3() {
        int actual = IntroTutorialChallenges.indexAtBinarySearch(5, Arrays.asList(1,4,5,7,9,12));
        assertEquals(2,actual);
    }

    @Test
    @DisplayName("Return X When find index number Y With Big List")
    public void testBig1() {
        int actual = IntroTutorialChallenges.indexAt(findBig, arr);
        assertEquals(indexBig,actual);
    }

    @Test
    @DisplayName("Return X When find index number Y With BinarySearch in Big List")
    public void testBigBinarySearch1() {
        int actual = IntroTutorialChallenges.indexAtBinarySearch(findBig, arr);
        assertEquals(indexBig,actual);
    }


}