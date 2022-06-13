package school.base;

import school.subjects.Position;

import java.io.File;

public abstract class Employee extends Person {



    private final Position position;
    private final int salary;
    private final int experience;
    private final File employeesFile = new File("src" + File.separator
            + "school" + File.separatorChar + "files" + File.separatorChar + "employeesFile.txt");


    public Employee(String name, String lastName, int age, Position position, int salary, int experience) {
        super(name, lastName, age);
        this.position = position;
        this.salary = salary;
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }

    public File getEmployeesFile() {
        return employeesFile;
    }

    @Override
    public String getPersonInfo() {

            return "Position: "+position+ '\n'+ super.getPersonInfo()+"\nExp: "+getExperience()+"\nSalary: $"+getSalary();




    }


}
