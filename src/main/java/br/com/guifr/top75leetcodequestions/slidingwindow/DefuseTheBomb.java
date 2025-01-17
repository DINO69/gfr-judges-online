package br.com.guifr.top75leetcodequestions.slidingwindow;

public class DefuseTheBomb {

    public int[] decrypt(int[] code, int k) {

        int[] result = new int[code.length];
        if ( k == 0) return result;

        int left,right;

        if(k > 0){
            left = 1;
            right = k;
        }else{
            left = code.length + k;
            right = code.length - 1;
        }

        int sum = 0;
        int tempLeft = left;
        while(tempLeft <= right){
            sum += code[tempLeft];
            tempLeft++;
        }


        for(int i = 0; i < code.length;i++){

            result[i] = sum;

            right = (right + 1) % code.length;

            sum = sum - code[left] + code[right];

            left = (left + 1) % code.length;

        }

        return result;
    }

}
