package school.file_managers;

import school.base.Account;

public interface BaseAccountFileManager {


    void createAccountInfo(Account account);

    void deleteAccount(Account accountForDelete) ;

     void findAccount(Account accountInSearch);


    void replaceAccount(Account AccountForReplace, Account newAccount);






}

