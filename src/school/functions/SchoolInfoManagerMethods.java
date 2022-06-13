package school.functions;

import school.base.Employee;
import school.base.Person;
import school.base.Student;

import java.util.TreeSet;

public interface SchoolInfoManagerMethods extends CommonMethods {



    void  WriteEmployeeInfo(Employee employee);
    void  WriteEmployeesInfo(TreeSet<? extends Person> employee,Person person);
     void WriteStudentsInfo(Student student);


}

