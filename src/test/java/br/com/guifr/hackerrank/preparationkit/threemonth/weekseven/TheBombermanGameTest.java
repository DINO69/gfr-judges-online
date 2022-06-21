package br.com.guifr.hackerrank.preparationkit.threemonth.weekseven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class TheBombermanGameTest {

    @Test
    @DisplayName("Return ['...','.O.','...'] When the bomberman game With seconds=1 arr='...','.O.','...'")
    public void test1() {

        List<String> expected = Arrays.asList("...", ".O.", "...");
        List<String> arr = Arrays.asList("...", ".O.", "...");
        int seconds = 1;
        List<String> afterGame = TheBombermanGame.start(arr, seconds);
        Assertions.assertLinesMatch(expected, afterGame);
        assertList(expected, afterGame);

    }

    @Test
    @DisplayName("Return ['OOO','OOO','OOO'] When the bomberman game With seconds=4 arr='...','.O.','...'")
    public void test2() {

        List<String> expected = Arrays.asList("OOO", "OOO", "OOO");
        List<String> arr = Arrays.asList("...", ".O.", "...");
        int seconds = 4;
        List<String> afterGame = TheBombermanGame.start(arr, seconds);
        Assertions.assertLinesMatch(expected, afterGame);
        assertList(expected, afterGame);

    }


    @Test
    @DisplayName("Return ['O.O','...','O.O'] When the bomberman game With seconds=3 arr='...','.O.','...'")
    public void test3() {

        List<String> expected = Arrays.asList("O.O", "...", "O.O");
        List<String> arr = Arrays.asList("...", ".O.", "...");
        int seconds = 3;
        List<String> afterGame = TheBombermanGame.start(arr, seconds);
        Assertions.assertLinesMatch(expected, afterGame);
        assertList(expected, afterGame);
    }

    @Test
    @DisplayName("Return ['O.O','...','O.O'] When the bomberman game With seconds=11 arr='...','.O.','...'")
    public void test4() {

        List<String> expected = Arrays.asList("O.O", "...", "O.O");
        List<String> arr = Arrays.asList("...", ".O.", "...");
        int seconds = 11;
        List<String> afterGame = TheBombermanGame.start(arr, seconds);
        Assertions.assertLinesMatch(expected, afterGame);
        assertList(expected, afterGame);
    }

    @Test
    @DisplayName("Return ['...','.O.','...'] When the bomberman game With seconds=13 arr='...','.O.','...'")
    public void test5() {

        List<String> expected = Arrays.asList("...", ".O.", "...");
        List<String> arr = Arrays.asList("...", ".O.", "...");
        int seconds = 13;
        List<String> afterGame = TheBombermanGame.start(arr, seconds);
        Assertions.assertLinesMatch(expected, afterGame);
        assertList(expected, afterGame);
    }

    @Test
    @DisplayName("Return ['O.O','...','O.O'] When the bomberman game With seconds=15 arr='...','.O.','...'")
    public void test6() {

        List<String> expected = Arrays.asList("O.O", "...", "O.O");
        List<String> arr = Arrays.asList("...", ".O.", "...");
        int seconds = 15;
        List<String> afterGame = TheBombermanGame.start(arr, seconds);
        Assertions.assertLinesMatch(expected, afterGame);
        assertList(expected, afterGame);
    }

    @Test
    @DisplayName("Return ['...','.O.','...'] When the bomberman game With seconds=17 arr='...','.O.','...'")
    public void test7() {

        List<String> expected = Arrays.asList("...", ".O.", "...");
        List<String> arr = Arrays.asList("...", ".O.", "...");
        int seconds = 17;
        List<String> afterGame = TheBombermanGame.start(arr, seconds);
        Assertions.assertLinesMatch(expected, afterGame);
        assertList(expected, afterGame);
    }

    @Test
    @DisplayName("Return ['...','.O.','...'] When the bomberman game With seconds=17 arr='...','.O.','...'")
    public void test8() {

        List<String> expected = Arrays.asList("...", ".O.", "...");
        List<String> arr = Arrays.asList("...", ".O.", "...");
        int seconds = 17;
        List<String> afterGame = TheBombermanGame.startStepByStep(arr, seconds);
        Assertions.assertLinesMatch(expected, afterGame);
        assertList(expected, afterGame);
    }

    @Test
    @DisplayName("Return ['OOO.OOO',...] When the bomberman game With seconds=3 arr='.......', '...O...', '....O..',...")
    public void test9() {

        List<String> expected = Arrays.asList("OOO.OOO", "OO...OO", "OOO...O", "..OO.OO", "...OOOO", "...OOOO");
        List<String> arr = Arrays.asList(".......", "...O...", "....O..", ".......", "OO.....", "OO.....");
        int seconds = 3;
        List<String> afterGame = TheBombermanGame.start(arr, seconds);
        Assertions.assertLinesMatch(expected, afterGame);
        assertList(expected, afterGame);
    }

    @Test
    @DisplayName("Return ['OOO.OOO',...] When the bomberman game With seconds=3 arr='.......',...")
    public void test10() {

        List<String> expected = Arrays.asList("OOO.OOO", "OO...OO", "OOO...O", "..OO.OO", "...OOOO", "...OOOO");
        List<String> arr = Arrays.asList(".......", "...O...", "....O..", ".......", "OO.....", "OO.....");
        int seconds = 3;
        List<String> afterGame = TheBombermanGame.startStepByStep(arr, seconds);
        Assertions.assertLinesMatch(expected, afterGame);
        assertList(expected, afterGame);
    }

    @Test
    @DisplayName("Return ['.......',...] When the bomberman game With seconds=5 arr='.......',...")
    public void test11() {

        List<String> expected = Arrays.asList(".......", "...O.O.", "...OO..", "..OOOO.", "OOOOOOO", "OOOOOOO");
        List<String> arr = Arrays.asList(".......", "...O.O.", "....O..", "..O....", "OO...OO", "OO.O...");
        int seconds = 5;
        List<String> afterGame = TheBombermanGame.start(arr, seconds);
        Assertions.assertLinesMatch(expected, afterGame);
        assertList(expected, afterGame);
    }

    @Test
    @DisplayName("Return ['.......',...] When the bomberman game With seconds=25 arr='.......',...")
    public void test12() {

        List<String> expected = Arrays.asList(".......", "...O.O.", "...OO..", "..OOOO.", "OOOOOOO", "OOOOOOO");
        List<String> arr = Arrays.asList(".......", "...O.O.", "....O..", "..O....", "OO...OO", "OO.O...");
        int seconds = 25;
        List<String> afterGame = TheBombermanGame.start(arr, seconds);
        Assertions.assertLinesMatch(expected, afterGame);
        assertList(expected, afterGame);
    }

    @Test
    @DisplayName("Return ['OOO.O.O',...] When the bomberman game With seconds=7 arr='.......',...")
    public void test13() {

        List<String> expected = Arrays.asList("OOO.O.O", "OO.....", "OO....O", ".......", ".......", ".......");
        List<String> arr = Arrays.asList(".......", "...O.O.", "....O..", "..O....", "OO...OO", "OO.O...");
        int seconds = 7;
        List<String> afterGame = TheBombermanGame.startStepByStep(arr, seconds);
        Assertions.assertLinesMatch(expected, afterGame);
        assertList(expected, afterGame);
    }

    @Test
    @DisplayName("Return ['OOO.O.O',...] When the bomberman game With seconds=51 arr='.......',...")
    public void test14() {

        List<String> expected = Arrays.asList("OOO.O.O", "OO.....", "OO....O", ".......", ".......", ".......");
        List<String> arr = Arrays.asList(".......", "...O.O.", "....O..", "..O....", "OO...OO", "OO.O...");
        int seconds = 51;
        List<String> afterGame = TheBombermanGame.startStepByStep(arr, seconds);
        Assertions.assertLinesMatch(expected, afterGame);
        assertList(expected, afterGame);
    }

    @Test
    @DisplayName("Return ['OOO.O.O',...] When the bomberman game With seconds=19 arr='.......',...")
    public void test15() {

        List<String> expected = Arrays.asList("OOO.O.O", "OO.....", "OO....O", ".......", ".......", ".......");
        List<String> arr = Arrays.asList(".......", "...O.O.", "....O..", "..O....", "OO...OO", "OO.O...");
        int seconds = 19;
        List<String> afterGame = TheBombermanGame.startStepByStep(arr, seconds);
        Assertions.assertLinesMatch(expected, afterGame);
        assertList(expected, afterGame);
    }

    @Test
    @DisplayName("Return ['OOO.O.O',...] When the bomberman game With seconds=31 arr='.......',...")
    public void test16() {

        List<String> expected = Arrays.asList("OOO.O.O", "OO.....", "OO....O", ".......", ".......", ".......");
        List<String> arr = Arrays.asList(".......", "...O.O.", "....O..", "..O....", "OO...OO", "OO.O...");
        int seconds = 31;
        List<String> afterGame = TheBombermanGame.startStepByStep(arr, seconds);
        Assertions.assertLinesMatch(expected, afterGame);
        assertList(expected, afterGame);
    }

    @Test
    @DisplayName("Return ['OOO.O.O',...] When the bomberman game With seconds=43 arr='.......',...")
    public void test17() {

        List<String> expected = Arrays.asList("OOO.O.O", "OO.....", "OO....O", ".......", ".......", ".......");
        List<String> arr = Arrays.asList(".......", "...O.O.", "....O..", "..O....", "OO...OO", "OO.O...");
        int seconds = 43;
        List<String> afterGame = TheBombermanGame.startStepByStep(arr, seconds);
        Assertions.assertLinesMatch(expected, afterGame);
        assertList(expected, afterGame);
    }

    @Test
    @DisplayName("Return ['OOO.O.O',...] When the bomberman game With seconds=55 arr='.......',...")
    public void test18() {

        List<String> expected = Arrays.asList("OOO.O.O", "OO.....", "OO....O", ".......", ".......", ".......");
        List<String> arr = Arrays.asList(".......", "...O.O.", "....O..", "..O....", "OO...OO", "OO.O...");
        int seconds = 55;
        List<String> afterGame = TheBombermanGame.startStepByStep(arr, seconds);
        Assertions.assertLinesMatch(expected, afterGame);
        assertList(expected, afterGame);
    }

    @Test
    @DisplayName("Return ['OOO.O.O',...] When the bomberman game With seconds=3 arr='.......',...")
    public void test19() {

        List<String> expected = Arrays.asList("OOO.O.O", "OO.....", "OO....O", ".......", ".......", ".......");
        List<String> arr = Arrays.asList(".......", "...O.O.", "....O..", "..O....", "OO...OO", "OO.O...");
        int seconds = 3;
        List<String> afterGame = TheBombermanGame.startStepByStep(arr, seconds);
        Assertions.assertLinesMatch(expected, afterGame);
        assertList(expected, afterGame);
    }

    @Test
    @DisplayName("Return ['OOO.O.O',...] When the bomberman game With seconds=7 arr='.......',...")
    public void test20() {

        List<String> expected = Arrays.asList("OOO.O.O", "OO.....", "OO....O", ".......", ".......", ".......");
        List<String> arr = Arrays.asList(".......", "...O.O.", "....O..", "..O....", "OO...OO", "OO.O...");
        int seconds = 7;
        List<String> afterGame = TheBombermanGame.start(arr, seconds);
        Assertions.assertLinesMatch(expected, afterGame);
        assertList(expected, afterGame);
    }

    @Test
    @DisplayName("Return ['OOO.O.O',...] When the bomberman game With seconds=3 arr='.......',...")
    public void test21() {

        List<String> expected = Arrays.asList("OOO.O.O", "OO.....", "OO....O", ".......", ".......", ".......");
        List<String> arr = Arrays.asList(".......", "...O.O.", "....O..", "..O....", "OO...OO", "OO.O...");
        int seconds = 3;
        List<String> afterGame = TheBombermanGame.startStepByStep(arr, seconds);
        Assertions.assertLinesMatch(expected, afterGame);
        assertList(expected, afterGame);
    }

    private void assertList(List<?> obj1, List<?> obj2) {
        Assertions.assertEquals(obj1.size(), obj2.size(), "Length is different");

        boolean b = IntStream.range(0, obj1.size()).allMatch(i -> obj1.get(i).equals(obj2.get(i)));
        Assertions.assertTrue(b, "Elements are different");

    }

    @Test
    @DisplayName("Return '1110111' When pass one second With 'OOO.OOO'")
    public void testChanges() {
        String actual = TheBombermanGame.passOneSecond("OOO.OOO");
        Assertions.assertEquals("1110111", actual);
    }

    @Test
    @DisplayName("Return '2221222' When pass one second With '1110111'")
    public void testChanges2() {
        String actual = TheBombermanGame.passOneSecond("1110111");
        Assertions.assertEquals("2221222", actual);
    }

    @Test
    @DisplayName("Return '...2...' When pass one second With '2221222'")
    public void testChanges3() {
        String actual = TheBombermanGame.passOneSecond("2221222");
        Assertions.assertEquals("...2...", actual);
    }

    @Test
    @DisplayName("Return [0,1,2,4,5,6] When pass one second With '2221222'")
    public void testWillExplode1() {
        List<Integer> actual = TheBombermanGame.willExplode("2221222");
        Assertions.assertEquals(6, actual.size());
        Assertions.assertEquals(0, actual.get(0));
        Assertions.assertEquals(1, actual.get(1));
        Assertions.assertEquals(2, actual.get(2));
        Assertions.assertEquals(4, actual.get(3));
        Assertions.assertEquals(5, actual.get(4));
        Assertions.assertEquals(6, actual.get(5));
    }

    @Test
    @DisplayName("Return [] When pass one second With '1111111'")
    public void testWillExplode2() {
        List<Integer> actual = TheBombermanGame.willExplode("1111111");
        Assertions.assertEquals(0, actual.size());
    }

    @Test
    @DisplayName("Return [2,4] When pass one second With '1121211'")
    public void testWillExplode3() {
        List<Integer> actual = TheBombermanGame.willExplode("1121211");
        Assertions.assertEquals(2, actual.size());
        Assertions.assertEquals(2, actual.get(0));
        Assertions.assertEquals(4, actual.get(1));
    }

    @Test
    @DisplayName("Return '1.....1' When ChangeInRow With '1111111'")
    public void testChangeInRow3() {

        List<Integer> exploded = Arrays.asList(2, 4);
        int row = 1;
        List<String> grid = Arrays.asList("1111111", "1111111", "1111111");
        List<String> gridExpected = Arrays.asList("1111111", "1.....1", "1111111");

        TheBombermanGame.changeInRow(grid, row, exploded);
        Assertions.assertLinesMatch(gridExpected, grid);
        assertList(gridExpected, grid);

    }

    @Test
    @DisplayName("Return '11.1.11' first and last line When changeInCol With '1111111'")
    public void testChangeInCol3() {

        List<Integer> exploded = Arrays.asList(2, 4);
        int row = 1;
        List<String> grid = Arrays.asList("1111111", "1111111", "1111111");
        List<String> gridExpected = Arrays.asList("11.1.11", "1111111", "11.1.11");

        TheBombermanGame.changeInCol(grid, row, exploded);
        Assertions.assertLinesMatch(gridExpected, grid);
        assertList(gridExpected, grid);

    }


    @Test
    @DisplayName("Return 'O.O' When finish row in the grid With [202]")
    public void testFinishExecution() {

        List<String> grid = Arrays.asList("202", "000", "202");
        List<String> gridExpected = Arrays.asList("O.O", "...", "O.O");

        TheBombermanGame.finishExecution(grid);
        Assertions.assertLinesMatch(gridExpected, grid);
        assertList(gridExpected, grid);
    }

    @Test
    @DisplayName("Return all O near bomb When completeZerosNearBomb With '.O.','...','O..'")
    public void testCompleteZerosNearBomb() {

        List<String> grid = Arrays.asList(".O.", "...", "O..");
        List<String> gridExpected = Arrays.asList("OOO", "OO.", "OO.");

        TheBombermanGame.completeZerosNearBomb(grid);
        Assertions.assertLinesMatch(gridExpected, grid);
        assertList(gridExpected, grid);

    }

    @Test
    @DisplayName("Return toggle .=O O=. When toggle With '.O.','...','O..'")
    public void testToggle() {

        List<String> grid = Arrays.asList(".O.", "...", "O..");
        List<String> gridExpected = Arrays.asList("O.O", "OOO", ".OO");

        TheBombermanGame.toggle(grid);
        Assertions.assertLinesMatch(gridExpected, grid);
        assertList(gridExpected, grid);

    }
}