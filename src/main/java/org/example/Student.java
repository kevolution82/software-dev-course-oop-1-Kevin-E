package org.example;

public class Student {
    private String name;
    private double grade;
    private int daysAbsent;

    public Student(String name, double grade, int daysAbsent) {
        this.name = name;
        this.grade = grade;
        this.daysAbsent = daysAbsent;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public int getDaysAbsent() {
        return daysAbsent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setDaysAbsent(int daysAbsent) {
        this.daysAbsent = daysAbsent;
    }


    public void addAbsence() {
        daysAbsent++;
    }

    // adds extra credit to the student's grade
    public void addBonusPoints(double bonusPoints) {
        grade += bonusPoints;
    }

    // returns string with student's grade and their absences
    @Override
    public String toString() {
        return name + " " + grade;
    }
}
