package school.base;

import java.io.File;
import java.util.Objects;

public abstract class Account {
    private final String name;
    private final String lastName;
    private final int age;

    private final File accountFile;

    public Account(String name, String lastName, int age, File accountFile) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
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

    public String getPersonInfo(){




        return "Name: "+ getName()+"\nLast Name: "+getLastName()+"\nAge: "+getAge();



    }



}
