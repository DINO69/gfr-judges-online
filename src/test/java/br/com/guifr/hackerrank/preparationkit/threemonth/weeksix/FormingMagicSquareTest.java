package br.com.guifr.hackerrank.preparationkit.threemonth.weeksix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static br.com.guifr.hackerrank.preparationkit.threemonth.weeksix.FormingMagicSquare.convert;
import static br.com.guifr.hackerrank.preparationkit.threemonth.weeksix.FormingMagicSquare.fixListInteger;

class FormingMagicSquareTest {

    @Test
    @DisplayName("Return 7 When fix the magic square With [[5,3,4][1,5,8][6,4,2]]")
    public void test1() {

        List<List<String>> arr = Arrays.asList(
                Arrays.asList("5","3","4"),
                Arrays.asList("1","5","8"),
                Arrays.asList("6","4","2")
        );

        int actual = fixListInteger(convert(arr));
        Assertions.assertEquals(7,actual);
    }

    @Test
    @DisplayName("Return 1 When fix the magic square With [[4,9,2][3,5,7][8,1,5]]")
    public void test2() {

        List<List<String>> arr = Arrays.asList(
                Arrays.asList("4","9","2"),
                Arrays.asList("3","5","7"),
                Arrays.asList("8","1","5")
        );

        int actual = FormingMagicSquare.fixListInteger(convert(arr));
        Assertions.assertEquals(1,actual);
    }


    @Test
    @DisplayName("Return 15 When sum the first line With [[4,9,2][3,5,7][8,1,5]]")
    public void test3() {

        List<List<String>> arr = Arrays.asList(
                Arrays.asList("4","9","2"),
                Arrays.asList("3","5","7"),
                Arrays.asList("8","1","5")
        );

        int actual = FormingMagicSquare.sumLine(arr,0);
        Assertions.assertEquals(15,actual);
    }

    @Test
    @DisplayName("Return 15 When sum the second line With [[4,9,2][3,5,7][8,1,5]]")
    public void test4() {

        List<List<String>> arr = Arrays.asList(
                Arrays.asList("4","9","2"),
                Arrays.asList("3","5","7"),
                Arrays.asList("8","1","5")
        );

        int actual = FormingMagicSquare.sumLine(arr,1);
        Assertions.assertEquals(15,actual);
    }

    @Test
    @DisplayName("Return 14 When sum the third line With [[4,9,2][3,5,7][8,1,5]]")
    public void test5() {

        List<List<String>> arr = Arrays.asList(
                Arrays.asList("4","9","2"),
                Arrays.asList("3","5","7"),
                Arrays.asList("8","1","5")
        );

        int actual = FormingMagicSquare.sumLine(arr,2);
        Assertions.assertEquals(14,actual);
    }

    @Test
    @DisplayName("Return 15 When sum the first column With [[4,9,2][3,5,7][8,1,5]]")
    public void test6() {

        List<List<String>> arr = Arrays.asList(
                Arrays.asList("4","9","2"),
                Arrays.asList("3","5","7"),
                Arrays.asList("8","1","5")
        );

        int actual = FormingMagicSquare.sumColumn(arr,0);
        Assertions.assertEquals(15,actual);
    }

    @Test
    @DisplayName("Return 15 When sum the second column With [[4,9,2][3,5,7][8,1,5]]")
    public void test7() {

        List<List<String>> arr = Arrays.asList(
                Arrays.asList("4","9","2"),
                Arrays.asList("3","5","7"),
                Arrays.asList("8","1","5")
        );

        int actual = FormingMagicSquare.sumColumn(arr,1);
        Assertions.assertEquals(15,actual);
    }

    @Test
    @DisplayName("Return 14 When sum the third column With [[4,9,2][3,5,7][8,1,5]]")
    public void test8() {

        List<List<String>> arr = Arrays.asList(
                Arrays.asList("4","9","2"),
                Arrays.asList("3","5","7"),
                Arrays.asList("8","1","5")
        );

        int actual = FormingMagicSquare.sumColumn(arr,2);
        Assertions.assertEquals(14,actual);
    }


    @Test
    @DisplayName("Return 21 When fix the magic square With [[6,9,8][3,9,4][9,4,4]]")
    public void test9() {

        List<List<String>> arr = Arrays.asList(
                Arrays.asList("6","9","8"),
                Arrays.asList("3","9","4"),
                Arrays.asList("9","4","4")
        );

        int actual = FormingMagicSquare.fixListInteger(convert(arr));
        Assertions.assertEquals(21,actual);
    }

    @Test
    @DisplayName("Return true When sum all rows and columns eq 15 With [[4,9,2][3,5,7][8,1,6]]")
    public void test10() {

        List<List<String>> arr = Arrays.asList(
                Arrays.asList("4","9","2"),
                Arrays.asList("3","5","7"),
                Arrays.asList("8","1","6")
        );

        Assertions.assertTrue(FormingMagicSquare.sumAll(arr));
    }

