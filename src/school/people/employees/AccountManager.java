package school.people.employees;

import school.base.Student;
import school.functions.SchoolInfoManagerMethods;
import school.base.Employee;
import school.base.Person;

import java.io.*;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

public final class AccountManager implements SchoolInfoManagerMethods {


    private final TreeSet<Employee> employees = new TreeSet<>(Comparator.comparing(Person::getName));


    private final TreeSet<Student> students = new TreeSet<>(Comparator.comparing(Person::getName));



@Override
    public void WriteEmployeeInfo(Employee person) {

        employees.add(person);
        try (OutputStreamWriter br = new OutputStreamWriter(
                new FileOutputStream(
                        person.getPersonFile()))) {



            employees.forEach(emp -> {
                try {

                    br.write(emp.getPersonInfo());
                    br.flush();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    public void WriteStudentsInfo(Student  student) {

        students.add(student);
        try (OutputStreamWriter br = new OutputStreamWriter(
                new FileOutputStream(
                        student.getPersonFile()))) {



            students.forEach(emp -> {
                try {

                    br.write(emp.getPersonInfo());
                    br.flush();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();

        }


    }

    @Override
    public void WriteEmployeesInfo(TreeSet<? extends Person> accounts, Person  person) {
        try (OutputStreamWriter br = new OutputStreamWriter(
                new FileOutputStream(person.getPersonFile()))) {



            accounts.forEach(emp -> {
                try {

                    br.write(emp.getPersonInfo());
                    br.flush();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();

        }






    }

//    @Override
//    public void setPersonInfo(Student student) {
//
//        students.add(student);
//
//        students.forEach(student1 -> {
//            try (Writer writer = new FileWriter(student1.getPersonFile());) {
//
//                writer.write(student1.getPersonInfo());
//                writer.flush();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        });
//
//
//    }


    @Override
    public void deletePerson(Person personForDelete, File personFile) {


    }

    @Override
    public void findPerson(Person peronForFind, File personFile) {

      try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(personFile)))){

         String name = bufferedReader.readLine() ;




         while (!(name .equals(peronForFind.getName()) )){

                 System.out.println(peronForFind.getPersonInfo());



         }







      }catch (IOException e){
          e.printStackTrace();

      }



    }

    @Override
    public void sortPersonByName(LinkedList<Person> people, File personFile) {

    }

    @Override
    public void replacePerson(Person personForReplace, Person newPerson, File personFile) {

    }
}
