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

        BigDecimal operationX = new BigDecimal(p2.getX()).subtract(new BigDecimal(p1.getX()));
        BigDecimal operationY = new BigDecimal(p2.getY()).subtract(new BigDecimal(p1.getY()));

        BigDecimal operationFinal = operationX.pow(2).add(operationY.pow(2));

        operationFinal = new BigDecimal(Math.sqrt(operationFinal.doubleValue()));

        operationFinal = operationFinal.setScale(4, RoundingMode.HALF_EVEN);

        return operationFinal.doubleValue();

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
