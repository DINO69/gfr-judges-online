package br.com.guifr.top75leetcodequestions.array;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {

        int result = 0;

        for(int i = 0; i < height.length; i++){
            for(int j = i + 1; j < height.length; j++){

                int length = j - i;
                int h = Math.min(height[i],height[j]);

                int process = length * h;

                result = Math.max(process,result);

            }

        }

        return result;
    }

    public static int maxArea2(int[] height) {

        int start = 0;
        int end = height.length - 1;

        int result = 0;

        while(start < end){

            int minHeight = Math.min(height[start],height[end]);
            int length = end - start;
            int process = minHeight * length;
            result = Math.max(process,result);
            if(height[start] > height[end]) end--;
            else start++;

        }

        return result;
    }
}
