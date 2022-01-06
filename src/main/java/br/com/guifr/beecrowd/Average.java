package br.com.guifr.beecrowd;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Average {

    private List<StudentGrades> studentGrades;

    private Average(StudentGrades ...grades) {
        studentGrades = new ArrayList<>();
        Arrays.stream(grades).forEach(studentGrades::add);
    }

    public static Average of(double gradeA, double gradeB) {
        StudentGrades studentGradesA = new StudentGrades(gradeA, 3.5);
        StudentGrades studentGradesB = new StudentGrades(gradeB, 7.5);
        return new Average(studentGradesA,studentGradesB);
    }

    public static Average of(StudentGrades ...studentGrades) {
        return new Average(studentGrades);
    }

    public String print() {
        return print(5);
    }

    private BigDecimal getWeightTotal() {
        return studentGrades.stream()
                .map(e -> new BigDecimal(e.getWeight()))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double gradeA = Double.valueOf(sc.nextLine());
        double gradeB = Double.valueOf(sc.nextLine());

        System.out.print(Average.of(gradeA,gradeB).print());

    }

    public String print(int precision) {

        BigDecimal reduce = this.studentGrades.stream()
                .map(this::getFinalGrade)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        return String.format(Locale.US,"MEDIA = %."+precision+"f\n",reduce.doubleValue());
    }

    private BigDecimal getFinalGrade(StudentGrades studentGrades) {
        return getFinalGrade(studentGrades.getGrade(), studentGrades.getWeight());
    }

    private BigDecimal getFinalGrade(double grade, double weight) {
        return new BigDecimal(grade)
                .multiply(new BigDecimal(weight)).divide(getWeightTotal(), 20, RoundingMode.FLOOR);
    }
}

class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        List<StudentGrades> studentGrades = new ArrayList<>();

        studentGrades.add(new StudentGrades(Double.valueOf(sc.nextLine()),2.0));
        studentGrades.add(new StudentGrades(Double.valueOf(sc.nextLine()),3.0));
        studentGrades.add(new StudentGrades(Double.valueOf(sc.nextLine()),5.0));
        StudentGrades[] arrayGrades = new StudentGrades[studentGrades.size()];
        studentGrades.toArray(arrayGrades);

        System.out.print(Average.of(arrayGrades).print(1));

    }

}
