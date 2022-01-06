package br.com.guifr.beecrowd;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AverageTwoTest {

    @Test
    @DisplayName("Then return 'MEDIA = 6.3' when calculate average 5.0 , 6.0 and 7.0")
    public void test1(){
        StudentGrades studentGradesA = new StudentGrades(5.0,2.0);
        StudentGrades studentGradesB = new StudentGrades(6.0,3.0);
        StudentGrades studentGradesC = new StudentGrades(7.0,5.0);
        String actual = Average.of(studentGradesA,studentGradesB,studentGradesC).print(1);
        Assertions.assertEquals("MEDIA = 6.3\n", actual);
    }

    @Test
    @DisplayName("Then return 'MEDIA = 9.0' when calculate average 5.0 , 10.0 and 10.0")
    public void test2(){
        StudentGrades studentGradesA = new StudentGrades(5.0,2.0);
        StudentGrades studentGradesB = new StudentGrades(10.0,3.0);
        StudentGrades studentGradesC = new StudentGrades(10.0,5.0);
        String actual = Average.of(studentGradesA,studentGradesB,studentGradesC).print(1);
        Assertions.assertEquals("MEDIA = 9.0\n", actual);
    }

    @Test
    @DisplayName("Then return 'MEDIA = 7.5' when calculate average 10.0 , 10.0 and 5.0")
    public void test3(){
        StudentGrades studentGradesA = new StudentGrades(10.0,2.0);
        StudentGrades studentGradesB = new StudentGrades(10.0,3.0);
        StudentGrades studentGradesC = new StudentGrades(5.0,5.0);
        String actual = Average.of(studentGradesA,studentGradesB,studentGradesC).print(1);
        Assertions.assertEquals("MEDIA = 7.5\n", actual);
    }

}