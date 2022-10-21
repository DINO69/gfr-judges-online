package br.com.guifr.hackerrank.preparationkit.threemonth.weekten;

import br.com.guifr.hackerrank.preparationkit.threemonth.weekten.QHEAP1.AddStrategy;
import br.com.guifr.hackerrank.preparationkit.threemonth.weekten.QHEAP1.MinimumStrategy;
import br.com.guifr.hackerrank.preparationkit.threemonth.weekten.QHEAP1.RemoveStrategy;
import br.com.guifr.hackerrank.preparationkit.threemonth.weekten.QHEAP1.Strategy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

class QHEAP1Test {

    @Test
    @DisplayName("Return Strategy Add When the choice which strategy will use Given option = 1")
    void test() {
        int option = 1;
        Strategy result = QHEAP1.whichStrategy(option);
        Assertions.assertTrue(result instanceof Strategy);
        Assertions.assertEquals("AddStrategy",result.getClass().getSimpleName());
    }

    @Test
    @DisplayName("Return Strategy Remove When the choice which strategy will use Given option = 2")
    void test2() {
        int option = 2;
        Strategy result = QHEAP1.whichStrategy(option);
        Assertions.assertTrue(result instanceof Strategy);
        Assertions.assertEquals("RemoveStrategy",result.getClass().getSimpleName());
    }

    @Test
    @DisplayName("Return Strategy Minimum When the choice which strategy will use Given option = 3")
    void test3() {
        int option = 3;
        Strategy result = QHEAP1.whichStrategy(option);
        Assertions.assertTrue(result instanceof Strategy);
        Assertions.assertEquals("MinimumStrategy",result.getClass().getSimpleName());
    }

    @Test
    @DisplayName("Return Queue with value 4 and return value 4 When Strategy Add execute Given value 4")
    void test4() {

        AddStrategy strategy = new AddStrategy(4);
        Queue<Integer> queue = new ArrayDeque<>();

        int result = strategy.execute(queue);

        Assertions.assertEquals(4,result,"Added 4");
        Assertions.assertEquals(4,queue.peek(),"4 was added");

    }

    @Test
    @DisplayName("Return Queue isEmpty and return value 4 When Strategy remove execute")
    void test5() {

        Strategy strategy = new RemoveStrategy(4);
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(4);
        int result = strategy.execute(queue);

        Assertions.assertEquals(4,result,"4 was removed");
        Assertions.assertTrue(queue.isEmpty());

    }

    @Test
    @DisplayName("Return Queue with just value 9 and return value 4 When Strategy remove execute Given queue[4,9]")
    void test6() {
        Strategy strategy = new RemoveStrategy(4);
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(4);
        queue.add(9);
        int result = strategy.execute(queue);

        Assertions.assertEquals(4,result,"4 was removed");
        Assertions.assertFalse(queue.isEmpty());
        Assertions.assertEquals(9,queue.peek(),"9 is present in queue");
    }

    @Test
    @DisplayName("Return Queue with just value 4 and return value 9 When Strategy remove execute Given queue[4,9]")
    void test7() {
        Strategy strategy = new RemoveStrategy(9);
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(4);
        queue.add(9);
        int result = strategy.execute(queue);

        Assertions.assertEquals(9,result,"9 was removed");
        Assertions.assertFalse(queue.isEmpty());
        Assertions.assertEquals(4,queue.peek(),"4 is present in queue");
    }

    @Test
    @DisplayName("Return 4 When Strategy minimum execute Given queue[4,9]")
    void test8() {
        Strategy strategy = new MinimumStrategy();
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(4);
        queue.add(9);
        int result = strategy.execute(queue);

        Assertions.assertEquals(4,result,"9 is the minimum value in queue");
        Assertions.assertFalse(queue.isEmpty());
        Assertions.assertEquals(2,queue.size(),"2 is the size queue");
    }

    @Test
    @DisplayName("Return [4,9] When process completely input Given [1,4][1,9][3][2,4][3]")
    void test9() {


        String expected = "4\n9";

        List<List<Integer>> list = List.of(
                List.of(1,4),
                List.of(1,9),
                List.of(3),
                List.of(2,4),
                List.of(3)
        );
        String result = QHEAP1.process(list);
        Assertions.assertEquals(expected,result);

    }
}