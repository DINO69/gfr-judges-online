package br.com.guifr.beecrowd;

import java.io.IOException;
import java.util.*;

public class TDARational {

    public static Operation operation(String signal) {
        switch (signal) {
            case "-":
                return new OperationSubtraction();
            case "+":
                return new OperationSum();
            case "/":
                return new OperationDivision();
            case "*":
                return new OperationMultiplication();
        }
        return null;
    }

    public static List<String> breakString(String s) {
        ArrayList<String> result = new ArrayList<>(Arrays.asList(s.split(" ")));
        result.remove(1);
        result.remove(4);
        return result;
    }

    protected static interface Operation {
        String with(int n1, int d1, int n2, int d2);
    }

    protected static class OperationSum implements Operation {
        @Override
        public String with(int n1, int d1, int n2, int d2) {
            int numerator = (n1 * d2) + (n2 * d1);
            int denominator = d1 * d2;
            return String.format("%d/%d", numerator, denominator);
        }
    }

    protected static class OperationSubtraction implements Operation {
        @Override
        public String with(int n1, int d1, int n2, int d2) {
            int numerator = (n1 * d2) - (n2 * d1);
            int denominator = d1 * d2;
            return String.format("%d/%d", numerator, denominator);
        }
    }

    protected static class OperationMultiplication implements Operation {
        @Override
        public String with(int n1, int d1, int n2, int d2) {
            int numerator = (n1 * n2);
            int denominator = d1 * d2;
            return String.format("%d/%d", numerator, denominator);
        }
    }

    protected static class OperationDivision implements Operation {
        @Override
        public String with(int n1, int d1, int n2, int d2) {
            int numerator = (n1 * d2);
            int denominator = n2 * d1;
            return String.format("%d/%d", numerator, denominator);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int quantity = Integer.valueOf(sc.nextLine());
        while (quantity-- > 0) {
            String s = sc.nextLine();
            List<String> valuesToOperation = breakString(s);
            System.out.println(withList(valuesToOperation));
        }
    }


    public static String with(String operation, int n1, int d1, int n2, int d2) {
        Operation op = operation(operation);
        String operationCalc = op.with(n1, d1, n2, d2);
        return String.format("%s = %s", operationCalc, mdc(operationCalc));
    }

    public static String withList(List<String> values) {
        String operation = values.get(2);
        int n1 = Integer.valueOf(values.get(0));
        int d1 = Integer.valueOf(values.get(1));
        int n2 = Integer.valueOf(values.get(3));
        int d2 = Integer.valueOf(values.get(4));

        return with(operation, n1, d1, n2, d2);
    }


    public static String mdc(String s) {

        String[] values = s.split("/");
        int numerator = Math.abs(Integer.valueOf(values[0]));
        int denominator = Math.abs(Integer.valueOf(values[1]));
        List<Integer> divsN = divisors(numerator);
        List<Integer> divsD = divisors(denominator);
        int max = findMaxComum(divsN, divsD);


        return s.contains("-") ? String.format("-%d/%d", numerator / max, denominator / max) : String.format("%d/%d", numerator / max, denominator / max);
    }

    private static int findMaxComum(List<Integer> divsN, List<Integer> divsD) {
        int max = -1;
        if (divsN.size() > divsD.size()) {
            Collections.sort(divsN, Collections.reverseOrder());
            for (Integer number : divsN) {
                if (divsD.contains(number)) {
                    max = number;
                    break;
                }
            }
        } else {
            Collections.sort(divsD, Collections.reverseOrder());
            for (Integer number : divsD) {
                if (divsN.contains(number)) {
                    max = number;
                    break;
                }
            }
        }
        return max;
    }

    public static List<Integer> divisors(int number) {
        List<Integer> result = new ArrayList<>();

        for (int x = 1; x <= Math.sqrt(number); x++) {
            if (number % x == 0) {
                result.add(x);
                result.add(number / x);
            }
        }

        return result;
    }

}
