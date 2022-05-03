package br.com.guifr.beecrowd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static br.com.guifr.beecrowd.TDARational.*;

class TDARationalTest {

    @Test
    @DisplayName("Return '10/8 = 5/4' When resolve operation SUM With '1 / 2 + 3 / 4'")
    public void testSum1() {
        int n1 = 1;
        int d1 = 2;

        int n2 = 3;
        int d2 = 4;

        String operation = "+";

        String actual = with(operation, n1, d1, n2, d2);
        Assertions.assertEquals("10/8 = 5/4", actual);
    }

    @Test
    @DisplayName("Return '10/8' When operation SUM With n1=1 d1=2 n2=3 d2=4")
    public void testOpSum1() {
        int n1 = 1;
        int d1 = 2;

        int n2 = 3;
        int d2 = 4;

        Operation op = new OperationSum();

        String actual = op.with(n1, d1, n2, d2);
        Assertions.assertEquals("10/8", actual);
    }

    @Test
    @DisplayName("Return '5/4' When calculate mdc With '10/8'")
    public void testMDC1() {

        String actual = TDARational.mdc("10/8");
        Assertions.assertEquals("5/4", actual);
    }

    @Test
    @DisplayName("Return '2/3' When calculate mdc With '12/18'")
    public void testMDC2() {

        String actual = TDARational.mdc("12/18");
        Assertions.assertEquals("2/3", actual);
    }

    @Test
    @DisplayName("Return '-1/4' When calculate mdc With '-2/8'")
    public void testMDC3() {

        String actual = TDARational.mdc("-2/8");
        Assertions.assertEquals("-1/4", actual);
    }

    @Test
    @DisplayName("Return [1 2 5 10] When calculate Divisors With 10")
    public void testDivisors1() {
        List<Integer> actual = TDARational.divisors(10);
        Assertions.assertEquals(4, actual.size(), "Size is 4");
        Assertions.assertTrue(actual.contains(1), "Contains 1");
        Assertions.assertTrue(actual.contains(2), "Contains 2");
        Assertions.assertTrue(actual.contains(5), "Contains 5");
        Assertions.assertTrue(actual.contains(10), "Contains 10");
    }

    @Test
    @DisplayName("Return [1 2 4 8] When calculate Divisors With 8")
    public void testDivisors2() {
        List<Integer> actual = TDARational.divisors(8);
        Assertions.assertEquals(4, actual.size(), "Size is 4");
        Assertions.assertTrue(actual.contains(1), "Contains 1");
        Assertions.assertTrue(actual.contains(2), "Contains 2");
        Assertions.assertTrue(actual.contains(4), "Contains 4");
        Assertions.assertTrue(actual.contains(8), "Contains 8");
    }


    @Test
    @DisplayName("Return '30/18 = 5/3' When resolve operation SUM With '2 / 3 + 6 / 6'")
    public void testSum2() {
        int n1 = 2;
        int d1 = 3;

        int n2 = 6;
        int d2 = 6;

        String operation = "+";

        String actual = with(operation, n1, d1, n2, d2);
        Assertions.assertEquals("30/18 = 5/3", actual);
    }

    @Test
    @DisplayName("Return '35/21 = 5/3' When resolve operation SUM With '2 / 3 + 7 / 7'")
    public void testSum3() {
        int n1 = 2;
        int d1 = 3;

        int n2 = 7;
        int d2 = 7;

        String operation = "+";

        String actual = with(operation, n1, d1, n2, d2);
        Assertions.assertEquals("35/21 = 5/3", actual);
    }

    @Test
    @DisplayName("Return '10/8 = 5/4' When resolve operation SUM With [ 1 2 + 3 4]")
    public void testSum4() {

        String actual = withList(Arrays.asList("1","2","+","3","4"));
        Assertions.assertEquals("10/8 = 5/4", actual);
    }

    @Test
    @DisplayName("Return '-2/8 = -1/4' When resolve operation SUM With '1 / 2 - 3 / 4'")
    public void testSubtraction1() {
        int n1 = 1;
        int d1 = 2;

        int n2 = 3;
        int d2 = 4;

        String operation = "-";

        String actual = with(operation, n1, d1, n2, d2);
        Assertions.assertEquals("-2/8 = -1/4", actual);
    }

    @Test
    @DisplayName("Return '-2/8' When resolve operation SUM With n1=1 d1=2 n2=3 d2=4")
    public void testOpSubtraction1() {
        int n1 = 1;
        int d1 = 2;

        int n2 = 3;
        int d2 = 4;

        Operation op = new OperationSubtraction();

        String actual = op.with(n1, d1, n2, d2);
        Assertions.assertEquals("-2/8", actual);
    }

    @Test
    @DisplayName("Return OperationSubtraction When create class Operation With operation='-'")
    public void testInstanceOfSubtraction() {

        Operation actual = TDARational.operation("-");
        Assertions.assertEquals("OperationSubtraction", actual.getClass().getSimpleName());
        Assertions.assertTrue(actual instanceof OperationSubtraction);
    }

