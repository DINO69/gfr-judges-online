package br.com.guifr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

class QuickSortTest {


    @Test
    @DisplayName("Should put array in order When sort(array) Given a=[2,1,3]")
    void test1() {

        int[] a = new int[]{2,1,3};

        QuickSort.sort(a);

        Assertions.assertEquals(1,a[0]);
        Assertions.assertEquals(2,a[1]);
        Assertions.assertEquals(3,a[2]);

    }

    @Test
    @DisplayName("Should put array in order When sort(array) Given a=[2,1,-3]")
    void test2() {

        int[] a = new int[]{2,1,-3};

        QuickSort.sort(a);

        Assertions.assertEquals(-3,a[0]);
        Assertions.assertEquals(1,a[1]);
        Assertions.assertEquals(2,a[2]);

    }

    @Test
    @DisplayName("Should put array in order When sort(array) Given a=[2]")
    void test3() {

        int[] a = new int[]{2};

        QuickSort.sort(a);

        Assertions.assertEquals(2,a[0]);

    }

    @Test
    @DisplayName("Should put array in order When sort(array) Given a=[1,2]")
    void test4() {

        int[] a = new int[]{1,2};

        QuickSort.sort(a);

        Assertions.assertEquals(1,a[0]);
        Assertions.assertEquals(2,a[1]);

    }

    @Test
    @DisplayName("Should put array in order When sort(array) Given a= random with 100 elements")
    void test5() {

        int amount = 100;

        int[] a = new int[amount];

        for(int i = 0;i < a.length;i++){
            a[i] = new Random().nextInt(amount * 10);
        }

        QuickSort.sort(a);

        for(int i = 1;i < a.length;i++){

            Assertions.assertTrue(a[i-1] <= a[i],String.format("%d <= %d",a[i-1],a[i]));
        }

    }

    @Test
    @DisplayName("Should put array in order When sort(array) Given a=[54,26,93,17,77,31,44,55,20]")
    void test6() {

        int[] a = new int[]{54,26,93,17,77,31,44,55,20};

        QuickSort.sort(a);

        for(int i = 1;i < a.length;i++){

            Assertions.assertTrue(a[i-1] <= a[i],String.format("%d <= %d",a[i-1],a[i]));
        }

    }

    @Test
    @DisplayName("Should put array in order When sort(array) Given a= random with 10000 elements")
    void test7() {

        int amount = 10000;

        int[] a = new int[amount];

        for(int i = 0;i < a.length;i++){
            a[i] = new Random().nextInt(amount * 10);
        }

        QuickSort.sort(a);

        for(int i = 1;i < a.length;i++){

            Assertions.assertTrue(a[i-1] <= a[i],String.format("%d <= %d",a[i-1],a[i]));
        }

    }

    @Test
    @DisplayName("Should put array in order When sort(array) Given a= random with 1_000_000 elements")
    void test8() {

        int amount = 1_000_000;

        int[] a = new int[amount];

        for(int i = 0;i < a.length;i++){
            a[i] = new Random().nextInt(amount * 10);
        }

        QuickSort.sort(a);

        for(int i = 1;i < a.length;i++){

            Assertions.assertTrue(a[i-1] <= a[i],String.format("%d <= %d",a[i-1],a[i]));
        }

    }


}