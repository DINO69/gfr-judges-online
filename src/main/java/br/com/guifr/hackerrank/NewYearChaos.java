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
        int diff = 0;
        for(int x = 0; x < asList.size(); x++){

            int manyBribes = 0;
            int person = asList.get(x);
            for(int nextX = x + 1; nextX < asList.size(); nextX++){
                if(person > asList.get(nextX)) {
                    manyBribes++;
                    if (manyBribes > 2)
                        return "Too chaotic";
                }
            }

            bribes += manyBribes;

        }

        return String.valueOf(bribes);
    }
}
