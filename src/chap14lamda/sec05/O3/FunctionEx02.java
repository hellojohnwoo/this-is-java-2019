package chap14lamda.sec05.O3;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionEx02 {
    private static List<Student> list = Arrays.asList(
            new Student("Eric", 100, 100),
            new Student("Jane", 99, 99)
    );

    public static double avg(ToIntFunction<Student> function) {
        int sum = 0;
        for (Student student : list) {
            sum += function.applyAsInt(student);
        }
        double avg = (double) sum / list.size();
        return avg;
    }

    public static void main(String[] args) {
        double englishAvg = avg( s -> s.getEnglishScore() );
        System.out.println(englishAvg);

        double mathAvg    = avg( s -> s.getMathScore() );
        System.out.println(mathAvg);
    }
}
