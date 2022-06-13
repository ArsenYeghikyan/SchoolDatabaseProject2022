package school.base;

public abstract class Person {
    private final String name;
    private final String lastName;
    private final int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
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


    public String getPersonInfo(){


        return "Name: "+ getName()+"\nLast Name: "+getLastName()+"\nAge: "+getAge();



    }



}
