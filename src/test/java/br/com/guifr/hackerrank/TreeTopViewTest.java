package br.com.guifr.hackerrank;

import br.com.guifr.hackerrank.Trees.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TreeTopViewTest {

    @Test
    @DisplayName("Return '1 2 5 6' When search top view With nodes [1 2 5 3 6 4]")
    public void test1() {
        Node node = null;
        node = Trees.inserts(node, Arrays.asList(1,2,5,3,6,4));
        String actual = TreeTopView.searchWithVerticalOrderTraversal(node);
        Assertions.assertEquals("1 2 5 6", actual);
    }

    @Test
    @DisplayName("Return '1 2 4 14 23 37 108...' When search top view With nodes [...]")
    public void test2() {
        Node node = null;
        node = Trees.inserts(node, Arrays.asList(37,23,108,59,86,64,94,14,105,17,111,65,55,31,79,97,78,25,50,22,66,46,104,98,81,90,68,40,103,77,74,18,69,82,41,4,48,83,67,6,2,95,54,100,99,84,34,88,27,72,32,62,9,56,109,115,33,15,91,29,85,114,112,20,26,30,93,96,87,42,38,60,7,73,35,12,10,57,80,13,52,44,16,70,8,39,107,106,63,24,92,45,75,116,5,61,49,101,71,11,53,43,102,110,1,58,36,28,76,47,113,21,89,51,19,3));
        String actual = TreeTopView.searchWithVerticalOrderTraversal(node);
        Assertions.assertEquals("1 2 4 14 23 37 108 111 115 116 83 84 85", actual);
    }

    @Test
    @DisplayName("Return '1 2 5 6' When fillMap MinimumDistance to search top view With nodes [1 2 5 3 6 4]")
    public void testFillMapMinimumDistance1() {
        Node node = null;
        node = Trees.inserts(node, Arrays.asList(1,2,5,3,6,4));
        String actual = TreeTopView.fillMapMinimumDistance(node);
        Assertions.assertEquals("1 2 5 6", actual);
    }

    @Test
    @DisplayName("Return '1 2 4 14 23 37 108...' When fillMap MinimumDistance to search top view With nodes [...]")
    public void testFillMapMinimumDistance2() {
        Node node = null;
        node = Trees.inserts(node, Arrays.asList(37,23,108,59,86,64,94,14,105,17,111,65,55,31,79,97,78,25,50,22,66,46,104,98,81,90,68,40,103,77,74,18,69,82,41,4,48,83,67,6,2,95,54,100,99,84,34,88,27,72,32,62,9,56,109,115,33,15,91,29,85,114,112,20,26,30,93,96,87,42,38,60,7,73,35,12,10,57,80,13,52,44,16,70,8,39,107,106,63,24,92,45,75,116,5,61,49,101,71,11,53,43,102,110,1,58,36,28,76,47,113,21,89,51,19,3));
        String actual = TreeTopView.fillMapMinimumDistance(node);
        Assertions.assertEquals("1 2 4 14 23 37 108 111 115 116 83 84 85", actual);
    }

    @Test
    @DisplayName("Return '1 2 5 6' When maxLeftRight to search top view With nodes [1 2 5 3 6 4]")
    public void testMaxLeftRight1() {
        Node node = null;
        node = Trees.inserts(node, Arrays.asList(1,2,5,3,6,4));
        String actual = TreeTopView.maxLeftRight(node);
        Assertions.assertEquals("1 2 5 6", actual);
    }

    @Test
    @DisplayName("Return '1 2 4 14 23 37 108...' When maxLeftRight to search top view With nodes [...]")
    public void testMaxLeftRight2() {
        Node node = null;
        node = Trees.inserts(node, Arrays.asList(37,23,108,59,86,64,94,14,105,17,111,65,55,31,79,97,78,25,50,22,66,46,104,98,81,90,68,40,103,77,74,18,69,82,41,4,48,83,67,6,2,95,54,100,99,84,34,88,27,72,32,62,9,56,109,115,33,15,91,29,85,114,112,20,26,30,93,96,87,42,38,60,7,73,35,12,10,57,80,13,52,44,16,70,8,39,107,106,63,24,92,45,75,116,5,61,49,101,71,11,53,43,102,110,1,58,36,28,76,47,113,21,89,51,19,3));
        String actual = TreeTopView.maxLeftRight(node);
        Assertions.assertEquals("1 2 4 14 23 37 108 111 115 116 83 84 85", actual);
    }

    @Test
    @DisplayName("Return '1 2 5 6' When dictionaryWithoutSort to search top view With nodes [1 2 5 3 6 4]")
    public void testDictionaryWithoutSort1() {
        Node node = null;
        node = Trees.inserts(node, Arrays.asList(1,2,5,3,6,4));
        String actual = TreeTopView.dictionaryWithoutSort(node);
        Assertions.assertEquals("1 2 5 6", actual);
    }

    @Test
    @DisplayName("Return '1 2 4 14 23 37 108...' When dictionaryWithoutSort to search top view With nodes [...]")
    public void testDictionaryWithoutSort2() {
        Node node = null;
        node = Trees.inserts(node, Arrays.asList(37,23,108,59,86,64,94,14,105,17,111,65,55,31,79,97,78,25,50,22,66,46,104,98,81,90,68,40,103,77,74,18,69,82,41,4,48,83,67,6,2,95,54,100,99,84,34,88,27,72,32,62,9,56,109,115,33,15,91,29,85,114,112,20,26,30,93,96,87,42,38,60,7,73,35,12,10,57,80,13,52,44,16,70,8,39,107,106,63,24,92,45,75,116,5,61,49,101,71,11,53,43,102,110,1,58,36,28,76,47,113,21,89,51,19,3));
        String actual = TreeTopView.dictionaryWithoutSort(node);
        Assertions.assertEquals("1 2 4 14 23 37 108 111 115 116 83 84 85", actual);
    }

}