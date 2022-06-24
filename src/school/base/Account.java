package school.base;

import java.io.File;
import java.util.Objects;

public abstract class Account {
    private  String name;
    private  String lastName;
    private int age;

    private  File accountFile;

    public Account(String name, String lastName, int age, File accountFile) {
        setName(name);
        setLastName(lastName);
        setAge(age);
        setAccountFile(accountFile);

    }

    private void setName(String name) {

        this.name = name;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setAge(int age) {
        if (age <= 0) {
            System.out.println("Age does not move to be less than or equal to 0");

        } else {
            this.age = age;
        }
    }


    private void setAccountFile(File accountFile) {
        this.accountFile = accountFile;
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

    public File getAccountFile() {
        return accountFile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;
        return getAge() == account.getAge() && Objects.equals(getName(), account.getName()) && Objects.equals(getLastName(), account.getLastName()) && Objects.equals(getAccountFile(), account.getAccountFile());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLastName(), getAge(), getAccountFile());
    }

    public String getPersonInfo() {


        return "Name: " + getName() + "\nLast Name: " + getLastName() + "\nAge: " + getAge();


    }


}
