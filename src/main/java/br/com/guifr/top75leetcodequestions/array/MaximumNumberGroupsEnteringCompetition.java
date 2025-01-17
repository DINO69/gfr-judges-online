package br.com.guifr.top75leetcodequestions.array;

import java.util.Arrays;

public class MaximumNumberGroupsEnteringCompetition {

    public int maximumGroups2(int[] grades) {
        int k = 0, total = 0, n = grades.length;
        while (total + k + 1 <= n)
            total += ++k;
        return k;
    }

    public int maximumGroups3(int[] A) {
        int left = 0, right = 1000, n = A.length;
        while (left < right) {
            int k = (left + right + 1) / 2;
            if (k * (k + 1) / 2 > n) {
                right = k - 1;
            } else {
                left = k;
            }
        }
        return left;
    }

    public int maximumGroups4(int[] A) {
        return (int)(Math.sqrt(A.length * 2 + 0.25) - 0.5);
    }

    public static int maximumGroups(int[] grades) {

        Arrays.sort(grades);

        if(grades.length <= 2) return 1;
        if(grades.length <= 4) return 2;

        // 3 / 5 / 6 / 7 / 10 / 12
        // 1 -> 12
        // 2 -> 10 + 3
        // 3 -> 7 + 5 + 6 -> 18

        //[2,31,41,31,36,46,33,45,47,8,31,6,12,12,15,35]
        //[02,06,08,12,12,15,31,31,31,33,35,36,41,45,46,47]

        // 1 -> 02,06,08,12,12,15,31
        // 2 -> 31,31,33,35,36,41,45,46,47

        // 1 - 47 = 47
        // 2 - 46 + 02 = 48
        // 3 - 45 + 06 + 08 = 59
        // 4 - 41 + 12 + 12 + 15 = 80
        // 5 - 36 + 31 + 31 + 31  + 33 + 45 = 197

        int last       = grades.length - 1;
        int init       = 0;

        int quantity   = 0;// think anout with to stat
        int processQuantity = 0;

        int amount = 0;
        int processAmount = 0;
        int groups = 0;

        System.out.println(Arrays.toString(grades));

        while(init < last){

            processQuantity = 1;
            processAmount = grades[last];

            init = 0;
            int firstInitWithValue = -1;

            while(init < last && (processAmount <= amount || processQuantity <= quantity) ){
                if(grades[init] == 0) {
                    init++;
                    continue;
                }else{
                    if(firstInitWithValue == -1){
                        firstInitWithValue = init;
                    }
                }

                if(processAmount + grades[init] <= amount && init + 1 < last) {
                    init++;
                    continue;
                }else{
                    if(init + 1 == last){
                        init = firstInitWithValue;
                    }
                }

                processAmount += grades[init];
                grades[init] = 0;

                init = 0;
                firstInitWithValue = -1;

                processQuantity++;

            }

            if(processAmount > amount && processQuantity > quantity) {
                quantity = processQuantity;
                amount = processAmount;

                System.out.println(quantity);
                System.out.println(amount);

                groups++;
            }

            last--;
        }

        return groups;

    }

    //[4, 12, 16, 19, 23, 25, 26, 26, 30, 30, 32, 36]


    //1 -> 36
    //2 -> 32 + 04 + 12
    //3 -> 30 + 16 + 19 + 23
    //4 -> 30 + 25 + 26 + 26 [04]

    //1 -> 36
    //2 -> 32 + 12
    //3 -> 30 + 04 + 16 + 19
    //4 -> 30 + 23 + 25 + 26 + 26

}
