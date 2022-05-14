package br.com.guifr.hackerrank.preparationkit.threemonth.weektwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class GradingStudentsTest {

    @Test
    @DisplayName("Return 85 When round grade to next multiple 5 is less than 3 With grade 84")
    public void test1() {
        int grade = 84;
        int actual = GradingStudents.finalGrade(grade);
        Assertions.assertEquals(85,actual);
    }

    @Test
    @DisplayName("Return 85 When round grade to next multiple 5 is less than 3 With grade 83")
    public void test2() {
        int grade = 83;
        int actual = GradingStudents.finalGrade(grade);
        Assertions.assertEquals(85,actual);
    }

    @Test
    @DisplayName("Return 82 When do not round grade because the diff next multiple 5 is more than 3 With grade 82")
    public void test3() {
        int grade = 82;
        int actual = GradingStudents.finalGrade(grade);
        Assertions.assertEquals(82,actual);
    }

    @Test
    @DisplayName("Return 29 When do not round grade because grade less 38 With grade 29")
    public void test4() {
        int grade = 29;
        int actual = GradingStudents.finalGrade(grade);
        Assertions.assertEquals(29,actual);
    }

    @Test
    @DisplayName("Return 57 When do not round grade because the diff next multiple 5 is more than 3 With grade 57")
    public void test5() {
        int grade = 57;
        int actual = GradingStudents.finalGrade(grade);
        Assertions.assertEquals(57,actual);
    }


    @Test
    @DisplayName("Return [85,85,82,29,57] When process all grades With [84,83,82,29,57]")
    public void testList1() {
        List<Integer> actual = GradingStudents.finalGradeAll(Arrays.asList(84,83,82,29,57));
        Assertions.assertTrue(Arrays.asList(85,85,82,29,57).equals(actual),"Final grade correct");
    }

}