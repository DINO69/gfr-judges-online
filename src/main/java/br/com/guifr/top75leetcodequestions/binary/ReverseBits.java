package br.com.guifr.top75leetcodequestions.binary;

public class ReverseBits {
    public int reverseBits(int n) {
        int result = 0;
        for(int i = 0; i < 32; i++){
            result <<= 1;
            if((n & 1) == 1) result++;
            n >>= 1;
        }
        return result;
    }

    public int reverseBitsCrazy(int num) {

        num = ((num & 0xffff0000) >>> 16) | ((num & 0x0000ffff) << 16);//32
        num = ((num & 0xff00ff00) >>> 8) | ((num & 0x00ff00ff) << 8);//16
        num = ((num & 0xf0f0f0f0) >>> 4) | ((num & 0x0f0f0f0f) << 4);//8
        num = ((num & 0xcccccccc) >>> 2) | ((num & 0x33333333) << 2);//4
        num = ((num & 0xaaaaaaaa) >>> 1) | ((num & 0x55555555) << 1);//2

        return num;

    }

    public static void main(String[] args) {
        ReverseBits reverseBits = new ReverseBits();
        System.out.println(reverseBits.reverseBits(-3));
    }

}
