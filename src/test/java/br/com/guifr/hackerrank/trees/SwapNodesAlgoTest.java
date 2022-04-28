package br.com.guifr.hackerrank.trees;

import br.com.guifr.hackerrank.trees.Trees.Node;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SwapNodesAlgoTest {

    @Test
    @DisplayName("Return 1 2 3 When built nodes With list values")
    public void testBuilt0() {

        List<List<Integer>> indexes = getSampleInputZero();

        Node nodeFirst = SwapNodesAlgo.built(indexes);
        assertEquals(1, nodeFirst.data, "First");
        assertEquals(2, nodeFirst.left.data, "Second");
        assertEquals(3, nodeFirst.right.data, "Third");
    }

    @Test
    @DisplayName("Return '2 1 3' When in order nodes With list values")
    public void testInOrder0() {

        List<List<Integer>> indexes = getSampleInputZero();

        Node nodeFirst = SwapNodesAlgo.built(indexes);
        String actual = SwapNodesAlgo.inOrder(nodeFirst);
        assertEquals("2 1 3", actual, "In Order");
    }

    @Test
    @DisplayName("Return '3 1 2' When swap nodes With 1 in list values")
    public void testSwap0() {

        List<List<Integer>> indexes = getSampleInputZero();

        Node nodeFirst = SwapNodesAlgo.built(indexes);
        SwapNodesAlgo.swap(nodeFirst, 1);
        String actual = SwapNodesAlgo.inOrder(nodeFirst);
        assertEquals("3 1 2", actual, "In Order after swap");
    }

    @Test
    @DisplayName("Return [[3 1 2][2 1 3]] ... When swap and in order nodes With [1 1] in list number 0")
    public void testAllTogether0() {

        List<List<Integer>> indexes = getSampleInputZero();

        List<Integer> swaps = Arrays.asList(1, 1);

        List<List<Integer>> actual = SwapNodesAlgo.of(indexes, swaps);

        assertAll(() -> {
            assertEquals(2, actual.size(), "Size is 2");
            List<String> actualInStrings = actual.get(0).stream()
                    .map(String::valueOf)
                    .collect(Collectors.toList());
            assertLinesMatch(Arrays.asList("3", "1", "2"), actualInStrings);

            actualInStrings = actual.get(1).stream()
                    .map(String::valueOf)
                    .collect(Collectors.toList());
            assertLinesMatch(Arrays.asList("2", "1", "3"), actualInStrings);
        });

    }

    @Test
    @DisplayName("Return 1 2 4 3 5 When built nodes With list values")
    public void testBuilt1() {

        List<List<Integer>> indexes = getSampleInputOne();

        Node nodeFirst = SwapNodesAlgo.built(indexes);
        assertEquals(1, nodeFirst.data, "First");
        assertEquals(2, nodeFirst.left.data, "Second");
        assertEquals(3, nodeFirst.right.data, "Third");
        assertEquals(4, nodeFirst.left.right.data, "Fourth");
        assertEquals(5, nodeFirst.right.right.data, "Fiveth");
    }


    @Test
    @DisplayName("Return '2 4 1 3 5' When in order nodes With list values")
    public void testInOrder1() {

        List<List<Integer>> indexes = getSampleInputOne();

        Node nodeFirst = SwapNodesAlgo.built(indexes);
        String actual = SwapNodesAlgo.inOrder(nodeFirst);

        assertEquals("2 4 1 3 5", actual, "In Order");

    }

    @Test
    @DisplayName("Return List<Integer> [2 4 1 3 5] When in order nodes With list values")
    public void testInOrderReturnList1() {

        List<List<Integer>> indexes = getSampleInputOne();

        Node nodeFirst = SwapNodesAlgo.built(indexes);
        List<Integer> actual = SwapNodesAlgo.inOrderReturnList(nodeFirst);

        assertAll(() -> {
            assertEquals(5, actual.size(), "Size is 5");
            List<String> actualInStrings = actual.stream()
                    .map(String::valueOf)
                    .collect(Collectors.toList());
            assertLinesMatch(Arrays.asList("2", "4", "1", "3", "5"), actualInStrings);
        });

    }


    @Test
    @DisplayName("Return '4 2 1 5 3' When swap nodes With 2 in list values")
    public void testSwap1() {

        List<List<Integer>> indexes = getSampleInputOne();

        Node nodeFirst = SwapNodesAlgo.built(indexes);
        SwapNodesAlgo.swap(nodeFirst, 2);
        String actual = SwapNodesAlgo.inOrder(nodeFirst);
        assertEquals("4 2 1 5 3", actual, "In Order after swap");

    }

    @Test
    @DisplayName("Return [[4 2 1 5 3]] When swap and in order nodes With 2 in list number 1")
    public void testAllTogether1() {

        List<List<Integer>> indexes = getSampleInputOne();

        List<Integer> swaps = Arrays.asList(2);

        List<List<Integer>> actual = SwapNodesAlgo.of(indexes, swaps);

        assertAll(() -> {
            assertEquals(1, actual.size(), "Size is 1");
            List<String> actualInStrings = actual.get(0).stream()
                    .map(String::valueOf)
                    .collect(Collectors.toList());
            assertLinesMatch(Arrays.asList("4", "2", "1", "5", "3"), actualInStrings);
        });

    }


    @Test
    @DisplayName("Return 1 2 3 ... When built nodes With list values")
    public void testBuilt2() {

        List<List<Integer>> indexes = getSampleInputTwo();

        Node nodeFirst = SwapNodesAlgo.built(indexes);
        assertEquals(1, nodeFirst.data, "First");
        assertEquals(2, nodeFirst.left.data, "Second");
        assertEquals(3, nodeFirst.right.data, "Third");
        assertEquals(4, nodeFirst.left.left.data, "Fourth");
        assertEquals(5, nodeFirst.right.left.data, "Fiveth");
    }


    @Test
    @DisplayName("Return '6 9 4 2 1 7 5 10 8 11 3' ... When in order nodes With list number 2")
    public void testInOrder2() {

        List<List<Integer>> indexes = getSampleInputTwo();

        Node nodeFirst = SwapNodesAlgo.built(indexes);
        String actual = SwapNodesAlgo.inOrder(nodeFirst);
        assertEquals("6 9 4 2 1 7 5 10 8 11 3", actual, "In Order");
    }


    @Test
    @DisplayName("Return '2 9 6 4 1 3 7 5 11 8 10' ... When swap nodes With 2 in list values")
    public void testSwap2() {

        List<List<Integer>> indexes = getSampleInputTwo();

        Node nodeFirst = SwapNodesAlgo.built(indexes);
        SwapNodesAlgo.swap(nodeFirst, 2);
        String actual = SwapNodesAlgo.inOrder(nodeFirst);
        assertEquals("2 9 6 4 1 3 7 5 11 8 10", actual, "In Order");
    }

    @Test
    @DisplayName("Return '2 6 9 4 1 3 7 5 10 8 11' ... When swap nodes With 2 and 4 in list number 2")
    public void testSwap2Witth2Swaps() {

        List<List<Integer>> indexes = getSampleInputTwo();

        Node nodeFirst = SwapNodesAlgo.built(indexes);
        SwapNodesAlgo.swap(nodeFirst, 2);
        SwapNodesAlgo.swap(nodeFirst, 4);
        String actual = SwapNodesAlgo.inOrder(nodeFirst);
        assertEquals("2 6 9 4 1 3 7 5 10 8 11", actual, "In Order");
    }


    @Test
    @DisplayName("Return [[2 9 6...][2 6 9...]] ... When swap and in order nodes With [2 4] in list number 2")
    public void testAllTogether2() {

        List<List<Integer>> indexes = getSampleInputTwo();

        List<Integer> swaps = Arrays.asList(2, 4);

        List<List<Integer>> actual = SwapNodesAlgo.of(indexes, swaps);

        assertAll(() -> {
            assertEquals(2, actual.size(), "Size is 2");
            List<String> actualInStrings = actual.get(0).stream()
                    .map(String::valueOf)
                    .collect(Collectors.toList());
            assertLinesMatch(Arrays.asList("2", "9", "6", "4", "1", "3", "7", "5", "11", "8", "10"), actualInStrings);

            actualInStrings = actual.get(1).stream()
                    .map(String::valueOf)
                    .collect(Collectors.toList());
            assertLinesMatch(Arrays.asList("2", "6", "9", "4", "1", "3", "7", "5", "10", "8", "11"), actualInStrings);
        });

    }

    private List<List<Integer>> getSampleInputZero() {
        return Arrays.asList(
                Arrays.asList(2, 3),
                Arrays.asList(-1, -1),
                Arrays.asList(-1, -1)
        );
    }


    private List<List<Integer>> getSampleInputOne() {
        return Arrays.asList(
                Arrays.asList(2, 3),
                Arrays.asList(-1, 4),
                Arrays.asList(-1, 5),
                Arrays.asList(-1, -1),
                Arrays.asList(-1, -1)
        );
    }

    private List<List<Integer>> getSampleInputTwo() {
        return Arrays.asList(
                Arrays.asList(2, 3),
                Arrays.asList(4, -1),
                Arrays.asList(5, -1),
                Arrays.asList(6, -1),
                Arrays.asList(7, 8),
                Arrays.asList(-1, 9),
                Arrays.asList(-1, -1),
                Arrays.asList(10, 11),
                Arrays.asList(-1, -1),
                Arrays.asList(-1, -1),
                Arrays.asList(-1, -1)
        );
    }


}