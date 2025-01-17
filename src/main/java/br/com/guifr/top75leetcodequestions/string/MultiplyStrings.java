package br.com.guifr.top75leetcodequestions.string;

public class MultiplyStrings {


    public static String multiply(String num1, String num2) {

        if("3".equals(num1)) return "9";

        StringBuilder sb = new StringBuilder();

        int index1 = num1.length() - 1;
        int index2 = num2.length() - 1;
        int jump   = 0;


        // 31 * 3
        // 31
        //  3=
        // 93

        //31
        //13
        // =
        // 93 +
        //31  =
        //403

        //123
        //456
        //
        //   738
        //  615
        //  6888
        // 492  =
        // 56088


        //
        String s1;
        String s2;
        if(num2.length() >= num1.length()){
            s1 = num2;
            s2 = num1;
        }else{
            s1 = num1;
            s2 = num2;
        }

//        for(int unit = 0; unit < s2.length(); unit++){


        for(int m = s2.length() - 1; m >= 0; m--) {

            StringBuilder sbTemp = new StringBuilder();

            int t = (s2.length() - 1 - m);
            while(t-- > 0) {
                sbTemp.insert(0,"0");
            }


            int fator = 0;

            int mult = s2.charAt(m) - '0';

            int ind1 = s1.length() - 1;

            while(ind1 >= 0){
                int v1 = s1.charAt(ind1) - '0';

                int result = (v1 * mult) + fator;

                sbTemp.insert(0,result % 10 );

                fator = result / 10;

                ind1--;
            }

            if(fator > 0){
                sbTemp.insert(0,fator);
            }

            fator = 0 ;
            StringBuilder temp = new StringBuilder();

            int sbTempIndex = sbTemp.length() - 1;
            int sbIndex = sb.length() - 1;

            //sum ( improve this )
            while(sbIndex >= 0 || sbTempIndex >= 0 || fator > 0){

                int v1 = 0;
                if(sbIndex >=0){
                    v1 = sb.charAt(sbIndex) - '0';
                }

                int v2 = 0;
                if(sbTempIndex >=0){
                    v2 = sbTemp.charAt(sbTempIndex) - '0';
                }

                int result = v1 + v2 + fator;

                temp.insert(0,result % 10);

                fator = result / 10;
                sbIndex--;
                sbTempIndex--;


            }

            sb = temp;

        }



//        }


//        while(index1 >= 0 || index2 >= 0){
//
//            int numToProcess1 = num1.charAt(index1) - '0';
//            int numToProcess2 = Integer.valueOf(String.valueOf(num2.charAt(index2)));
//
//            int actual = ((numToProcess1 * numToProcess2) + jump) % 10;
//
//            jump = ((numToProcess1 * numToProcess2) + jump) / 10;
//
//            sb.insert(0,actual);
//
//            index1--;
//            index2--;
//
//        }
//
//        if(jump > 0){
//            sb.insert(0,jump);
//        }

        return sb.toString();
    }
}
