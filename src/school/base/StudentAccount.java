package school.base;

import school.students_grade.Grade;

import java.io.File;
import java.util.Objects;

public abstract class StudentAccount extends Account {

   private final double averageRating;

   private final Grade grade;




    public StudentAccount(String name, String lastName, int age, double averageRating, Grade grade) {
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
        if (!(o instanceof StudentAccount that)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(that.getAverageRating(), getAverageRating()) == 0 && getGrade() == that.getGrade();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getAverageRating(), getGrade());
    }

    @Override
    public String getAccountInfo() {
        return '\n'+super.getAccountInfo() +"\nAverageRating: " +getAverageRating()+
                "\nGrade: "+ getGrade()+'\n';




    }






}
