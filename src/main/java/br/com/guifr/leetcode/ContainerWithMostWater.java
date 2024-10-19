package br.com.guifr.leetcode;

public class ContainerWithMostWater {


    public int maxArea(int[] height) {
        int result = 0;

        for(int i = 0; i < height.length; i++){
            for(int j = i+1; j < height.length; j++){
                int area = (j-i) * Math.min(height[i], height[j]);
                if(area > result){
                    result = area;
                }
            }
        }

        return result;
    }

    public int maxAreaOn(int[] height) {
        int firstIndex = 0;
        int secondIndex = 1;
        int result = 1 * Math.min(height[0], height[1]);
        if(height.length == 2) return result;

//        2 x 1 = 2
//        6 x 1 = 6 [8]1 e [6]2
//        2 x 2 = 4
//        3 x 5 = 15 [8]1 e [5] 4
//        2 x 5 = 10
//        4 x 4 = 16 [8]1 e [4]5
//        8 x 5 = 40 [8]1 e [8]6
//        7 x 2 = 14
//        7 X 7 = 49 [8]1 e [7]8

        for(int i = 2; i < height.length; i++){

            //compare with first
            int distanceFirst = i - firstIndex;
            int areaFirst = distanceFirst * Math.min(height[firstIndex], height[i]);
            int distanceSecond = i - secondIndex;
            int areaSecond = distanceSecond * Math.min(height[secondIndex], height[i]);
            if(areaFirst > areaSecond) {
                if (areaFirst > result) {
                    result = areaFirst;
                    secondIndex = i;
                }
            }else{
                if (areaSecond > result) {
                    result = areaSecond;
                    firstIndex = i;
                }
            }

        }



        return result;
    }

    public int maxAreaextremities(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

}
