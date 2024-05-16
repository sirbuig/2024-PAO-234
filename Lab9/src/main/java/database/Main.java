package database;

import database.config.DatabaseConfiguration;
import database.config.SetupDataUsingStatement;
import database.domain.Person;
import database.repository.PersonRepository;

import java.util.Optional;

public class Main {

    /*
    Statements
    PreparedStatements
    CallableStatements
    */

    public static void main(String[] args) {
        SetupDataUsingStatement setupData = new SetupDataUsingStatement();
        setupData.createTable();
        setupData.addPerson();
        setupData.getAllPersons();

        PersonRepository personRepository = new PersonRepository();
        personRepository.insert("Ioana", 20);
        personRepository.insert(new Person("Denis", 19));

        Optional<Person> person = personRepository.getById(3);
        if (person.isPresent()) {
            System.out.println(person.get());
        }

        personRepository.updateName("Cristi", 3);

        personRepository.insertPersonProcedure(new Person("Gigel", 30));

        DatabaseConfiguration.closeDatabaseConnection();
    }
}
