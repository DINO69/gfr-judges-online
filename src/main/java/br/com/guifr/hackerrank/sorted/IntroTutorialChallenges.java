package br.com.guifr.hackerrank.sorted;

import java.util.List;

public class IntroTutorialChallenges {


    public static int indexAt(int number, List<Integer> arr) {

        int index = 0;

        /*for(;index < arr.size();index++){
            if(arr.get(index) == number){
                break;
            }
        }*/

        for(Integer n : arr){
            if(arr.get(index) == number){
                break;
            }
            index++;
        }

        return index;
    }

    public static int indexAtBinarySearch(int V, List<Integer> arr) {

        int start = 0;
        int end = arr.size() - 1;

        while(start <= end){
            int mid = (start + end) / 2;
            if(arr.get(mid) == V){
                return mid;
            }
            if(arr.get(mid) > V){
                end = mid - 1;
            }else{
                start = mid + 1;
            }

        }

        return -1;
    }
}
