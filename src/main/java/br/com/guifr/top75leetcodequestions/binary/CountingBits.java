package br.com.guifr.top75leetcodequestions.binary;

public class CountingBits {

    public int[] countBits(int n) {
        if(n == 0) return new int[]{0};

        int[] result = new int[n + 1];
        result[0] = 0;
        result[1] = 1;

        for(int num = 2; num <= n;num++){
            int analysis = num;

            while(analysis > 0){
                if(analysis % 2 == 1) result[num]++;
                analysis = analysis / 2;
            }

        }

        return result;

    }
    public int[] countBitsBest(int n) {
        if(n == 0) return new int[]{0};

        int[] result = new int[n + 1];
        result[0] = 0;
        result[1] = 1;

        for(int num = 2; num <= n;num++){
            result[num] = result[num >> 1] + (num & 1);

        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(new CountingBits().countBitsBest(9));
    }

}
