package br.com.guifr.beecrowd;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class DistanceBetweenTwoPoints {

    private Point p1;
    private Point p2;

    public DistanceBetweenTwoPoints(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public static DistanceBetweenTwoPoints points(Point p1, Point p2) {
        return new DistanceBetweenTwoPoints(p1, p2);
    }

    public double distance() {

        BigDecimal operationX = subtractionWithPow(p2.getX(),p1.getX());
        BigDecimal operationY = subtractionWithPow(p2.getY(),p1.getY());

        BigDecimal operationFinal = new BigDecimal(Math.sqrt(operationX.add(operationY).doubleValue()));

        operationFinal = operationFinal.setScale(4, RoundingMode.HALF_EVEN);

        return operationFinal.doubleValue();

    }

    public BigDecimal subtractionWithPow(double propP2,double propP1){
        BigDecimal op = new BigDecimal(propP2).subtract(new BigDecimal(propP1));
        return op.pow(2);
    }

    public static class Point {

        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public Point(String linePoint) {
            String[] values = linePoint.split(" ");
            this.x = Double.parseDouble(values[0]);
            this.y = Double.parseDouble(values[1]);
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
    }


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String lineP1 = sc.nextLine();
        String lineP2 = sc.nextLine();

        System.out.println(DistanceBetweenTwoPoints.points(new Point(lineP1),new Point(lineP2)).distance());


    }


}
