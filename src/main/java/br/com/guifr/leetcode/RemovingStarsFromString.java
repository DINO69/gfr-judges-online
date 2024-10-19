package br.com.guifr.leetcode;

import org.jetbrains.annotations.NotNull;

import java.util.Stack;

public class RemovingStarsFromString {


    public String removeStars(String s){

        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c != '*') {
                stack.push(c);
                continue;
            }
            if(!stack.isEmpty()){
                stack.pop();
            }
        }

        return toString(stack);
    }

    private static String toString(Stack<Character> stack) {
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            result.insert(0, stack.pop());
        }
        return result.toString();
    }

}
