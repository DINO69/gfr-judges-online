package br.com.guifr.hackerrank.preparationkit.threemonth.weeknine;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Waiter {

    public static void main(String[] args) {

        String patterFrom = "(\\{\\{ticket\\.organization\\.custom_fields\\.)(.*\\}\\})";
        String patterTo = "{{ticket.organization.metadata.*}}";
        Pattern compile = Pattern.compile(patterFrom, Pattern.CASE_INSENSITIVE);
        Matcher matcher = compile.matcher("{{ticket.organization.custom_fields.poc_name}}");
        String ssss = matcher.replaceAll(patterTo);
        System.out.println(ssss);


        
        int a = 10;
        int b = 7;
        int c = a & b;
        System.out.println(c);

        String sa = "a.b.g.d";
        String sb = "a.b.e.d";
        String regexFrom = "a.b.\\S";
        String regexTo = "a.b.c";

        Pattern p = Pattern.compile("a.b.g.d", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(sa);
        String s1 = m.replaceAll("a.b.c.d");

        p = Pattern.compile("a.b.e.d", Pattern.CASE_INSENSITIVE);
        m = p.matcher(sb);
        String s2 = m.replaceAll("a.b.c.d");

        p = Pattern.compile(regexFrom, Pattern.CASE_INSENSITIVE);
        m = p.matcher(sa);
        String s3 = m.replaceAll(regexTo);
        m = p.matcher(sb);
        String s4 = m.replaceAll(regexTo);

        System.out.println(sa);
        System.out.println(sb);

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s3);
        System.out.println(s4);

    }

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
