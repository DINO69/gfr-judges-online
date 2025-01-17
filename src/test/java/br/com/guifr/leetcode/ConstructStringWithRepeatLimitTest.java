package br.com.guifr.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ConstructStringWithRepeatLimitTest {

    @Test
    @DisplayName("Return 'zzcccac' When call repeatLimitedStringCursor(s,repeatLimit) Given s='cczazcc' repeatLimit ='3")
    void testrepeatLimitedStringCursor1() {
        int repeatLimit = 3;
        String s = "cczazcc";
        Assertions.assertEquals("zzcccac",ConstructStringWithRepeatLimit.repeatLimitedStringCursor(s,repeatLimit));
    }

    @Test
    @DisplayName("Return 'bbabaa' When call repeatLimitedStringCursor(s,repeatLimit) Given s='aababab' repeatLimit ='2")
    void testrepeatLimitedStringCursor2() {
        int repeatLimit = 2;
        String s = "aababab";
        Assertions.assertEquals("bbabaa",ConstructStringWithRepeatLimit.repeatLimitedStringCursor(s,repeatLimit));
    }

    @Test
    @DisplayName("Return 'cba' When call repeatLimitedStringCursor(s,repeatLimit) Given s='abc' repeatLimit ='1")
    void testrepeatLimitedStringCursor3() {
        int repeatLimit = 1;
        String s = "abc";
        Assertions.assertEquals("cba",ConstructStringWithRepeatLimit.repeatLimitedStringCursor(s,repeatLimit));
    }

    @Test
    @DisplayName("Return 'zzcccac' When call repeatLimitedString(s,repeatLimit) Given s='cczazcc' repeatLimit ='3")
    void test1() {
        int repeatLimit = 3;
        String s = "cczazcc";
        Assertions.assertEquals("zzcccac",ConstructStringWithRepeatLimit.repeatLimitedString(s,repeatLimit));
    }

    @Test
    @DisplayName("Return 'bbabaa' When call repeatLimitedString(s,repeatLimit) Given s='aababab' repeatLimit ='2")
    void test2() {
        int repeatLimit = 2;
        String s = "aababab";
        Assertions.assertEquals("bbabaa",ConstructStringWithRepeatLimit.repeatLimitedString(s,repeatLimit));
    }

    @Test
    @DisplayName("Return 'cba' When call repeatLimitedString(s,repeatLimit) Given s='abc' repeatLimit ='1")
    void test3() {
        int repeatLimit = 1;
        String s = "abc";
        Assertions.assertEquals("cba",ConstructStringWithRepeatLimit.repeatLimitedString(s,repeatLimit));
    }

    @Test
    @DisplayName("Return 'cb' When call repeatLimitedString(s,repeatLimit) Given s='bc' repeatLimit ='1")
    void test4() {
        int repeatLimit = 1;
        String s = "bc";
        Assertions.assertEquals("cb",ConstructStringWithRepeatLimit.repeatLimitedString(s,repeatLimit));
    }

    @Test
    @DisplayName("Return 'c' When call repeatLimitedString(s,repeatLimit) Given s='c' repeatLimit ='1")
    void test5() {
        int repeatLimit = 1;
        String s = "c";
        Assertions.assertEquals("c",ConstructStringWithRepeatLimit.repeatLimitedString(s,repeatLimit));
    }

    @Test
    @DisplayName("Return 'yxxvvuvusrr...' When call repeatLimitedString(s,repeatLimit) Given s='robnsdvpuxbap...' repeatLimit ='2")
    void test6() {
        int repeatLimit = 2;
        String s = "robnsdvpuxbapuqgopqvxdrchivlifeepy";
        Assertions.assertEquals("yxxvvuvusrrqqppopponliihgfeeddcbba",ConstructStringWithRepeatLimit.repeatLimitedString(s,repeatLimit));
    }

    @Test
    @DisplayName("Return 'zyxyxwxwvwvuvuv...' When call repeatLimitedString(s,repeatLimit) Given s='xyutfpopdynb...' repeatLimit ='1'")
    void test7() {
        int repeatLimit = 1;
        String s = "xyutfpopdynbadwtvmxiemmusevduloxwvpkjioizvanetecnuqbqqdtrwrkgt";
        Assertions.assertEquals("zyxyxwxwvwvuvuvututstrtrtqpqpqponononmlmkmkjigifiededededcbaba",ConstructStringWithRepeatLimit.repeatLimitedString(s,repeatLimit));
    }


    @Test
    @DisplayName("Return [[c=1][b=1][a=1]] When buildLettersAmount Given s='abc'")
    void test1buildLettersAmount() {

        Map<Integer, Integer> result = ConstructStringWithRepeatLimit.buildLettersAmount("abc");
        Assertions.assertEquals(3,result.size());
        Iterator<Map.Entry<Integer, Integer>> iterator = result.entrySet().iterator();
        Assertions.assertTrue(iterator.hasNext());
        Map.Entry<Integer, Integer> entry = iterator.next();
        Assertions.assertEquals(99, entry.getKey());
        Assertions.assertEquals(1, entry.getValue());

        Assertions.assertTrue(iterator.hasNext());
        entry = iterator.next();
        Assertions.assertEquals(98, entry.getKey());
        Assertions.assertEquals(1, entry.getValue());

        Assertions.assertTrue(iterator.hasNext());
        entry = iterator.next();
        Assertions.assertEquals(97, entry.getKey());
        Assertions.assertEquals(1, entry.getValue());

    }

    @Test
    @DisplayName("Return null When call tryNextOrNull Given hasNext() eq false")
    void testtryNextOrNull1() {
        Iterator<Integer> iterator = new HashSet<Integer>().iterator();
        Assertions.assertNull(ConstructStringWithRepeatLimit.tryNextOrNull(iterator));
    }

    @Test
    @DisplayName("Return '1' When call tryNextOrNull Given hasNext() eq true and first element is 1")
    void testtryNextOrNull2() {
        Iterator<Integer> iterator = Set.of(1).iterator();
        Integer result = ConstructStringWithRepeatLimit.tryNextOrNull(iterator);
        Assertions.assertNotNull(result);
        Assertions.assertEquals(1,result);
    }
}