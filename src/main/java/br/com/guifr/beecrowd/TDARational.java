package br.com.guifr.beecrowd;

import java.io.IOException;
import java.util.*;

public class TDARational {

    protected static interface Operation {
        String with(int n1, int d1, int n2, int d2);
    }

    protected static class OperationSum implements Operation {
        @Override
        public String with(int n1, int d1, int n2, int d2) { // O(1)
            int numerator = (n1 * d2) + (n2 * d1);
            int denominator = d1 * d2;
            return String.format("%d/%d", numerator, denominator);
        }
    }

    protected static class OperationSubtraction implements Operation {
        @Override
        public String with(int n1, int d1, int n2, int d2) { // O(1)
            int numerator = (n1 * d2) - (n2 * d1);
            int denominator = d1 * d2;
            return String.format("%d/%d", numerator, denominator);
        }
    }

    protected static class OperationMultiplication implements Operation {
        @Override
        public String with(int n1, int d1, int n2, int d2) { // O(1)
            int numerator = (n1 * n2);
            int denominator = d1 * d2;
            return String.format("%d/%d", numerator, denominator);
        }
    }

    protected static class OperationDivision implements Operation {
        @Override
        public String with(int n1, int d1, int n2, int d2) { // O(1)
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


    public static String with(String operation, int n1, int d1, int n2, int d2) { // O(sqrt(n))
        Operation op = operation(operation); // O(1)
        String operationCalc = op.with(n1, d1, n2, d2); // O(1)
        return String.format("%s = %s", operationCalc, mdcLessComplexity(operationCalc)); // O(sqrt(n))

    }

    public static String withList(List<String> values) { // O(sqrt(n))
        String operation = values.get(2);
        int n1 = Integer.valueOf(values.get(0));
        int d1 = Integer.valueOf(values.get(1));
        int n2 = Integer.valueOf(values.get(3));
        int d2 = Integer.valueOf(values.get(4));

        return with(operation, n1, d1, n2, d2); // O(sqrt(n))
    }


    public static String mdc(String s) { // 2xO(sqrt(n)) + O(n2) = O(n2)

        String[] values = s.split("/");
        int numerator = Math.abs(Integer.valueOf(values[0]));
        int denominator = Math.abs(Integer.valueOf(values[1]));
        List<Integer> divsN = divisors(numerator); // O(sqrt(n))
        List<Integer> divsD = divisors(denominator); // O(sqrt(n))
        int max = findMaxComum(divsN, divsD); //O(n2)

        return s.contains("-") ? String.format("-%d/%d", numerator / max, denominator / max) : String.format("%d/%d", numerator / max, denominator / max);
    }

    public static String mdcLessComplexity(String s) { // O(sqrt(n))
        String[] values = s.split("/");
        int numerator = Math.abs(Integer.valueOf(values[0]));
        int denominator = Math.abs(Integer.valueOf(values[1]));
        int max = findMaxComumTogether(numerator, denominator); // O(sqrt(n))
        return s.contains("-") ? String.format("-%d/%d", numerator / max, denominator / max) : String.format("%d/%d", numerator / max, denominator / max);
    }

    private static int findMaxComum(List<Integer> divsN, List<Integer> divsD) { //O(n*log(n)) + O(n2) = O(n2)
        int max = -1;
        if (divsN.size() > divsD.size()) {
            Collections.sort(divsN, Collections.reverseOrder()); //O(n*log(n))
            for (Integer number : divsN) { // O(n) == O(n2)
                if (divsD.contains(number)) { // contains = O(n)
                    max = number;
                    break;
                }
            }
        } else {
            Collections.sort(divsD, Collections.reverseOrder()); //O(n*log(n))
            for (Integer number : divsD) { // O(n) == O(n2)
                if (divsN.contains(number)) { // contains = O(n)
                    max = number;
                    break;
                }
            }
        }
        return max;
    }

    public static List<Integer> divisors(int number) { // O(sqrt(n))
        List<Integer> result = new ArrayList<>();

        for (int x = 1; x <= Math.sqrt(number); x++) {
            if (number % x == 0) {
                result.add(x);
                result.add(number / x);
            }
        }

        return result;
    }

    public static Operation operation(String signal) { //O(1)
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

    public static List<String> breakString(String s) { // O (n + k)
        ArrayList<String> result = new ArrayList<>(Arrays.asList(s.split(" "))); // split = O (n + k)
        result.remove(1);
        result.remove(4);
        return result;
    }

    public static int findMaxComumTogether(int n, int d) { // O(sqrt(n))

        int numberMax,numberMin;
        if(n > d){
            numberMax = n;
            numberMin = d;
        }else{
            numberMax = d;
            numberMin = n;
        }

        int sqrtMax = (int) Math.sqrt(numberMax);
        int max = 1;

        for(int x = 1; x <= sqrtMax; x++){ // O(sqrt(n))
            if(numberMax%x == 0){
                int quo1 = x;
                int quo2 = numberMax/x;
                if(numberMin%quo1 == 0){
                    max = Math.max(quo1,max);
                }
                if(numberMin%quo2 == 0){
                    max = Math.max(quo2,max);
                }
            }
        }

        return max;
    }

}
