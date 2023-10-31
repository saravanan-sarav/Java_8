package Java8vsJava7;

import org.example.Person;
import org.example.PersonRepository;

import java.util.List;
import java.util.function.BiPredicate;

public class F_BiPredicate {
    public static void main(String[] args) {
        BiPredicate<Person, List<String>> biPredicate = (person, hobbies) -> person.getHeight()>150 && person.getHobbies().contains("Swimming");

        List<Person> personList = PersonRepository.getAllPersons();

        personList.forEach(person -> {
           if(biPredicate.test(person, person.getHobbies())){
               System.out.println(person.getName().toUpperCase());
            } else {
               System.out.println("False---->"+ person.getName());
           }
        });

    }
}