    @Test
    @DisplayName("Return OperationSum When create class Operation With operation='+'")
    public void testInstanceOfSum() {

        Operation actual = TDARational.operation("+");
        Assertions.assertEquals("OperationSum", actual.getClass().getSimpleName());
        Assertions.assertTrue(actual instanceof OperationSum);
    }

    @Test
    @DisplayName("Return Division When create class Operation With operation='/'")
    public void testInstanceOfDivision() {

        Operation actual = TDARational.operation("/");
        Assertions.assertEquals("OperationDivision", actual.getClass().getSimpleName());
        Assertions.assertTrue(actual instanceof OperationDivision);
    }

    @Test
    @DisplayName("Return Multiplication When create class Operation With operation='*'")
    public void testInstanceOfMultiplication() {

        Operation actual = TDARational.operation("*");
        Assertions.assertEquals("OperationMultiplication", actual.getClass().getSimpleName());
        Assertions.assertTrue(actual instanceof OperationMultiplication);
    }

    @Test
    @DisplayName("Return '12/18 = 2/3' When resolve operation SUM With '2 / 3 * 6 / 6'")
    public void testMultiplication1() {
        int n1 = 2;
        int d1 = 3;

        int n2 = 6;
        int d2 = 6;

        String operation = "*";

        String actual = with(operation, n1, d1, n2, d2);
        Assertions.assertEquals("12/18 = 2/3", actual);
    }

    @Test
    @DisplayName("Return '12/18' When resolve operation SUM With n1=2 d1=3 n2=6 d2=6")
    public void testOpMultiplication1() {
        int n1 = 2;
        int d1 = 3;

        int n2 = 6;
        int d2 = 6;

        Operation op = new OperationMultiplication();

        String actual = op.with(n1, d1, n2, d2);
        Assertions.assertEquals("12/18", actual);
    }

    @Test
    @DisplayName("Return '4/6 = 2/3' When resolve operation SUM With '1 / 2 / 3 / 4'")
    public void testDivision1() {
        int n1 = 1;
        int d1 = 2;

        int n2 = 3;
        int d2 = 4;

        String operation = "/";

        String actual = with(operation, n1, d1, n2, d2);
        Assertions.assertEquals("4/6 = 2/3", actual);
    }

    @Test
    @DisplayName("Return '4/6' When resolve operation SUM With n1=1 d1=2 n2=3 d2=4")
    public void testOpDivision1() {
        int n1 = 1;
        int d1 = 2;

        int n2 = 3;
        int d2 = 4;

        Operation op = new OperationDivision();

        String actual = op.with(n1, d1, n2, d2);
        Assertions.assertEquals("4/6", actual);
    }


    @Test
    @DisplayName("Return [1 2 + 3 4] When break string per spaces With '1 / 2 + 3 / 4'")
    public void testBreakString1() {

        List<String> actual = TDARational.breakString("1 / 2 + 3 / 4");
        Assertions.assertEquals(5,actual.size(),"Size is 5");
        Assertions.assertEquals("1",actual.get(0),"first is 1");
        Assertions.assertEquals("2",actual.get(1),"Second is 2");
        Assertions.assertEquals("+",actual.get(2),"Third is +");
        Assertions.assertEquals("3",actual.get(3),"Fourth is 3");
        Assertions.assertEquals("4",actual.get(4),"Fiveth is 4");
    }

    @Test
    @DisplayName("Return 2 When findMaxComumTogether With 10 8")
    public void testfindMaxComumTogether1() {
        int n = 10;
        int d = 8;

        int actual = TDARational.findMaxComumTogether(n,d);
        Assertions.assertEquals(2, actual);
    }

    @Test
    @DisplayName("Return 6 When findMaxComumTogether With 12 18")
    public void testfindMaxComumTogether2() {
        int n = 12;
        int d = 18;

        int actual = TDARational.findMaxComumTogether(n,d);
        Assertions.assertEquals(6, actual);
    }

    @Test
    @DisplayName("Return 7 When findMaxComumTogether With 35 21")
    public void testfindMaxComumTogether3() {
        int n = 35;
        int d = 21;

        int actual = TDARational.findMaxComumTogether(n,d);
        Assertions.assertEquals(7, actual);
    }

    @Test
    @DisplayName("Return 1 When findMaxComumTogether With 7 5")
    public void testfindMaxComumTogether4() {
        int n = 7;
        int d = 5;

        int actual = TDARational.findMaxComumTogether(n,d);
        Assertions.assertEquals(1, actual);
    }

    @Test
    @DisplayName("Return '5/4' When calculate mdcLessComplexity With '10/8'")
    public void testMDCLessComplexity1() {

        String actual = TDARational.mdcLessComplexity("10/8");
        Assertions.assertEquals("5/4", actual);
    }

    @Test
    @DisplayName("Return '2/3' When calculate mdcLessComplexity With '12/18'")
    public void testMDCLessComplexity2() {

        String actual = TDARational.mdcLessComplexity("12/18");
        Assertions.assertEquals("2/3", actual);
    }

    @Test
    @DisplayName("Return '-1/4' When calculate mdcLessComplexity With '-2/8'")
    public void testMDCLessComplexity3() {

        String actual = TDARational.mdcLessComplexity("-2/8");
        Assertions.assertEquals("-1/4", actual);
    }

}