    @Test
    @DisplayName("Return False When sum all rows and columns not eq 15 With [[4,9,2][3,5,7][8,1,5]]")
    public void test11() {

        List<List<String>> arr = Arrays.asList(
                Arrays.asList("4","9","2"),
                Arrays.asList("3","5","7"),
                Arrays.asList("8","1","5")
        );

        Assertions.assertFalse(FormingMagicSquare.sumAll(arr));
    }

    @Test
    @DisplayName("Return 9 When fix the magic square With [[1 3 8][6 4 1][2 6 5]]")
    public void test12() {

        List<List<String>> arr = Arrays.asList(
                Arrays.asList("1","3","8"),
                Arrays.asList("6","4","1"),
                Arrays.asList("2","6","5")
        );

        int actual = FormingMagicSquare.fixListInteger(convert(arr));
        Assertions.assertEquals(9,actual);
    }

    @Test
    @DisplayName("Return 18 When fix the magic square With [[4 9 2][9 7 6][3 5 8]]")
    public void test13() {

        List<List<String>> arr = Arrays.asList(
                Arrays.asList("4","9","2"),
                Arrays.asList("9","7","6"),
                Arrays.asList("3","5","8")
        );

        int actual = FormingMagicSquare.fixListInteger(convert(arr));
        Assertions.assertEquals(18,actual);
    }

    @Test
    @DisplayName("Return 20 When fix the magic square With [[2 1 7][9 9 9][4 8 6]]")
    public void test14() {

        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(2,1,7),
                Arrays.asList(9,9,9),
                Arrays.asList(4,8,6)
        );

        int actual = fixListInteger(arr);
        Assertions.assertEquals(20,actual);
    }

    @Test
    @DisplayName("Return [2][1] = 9 [0][1] = 1 When insert 9 e 1 in column With [[2 1 7][9 9 9][4 8 6]]")
    public void test15() {

        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(2,1,7),
                Arrays.asList(9,9,9),
                Arrays.asList(4,8,6)
        );

        FormingMagicSquare.addInColumn(arr,9,1);
        Assertions.assertEquals(1,arr.get(2).get(1));
        Assertions.assertEquals(9,arr.get(0).get(1));
    }

    @Test
    @DisplayName("Return [1][0] = 7 [1][2] = 3 When insert 7 e 3 in row With [[2 1 7][9 9 9][4 8 6]]")
    public void test16() {

        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(2,1,7),
                Arrays.asList(9,9,9),
                Arrays.asList(4,8,6)
        );

        FormingMagicSquare.addInRow(arr,7,3);
        Assertions.assertEquals(7,arr.get(1).get(0));
        Assertions.assertEquals(3,arr.get(1).get(2));
    }

    @Test
    @DisplayName("Return true When after complete the magic cube and sum all eq 15 With [[1,9,1][3,5,7][1,1,1]]")
    public void test17() {

        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(1,9,1),
                Arrays.asList(3,5,7),
                Arrays.asList(1,1,1)
        );

        FormingMagicSquare.complete(arr);

        Assertions.assertTrue(FormingMagicSquare.sumAllInteger(arr));
    }

    @Test
    @DisplayName("Return true When after complete the magic cube and sum all eq 15 With [[1,1,1][3,5,7][1,9,1]]")
    public void test18() {

        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(1,1,1),
                Arrays.asList(3,5,7),
                Arrays.asList(1,9,1)
        );

        FormingMagicSquare.complete(arr);

        Assertions.assertTrue(FormingMagicSquare.sumAllInteger(arr));
    }

    @Test
    @DisplayName("Return true When after complete the magic cube and sum all eq 15 With [[1,1,1][3,5,7][1,9,1]]")
    public void test19() {

        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(1,1,1),
                Arrays.asList(7,5,3),
                Arrays.asList(1,9,1)
        );

        FormingMagicSquare.complete(arr);

        Assertions.assertTrue(FormingMagicSquare.sumAllInteger(arr));
    }

    @Test
    @DisplayName("Return 20 When fix the magic square With [[4 4 7][3 1 5][1 7 9]]")
    public void test20() {

        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(4,4,7),
                Arrays.asList(3,1,5),
                Arrays.asList(1,7,9)
        );

        int actual = fixListInteger(arr);
        Assertions.assertEquals(20,actual);
    }

    @Test
    @DisplayName("Return 18 When fix the magic square With [[6 1 2][7 2 6][5 6 2]]")
    public void test21() {

        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(6,1,2),
                Arrays.asList(7,2,6),
                Arrays.asList(5,6,2)
        );

        int actual = fixListInteger(arr);
        Assertions.assertEquals(18,actual);
    }


}