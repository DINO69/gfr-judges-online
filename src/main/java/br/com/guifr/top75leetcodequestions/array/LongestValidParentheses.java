package br.com.guifr.top75leetcodequestions.array;

import java.util.*;

public class LongestValidParentheses {

    //RESULT
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max_len = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    max_len = Math.max(max_len, i - stack.peek());
                }
            }
        }

        return max_len;
    }

    public static int execute(String s) {

        return  longestValidParentheses(s);

        //return processLongetValid(s,new HashMap<>());

    }

    private static int processLongetValid(String s, Map<String,Integer> results) {

        if(s.isEmpty()) return 0;

        if(results.containsKey(s)) return results.get(s);

        int max = 0;

        int process = 0;

        Deque<Character> stack = new ArrayDeque<>();


        int startIndex = 0;

        while(startIndex < s.length() && s.charAt(startIndex) != '('){
            startIndex++;
        }

        for(int i = startIndex; i < s.length(); i++){

            char c = s.charAt(i);

//            if(stack.isEmpty() && c == ')' && process == 0) continue;

            if(c == '('){
                max = Math.max(processLongetValid(s.substring(i+1),results),max);
                stack.push(c);
                continue;
            }

            //()(()

            if(stack.peek() != null && stack.peek() == '(' && c == ')'){
                stack.pop();

                if(stack.isEmpty())
                    process = i+1 - startIndex;

                max = Math.max(process,max);

            }else{

                stack.clear();
                process = 0;
                startIndex = i + 1;

                String alreadProcess = s.substring(startIndex);
                if(results.containsKey(alreadProcess)) return results.get(alreadProcess);


            }

        }

        max = Math.max(process, max);

        results.put(s,max);

        return max;
    }

}
