package school.functions;

import school.people.Person;

import java.io.File;
import java.util.LinkedList;

public interface CommonMethods {



     void deletePerson(Person personForDelete, File personFile) ;


     void findPerson(Person peronForFind, File personFile);


     void sortPersonByName(LinkedList<Person> people, File personFile);


     void replacePerson(Person personforReplace, Person newPerson, File personFile);

}
