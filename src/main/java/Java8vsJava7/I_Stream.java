package Java8vsJava7;

import org.apache.commons.lang3.time.StopWatch;
import org.example.Person;
import org.example.PersonRepository;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class I_Stream {
    public static void main(String[] args) throws InterruptedException {

//        Basic Stream Function
        Stream<Integer> stream1 = Stream.of(0,1,2,3,4,5,6,7,8,9,10);
        stream1.forEach(i-> System.out.print(i+" "));


//        Basic Map Without Stream
        List<Person> personList = PersonRepository.getAllPersons();
        Map<String, List<String>> map = new HashMap<>();


//        Using For Each
        personList.forEach(person -> map.put(person.getName(),person.getHobbies()));


//        Using For Loop
        for(Person person : PersonRepository.getAllPersons()){
            map.put(person.getName(),person.getHobbies());
        }

        System.out.println(map);


//        Using Stream
        Map<String, List<String>> streamMap = PersonRepository.getAllPersons().stream()
                .collect(Collectors.toMap(Person::getName,Person::getHobbies));
        System.out.println(streamMap);


//        Filters Using Streams
        Map<String, List<String>> streamMapFilterHeightAndGender = PersonRepository.getAllPersons().stream()
                .filter(person -> person.getHeight()>150)
                .filter(person -> person.getGender().equalsIgnoreCase("male"))
                .collect(Collectors.toMap(Person::getName,Person::getHobbies));
        System.out.println("After Filter : "+streamMapFilterHeightAndGender);



        //        Print All Names in Uppercase using Stream
        List<String> upperCaseName = PersonRepository.getAllPersons().stream()
                .map(Person::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Names In UpperCase: "+upperCaseName);

        List<String> upperCaseNameParallelStream = PersonRepository.getAllPersons().parallelStream()
                .map(Person::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Names In UpperCase: "+upperCaseNameParallelStream);


        List<Integer> integerList = new ArrayList<>();

        Random random = new Random();

        for (long i = 0; i < 10000000; i++) {
            int randomValue = random.nextInt(); // Generate a random integer
            integerList.add(randomValue); // Add it to the list
        }

        StopWatch watch = new StopWatch();
        watch.start();

        List<Integer> withstream = integerList.parallelStream().toList();
        watch.stop();
        System.out.println("Parellel stream: "+watch.getTime());

        watch.reset();
        Thread.sleep(2000);
        System.out.println("Started Parellel Stream");
        watch.start();
        List<Integer> withparallelstream = integerList.stream().toList();
        watch.stop();
        System.out.println("Stream: "+watch.getTime());

//
    }
}
