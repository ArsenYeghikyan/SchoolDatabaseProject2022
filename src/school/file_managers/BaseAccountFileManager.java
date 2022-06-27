package school.file_managers;

import school.base.Account;

import java.io.File;

public interface BaseAccountFileManager {


    void  WriteAccountsInfo(Account account);

    void deleteAccount(Account personForDelete, File personFile) ;

    void findAccount(Account peronForFind, File personFile);


    void replaceAccount(Account AccountForReplace, Account newAccount, File accountFile);






}

