package br.com.guifr.leetcode;

import org.junit.platform.commons.util.StringUtils;

import java.util.List;
import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {//TODO REFACTOR
        char[] charArray = s.toCharArray();
        List<Character> numbers = List.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
        Character bracketOpen = '[';
        Character bracketClose = ']';
        Stack<Integer> numbersStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        StringBuilder temp = new StringBuilder();
        StringBuilder result = new StringBuilder();
        Boolean lastIsNumber = false;
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (numbers.contains(c)) {
                int numericValue = Character.getNumericValue(c);
                if (lastIsNumber) {
                    int lastNumber = numbersStack.pop();
                    numericValue = lastNumber * 10 + numericValue;
                }
                numbersStack.push(numericValue);
                lastIsNumber = true;
                continue;
            }
            lastIsNumber = false;
            if (bracketOpen.equals(c)) {
                stringStack.push(temp.toString());
                temp = new StringBuilder();
                continue;
            }
            if (bracketClose.equals(c)) {
                int multiplier = numbersStack.pop();
                String string = stringStack.pop();
                String tempResult = temp.toString().repeat(multiplier);
                temp = new StringBuilder(string.concat(tempResult));
                if(numbersStack.isEmpty()){
                    result.append(temp);
                    temp = new StringBuilder();
                }
//                temp = new StringBuilder(string);
                continue;
            }
            temp.append(c);
        }

        return result.toString().concat(temp.toString());
    }
}
