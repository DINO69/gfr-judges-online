package br.com.guifr.top75leetcodequestions.dynamicprogramming;

public class JumpGameTwo {

    public static int jump(int[] nums) {

        int[] visited = new int[nums.length + 1];
        for(int i = 0; i < visited.length; i++){
            visited[i] = Integer.MAX_VALUE;
        }
        int result = jump(nums,0,0,visited);
        return result != Integer.MAX_VALUE ? result : 0;

    }

    private static int jump(int[] nums, int start, int jumps, int[] visited) {

        if(start >= nums.length) return Integer.MAX_VALUE;

        visited[start] = Math.min(jumps,visited[start]);

        if(start == nums.length - 1) {
            return visited[start];
        }

        if(nums[start] <= 0) return Integer.MAX_VALUE;

        if(visited[start] == -1) return Integer.MAX_VALUE;


        int amount = nums[start];

        int result = Integer.MAX_VALUE;

        while(amount > 0 && jumps < visited[nums.length - 1]){
            int min = jump(nums, start + amount, visited[start] + 1, visited);
            result = Math.min(result,min);
            amount--;
        }

        if(result == Integer.MAX_VALUE) visited[start] = -1;

        return result;
    }

}
