package chap16stream.sec02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionEx {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("B",11),
                new Student("T",22),
                new Student("S", 33)
        );

        Stream<Student> stream = studentList.stream();
        stream.forEach(s-> System.out.println(s.getName()));
    }
}
