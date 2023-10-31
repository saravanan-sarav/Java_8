package Threads;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//        Before Java 8
        int total7 = 0;
        for (int i =0;i<=50;i++){
            total7 +=i;
        }
        System.out.println(total7);

//        Java 8
        int total8 = IntStream.range(0,50).sum();
        System.out.println(total8);
    }
}
