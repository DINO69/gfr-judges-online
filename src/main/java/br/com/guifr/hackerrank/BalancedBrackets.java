package br.com.guifr.hackerrank;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;

public class BalancedBrackets {


    public static String of(String s) {

        HashMap<Character,Character> openClose = new HashMap<>();
        openClose.put('{','}');
        openClose.put('(',')');
        openClose.put('[',']');

        Deque<Character> stack = new ArrayDeque<>();

        for(int x = 0; x < s.length();x++){
            if (openClose.get(s.charAt(x)) != null){
                stack.push(s.charAt(x));
            }else{

                if(stack.isEmpty() || openClose.get(stack.peek()) !=  s.charAt(x)){
                    return "NO";
                }
                stack.pop();
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        while(!line.equals("exit")){
            System.out.println(of(line));
            line = sc.nextLine();
        }
    }
}
