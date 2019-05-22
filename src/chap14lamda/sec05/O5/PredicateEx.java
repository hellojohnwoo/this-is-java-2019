package chap14lamda.sec05.O5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {
    private static List<Student> list = Arrays.asList(
      new Student("Ann", "female", 11),
      new Student("Barbie", "female", 22),
      new Student("Chen", "male", 23),
      new Student("Jack", "male", 22)
    );

    public static double avg( Predicate<Student> predicate) {
        int count = 0, sum = 0;
        for(Student student : list) {
            if( predicate.test(student) ) {
                count++;
                sum += student.getScore();
            }
        }
        return (double) sum / count;
    }

    public static void main(String[] args) {
        double maleAvg = avg( t -> t.getSex().equals("male"));
        System.out.println("male Average Score : " + maleAvg);

        double femaleAvg = avg( t -> t.getSex().equals("female"));
        System.out.println("female Average Score : " + femaleAvg);
    }

}
