package chap16stream.sec01;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceEx {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("A",11),
                new Student("B",22),
                new Student("C", 33)
        );

        double avg = studentList.stream().
                        mapToInt(Student::getScore).
                        average().getAsDouble();
        System.out.println("Average Score : " + avg);
    }
}
