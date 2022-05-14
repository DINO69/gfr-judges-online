package br.com.guifr.hackerrank.preparationkit.threemonth.weektwo;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public static final int MULTIPLE = 5;
    public static final int NOT_ROUND_LESS_THAN = 38;

    public static int finalGrade(int grade) {
        if(grade < NOT_ROUND_LESS_THAN) return grade;
        int modFive = grade % MULTIPLE;
        int diff = MULTIPLE - modFive;
        int result = grade + ( diff < 3 ? diff : 0 );
        return result;
    }

    public static List<Integer> finalGradeAll(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();
        for(Integer grade : grades){
            result.add(finalGrade(grade));
        }
        return result;
    }
}
