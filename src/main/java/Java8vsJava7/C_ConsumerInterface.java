package Java8vsJava7;

import java.util.function.Consumer;

public class C_ConsumerInterface {
    public static void main(String[] args) {
        Consumer<String> consumer1 = s -> System.out.println(s);
        Consumer<String> consumer2 = s -> System.out.println(s.toUpperCase());

        consumer1.accept("Sarav");
        consumer2.accept("sarav");

//        Simplified Version
//        7th and 15th Line are same
        Consumer<String> consumer3 = System.out::println;

        consumer1.andThen(consumer2).andThen(consumer3).accept("Some Data");
    }
}
