package br.com.guifr.hackerrank;

import java.util.List;

public class NewYearChaos {

    private List<Integer> asList;

    private NewYearChaos(List<Integer> asList) {
        this.asList = asList;
    }

    public static NewYearChaos queue(List<Integer> asList) {
        return new NewYearChaos(asList);
    }

    //TODO -> improve the algorithm because this not passed all test the judge per time limit exceeded
    public String howManyBribes() {

        int bribes = 0;
        for(int x = 0; x < asList.size(); x++){

            int manyBribes = 0;
            int person = asList.get(x);

            if(person - (x+1) > 2){
                return "Too chaotic";
            }

            for(int nextX = x + 1; nextX < asList.size(); nextX++){
                int nextPerson = asList.get(nextX);

                if(person > nextPerson) {
                    manyBribes++;
                    if (manyBribes > 2)
                        return "Too chaotic";
                }
            }

            bribes += manyBribes;

        }

        return String.valueOf(bribes);
    }


    public String calc() {
        int ans = 0;
        for (int i = asList.size() - 1; i >= 0; i--) {
            if (asList.get(i) - (i + 1) > 2) {
                return "Too chaotic";
            }
            for (int j = Math.max(0, asList.get(i) - 2); j < i; j++)
                if (asList.get(j) > asList.get(i)) ans++;
        }
        return String.valueOf(ans);
    }
}
