package Java8vsJava7;

import org.example.Person;
import org.example.PersonRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class H_FunctionWithMapReturn {
    public static void main(String[] args) {
        List<Person> personList = PersonRepository.getAllPersons();

        BiPredicate<Integer, String> biPredicate = (height, gender) -> height>150 && gender.equalsIgnoreCase("male");


        Function<List<Person>, Map<String, Double>> function = person1 -> {
            Map<String, Double> map = new HashMap<>();
            person1.forEach(person -> {
                if (biPredicate.test(person.getHeight(),person.getGender())) {
                    map.put(person.getName(),person.getSalary());
                }
            });
            return map;
        };

        Map<String,Double> result = function.apply(personList);
        for (String j : result.keySet()){
            System.out.println(j+" "  +result.get(j));
        }
    }
}
