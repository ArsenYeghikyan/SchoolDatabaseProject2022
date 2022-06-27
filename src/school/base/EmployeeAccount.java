package school.base;

import school.employe_position.Position;

import java.io.File;
import java.util.Objects;

public abstract class EmployeeAccount extends Account {



    private final Position position;
    private final int salary;
    private final int experience;


    public EmployeeAccount(String name, String lastName, int age, Position position, int salary, int experience) {
        super(name, lastName, age,new File("src" + File.separator
                + "school" + File.separatorChar + "files" + File.separatorChar + "employees_info.txt"));
        this.position = position;
        this.salary = salary;
        this.experience = experience;

    }


//    private int setSalary(int salary){
//
//        if
//
//
//    }







    public int getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }


    public Position getPosition() {
        return position;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeAccount account)) return false;
        if (!super.equals(o)) return false;
        return getSalary() == account.getSalary() && getExperience() == account.getExperience() && getPosition() == account.getPosition();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPosition(), getSalary(), getExperience());
    }

    @Override
    public String getPersonInfo() {

            return '\n'+"Position: "+position+ '\n'+ super.getPersonInfo()+"\nExp: "+getExperience()+"\nSalary: $"+getSalary()+'\n';




    }


}
