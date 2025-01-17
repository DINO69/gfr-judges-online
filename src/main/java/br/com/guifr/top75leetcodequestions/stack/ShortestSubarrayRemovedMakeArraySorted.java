package br.com.guifr.top75leetcodequestions.stack;

import java.util.Stack;

public class ShortestSubarrayRemovedMakeArraySorted {

    public static void main(String[] args) {
        System.out.println(findLengthOfShortestSubarray(new int[]{1,2,3,10,4,2,3,5}));
    }

    public static int findLengthOfShortestSubarray(int[] arr) {

        Stack<Integer> order = new Stack<>();
        order.push(arr[0]);

        for(int i = 1; i < arr.length;i++){

            while(!order.isEmpty() && order.peek() > arr[i]){
                order.pop();
            }

            order.push(arr[i]);

        }

        System.out.println(order);

        return arr.length - order.size();

    }

}
