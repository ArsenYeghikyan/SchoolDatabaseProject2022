package school.base;

import school.subjects.Grade;

import java.io.File;
import java.util.Objects;

public abstract class Student extends Person {

   private final double averageRating;

   private final Grade grade;

   private final File studentInfoFile;


    public Student(String name, String lastName, int age, double averageRating, Grade grade, File studentInfoFile) {
        super(name, lastName, age);
        this.averageRating = averageRating;
        this.grade = grade;
        this.studentInfoFile = studentInfoFile;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public Grade getGrade() {
        return grade;
    }

    public File getStudentInfoFile() {
        return studentInfoFile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Double.compare(student.getAverageRating(), getAverageRating()) == 0 && getGrade() == student.getGrade() && Objects.equals(studentInfoFile, student.studentInfoFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAverageRating(), getGrade(), studentInfoFile);
    }

    @Override
    public String printInfo() {
        return '\n'+super.printInfo() +"\nAverageRating: " +averageRating+
                "\nGrade: "+ grade+'\n';

        //// dobawit parametry uchenika


    }






}
