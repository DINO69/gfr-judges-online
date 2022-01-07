package br.com.guifr.beecrowd;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class SimpleCalculate {


    private List<Product> productList;

    private SimpleCalculate() {}

    public SimpleCalculate(List<Product> productList) {
        this.productList = productList;
    }

    public String print() {
        return String.format(Locale.US,"VALOR A PAGAR: R$ %.2f",calculate().doubleValue());
    }

    private BigDecimal calculate() {
        return productList.stream()
                .map(p -> p.getValue().multiply(p.getQtd()))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String lineProduct1 = sc.nextLine();
        String lineProduct2 = sc.nextLine();
        List<Product> products = Arrays.asList(new Product(lineProduct1), new Product(lineProduct2));

        System.out.println(SimpleCalculate.products(products).print());

    }

    public static SimpleCalculate products(List<Product> productList){
        return new SimpleCalculate(productList);
    }

    public static class Product {
        private int code;
        private BigDecimal qtd;
        private BigDecimal value;

        private Product() {}

        public Product(String line) {
            String[] values = line.split(" ");
            this.code = Integer.parseInt(values[0]);
            this.qtd = new BigDecimal(values[1]);
            this.value = new BigDecimal(values[2]);
        }

        public BigDecimal getQtd() {
            return qtd;
        }

        public BigDecimal getValue() {
            return value;
        }

        public int getCode() {
            return code;
        }
    }
}
