package br.com.guifr.beecrowd;

public class StudentGrades {
    private double grade;
    private double weight;

    private StudentGrades() {}

    public StudentGrades(double grade, double weight) {
        this.grade = grade;
        this.weight = weight;
    }

    public double getGrade() {
        return grade;
    }

    public double getWeight() {
        return weight;
    }
}
