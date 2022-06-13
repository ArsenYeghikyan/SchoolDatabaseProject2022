package school.base;

import school.subjects.Grade;

import java.io.File;
import java.util.Objects;

public abstract class Student extends Person {

   private final double averageRating;

   private final Grade grade;




    public Student(String name, String lastName, int age, double averageRating, Grade grade) {
        super(name, lastName, age,new File("src" + File.separator
                + "school" + File.separatorChar + "files" + File.separatorChar + "students_info.txt"));
        this.averageRating = averageRating;
        this.grade = grade;

    }

    public double getAverageRating() {
        return averageRating;
    }

    public Grade getGrade() {
        return grade;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Double.compare(student.averageRating, averageRating) == 0 && grade == student.grade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAverageRating(), getGrade());
    }

    @Override
    public String getPersonInfo() {
        return '\n'+super.getPersonInfo() +"\nAverageRating: " +averageRating+
                "\nGrade: "+ grade+'\n';

        //// dobawit parametry uchenika


    }






}
