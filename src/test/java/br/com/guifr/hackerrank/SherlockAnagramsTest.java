package br.com.guifr.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SherlockAnagramsTest {

    @Test
    @DisplayName("Return 2 when search anagrams in s='mom'")
    public void test1(){

        int actual = SherlockAnagrams.search("mom");
        Assertions.assertEquals(2,actual);
    }

    @Test
    @DisplayName("Return 4 when search anagrams in s='abba'")
    public void test2(){

        int actual = SherlockAnagrams.search("abba");
        Assertions.assertEquals(4,actual);
    }

    @Test
    @DisplayName("Return 0 when search anagrams in s='abcd'")
    public void test3(){

        int actual = SherlockAnagrams.search("abcd");
        Assertions.assertEquals(0,actual);
    }

    @Test
    @DisplayName("Return 3 when search anagrams in s='ifailuhkqq'")
    public void test4(){
        int actual = SherlockAnagrams.search("ifailuhkqq");
        Assertions.assertEquals(3,actual);
    }

    @Test
    @DisplayName("Return 10 when search anagrams in s='kkkk'")
    public void test5(){
        int actual = SherlockAnagrams.search("kkkk");
        Assertions.assertEquals(10,actual);
    }

    @Test
    @DisplayName("Return 5 when search anagrams in s='cdcd'")
    public void test6(){
        int actual = SherlockAnagrams.search("cdcd");
        Assertions.assertEquals(5,actual);
    }


    @Test
    @DisplayName("Return true when comparing 'abc' with 'bca'")
    public void test7(){

        boolean actual = SherlockAnagrams.comparing("abc","bca");
        Assertions.assertTrue(actual);
    }

    @Test
    @DisplayName("Return false when comparing 'acc' with 'bca'")
    public void test8(){
        boolean actual = SherlockAnagrams.comparing("acc","bca");
        Assertions.assertFalse(actual);
    }

}