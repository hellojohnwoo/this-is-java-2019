package chap14lamda.sec05.O3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionEx {
    private static List<Student> list = Arrays.asList(
            new Student("Kim", 99, 88),
            new Student("Park", 77, 66)
    );

    public static void printString(Function<Student, String> function) {
        for(Student student : list) {
            System.out.println(function.apply(student) + " ");
        }
        System.out.println();
    }
}
