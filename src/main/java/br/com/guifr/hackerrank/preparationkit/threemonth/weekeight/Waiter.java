package br.com.guifr.hackerrank.preparationkit.threemonth.weekeight;

import java.util.*;

public class Waiter {

    private static final List<Integer> numbersPrimes = new ArrayList<>(Arrays.asList(2,3,5,7,11,13));


    public static List<Integer> with(List<Integer> plates, int interations) {

        List<Integer> answers = new ArrayList<>();
        Deque<Integer> aToLoop = new ArrayDeque<>();

        toDeque(plates, aToLoop);

        Deque<Integer> a = new ArrayDeque<>();
        Deque<Integer> b = new ArrayDeque<>();
        for(int i = 0; i < interations; i++){
            a = new ArrayDeque<>();
            b = new ArrayDeque<>();
            int numberPrime = getNumberPrime(i);

            while(!aToLoop.isEmpty()){
                int plate = aToLoop.peek();
                if(plate % numberPrime == 0){
                    b.push(aToLoop.pop());
                }else{
                    a.push(aToLoop.pop());
                }
            }
            addDequeToList(b,answers);
            aToLoop = a;
        }

        addDequeToList(b,answers);
        addDequeToList(a,answers);


        return answers;
    }

    private static void addDequeToList(Deque<Integer> from, List<Integer> to) {
        while(from.peek() != null){
            to.add(from.pop());
        }
    }

    protected static int getNumberPrime(int index) {
        while(numbersPrimes.size() <= index){
            int nextPrime = numbersPrimes.get(numbersPrimes.size()-1) + 1;
            while(!isPrimeNumber(nextPrime)){
                nextPrime++;
            }
            numbersPrimes.add(nextPrime);
        }

        return numbersPrimes.get(index);
    }

    private static boolean isPrimeNumber(int nextPrime) {
        for(int div = 2; div <= Math.sqrt(nextPrime);div++){
            if(nextPrime % div == 0) return false;
        }
        return true;
    }

    private static void toDeque(List<Integer> plates, Deque<Integer> a) {
        for(Integer plate : plates){
            a.push(plate);
        }
    }
}
