package br.com.guifr.beecrowd;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class SalaryWithBonus {

    private BigDecimal salary;
    private BigDecimal sales;

    private SalaryWithBonus() {}

    public SalaryWithBonus(String salary, String sales) {
        this.sales = new BigDecimal(sales);
        this.salary = new BigDecimal(salary);
    }

    public static SalaryWithBonus ofSalary(String salary) {
        return new SalaryWithBonus(salary,"0.0");
    }

    public SalaryWithBonus ofSales(String sales) {
        this.sales = new BigDecimal(sales);
        return this;
    }

    public String print() {
        BigDecimal over = sales.multiply(new BigDecimal(15)).divide(new BigDecimal(100),2,RoundingMode.HALF_EVEN);
        BigDecimal salaryFinal = salary.add(over);
        return String.format(Locale.US,"TOTAL = R$ %.2f",salaryFinal.doubleValue());
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        String salary = sc.next();
        String sales = sc.next();

        System.out.println(SalaryWithBonus.ofSalary(salary).ofSales(sales).print());

    }

}
