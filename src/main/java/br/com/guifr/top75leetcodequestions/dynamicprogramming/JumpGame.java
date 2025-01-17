package br.com.guifr.top75leetcodequestions.dynamicprogramming;

public class JumpGame {

    public static boolean canJump(int[] nums) {

        int[] visited = new int[nums.length + 1];
        boolean result = canJump(nums,0, visited);

        return result;
    }

    private static boolean canJump(int[] nums, int start, int[] visited) {
        if(start == nums.length - 1) return true;
        if(start >= nums.length) return false;
        if(visited[start] > 0) return true;

        if(visited[start] < 0) return false;
        if(nums[start] == 0) return false;

        int amount = nums[start];

        boolean result = false;

        while( amount > 0 && !result){
            result = canJump(nums,start + amount, visited);
            amount--;
        }

        visited[start] = result ? 1 : -1;

        return result;
    }

}
