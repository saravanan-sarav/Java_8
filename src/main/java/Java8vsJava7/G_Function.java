package Java8vsJava7;

import java.util.function.Function;

public class G_Function {
    public static void main(String[] args) {
        Function<String,String> f = s -> s.toUpperCase();

        System.out.println("Saravanan");
        System.out.println(f.apply("Saravanan"));
    }
}
