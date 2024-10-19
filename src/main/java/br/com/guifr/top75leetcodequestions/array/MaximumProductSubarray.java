package br.com.guifr.top75leetcodequestions.array;

public class MaximumProductSubarray {

    public int maxProduct(int[] nums) {

        int result = nums[0];
        int resultLeft = 1;
        int resultRight = 1;

        for(int i = 0 ; i < nums.length ; i++){
            int n = nums[i];

            if(resultLeft == 0) resultLeft = 1;
            resultLeft *= n;


            //resultLeft = Math.max(resultLeft,n);
            if(resultRight == 0) resultRight = 1;
            resultRight *= nums[nums.length - i - 1];


            //resultRight = Math.max(resultRight,n);

            result = Math.max(result,Math.max(resultLeft,resultRight));

        }

        return result;
    }

}
