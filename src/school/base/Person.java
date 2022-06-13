package school.base;

import java.io.File;
import java.util.Objects;

public abstract class Person {
    private final String name;
    private final String lastName;
    private final int age;

    private final File personFile;

    public Person(String name, String lastName, int age, File personFile) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.personFile = personFile;
    }



    public String getName() {
        return name;
    }


    public String getLastName() {
        return lastName;
    }


    public int getAge() {
        return age;
    }

    public File getPersonFile() {
        return personFile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(lastName, person.lastName) && Objects.equals(personFile, person.personFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age, personFile);
    }

    public String getPersonInfo(){




        return "Name: "+ getName()+"\nLast Name: "+getLastName()+"\nAge: "+getAge();



    }



}
