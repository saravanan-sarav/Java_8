package org.example;

import java.util.Arrays;
import java.util.List;

public class PersonRepository {

    public static List<Person> getAllPersons(){
        Person p1 = new Person("John","Male",165,2,2000, Arrays.asList("Cricket","Swimming","Tennis"));
        Person p2 = new Person("Angel","Female",158,3,2000, Arrays.asList("Cricket","Swimming","Tennis"));
        Person p3 = new Person("Nacy","Female",145,5,2000, Arrays.asList("Cricket","Swimming","Tennis"));
        Person p4 = new Person("Compell","Male",175,1,2000, Arrays.asList("Cricket","Swimming","Tennis"));
        Person p5 = new Person("Harper","Male",183,2,2000, Arrays.asList("Cricket","Swimming","Tennis"));
        Person p6 = new Person("Sarav","Male",155,3,2000, Arrays.asList("Cricket","Swimming","Tennis"));
        return Arrays.asList(p1,p2,p3,p4,p5,p6);

    }
}
