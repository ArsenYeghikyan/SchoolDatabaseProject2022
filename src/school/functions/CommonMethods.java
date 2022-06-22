package school.functions;

import school.base.Account;

import java.io.File;
import java.util.LinkedList;

public interface CommonMethods {



     void deletePerson(Account personForDelete, File personFile) ;


     void findPerson(Account peronForFind, File personFile);


     void sortPersonByName(LinkedList<Account> people, File personFile);


     void replacePerson(Account personforReplace, Account newPerson, File personFile);

}
