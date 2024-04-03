package validator;

import validator.domain.Person;
import validator.validator.PersonValidator;

public class Main {
    public static void main(String[] args) {
        PersonValidator validator = new PersonValidator();

        Person person1 = new Person("Ionescu","Gigel", "0712345678", 40);
        Person person2 = new Person("ionescu", "Gigel", "0712345678", 40);
        Person person3 = new Person("Ionescu","", "0712345678", 40);
        Person person4 = new Person("Ionescu", "Gigel", "0731", 40);
        Person person5 = new Person("Ionescu","Gigel", "071234567890", 40);
        Person person6 = new Person("Ionescu","Gigel", "0212345678", 40);
        Person person7 = new Person("Ionescu", "Gigel", "07212345678", 15);

        //System.out.println(person.toString());

        Person[] persons = new Person[] {person1, person2, person3, person4, person5, person6, person7};

        for (Person person: persons) {
            validator.validate(person);
        }

        System.out.println("Error messages: ");

        for (Person person: persons) {
            String message = validator.validateWithErrorMessages(person);
            System.out.println(message + " for " + person);
        }
    }
}
