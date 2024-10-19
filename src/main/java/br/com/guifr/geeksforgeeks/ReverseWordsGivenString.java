package br.com.guifr.geeksforgeeks;

import org.junit.platform.commons.util.ToStringBuilder;

import java.util.Stack;

//https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1
public class ReverseWordsGivenString {

    public static String reverseWordsDirect(String s) {

        StringBuilder word = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '.'){
                result.insert(0,word).insert(0,".");
                word = new StringBuilder();
            }else{
                word.append(c);
            }
        }
        result.insert(0,word);
        return result.toString();

    }


    public static String reverseWordsWithStack(String s) {

        Stack<String> stack = new Stack<>();

        StringBuilder word = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '.'){
                stack.push(word.toString());
                word = new StringBuilder();
            }else{
                word.append(c);
            }
        }
        stack.push(word.toString());

        StringBuilder result = new StringBuilder(stack.pop());
        while(!stack.isEmpty()){
            result.append(".");
            result.append(stack.pop());
        }
        return result.toString();

    }


    public static String reverseWords(String s) {
        String[] values = s.split("\\.");
        StringBuilder result = new StringBuilder(values[values.length-1]);
        for(int i = values.length-2; i >= 0;i--){
            result.append(".");
            result.append(values[i]);
        }
        return result.toString();
    }
}
