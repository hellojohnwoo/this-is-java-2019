package chap16stream.sec01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LamdaExpressionsEx {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("BTS",99),
                new Student("SNSD",77)
        );

        Stream<Student> stream = list.stream();
        stream.forEach(s-> {
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + " : " + score);
        });
    }
}
