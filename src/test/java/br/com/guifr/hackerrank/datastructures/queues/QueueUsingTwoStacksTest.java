package br.com.guifr.hackerrank.datastructures.queues;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class QueueUsingTwoStacksTest {


    @Test
    @DisplayName("Return [14 14] When operate in queue With list of task number 1")
    public void test1() {

        List<String> a = Arrays.asList("1 42", "2", "1 14", "3", "1 28", "3", "1 60", "1 78", "2", "2");

        List<Integer> actual = QueueUsingTwoStacks.of(a);
        assertEquals(2, actual.size(), "Size is 2");
        assertTrue(Arrays.asList(14, 14).equals(actual));
    }

    @Test
    @DisplayName("Return [14 14 60] When operate in queue With list of task number 2")
    public void test2() {

        List<String> a = Arrays.asList("1 42", "2", "1 14", "3", "1 28", "3", "1 60", "1 78", "2", "2", "3");

        List<Integer> actual = QueueUsingTwoStacks.of(a);
        assertEquals(3, actual.size(), "Size is 3");
        assertTrue(Arrays.asList(14, 14, 60).equals(actual));
    }

    @Test
    @DisplayName("Return 14 When enqueue number 14 in queue With queue empty")
    public void testEnqueue1() {

        Queue<Integer> queue = new ArrayDeque<>();
        QueueUsingTwoStacks.enqueue(queue,14);

        assertEquals(1, queue.size(), "queue size 1");
        assertTrue(queue.contains(14),"Queue contains 14");
    }

    @Test
    @DisplayName("Return 14 When dequeue in queue With queue [14 28]")
    public void testDequeue1() {

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(14);
        queue.add(28);
        int actual = QueueUsingTwoStacks.dequeue(queue);

        assertEquals(1, queue.size(), "queue size 1");
        assertEquals(14, actual, "Element dequeue");
        assertFalse(queue.contains(14),"Queue NÂO contains 14");
        assertTrue(queue.contains(28),"Queue contains 28");
    }

    @Test
    @DisplayName("Return 14 When dequeue in queue With queue [14 28]")
    public void testHead1() {

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(14);
        queue.add(28);
        int actual = QueueUsingTwoStacks.head(queue);

        assertEquals(2, queue.size(), "queue size 1");
        assertEquals(14, actual, "Element dequeue");
        assertTrue(queue.contains(14),"Queue contains 14");
        assertTrue(queue.contains(28),"Queue contains 28");
    }

    @Test
    @DisplayName("Return '14\n14' When prepare for print With [14 14]")
    public void testStringForPrint1() {

        String actual = QueueUsingTwoStacks.stringForPrint(Arrays.asList(14,14));
        assertEquals("14\n14", actual);
    }

    @Test
    @DisplayName("Return '14\n14' When prepare for print With [14 14]")
    public void testStringForPrintWithoutStream1() {

        String actual = QueueUsingTwoStacks.stringForPrintWithoutStream(Arrays.asList(14,14));
        assertEquals("14\n14", actual);
    }


}