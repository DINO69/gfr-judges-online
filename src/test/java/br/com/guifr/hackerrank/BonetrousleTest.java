package br.com.guifr.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

class BonetrousleTest {

    @Test
    @DisplayName("Return one solution When Papyrus  try buy spaghetti With n=12 k=8 b=3")
    public void test1() {
        int n = 12;
        int k = 8;
        int b = 3;
        List<Long> actual = Bonetrousle.with(n,k,b);
        Assertions.assertEquals(3,actual.size(),"Size is 3");
    }

    @Test
    @DisplayName("Return -1 When Papyrus can't buy spaghetti With n=10 k=3 b=3")
    public void test2() {
        int n = 10;
        int k = 3;
        int b = 3;
        List<Long> actual = Bonetrousle.with(n,k,b);
        Assertions.assertEquals(1,actual.size(),"Size is 1");
        Assertions.assertEquals(-1,actual.get(0),"First is -1");
    }

    @Test
    @DisplayName("Return one solution When Papyrus try buy spaghetti With n=9 k=10 b=2")
    public void test3() {
        int n = 9;
        int k = 10;
        int b = 2;
        List<Long> actual = Bonetrousle.with(n,k,b);
        Assertions.assertEquals(2,actual.size(),"Size is 2");
        Assertions.assertFalse(actual.contains(-1L),"Não contem -1 = insuccess");
    }

    @Test
    @DisplayName("Return one solution When Papyrus try buy spaghetti With n=51 k=18 b=6")
    public void test4() {
        int n = 51;
        int k = 18;
        int b = 6;
        List<Long> actual = Bonetrousle.with(n,k,b);
        System.out.println(actual);
        Assertions.assertEquals(6,actual.size(),"Size is 6");
        Assertions.assertEquals(6,new HashSet<>(actual).size(),"Unique number size is 6");
        Assertions.assertFalse(actual.contains(-1L),"Não contem -1 = insuccess");
    }

    @Test
    @DisplayName("Return one solution When Papyrus try buy spaghetti With n=22 k=7 b=6")
    public void test5() {
        int n = 22;
        int k = 7;
        int b = 6;
        List<Long> actual = Bonetrousle.with(n,k,b);
        System.out.println(actual);
        Assertions.assertEquals(6,actual.size(),"Size is 6");
        Assertions.assertEquals(6,new HashSet<>(actual).size(),"Unique number size is 6");
        Assertions.assertFalse(actual.contains(-1L),"Não contem -1 = insuccess");
    }

    @Test
    @DisplayName("Return one solution When Papyrus try buy spaghetti With n=77 k=18 b=7")
    public void test6() {
        int n = 77;
        int k = 18;
        int b = 7;
        List<Long> actual = Bonetrousle.with(n,k,b);
        System.out.println(actual);
        Assertions.assertEquals(7,actual.size(),"Size is 7");
        Assertions.assertEquals(7,new HashSet<>(actual).size(),"Unique number size is 7");
        Assertions.assertFalse(actual.contains(-1L),"Não contem -1 = insuccess");
    }

}