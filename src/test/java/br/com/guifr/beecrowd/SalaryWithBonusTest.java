package br.com.guifr.beecrowd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SalaryWithBonusTest {

    @Test
    @DisplayName("Return 'TOTAL = R$ 684.54' when calculate salary 500.00 and sales 1230.30 ")
    public void test1(){


        String actual = SalaryWithBonus.ofSalary("500.00").ofSales("1230.30").print();
        Assertions.assertEquals("TOTAL = R$ 684.54",actual);
    }

    @Test
    @DisplayName("Return 'TOTAL = R$ 700.00' when calculate salary 700.00 and no sales")
    public void test2(){
        String actual = SalaryWithBonus.ofSalary("700.00").print();
        Assertions.assertEquals("TOTAL = R$ 700.00",actual);
    }

    @Test
    @DisplayName("Return 'TOTAL = R$ 1884.58' when calculate salary 1700.00 and 1230.50 of sales")
    public void test3(){
        String actual = SalaryWithBonus.ofSalary("1700.00").ofSales("1230.50").print();
        Assertions.assertEquals("TOTAL = R$ 1884.58",actual);
    }

}