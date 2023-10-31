package Java8vsJava7;

import org.example.Person;
import org.example.PersonRepository;

import java.util.List;
import java.util.function.BiConsumer;

public class D_BiConsumerInterface {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer1 = (x,y)-> System.out.println("sum is = "+(x+y));
        biConsumer1.accept(2,4);

        List<Person> personList = PersonRepository.getAllPersons();
        BiConsumer<String,List<String>> biConsumer2 = (name,hobbies) -> System.out.println("Name: "+name+ " /Hobbies: "+ hobbies);

        personList.forEach(person -> biConsumer2.accept(person.getName(),person.getHobbies()));
    }
}
