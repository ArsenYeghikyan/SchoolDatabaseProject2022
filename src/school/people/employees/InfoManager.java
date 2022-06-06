package school.people.employees;

import school.base.Student;
import school.functions.SchoolInfoManagerMethods;
import school.base.Employee;
import school.base.Person;

import java.io.*;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

public final class InfoManager implements SchoolInfoManagerMethods {


    private final TreeSet<Employee> employees = new TreeSet<>(new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    });


    private final TreeSet<Student> students = new TreeSet<>(new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    });


    public void writeEmployeesInfo(Employee employee) {

        employees.add(employee);
try (Writer writer = new FileWriter(employee.getEmployeesFile())){
    employees.forEach(emp -> {
        try  {

            writer.write(emp.printInfo());
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    });
}catch (Exception e){
    System.out.println(e);
}


    }


    @Override
    public void writeStudentInfo(Student student) {

        students.add(student);

      students.forEach(student1 ->  {
            try (Writer writer = new FileWriter(student1.getStudentInfoFile());) {

                writer.write(student1.printInfo());
                writer.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    });



    }


    @Override
    public void deletePerson(Person personForDelete, File personFile) {





    }

    @Override
    public void findPerson(Person peronForFind, File personFile) {

    }

    @Override
    public void sortPersonByName(LinkedList<Person> people, File personFile) {

    }

    @Override
    public void replacePerson(Person personForReplace, Person newPerson, File personFile) {

    }
}
