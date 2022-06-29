package school.account_manager;

import school.base.StudentAccount;
import school.file_managers.BaseAccountFileManager;
import school.base.EmployeeAccount;
import school.base.Account;

import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;

public final class AccountManager implements BaseAccountFileManager {

    private final TreeSet<EmployeeAccount> employees = new TreeSet<>(Comparator.comparing(Account::getName));

    private final TreeSet<StudentAccount> students = new TreeSet<>(Comparator.comparing(Account::getName));


    private void addAccount(Account account) {


        if (account instanceof StudentAccount) {
            students.add((StudentAccount) account);

        } else if (account instanceof EmployeeAccount) {
            employees.add((EmployeeAccount) account);
        }


    }


    private TreeSet<? extends Account> checkAccount(Account account) {

        if (account instanceof StudentAccount) {
            return students;
        }
        return employees;

    }


    @Override
    public void CreateAccountInfo(Account account) {

        addAccount(account);
        writingInfo(account);

    }


    @Override
    public void deleteAccount(Account accountForDelete) {

        checkAccount(accountForDelete).remove(accountForDelete);


        writingInfo(accountForDelete);

    }


    private void writingInfo(Account account) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream((account.getAccountFile()))))) {

            checkAccount(account).forEach(acc -> {
                try {
                    bw.write(acc.getAccountInfo());

                    bw.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            });

        } catch (NullPointerException exception) {
            System.out.println("You entered an empty value, please try again");
        } catch (Exception e) {
            System.out.println("oops!");

        }


    }


    @Override
    public void findAccount(Account accountInSearch) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(accountInSearch.getAccountFile())))) {


            String str;

            while ((str = br.readLine()) != null) {

                if (str.equals("Name: " + accountInSearch.getName())) {
                    System.out.println(accountInSearch.getAccountInfo());
                }


            }


        } catch (IOException e) {
            System.out.println("IOException");
        }


    }


    @Override
    public void replaceAccount(Account personForReplace, Account newAccount) {

        deleteAccount(personForReplace);
        writingInfo(newAccount);


    }
}
