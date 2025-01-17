package br.com.guifr.top75leetcodequestions.slidingwindow;

public class TakeKEachCharacterFromLeftAndRight {

    public static void main(String[] args) {
        System.out.println(takeCharacters("aabaaaacaabc",2));
    }

    public static int takeCharacters_O_N(String s, int k) {
        if(k == 0 )
            return 0;

        int[] chars = new int[3];

        int right = s.length() - 1;

        int result = Integer.MAX_VALUE;


        while (right >= 0 && (chars[0] < k || chars[1] < k  || chars[2] < k )) {
            char cRight = s.charAt(right--);
            chars[cRight - 'a']++;
        }

        if(chars[0] < k || chars[1] < k || chars[2] < k) return -1;

        int left = 0;

        while(right < s.length() - 1) {

            result = Math.min(result, chars[0] + chars[1] + chars[2]);
            chars[s.charAt(++right) - 'a']--;

            while (chars[0] < k || chars[1] < k || chars[2] < k) {
                chars[s.charAt(left++) - 'a']++;
            }

        }

        result = Math.min(result, chars[0] + chars[1] + chars[2]);

        return result != Integer.MAX_VALUE ? result : -1;

    }

    public static int takeCharacters_O_N_BCK(String s, int k) {
        if(k == 0 )
            return 0;


        int[] charsLeft  = new int[3];
        int[] charsRight = new int[3];
        int[] charsBoth = new int[3];

        int left = 0;
        int right = s.length() - 1;

        int result = Integer.MAX_VALUE;

        while(right >= 0){

            char cLeft = s.charAt(left);
            char cRight = s.charAt(right);

            charsBoth[cLeft - 'a']++;
            charsBoth[cRight - 'a']++;

            charsLeft[cLeft - 'a']++;
            charsRight[cRight - 'a']++;

            if(left >= right){
                //charsLeft[cLeft - 'a']++;
                charsBoth[cLeft - 'a']--;//duplicate left already count when left == right
                charsBoth[cRight - 'a']--;//duplicate left already count when left == right
            }

            if(charsLeft[0] >= k && charsLeft[1] >= k && charsLeft[2] >= k){
                result = Math.min(result,charsLeft[0] + charsLeft[1] + charsLeft[2]);
//                return result;
            }

            if(charsRight[0] >= k && charsRight[1] >= k && charsRight[2] >= k){
                result = Math.min(result,charsRight[0] + charsRight[1] + charsRight[2]);
//                return result;
            }

            if(charsBoth[0] >= k && charsBoth[1] >= k && charsBoth[2] >= k){
                int auxDirection = left;
                char cAux;
                int[] keepBoth = new int[]{charsBoth[0],charsBoth[1],charsBoth[2]};
                while(auxDirection >= 0 && charsBoth[0] >= k && charsBoth[1] >= k && charsBoth[2] >= k) {
                    result = Math.min(result, charsBoth[0] + charsBoth[1] + charsBoth[2]);
                    cAux = s.charAt(auxDirection);
                    charsBoth[cAux - 'a']--;
                    auxDirection--;
                }

                auxDirection = right;
                charsBoth = keepBoth;
                keepBoth = new int[]{charsBoth[0],charsBoth[1],charsBoth[2]};
                while(auxDirection < s.length() - 1 && charsBoth[0] >= k && charsBoth[1] >= k && charsBoth[2] >= k) {
                    result = Math.min(result, charsBoth[0] + charsBoth[1] + charsBoth[2]);
                    cAux = s.charAt(auxDirection);
                    charsBoth[cAux - 'a']--;
                    auxDirection++;
                }
                charsBoth = keepBoth;
            }


            left++;
            right--;
        }


        return result != Integer.MAX_VALUE ? result : -1;

    }

    public static int takeCharactersHashMap(String s, int k) {
        if(k == 0 )
            return 0;

        int[] chars = new int[3];

        int result = Integer.MAX_VALUE;

        for(int i = 0; i < s.length();i++){
            chars = new int[3];
            for(int j = 0; j < s.length();j++) {
                if(j < i) continue;
                char c = s.charAt(j);
                chars[c - 'a']++;
                if ((i==0 || j == s.length() - 1) && chars[0] >= k && chars[1] >= k && chars[2] >= k) {
                    result = Math.min(result, chars[0] + chars[1] + chars[2]);
                }
            }
            int aux = 0;
            while(aux < i && (chars[0] < k || chars[1] < k || chars[2] < k)){
                chars[s.charAt(aux)-'a']++;
                aux++;
            }
            if (chars[0] >= k && chars[1] >= k && chars[2] >= k) {
                result = Math.min(result, chars[0] + chars[1] + chars[2]);
            }

        }

        return result != Integer.MAX_VALUE ? result : -1;

    }

    public static int takeCharacters(String s, int k) {
        if(k == 0 )
            return 0;

        int[] chars = new int[3];

        for(Character c : s.toCharArray()){
            chars[c-'a']++;
        }

        int result = 0;

        // if some amount letters a, b, c is invalid ( < k )
        for(int amountC : chars){
            if(amountC < k) return -1;
            result+=amountC;
        }

        int run = 0;

        for(int i = 0; i < s.length() ; i++){

            chars[s.charAt(i)-'a']--;

            while(chars[0] < k || chars[1] < k || chars[2] < k){
                result = Math.min(result,chars[0]+chars[1]+chars[2] + 1);
                while(s.charAt(run) != s.charAt(i)){
                    chars[s.charAt(run)-'a']++;
                    run++;
                }
                run++;
                chars[s.charAt(i)-'a']++;
            }

        }
        result = Math.min(result,chars[0]+chars[1]+chars[2]);


        return result;

    }


    public static int takeCharacters2(String s, int k) {
        int[] arr=new int[3];
        // count all the frq of string
        for(char ch:s.toCharArray()) arr[ch-'a']++;

        // if total frq of any char is less than k return -1;
        if(arr[0]<k||arr[1]<k||arr[2]<k) return -1;
        int ans=arr[0]+arr[1]+arr[2];
        int st=0;

        for(char ch:s.toCharArray()){
            arr[ch-'a']--;

            // if any char length is less than k then increase start position
            if(arr[0]<k||arr[1]<k||arr[2]<k){
                //get the min ans
                ans=Math.min(arr[0]+arr[1]+arr[2]+1,ans);
                while(s.charAt(st)!=ch){
                    arr[s.charAt(st)-'a']++;
                    st++;
                }
                arr[ch-'a']++;
                st++;
            }
        }
        ans=Math.min(arr[0]+arr[1]+arr[2],ans);

        return ans;
    }

}
