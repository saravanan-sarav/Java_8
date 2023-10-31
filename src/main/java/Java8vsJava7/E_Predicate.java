package Java8vsJava7;

import org.example.Person;
import org.example.PersonRepository;

import java.util.List;
import java.util.function.Predicate;

public class E_Predicate {
    public static void main(String[] args) {
        Predicate<Integer> predicateLessThan = a -> a>50;

        System.out.println(predicateLessThan.test(10));
        System.out.println(predicateLessThan.test(60));

        List<Person> personList = PersonRepository.getAllPersons();

        Predicate<Person> heightPredicate = person -> person.getHeight()>150;
        Predicate<Person> genderPredicate = person -> person.getGender().equalsIgnoreCase("male");

        personList.forEach(person-> {
            if (heightPredicate.and(genderPredicate).test(person)){
                System.out.println(person.getName().toUpperCase());
            }else {
                System.out.println("False List---->"+ person.getName());
            }
        });


    }
}
