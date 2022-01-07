package br.com.guifr.beecrowd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleCalculateTest {

    @Test
    @DisplayName("Return 'VALOR A PAGAR: R$ 15.50' when sum the values to pay")
    public void test1() {

        List<SimpleCalculate.Product> products = new ArrayList<>();
        products.add(new SimpleCalculate.Product("12 1 5.30"));
        products.add(new SimpleCalculate.Product("16 2 5.10"));

        String actual = SimpleCalculate.products(products).print();

        assertEquals("VALOR A PAGAR: R$ 15.50", actual);
    }

    @Test
    @DisplayName("Return 'VALOR A PAGAR: R$ 51.40' when sum the values to pay")
    public void test2() {

        List<SimpleCalculate.Product> products = new ArrayList<>();
        products.add(new SimpleCalculate.Product("13 2 15.30"));
        products.add(new SimpleCalculate.Product("161 4 5.20"));

        String actual = SimpleCalculate.products(products).print();

        assertEquals("VALOR A PAGAR: R$ 51.40", actual);
    }

    @Test
    @DisplayName("Return 'VALOR A PAGAR: R$ 30.20' when sum the values to pay")
    public void test3() {

        List<SimpleCalculate.Product> products = new ArrayList<>();
        products.add(new SimpleCalculate.Product("1 1 15.10"));
        products.add(new SimpleCalculate.Product("2 1 15.10"));

        String actual = SimpleCalculate.products(products).print();

        assertEquals("VALOR A PAGAR: R$ 30.20", actual);
    }


    @Test
    @DisplayName("Return Product with code 12 qtd 1 and value 5.30 when line '12 1 5.30'")
    public void testProduct() {

        SimpleCalculate.Product product = new SimpleCalculate.Product("12 1 5.30");

        Assertions.assertAll(
                () -> assertEquals(12, product.getCode()),
                () -> assertEquals(1, product.getQtd().intValue()),
                () -> assertEquals(5.30, product.getValue().doubleValue())
        );

    }


}