package br.com.guifr.beecrowd;

import java.util.*;


public class JosephsCousin {

    private int amountPeople;

    private static Set<Integer> cousins = new LinkedHashSet<>();
    static {
        cousins.add(2);
        cousins.add(3);
        cousins.add(5);
        cousins.add(7);
        cousins.add(11);
        cousins.add(13);
        cousins.add(17);
    }

    public JosephsCousin(int amountPeople) {
        this.amountPeople = amountPeople;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        while(number != 0){
            System.out.println(withPeople(number).saving());
            number = sc.nextInt();
        }

    }

    public static JosephsCousin withPeople(int amountPeople) {
        return new JosephsCousin(amountPeople);
    }

    public static boolean isCousin(int number) {
        if (number < 2) {
            return false;
        }

        if(cousins.contains(number)){
            return true;
        }

        for(int cousin : cousins){
            int result = number / cousin;
            if (number % cousin == 0) {
                return false;
            }
            if(result < cousin){
                break;
            }
        }

        cousins.add(number);
        return true;
    }

    public static int howManyOne(int[] arrays) {
        long count = Arrays.stream(arrays)
                .filter(n -> n == 1)
                .count();
        return (int) count;
    }

    public static int firstPositionHasOne(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == 1) {
                return i + 1;
            }
        }
        return -1;
    }

    public static int nextCousin(int number) {
        while(!isCousin(++number)){
        }
        return number;
    }

    public int saving() {

        if(amountPeople < 4){
            return 1;
        }

        No no = No.initialNo(amountPeople);
        no = no.next;
        no.blacked();

        int cousin = 2;

        for (int i = 2; i <= amountPeople; i++) {

            if (amountPeople == i) {
                //return firstPositionHasOne(people);
                return no.next.number;
            }

            cousin = nextCousin(cousin);

            int countCousin = cousin;

            while (countCousin-- > 0) {
                no = no.next;
            }
            no.blacked();
        }

        return -1;
    }
}
