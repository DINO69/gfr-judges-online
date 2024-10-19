package br.com.guifr.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StringCompression {


    public static int compress(char[] chars) {

        int result = 0;
        for(int i = 0; i < chars.length; i++){
            int read = chars[i];
            int amount = 1;
            chars[result] = chars[i];
            result++;
            while (i+1 < chars.length && chars[i+1] == read){
                amount++;
                i++;
            }
            if(amount > 1){
                Stack<Character> stack = new Stack<>();
                while(amount > 0){
                    stack.push(String.valueOf(amount % 10).charAt(0));
                    amount /= 10;
                }
                while(!stack.isEmpty()){
                    chars[result] = stack.pop();
                    result++;
                }
            }
        }

        System.out.println(result);

        return result;

    }
}
