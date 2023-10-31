package Java8vsJava7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B_Java8vsJava7 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("a","b","c","d","a");

//        Before Java 8
        List<String> uniqueNames = new ArrayList<>();
        for (String str:names){
            if(!uniqueNames.contains(str)){
                uniqueNames.add(str);
            }
        }
        System.out.println("Before Java 8 " + uniqueNames);

//        After Java 8
        List<String> uniqueNameAfter8 = names.stream().distinct().toList();
        System.out.println("After Java 8"+ uniqueNameAfter8);

    }
}
