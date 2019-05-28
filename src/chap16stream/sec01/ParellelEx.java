/*

package chap16stream.sec01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParellelEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A","B","C","D","E");

        Stream<String> stream = list.stream();
        stream.forEach(ParellelEx::print);
        System.out.println();

        String<String> parallelStream = list.parallelStream();
        parallelStream.forEach(ParellelEx::print);

    }

    public static void main(String[] args) {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
}

*/