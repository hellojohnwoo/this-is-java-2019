package chap14lamda.sec00summary;

import java.util.function.ToIntFunction;

public class Prob06 {
    private static Student[] stu = {
            new Student("Kim",55,91),
            new Student("Lee",55,91)
    };

    public static double avg(ToIntFunction<Student> function) {
        int sum = 0;
        for(Student student : stu) {
            sum += function.applyAsInt(student);
        }
        double avg = (double) sum / stu.length;
        return avg;
    }

    public static void main(String[] args) {
        double engAvg = avg( s -> s.getEngScore());
        // double engAvg = avg( Student::getEngScore);
        System.out.println("English Avg Score : " + engAvg);

        double mathAvg = avg( s -> s.getMathScore());
        // double mathAvg = avg( Student::getEngScore);
        System.out.println("Math Avg Score : " + mathAvg);
    }
}
